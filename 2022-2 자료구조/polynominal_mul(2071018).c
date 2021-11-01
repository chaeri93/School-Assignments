#include  <stdio.h>
#include <stdlib.h>

// (데이터 저장) 노드
typedef struct ListNode {
    int coef;
    int expon;
    struct ListNode* link;// 다음 노드의 주소값
} ListNode;

// 헤더 노드
typedef struct ListType {
    int size;
    ListNode* head;//첫번째 노드의 주소값
    ListNode* tail;//마지막 노드의 주소값
} ListType;

// 오류 함수
void error(char* message)
{
    fprintf(stderr, "%s\n", message);
    exit(1);
}

//  리스트 헤더 생성 함수
ListType* create()
{
    ListType* plist = (ListType*)malloc(sizeof(ListType));
    plist->size = 0;
    plist->head = plist->tail = NULL;
    return plist;
}

// plist는 연결 리스트의 헤더를 가리키는 포인터, coef는 계수, expon은 지수
void insert_last(ListType* plist, int coef, int expon)
{
    ListNode* temp =
        (ListNode*)malloc(sizeof(ListNode));
    if (temp == NULL) error("메모리 할당 에러");
    temp->coef = coef;
    temp->expon = expon;
    temp->link = NULL;
    if (plist->tail == NULL) {
        plist->head = plist->tail = temp;
    }
    else {
        plist->tail->link = temp;
        plist->tail = temp;
    }
    plist->size++;
    
}

//한 연겨리스트 안에서 expon이 같으면 각 ceof을 계산 해주는 함수, 동류항을 없애주는 함수
void remove_Duplicates(ListType* plist) {
    ListNode* p1, * p2, * p3, *p4;
    p1 = plist->head;
    //하나 씩 노드를 비교해본다
    while (p1!=NULL && p1->link != NULL) {// p1이 NULL이거나 p1->link이 NULL일 때까지 실행
        p2 = p1;
        //하나의 노드를 선택해서 나머지 노드들과 비교해본다
        while (p2->link != NULL) {//p2->link가 NULL이 될 때까지 실행
            if (p1->expon == p2->link->expon) {//p1의 지수 == p2의 다음 노드의 지수

                //계수끼리 더해주어 p1->coef에 저장
                p1->coef += p2->link->coef;
                //p2->link을 삭제하기 위해 따로 p3에 저장
                p3 = p2->link;
                p2->link = p2->link->link;
                //p2->link를 삭제하기 때문에 연결리스트의 개수를 하나 줄임
                plist->size--;
                //p2->link가 가르키는 동적 메모리를 반환
                free(p3);
            }
            else
                //p2를 다음 노드로 이동
                p2 = p2->link;
        }
        //p1을 다음 노드로 이동
        p1 = p1->link;
    }
}

//다항식의 곱셈
void poly_mul(ListType* plist1, ListType* plist2, ListType* plist3) {
    //plist3 = plist1 * plist2

    ListNode* a = plist1->head;
    while (a != NULL) {//a가 NULL일 때까지 실행
        ListNode* b = plist2->head;
        while (b != NULL) {// 
            //계수끼리는 곱해서 coef에 저장, 지수끼리는 더해주어서 expon에 저장
            int coef = a->coef * b->coef;
            int expon = a->expon + b->expon;
            // plist3 마지막에 insert
            insert_last(plist3, coef, expon);
            b = b->link;
        }
        a = a->link;
    }
    //연결리스트에서 똑같은 expon 값을 가진 노드()항들을 더해준다
    remove_Duplicates(plist3);
}

//거듭제곱을 계산해주는 함수
double power(double x, int n) {
    if (n == 0) 
        return 1;
    else if (n % 2 == 0) //n이 짝수일때
        return power(x * x, n / 2);
    else //n이 홀수일때
        return x * power(x * x, (n - 1) / 2);
}

//정수 x에 대해 plist에 해당하는 다항식의 값을 계산하는 함수
int eval(ListType* plist, int x) {
    int result = 0;
    ListNode* p = plist->head;
    for (int i = 0; i < plist->size; i++) {
        result += p->coef * power(x, p->expon);
        p = p->link;
    }
    return result;
}

//연결리스트를 다항식으로 출력해주는 함수
void poly_print(ListType* plist)
{
    ListNode* p = plist->head;
    printf("polynomial = ");
    
    for (; p; p = p->link) {
        if (p->link==NULL)// if문을 사용하여 마지막 노드에는 '+'가 붙지 않게 해준다 
          printf("%dx^%d ", p->coef, p->expon);
        else
          printf("%dx^%d + ", p->coef, p->expon);

    }
    printf("\n");
}

int main(void)
{
    ListType* list1, * list2, * list3;

    list1 = create(); // 연결 리스트 헤더 생성
    list2 = create();
    list3 = create();

    insert_last(list1, 3, 4); // 다항식 1을 생성 … A = 3x^4+2x^2+1 
    insert_last(list1, 2, 2);
    insert_last(list1, 1, 0);

    insert_last(list2, 8, 5); // 다항식 2를 생성 … B = 8x^5-3x^3+10x 
    insert_last(list2, -3, 3);
    insert_last(list2, 10, 1);

    poly_print(list1);
    poly_print(list2);
    
    //다항식 3 = 다항식 1 * 다항식 2
    poly_mul(list1, list2, list3);
    printf("두 다항식의 곱 ==>");
    poly_print(list3);

    int x, result;
    printf("X 값을 입력하세요:");
    scanf_s("%d", &x);
    printf("정수 X(= %d)에 대한 다항식의 값 ==>", x);

    //x를 다항식에 대입한 값을 result에 저장
    result = eval(list3, x);
    printf(" %d", result);

    free(list1); free(list2); free(list3);
}

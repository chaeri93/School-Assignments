#include  <stdio.h>
#include <stdlib.h>

// (������ ����) ���
typedef struct ListNode {
    int coef;
    int expon;
    struct ListNode* link;// ���� ����� �ּҰ�
} ListNode;

// ��� ���
typedef struct ListType {
    int size;
    ListNode* head;//ù��° ����� �ּҰ�
    ListNode* tail;//������ ����� �ּҰ�
} ListType;

// ���� �Լ�
void error(char* message)
{
    fprintf(stderr, "%s\n", message);
    exit(1);
}

//  ����Ʈ ��� ���� �Լ�
ListType* create()
{
    ListType* plist = (ListType*)malloc(sizeof(ListType));
    plist->size = 0;
    plist->head = plist->tail = NULL;
    return plist;
}

// plist�� ���� ����Ʈ�� ����� ����Ű�� ������, coef�� ���, expon�� ����
void insert_last(ListType* plist, int coef, int expon)
{
    ListNode* temp =
        (ListNode*)malloc(sizeof(ListNode));
    if (temp == NULL) error("�޸� �Ҵ� ����");
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

//�� ���ܸ���Ʈ �ȿ��� expon�� ������ �� ceof�� ��� ���ִ� �Լ�, �������� �����ִ� �Լ�
void remove_Duplicates(ListType* plist) {
    ListNode* p1, * p2, * p3, *p4;
    p1 = plist->head;
    //�ϳ� �� ��带 ���غ���
    while (p1!=NULL && p1->link != NULL) {// p1�� NULL�̰ų� p1->link�� NULL�� ������ ����
        p2 = p1;
        //�ϳ��� ��带 �����ؼ� ������ ����� ���غ���
        while (p2->link != NULL) {//p2->link�� NULL�� �� ������ ����
            if (p1->expon == p2->link->expon) {//p1�� ���� == p2�� ���� ����� ����

                //������� �����־� p1->coef�� ����
                p1->coef += p2->link->coef;
                //p2->link�� �����ϱ� ���� ���� p3�� ����
                p3 = p2->link;
                p2->link = p2->link->link;
                //p2->link�� �����ϱ� ������ ���Ḯ��Ʈ�� ������ �ϳ� ����
                plist->size--;
                //p2->link�� ����Ű�� ���� �޸𸮸� ��ȯ
                free(p3);
            }
            else
                //p2�� ���� ���� �̵�
                p2 = p2->link;
        }
        //p1�� ���� ���� �̵�
        p1 = p1->link;
    }
}

//���׽��� ����
void poly_mul(ListType* plist1, ListType* plist2, ListType* plist3) {
    //plist3 = plist1 * plist2

    ListNode* a = plist1->head;
    while (a != NULL) {//a�� NULL�� ������ ����
        ListNode* b = plist2->head;
        while (b != NULL) {// 
            //��������� ���ؼ� coef�� ����, ���������� �����־ expon�� ����
            int coef = a->coef * b->coef;
            int expon = a->expon + b->expon;
            // plist3 �������� insert
            insert_last(plist3, coef, expon);
            b = b->link;
        }
        a = a->link;
    }
    //���Ḯ��Ʈ���� �Ȱ��� expon ���� ���� ���()�׵��� �����ش�
    remove_Duplicates(plist3);
}

//�ŵ������� ������ִ� �Լ�
double power(double x, int n) {
    if (n == 0) 
        return 1;
    else if (n % 2 == 0) //n�� ¦���϶�
        return power(x * x, n / 2);
    else //n�� Ȧ���϶�
        return x * power(x * x, (n - 1) / 2);
}

//���� x�� ���� plist�� �ش��ϴ� ���׽��� ���� ����ϴ� �Լ�
int eval(ListType* plist, int x) {
    int result = 0;
    ListNode* p = plist->head;
    for (int i = 0; i < plist->size; i++) {
        result += p->coef * power(x, p->expon);
        p = p->link;
    }
    return result;
}

//���Ḯ��Ʈ�� ���׽����� ������ִ� �Լ�
void poly_print(ListType* plist)
{
    ListNode* p = plist->head;
    printf("polynomial = ");
    
    for (; p; p = p->link) {
        if (p->link==NULL)// if���� ����Ͽ� ������ ��忡�� '+'�� ���� �ʰ� ���ش� 
          printf("%dx^%d ", p->coef, p->expon);
        else
          printf("%dx^%d + ", p->coef, p->expon);

    }
    printf("\n");
}

int main(void)
{
    ListType* list1, * list2, * list3;

    list1 = create(); // ���� ����Ʈ ��� ����
    list2 = create();
    list3 = create();

    insert_last(list1, 3, 4); // ���׽� 1�� ���� �� A = 3x^4+2x^2+1 
    insert_last(list1, 2, 2);
    insert_last(list1, 1, 0);

    insert_last(list2, 8, 5); // ���׽� 2�� ���� �� B = 8x^5-3x^3+10x 
    insert_last(list2, -3, 3);
    insert_last(list2, 10, 1);

    poly_print(list1);
    poly_print(list2);
    
    //���׽� 3 = ���׽� 1 * ���׽� 2
    poly_mul(list1, list2, list3);
    printf("�� ���׽��� �� ==>");
    poly_print(list3);

    int x, result;
    printf("X ���� �Է��ϼ���:");
    scanf_s("%d", &x);
    printf("���� X(= %d)�� ���� ���׽��� �� ==>", x);

    //x�� ���׽Ŀ� ������ ���� result�� ����
    result = eval(list3, x);
    printf(" %d", result);

    free(list1); free(list2); free(list3);
}

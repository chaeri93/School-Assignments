#include <stdio.h>
#include <stdlib.h>

#define MAX_QUEUE_SIZE 100
typedef int element;
typedef struct { // 큐를 위한 구조체
    element  data[MAX_QUEUE_SIZE];
    int front, rear;
} DequeType;

// 오류 함수
void error(char* message)
{
    fprintf(stderr, "%s\n", message);
    exit(1);
}

// 초기화 
void init_deque(DequeType* q)
{
    q->front = q->rear = 0;
}

// 공백 상태 검출 함수
int is_empty(DequeType* q)
{
    return (q->front == q->rear);
}


// 포화 상태 검출 함수
int is_full(DequeType* q)
{
    return (((q->rear + 1) % MAX_QUEUE_SIZE) == q->front);
}

// 원형 큐 출력 함수
void deque_print(DequeType* q)
{
    printf("DEQUE(front=%d rear=%d) = ",
        q->front, q->rear);
    if (!is_empty(q)) {
        int i = q->front;
        do {
            i = (i + 1) % (MAX_QUEUE_SIZE);
            printf("%d | ", q->data[i]);
            if (i == q->rear) break;
        } while (i != q->front);
    }
    printf("\n");
}


// rear쪽 삽입 함수
void add_rear(DequeType* q, element item)
{
    if (is_full(q)) error("큐가 포화 상태입니다");
    q->rear = (q->rear + 1) % MAX_QUEUE_SIZE;
    q->data[q->rear] = item;
}

// front쪽 삽입 함수
void add_front(DequeType* q, element val)
{
    if (is_full(q))
        error("큐가 포화 상태입니다");
    q->data[q->front] = val;
    q->front = (q->front - 1 + MAX_QUEUE_SIZE) % MAX_QUEUE_SIZE; // front값 1감소
}


// front 삭제 함수
element delete_front(DequeType* q)
{
    if (is_empty(q)) error("큐가 공백 상태입니다");
    q->front = (q->front + 1) % MAX_QUEUE_SIZE;
    return q->data[q->front];
}

// front get 함수
element get_front(DequeType* q)
{
    if (is_empty(q))
        error("큐가 공백 상태입니다");
    return q->data[(q->front + 1) % MAX_QUEUE_SIZE];
}



//rear 삭제 함수
element delete_rear(DequeType* q)
{
    int prev = q->rear;
    if (is_empty(q))
        error("큐가 공백 상태입니다");
    q->rear = (q->rear - 1 + MAX_QUEUE_SIZE) % MAX_QUEUE_SIZE;
    return q->data[prev];
}

// rear get 함수
element get_rear(DequeType* q)
{
    if (is_empty(q))
        error("큐가 공백 상태입니다");
    return q->data[q->rear];
}

//회문인지 검사하는 프로그램
int palindrome_check(DequeType *queue) {
    int length = queue->rear - queue->front;// 전체 문자열의 길이
    while(length>1){//덱에 남아 있는 데이터 개수가 1이하이면 반복문 
        int first = delete_front(queue);
        int last = delete_rear(queue);
        if (first != last) {// 덱의 front와 rear가 같지 않으면 0 반환
            return 0;
        }
        length = queue->rear - queue->front;//front와 rear를 삭제한 후 남은 문자열 길이
    }
    return 1;// 전체 회문 검사 후 모든 문자열의 front 와 rear가 같다면 1 반환
}

int main(void)
{
    printf("[덱을 이용한 회문 판단] 문자열을 입력하시오: ");

    DequeType queue;
    char String[MAX_QUEUE_SIZE];
    gets(String);
    init_deque(&queue);
    for (int i = 0; i < strlen(String); i++) {
        add_rear(&queue, String[i]);// 함수 호출시// 스택 주소를 전달
    }

    if (palindrome_check(&queue)) {//회문검사
        printf("회문입니다");
    }
    else {
        printf("회문이 아닙니다.");
    }

}
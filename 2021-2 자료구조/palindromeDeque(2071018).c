#include <stdio.h>
#include <stdlib.h>

#define MAX_QUEUE_SIZE 100
typedef int element;
typedef struct { // ť�� ���� ����ü
    element  data[MAX_QUEUE_SIZE];
    int front, rear;
} DequeType;

// ���� �Լ�
void error(char* message)
{
    fprintf(stderr, "%s\n", message);
    exit(1);
}

// �ʱ�ȭ 
void init_deque(DequeType* q)
{
    q->front = q->rear = 0;
}

// ���� ���� ���� �Լ�
int is_empty(DequeType* q)
{
    return (q->front == q->rear);
}


// ��ȭ ���� ���� �Լ�
int is_full(DequeType* q)
{
    return (((q->rear + 1) % MAX_QUEUE_SIZE) == q->front);
}

// ���� ť ��� �Լ�
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


// rear�� ���� �Լ�
void add_rear(DequeType* q, element item)
{
    if (is_full(q)) error("ť�� ��ȭ �����Դϴ�");
    q->rear = (q->rear + 1) % MAX_QUEUE_SIZE;
    q->data[q->rear] = item;
}

// front�� ���� �Լ�
void add_front(DequeType* q, element val)
{
    if (is_full(q))
        error("ť�� ��ȭ �����Դϴ�");
    q->data[q->front] = val;
    q->front = (q->front - 1 + MAX_QUEUE_SIZE) % MAX_QUEUE_SIZE; // front�� 1����
}


// front ���� �Լ�
element delete_front(DequeType* q)
{
    if (is_empty(q)) error("ť�� ���� �����Դϴ�");
    q->front = (q->front + 1) % MAX_QUEUE_SIZE;
    return q->data[q->front];
}

// front get �Լ�
element get_front(DequeType* q)
{
    if (is_empty(q))
        error("ť�� ���� �����Դϴ�");
    return q->data[(q->front + 1) % MAX_QUEUE_SIZE];
}



//rear ���� �Լ�
element delete_rear(DequeType* q)
{
    int prev = q->rear;
    if (is_empty(q))
        error("ť�� ���� �����Դϴ�");
    q->rear = (q->rear - 1 + MAX_QUEUE_SIZE) % MAX_QUEUE_SIZE;
    return q->data[prev];
}

// rear get �Լ�
element get_rear(DequeType* q)
{
    if (is_empty(q))
        error("ť�� ���� �����Դϴ�");
    return q->data[q->rear];
}

//ȸ������ �˻��ϴ� ���α׷�
int palindrome_check(DequeType *queue) {
    int length = queue->rear - queue->front;// ��ü ���ڿ��� ����
    while(length>1){//���� ���� �ִ� ������ ������ 1�����̸� �ݺ��� 
        int first = delete_front(queue);
        int last = delete_rear(queue);
        if (first != last) {// ���� front�� rear�� ���� ������ 0 ��ȯ
            return 0;
        }
        length = queue->rear - queue->front;//front�� rear�� ������ �� ���� ���ڿ� ����
    }
    return 1;// ��ü ȸ�� �˻� �� ��� ���ڿ��� front �� rear�� ���ٸ� 1 ��ȯ
}

int main(void)
{
    printf("[���� �̿��� ȸ�� �Ǵ�] ���ڿ��� �Է��Ͻÿ�: ");

    DequeType queue;
    char String[MAX_QUEUE_SIZE];
    gets(String);
    init_deque(&queue);
    for (int i = 0; i < strlen(String); i++) {
        add_rear(&queue, String[i]);// �Լ� ȣ���// ���� �ּҸ� ����
    }

    if (palindrome_check(&queue)) {//ȸ���˻�
        printf("ȸ���Դϴ�");
    }
    else {
        printf("ȸ���� �ƴմϴ�.");
    }

}
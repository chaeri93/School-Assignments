#include <stdio.h>
#include <stdlib.h>

// ���Ŀ� ������ �ʿ��ϸ� ���⸸ �����Ͽ� ����
// === ���� �ڵ� ���� ===
#define MAX_STACK_SIZE 100	// ������ �ִ� ũ��
typedef int element;
typedef struct {     // ����ü 
    element data[MAX_STACK_SIZE];
    int top;
} StackType;

void init_stack(StackType* s)
{    // ���� �ʱ�ȭ �Լ�
    s->top = -1;
}

int is_empty(StackType* s)    // ���� ���� ���� �Լ�
{
    return (s->top == -1);
}

int is_full(StackType* s)        // ��ȭ ���� ���� �Լ�
{
    return (s->top == (MAX_STACK_SIZE - 1));
}

void push(StackType* s, element item)
{   // ���� �Լ�
    if (is_full(s)) {
        fprintf(stderr, "���� ��ȭ ����\n");
        return;
    }
    else s->data[++(s->top)] = item;
}
element pop(StackType* s)
{   // ���� �Լ�
    if (is_empty(s)) {
        fprintf(stderr, "���� ���� ����\n");
        exit(1);
    }
    else return s->data[(s->top)--];
}
element peek(StackType* s)
{   // ��ũ �Լ�
    if (is_empty(s)) {
        fprintf(stderr, "���� ���� ����\n");
        exit(1);
    }
    else return s->data[(s->top)];
}
// === ���� �ڵ� �� ===

int palindrome(char String[]) {
    StackType s;
    init_stack(&s);
    for (int i = 0; String[i] != 0; i++) {//���ÿ� ���ڿ� ����
        push(&s, String[i]);// �Լ� ȣ���// ���� �ּҸ� ����
    }

    for (int i = 0; String[i] != 0; i++) {
        if (String[i] != pop(&s)) {// ���ڿ��� ������ ���ϸ鼭 ���ÿ� ����ִ� ������ ����
            return 0;// ���ڿ��� ������ �����Ͱ� �ٸ��� 0�� ��ȯ=>ȸ���� �ƴմϴ�.
        }
    }
    return 1;//��ü ���ڿ��� ���ÿ� ����� �����͵��� ��� ������ 1 ��ȯ=>ȸ���Դϴ�

}

int main(void)
{
    StackType s;  // ���� ���� ����

    printf("[������ �̿��� ȸ�� �Ǵ�] ���ڿ��� �Է��Ͻÿ�: ");
    char String[MAX_STACK_SIZE];
    gets(String);
    if (palindrome(String)) {//ȸ���˻�
        printf("ȸ���Դϴ�");
    }
    else {
        printf("ȸ���� �ƴմϴ�.");
    }
}
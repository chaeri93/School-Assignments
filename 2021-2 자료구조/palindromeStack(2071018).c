#include <stdio.h>
#include <stdlib.h>

// 차후에 스택이 필요하면 여기만 복사하여 붙임
// === 스택 코드 시작 ===
#define MAX_STACK_SIZE 100	// 스택의 최대 크기
typedef int element;
typedef struct {     // 구조체 
    element data[MAX_STACK_SIZE];
    int top;
} StackType;

void init_stack(StackType* s)
{    // 스택 초기화 함수
    s->top = -1;
}

int is_empty(StackType* s)    // 공백 상태 검출 함수
{
    return (s->top == -1);
}

int is_full(StackType* s)        // 포화 상태 검출 함수
{
    return (s->top == (MAX_STACK_SIZE - 1));
}

void push(StackType* s, element item)
{   // 삽입 함수
    if (is_full(s)) {
        fprintf(stderr, "스택 포화 에러\n");
        return;
    }
    else s->data[++(s->top)] = item;
}
element pop(StackType* s)
{   // 삭제 함수
    if (is_empty(s)) {
        fprintf(stderr, "스택 공백 에러\n");
        exit(1);
    }
    else return s->data[(s->top)--];
}
element peek(StackType* s)
{   // 피크 함수
    if (is_empty(s)) {
        fprintf(stderr, "스택 공백 에러\n");
        exit(1);
    }
    else return s->data[(s->top)];
}
// === 스택 코드 끝 ===

int palindrome(char String[]) {
    StackType s;
    init_stack(&s);
    for (int i = 0; String[i] != 0; i++) {//스택에 문자열 저장
        push(&s, String[i]);// 함수 호출시// 스택 주소를 전달
    }

    for (int i = 0; String[i] != 0; i++) {
        if (String[i] != pop(&s)) {// 문자열과 스택을 비교하면서 스택에 들어있는 데이터 삭제
            return 0;// 문자열과 스택의 데이터가 다르면 0을 반환=>회문이 아닙니다.
        }
    }
    return 1;//전체 문자열과 스택에 저장된 데이터들이 모두 같으면 1 반환=>회문입니다

}

int main(void)
{
    StackType s;  // 스택 정적 생성

    printf("[스택을 이용한 회문 판단] 문자열을 입력하시오: ");
    char String[MAX_STACK_SIZE];
    gets(String);
    if (palindrome(String)) {//회문검사
        printf("회문입니다");
    }
    else {
        printf("회문이 아닙니다.");
    }
}
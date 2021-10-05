#include <stdio.h>
#include <string.h>
void main() {
	int index = 0;
	char s[100];
	char sec[100];
	printf("공백이 있는 문자열을 입력하시오: ");
	gets_s(s,100);
	for (int i = 0; i <= strnlen_s(s,100); i++) {
		if (s[i] != ' ') {
			sec[index] = s[i];
			index++;
		}
	}
	sec[index] = 0;
	puts(sec);
}
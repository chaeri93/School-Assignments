#include <stdio.h>
#include <string.h>
void main() {
	int index = 0;
	char s[100];
	char sec[100];
	printf("������ �ִ� ���ڿ��� �Է��Ͻÿ�: ");
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
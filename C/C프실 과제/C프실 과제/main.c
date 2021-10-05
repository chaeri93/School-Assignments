#include <stdio.h> 
#include <string.h> 
void reverse(char* token, char separate[]) {
    token = strtok(token, separate);
    if (token != NULL) {
        reverse(NULL, separate);
        printf("%s ", token);

    }
}

void main() {
    char* token, sep[] = " ,.!?", s[100];

    printf("¹®ÀÚ¿­À» ÀÔ·ÂÇÏ½Ã¿À: ");
    gets(s);
    reverse(s, sep);
}
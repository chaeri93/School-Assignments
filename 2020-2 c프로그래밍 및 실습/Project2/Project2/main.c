#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#define ROWS 4
#define COLS 3
void printMatrix(int a[ROWS][COLS]) {
	for (int i = 0; i < ROWS; i++) {
		printf("|");
		for (int j = 0; j < COLS; j++)
			printf("%4d", a[i][j]);
		printf("|\n");
	}
	printf("\n");
}
void multipleMatrix(int a[ROWS][COLS], int b[ROWS][COLS]) {
	int mul[ROWS][COLS];
	for (int i = 0; i < ROWS; i++) {
		for (int j = 0; j < COLS; j++) {
			mul[i][j] = 0;
			for (int k = 0; k < COLS; k++) {
				mul[i][j] += a[i][k] * b[k][j];
			}
		}
	}
	printMatrix(mul);
}
void makeMatrix(int a[ROWS][COLS]) {
	for (int i = 0; i < ROWS; i++)
		for (int j = 0; j < COLS; j++)
			a[i][j] = rand() % 10;
	printMatrix(a);
}
void main() {
	int first[ROWS][COLS];
	int second[ROWS][COLS];
	srand(time(NULL));
	makeMatrix(first);
	makeMatrix(second);
	multipleMatrix(first, second);
}
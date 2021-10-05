#include <stdio.h>
void get_sum_diff(int x, int y, int* p_sum, int* p_diff) {
	*p_sum = x + y;
	if (x > y)
		*p_diff = x - y;
	else
		*p_diff = y - x;
}
void main() {
	int x, y, sum, diff;
	printf("x의 값: ");
	scanf_s("%d", &x);
	printf("y의 값: ");
	scanf_s("%d", &y);
	get_sum_diff(x, y, &sum, &diff);
	printf("x와 y의 합은 %d이고 차는 %d이다", sum, diff);
}
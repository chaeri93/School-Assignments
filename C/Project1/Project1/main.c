#include <stdio.h>

void main()
{
	int x, y, z, w;
	printf("정수 4개를 입력하시오\n");
	printf("x: ");
	scanf("%d", &x);
	printf("y: ");
	scanf("%d", &y);
	printf("z: ");
	scanf("%d", &z);
	printf("w: ");
	scanf("%d", &w);
	if ((x >= y) && (x >= z) && (x >= w))
		printf("최대값: %d",x);
	else if ((y >= x) && (y >= z) && (y >= w))
		printf("최대값: %d",y);
	else if ((z >= x) && (z >= y) && (z >= w))
		printf("최대값: %d",z);
	else
		printf("최대값: %d",w);
}
#include <stdio.h>

void main()
{
	int x, y, z, w;
	printf("���� 4���� �Է��Ͻÿ�\n");
	printf("x: ");
	scanf("%d", &x);
	printf("y: ");
	scanf("%d", &y);
	printf("z: ");
	scanf("%d", &z);
	printf("w: ");
	scanf("%d", &w);
	if ((x >= y) && (x >= z) && (x >= w))
		printf("�ִ밪: %d",x);
	else if ((y >= x) && (y >= z) && (y >= w))
		printf("�ִ밪: %d",y);
	else if ((z >= x) && (z >= y) && (z >= w))
		printf("�ִ밪: %d",z);
	else
		printf("�ִ밪: %d",w);
}
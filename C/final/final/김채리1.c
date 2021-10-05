#include <stdio.h>

int product(int a, int b)
{
	if (b == 1)
		return a;
	else if (b <= 0)
		return 0;
	else
		return a + product(a, b - 1);
}
int modulo(int a, int b)
{
	int result, c;
	if (b == 1)
		return a;
	else if (b <= 0)
		return a;
	else {
		c = a;
		for (int i = 0; i < quotient(a, b); i++) {
			result = c - b;
			c = c - b;
		}
		return result;
	}
}
int quotient(int a, int b)
{
	int count;
	if (b == 1)
		return b;
	else if (b <= 0)
		return b;
	else {
		a = a - b;
		count++;
		quotient(a - b, b);
		return count;
	}
}
void main()
{
	printf("°ö : %d, ¸ò : %d, ³ª¸ÓÁö : %d\n", product(14, 5), quotient(14, 5), modulo(14, 5));
}
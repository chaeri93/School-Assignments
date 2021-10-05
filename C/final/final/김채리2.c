#include <stdio.h>
#include <string.h>
#define SIZE 20
typedef struct
{
	char title[SIZE];
	char genre[SIZE];
}Movie;
void menu()
{
	printf("\n============\n");
	printf(" 1. �߰�\n");
	printf(" 2. ���\n");
	printf(" 3. �˻�\n");
	printf(" 4. ����\n");
	printf("============\n\n");
}
void add_movie(Movie m[], int count)
{
	m = (Movie*)malloc(sizeof(Movie) * count);
	for (int i = 0; i < count; i++) {
		printf("���� : ");
		gets_s(m[count].title, SIZE);
		printf("�帣 : ");
		gets_s(m[count].genre, SIZE);
	}
}
void print_movie(Movie m[], int count)
{
	for (int i = 0; i < count; i++) {
		for (int j = 0; j<strlen(m[count].title); j++)
			printf("%d.	%c",i+1, m[count].title[j]);
		for (int k = 0; k < strlen(m[count].genre); k++)
			printf("	%c", m[count].genre[k]);
	}
		
}
void search_movie(Movie m[], int count)
{
	char str[SIZE];
	int choice;
	printf("���� �˻��� 1, �帣 �˻��� 2�� �Է� : ");
	scanf("%d", &choice);
	getchar(); 
	if (choice == 1) {
		printf("���� : ");
		gets_s(str, SIZE);
		for (int i = 0; i < SIZE; i++)
			if (strcmp(str, m[i].title) == 0)
				printf("%c", m[i].title);
	}
	if (choice == 2) {
		printf("�帣 : ");
		gets_s(str, SIZE);
		for (int i = 0; i < SIZE; i++)
			if (strcmp(str, m[i].genre) == 0)
				printf("%c", m[i].genre);
	}
}
void main()
{
	Movie movies[SIZE];
	int num, count = 0;
	while (1)
	{
		menu();
		printf("�޴��� �����ϼ��� : ");
		scanf("%d", &num);
		printf("\n");
		getchar();
		switch (num)
		{
		case 1:
			printf("�� ���̳� �����Ͻðڽ��ϱ�? ");
			scanf("%d", &count);
			add_movie(movies,  count);
			break;
		case 2:
			print_movie(movies, count);
			break;
		case 3:
			search_movie(movies, count);
			break;
		case 4:
			printf("���α׷��� �����մϴ�...\n");
			return;
		}
	}
}
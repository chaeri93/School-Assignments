#include <stdio.h>


float get_average(int arr[], int N) {    //�迭�� ����� ���ϴ� �Լ�
	float sum, result;
	sum = 0;
	for (int i = 0; i < N; i++) {
		sum += arr[i];
	}
	result = sum / N;
	return result;
}

void swap(int* a, int* b) {    //���� ��ȯ���ִ� �Լ�
	int temp = *a;
	*a = *b;
	*b = temp;
}

void bubble_sort(int arr[], int N) {   // Bubble sort
	for (int i = 0; i < N; i++) {   // 0 ~ (i-1)���� �ݺ�
		for (int j = 0; j < N-1-i; j++) {   // j��°�� j+1��°�� ��Ұ� ũ�� ���� �ƴϸ� ��ȯ
			if (arr[j] > arr[j + 1]) 
				swap(&arr[j], &arr[j + 1]);
		}
	}
}

int main(void) {
	int myTeam[100];
	int otherTeam[100];
	int N, K;
	int min_index, max_index;
	float before;
	scanf_s("%d %d", &N, &K);

	for (int i = 0; i < N; i++) {    //�� �� ������ ���� �Է�
		scanf_s("%d", &myTeam[i]);
	}

	for (int i = 0; i < N; i++) {    //����� ������ ���� �Է�
		scanf_s("%d", &otherTeam[i]);
	}
	before = get_average(myTeam, N);   //���� ���

	bubble_sort(myTeam, N);
	bubble_sort(otherTeam, N);
	//������ ����� ������ ���� ����

	for (int i = 0; i < K; i++) {
		if (myTeam[0] >= otherTeam[N-1])   // ������ ������ ������ ����� �ְ��� ������ ������ �ִ� �������� ������ ���ų� ������ Ʈ���̵� �� �ʿ䰡 ���⶧���� for�� Ż��
			break;
		else {
			swap(&myTeam[0], &otherTeam[N-1]);    //���� ������ ������ ����� �ְ��� Ʈ���̵�
			bubble_sort(myTeam, N);    
			bubble_sort(otherTeam, N);     //Ʈ���̵� �� ������ ����� ������ ���� ����
		}
	}

	printf("\n");
	for (int i = 0; i < N; i++) {    //Ʈ����Ʈ �Ϸ�� �������� ���� ���
		printf("%d ", myTeam[i]);
	}
	printf("\n");

	printf("%.1f -> %.1f", before, get_average(myTeam, N));    //������հ� Ʈ���̵�Ϸ� �� �Ҽ��� ù°�ڸ������� ��� ���

}


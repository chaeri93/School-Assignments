#include <stdio.h>


float get_average(int arr[], int N) {    //배열의 평균을 구하는 함수
	float sum, result;
	sum = 0;
	for (int i = 0; i < N; i++) {
		sum += arr[i];
	}
	result = sum / N;
	return result;
}

void swap(int* a, int* b) {    //서로 교환해주는 함수
	int temp = *a;
	*a = *b;
	*b = temp;
}

void bubble_sort(int arr[], int N) {   // Bubble sort
	for (int i = 0; i < N; i++) {   // 0 ~ (i-1)까지 반복
		for (int j = 0; j < N-1-i; j++) {   // j번째와 j+1번째의 요소가 크기 순이 아니면 교환
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

	for (int i = 0; i < N; i++) {    //내 팀 선수들 성적 입력
		scanf_s("%d", &myTeam[i]);
	}

	for (int i = 0; i < N; i++) {    //상대팀 선수들 성적 입력
		scanf_s("%d", &otherTeam[i]);
	}
	before = get_average(myTeam, N);   //이전 평균

	bubble_sort(myTeam, N);
	bubble_sort(otherTeam, N);
	//내팀과 상대팀 선수들 성적 정렬

	for (int i = 0; i < K; i++) {
		if (myTeam[0] >= otherTeam[N-1])   // 내팀의 최하위 선수가 상대팀 최고의 성적을 가지고 있는 선수보다 성적이 높거나 같으면 트레이드 할 필요가 없기때문에 for문 탈출
			break;
		else {
			swap(&myTeam[0], &otherTeam[N-1]);    //내팀 최하위 선수와 상대팀 최고선수 트레이드
			bubble_sort(myTeam, N);    
			bubble_sort(otherTeam, N);     //트레이드 후 내팀과 상대팀 선수들 성적 정렬
		}
	}

	printf("\n");
	for (int i = 0; i < N; i++) {    //트레이트 완료된 선수들의 성적 출력
		printf("%d ", myTeam[i]);
	}
	printf("\n");

	printf("%.1f -> %.1f", before, get_average(myTeam, N));    //이전평균과 트레이드완료 후 소수점 첫째자리까지만 평균 출력

}


#define _CRT_SECURE_NO_WARNINGS 
#include <stdio.h>
#include <stdlib.h>

const char* outputFileName = "hw03_output.txt";
const int max = 201;

int cal_front(int a, char line[201]) {
	char front[100];
	long long first;
	for (int i = 0; i < a; i++) {
		front[i] = line[i];
	}
	first = atoi(front);
	return first;
}

int cal_back(int a, char line[201]) {
	char back[100];
	long long second;
	for (int i = a + 1; i < strlen(line); i++) {
		back[i - a - 1] = line[i];
	}
	second = atoi(back);
	return second;
}

void calculate_big(FILE* fp, char op, int a, char line[201]) {
	long long first, second;
	first = cal_front(a, line);
	second = cal_back(a, line);
	fprintf(fp, "%d ", first > second);
	fprintf(fp, "\n");
}

void calculate_small(FILE* fp, char op, int a, char line[201]) {
	long long first, second;
	first = cal_front(a, line);
	second = cal_back(a, line);
	fprintf(fp, "%d ", first < second);
	fprintf(fp, "\n");
}

void calculate_equal(FILE* fp, char op, int a, char line[201]) {
	long long first, second;
	first = cal_front(a, line);
	second = cal_back(a, line);
	fprintf(fp, "%d ", first == second);
	fprintf(fp, "\n");
}

void calculate_mul(FILE* fp, char op, int a, char line[201]) {
	long long first, second;
	first = cal_front(a, line);
	second = cal_back(a, line);
	fprintf(fp, "%d ", first * second);
	fprintf(fp, "\n");
}

void calculate_sub(FILE* fp, char op, int a, char line[201]) {
	long long  first, second, k;
	char b[100];
	first = cal_front(a, line);
	second = cal_back(a, line);
	k = first - second;
	sprintf(b, "%d", k);
	for (int i = 0; i < strlen(b); i++) {
		fprintf(fp, "%d ", &b[i]);
	}
	fprintf(fp, "\n");
}

void calculate_sum(FILE* fp, char op, int a, char line[201]) {
	char front[100];
	long long first, second;
	first = cal_front(a, line);
	second = cal_back(a, line);
	fprintf(fp, "%d ", first + second);
	fprintf(fp, "\n");
}



int main() {
	//MK: YOUR NAME with Student ID
	int count = 0;
	char line[201];
	char one[100];
	char op = ' ';

	FILE* inFile = fopen("input.txt", "r");
	FILE* outFile = fopen(outputFileName, "w");
	printf("Kim Chaeri (2071018)\n");

	fgets(one, 100, inFile);
	count = atoi(one);
	while (count) {
		fgets(line, 201, inFile);
		printf(line);
		for (int i = 0;  i < strlen(line); i++) {
			if (line[i] == '>') {
				op = line[i];
				calculate_big(outFile, op, i, line);
			}
			else if (line[i] == '<') {
				op = line[i];
				calculate_small(outFile, op, i, line);
			}
			else if (line[i] == '=') {
				op = line[i];
				calculate_equal(outFile, op, i, line);
			}
			else if (line[i] == '*') {
				op = line[i];
				calculate_mul(outFile, op, i, line);
			}
			else if (line[i] == '-') {
				op = line[i];
				calculate_sub(outFile, op, i, line);
			}
			else if (line[i] == '+') {
				op = line[i];
				calculate_sum(outFile, op, i, line);
			}
		}
		count--;
	}
	fclose(outFile);
	fclose(inFile);
	return 1;
}



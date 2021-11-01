#define _CRT_SECURE_NO_WARNINGS 
#include <stdio.h>

const int MAX = 10;
const char* outputFileName = "hw02_output.txt";


void input_Matrix(int matrix[][10], FILE* fp) {
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			fscanf(fp, "%d", &matrix[i][j]);
		}
	}
}

void add_zeroA(int matrix[][10], int matrix_output[][28]) {
	for (int i = 0; i < 10; i++) {
		switch (i) {
			case 0:
				for (int j = 0; j < 18; j++)
					matrix_output[0][j] = 0;
				for (int j = 18; j < 28; j++)
					matrix_output[0][j] = matrix[0][j - 18];
				break;
			case 1:
				for (int j = 0; j < 17; j++)
					matrix_output[1][j] = 0;
				for (int j = 17; j < 27; j++)
					matrix_output[1][j] = matrix[1][j - 17];
				matrix_output[1][27] = 0;
				break;
			case 2:
				for (int j = 0; j < 16; j++)
					matrix_output[2][j] = 0;
				for (int j = 16; j < 26; j++)
					matrix_output[2][j] = matrix[2][j - 16];
				matrix_output[2][26] = 0;
				matrix_output[2][27] = 0;
				break;
			case 3:
				for (int j = 0; j < 15; j++)
					matrix_output[3][j] = 0;
				for (int j = 15; j < 25; j++)
					matrix_output[3][j] = matrix[3][j - 15];
				matrix_output[3][25] = 0;
				matrix_output[3][26] = 0;
				matrix_output[3][27] = 0;
				break;
			case 4:
				for (int j = 0; j < 14; j++)
					matrix_output[4][j] = 0;
				for (int j = 14; j < 24; j++)
					matrix_output[4][j] = matrix[4][j - 14];
				for (int j = 24; j < 28; j++)
					matrix_output[4][j] = 0;
				break;
			case 5:
				for (int j = 0; j < 13; j++)
					matrix_output[5][j] = 0;
				for (int j = 13; j < 23; j++)
					matrix_output[5][j] = matrix[5][j - 13];
				for (int j = 23; j < 28; j++)
					matrix_output[5][j] = 0;
				break;
			case 6:
				for (int j = 0; j < 12; j++)
					matrix_output[6][j] = 0;
				for (int j = 12; j < 22; j++)
					matrix_output[6][j] = matrix[6][j - 12];
				for (int j = 22; j < 28; j++)
					matrix_output[6][j] = 0;
				break;
			case 7:
				for (int j = 0; j < 11; j++)
					matrix_output[7][j] = 0;
				for (int j = 11; j < 21; j++)
					matrix_output[7][j] = matrix[7][j - 11];
				for (int j = 21; j < 28; j++)
					matrix_output[7][j] = 0;
				break;
			case 8:
				for (int j = 0; j < 10; j++)
					matrix_output[8][j] = 0;
				for (int j = 10; j < 20; j++)
					matrix_output[8][j] = matrix[8][j - 10];
				for (int j = 20; j < 28; j++)
					matrix_output[8][j] = 0;
				break;
			case 9:
				for (int j = 0; j < 9; j++)
					matrix_output[9][j] = 0;
				for (int j = 9; j < 19; j++)
					matrix_output[9][j] = matrix[9][j - 9];
				for (int j = 19; j < 28; j++)
					matrix_output[9][j] = 0;
				break;
		}
	}

}

void add_zeroB(int matrix[][10], int matrix_output[][10]) {
	for (int i = 0; i < 10; i++) {
		switch (i) {
		case 0:
			for (int j = 0; j < 18; j++)
				matrix_output[j][0] = 0;
			for (int j = 18; j < 28; j++)
				matrix_output[j][0] = matrix[j - 18][0];
			break;
		case 1:
			for (int j = 0; j < 17; j++)
				matrix_output[j][1] = 0;
			for (int j = 17; j < 27; j++)
				matrix_output[j][1] = matrix[j - 17][1];
			matrix_output[27][1] = 0;
			break;
		case 2:
			for (int j = 0; j < 16; j++)
				matrix_output[j][2] = 0;
			for (int j = 16; j < 26; j++)
				matrix_output[j][2] = matrix[j - 16][2];
			matrix_output[26][2] = 0;
			matrix_output[27][2] = 0;
			break;
		case 3:
			for (int j = 0; j < 15; j++)
				matrix_output[j][3] = 0;
			for (int j = 15; j < 25; j++)
				matrix_output[j][3] = matrix[j - 15][3];
			matrix_output[25][3] = 0;
			matrix_output[26][3] = 0;
			matrix_output[27][3] = 0;
			break;
		case 4:
			for (int j = 0; j < 14; j++)
				matrix_output[j][4] = 0;
			for (int j = 14; j < 24; j++)
				matrix_output[j][4] = matrix[j - 14][4];
			for (int j = 24; j < 28; j++)
				matrix_output[j][4] = 0;
			break;
		case 5:
			for (int j = 0; j < 13; j++)
				matrix_output[j][5] = 0;
			for (int j = 13; j < 23; j++)
				matrix_output[j][5] = matrix[j - 13][5];
			for (int j = 23; j < 28; j++)
				matrix_output[j][5] = 0;
			break;
		case 6:
			for (int j = 0; j < 12; j++)
				matrix_output[j][6] = 0;
			for (int j = 12; j < 22; j++)
				matrix_output[j][6] = matrix[j - 12][6];
			for (int j = 22; j < 28; j++)
				matrix_output[j][6] = 0;
			break;
		case 7:
			for (int j = 0; j < 11; j++)
				matrix_output[j][7] = 0;
			for (int j = 11; j < 21; j++)
				matrix_output[j][7] = matrix[j - 11][7];
			for (int j = 21; j < 28; j++)
				matrix_output[j][7] = 0;
			break;
		case 8:
			for (int j = 0; j < 10; j++)
				matrix_output[j][8] = 0;
			for (int j = 10; j < 20; j++)
				matrix_output[j][8] = matrix[j - 10][8];
			for (int j = 20; j < 28; j++)
				matrix_output[j][8] = 0;
			break;
		case 9:
			for (int j = 0; j < 9; j++)
				matrix_output[j][9] = 0;
			for (int j = 9; j < 19; j++)
				matrix_output[j][9] = matrix[j - 9][9];
			for (int j = 19; j < 28; j++)
				matrix_output[j][9] = 0;
			break;
		}
	}
}

void print_output_to_file(FILE* fp, int ROW, int COL, int matrixOutput[][10]) {
	for (int y = 0; y < ROW; y++) {
		for (int x = 0; x < COL; x++) {
			fprintf(fp, "%d ", matrixOutput[y][x]);
		}
		fprintf(fp, "\n");
	}
}

void calculate_systolic_array(int matrixA[][28], int matrixB[][10], int matrixOutput[10][10], FILE* fp) {
	int tempA[10][10] = { 0 };
	int tempB[10][10] = { 0 };
	fprintf(fp, "Cycle 0 \n");
	print_output_to_file(fp, 10, 10, matrixOutput);
	for (int cycle = 27; cycle > -1; cycle--) {
		int print_cycle = 28 - cycle;
		/*int i = 9;
		while (i > 0) {
			for (int j = 0; j < 10; j++)
				tempA[j][i] = tempA[j][i - 1];
			i--;
		}*/
		for (int i = 9; i > 0; i--) {
			tempA[0][i] = tempA[0][i - 1];
			tempA[1][i] = tempA[1][i - 1];
			tempA[2][i] = tempA[2][i - 1];
			tempA[3][i] = tempA[3][i - 1];
			tempA[4][i] = tempA[4][i - 1];
			tempA[5][i] = tempA[5][i - 1];
			tempA[6][i] = tempA[6][i - 1];
			tempA[7][i] = tempA[7][i - 1];
			tempA[8][i] = tempA[8][i - 1];
			tempA[9][i] = tempA[9][i - 1];
		}
		/*int a = 0;
		while (a < 10) {
			tempA[a][0] = matrixA[a][cycle];
			a++;
		}*/
		tempA[0][0] = matrixA[0][cycle];
		tempA[1][0] = matrixA[1][cycle];
		tempA[2][0] = matrixA[2][cycle];
		tempA[3][0] = matrixA[3][cycle];
		tempA[4][0] = matrixA[4][cycle];
		tempA[5][0] = matrixA[5][cycle];
		tempA[6][0] = matrixA[6][cycle];
		tempA[7][0] = matrixA[7][cycle];
		tempA[8][0] = matrixA[8][cycle];
		tempA[9][0] = matrixA[9][cycle];
		int k = 9;
		while (k > 0) {
			for (int j = 0; j < 10; j++)
				tempB[k][j] = tempB[k - 1][j];
			k--;
		}
		int b = 0;
		while (b < 10) {
			tempB[0][b] = matrixB[cycle][b];
			b++;
		}
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 10; y++) {
				matrixOutput[x][y] = matrixOutput[x][y] + (tempA[x][y] * tempB[x][y]);
			}
		}
		fprintf(fp, "Cycle %d \n", print_cycle);
		print_output_to_file(fp, 10, 10, matrixOutput);
	}
}

int main() {
	//MK: YOUR NAME with Student ID
	int getmatrixA[10][10];
	int getmatrixB[10][10];
	int matrixA[10][28];
	int matrixB[28][10];
	int matrixResult[10][10] = {0};

	const char* inFileName = "input.txt";
	printf("Kim, Chaeri (2071018)\n");
	FILE* inFile = fopen(inFileName, "r");
	FILE* outFile = fopen(outputFileName, "w");

	input_Matrix(getmatrixA, inFile);
	input_Matrix(getmatrixB, inFile);
	add_zeroA(getmatrixA, matrixA);
	add_zeroB(getmatrixB, matrixB);
	
	calculate_systolic_array(matrixA, matrixB, matrixResult, outFile);
	
	fclose(outFile);
	fclose(inFile);
	return 1;
}

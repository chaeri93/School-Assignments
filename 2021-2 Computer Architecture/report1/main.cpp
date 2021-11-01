/*
 * =====================================================================================
 *
 *       Filename:  main.cpp
 *
 *    Description:  Homework #01
 *
 *        Version:  1.0
 *        Created:  2021-09-04
 *       Revision:  none
 *       Compiler:  g++
 *
 * 	 Student Name:Chaeri 
 * 		 Student ID: 2071018
 *   Organization:  Ewha Womans University
 *
 * =====================================================================================
 */

#include <stdio.h>

const int MAX = 10;
const char *outputFileName="hw01_output.txt";

void calc_Matrix(int matrix1[][10], int matrix2[][10], int matrixOutput[][10], int A,int B, int C){
	for(int x = 0; x < A; x++){
		for(int y=0; y<C; y++){
			matrixOutput[x][y]=0;
			for(int z=0; z< B; z++){
				matrixOutput[x][y] += matrix1[x][z]*matrix2[z][y];
				
			}
			printf("%2d ", matrixOutput[x][y]);
		}
		printf("\n");	
	}
}

void print_output_to_file(FILE *fp, int ROW, int COL, int matrixOutput[][10]){
	for(int y = 0; y < ROW; y++){
		for(int x = 0; x < COL; x++){
			fprintf(fp, "%d ", matrixOutput[y][x]);
			/*printf("print output file");*/
		}
		fprintf(fp, "\n");
	}
}

int main(){

	int count=0;
	int matrix1[10][10];
	int matrix2[10][10];
	int matrixOutput[10][10];
	int A,B,C=0;

	printf("Kim, Chaeri (2071018)\n");
	FILE *inFile = fopen("input.txt","r");
	FILE *outFile = fopen(outputFileName, "w");

	fscanf(inFile, "%d", &count);
	while(count){
		fscanf(inFile, "%d %d %d", &A, &B, &C);
		for(int x = 0; x < A; x++){
			for(int y = 0; y < B; y++){
				matrix1[x][y]=0;
				fscanf(inFile, "%d ", &matrix1[x][y]);
			}		
		}

		for(int x = 0; x < B; x++){
			for(int y = 0; y < C; y++){
				matrix2[x][y]=0;
				fscanf(inFile, "%d ", &matrix2[x][y]);
					
			}
		}
		calc_Matrix(matrix1, matrix2, matrixOutput, A, B, C);
		print_output_to_file(outFile, A, C, matrixOutput);
		
		count--;
	}
	
	fclose(outFile);
	fclose(inFile);
	return 1;
}



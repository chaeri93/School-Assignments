#define _CRT_SECURE_NO_WARNINGS 
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define DEBUG 0

const char* outputFileName = "hw04_output.txt";

unsigned long long cacheHit;
unsigned long long cacheMiss;

void init() {
    cacheHit = 0;
    cacheMiss = 0;
}

void ratio(FILE* fp) {
    unsigned long long total = cacheHit + cacheMiss;
    fprintf(fp, "Hit: %3.2f\n", (float)cacheHit / total *100);
    fprintf(fp, "Miss: %3.2f\n", (float)cacheMiss / total * 100);
}

unsigned int htoi(const char str[])
{
    /* Local Variables */
    unsigned int nResult = 0;

    for (int i = 0; i <= strlen(str); i++)
    {
        if (str[i] >= 'A' && str[i] <= 'F')                // chHex���� 'A'(65)~'F'(70) �϶�
            nResult = nResult * 16 + str[i] - 'A' + 10;
        else if (str[i] >= 'a' && str[i] <= 'f')                // chHex���� 'a'(97)~'f'(102) �϶�
            nResult = nResult * 16 + str[i] - 'a' + 10;
        else if (str[i] >= '0' && str[i] <= '9')            // chHex���� '0'(48)~'9'(57) �϶�
            nResult = nResult * 16 + str[i] - '0';
    }
    return nResult;
}

int seq_search(int a[], int n, int key) {
    for (int i = 0; i < n; i++) {
        if (a[i] == key) {
            return i; 
        }
    }
    return -1;
}

int main() {
    //MK: YOUR NAME with Student ID
    int test = 0;
    int blocks_num = 0;
    int address_num = 0;
    int block_size = 0;
    char line[10000];
    char one[100];

    int j,b = 0;
    unsigned int L, R=0;
    

    FILE* inFile = fopen("input.txt", "r");
    FILE* outFile = fopen(outputFileName, "w");
    printf("Kim, Chaeri (2071018)\n");
    init();


    fgets(one, 100, inFile);
    test = atoi(one);
    while (test>0) {
        int index[512] = { 0 ,};
        int tag[512] = { 0 ,};
        init();
        fgets(line, 201, inFile);
        blocks_num = atoi(line);

        fgets(line, 201, inFile);
        block_size = atoi(line);

        fgets(line, 201, inFile);
        address_num = atoi(line);

        for (int i = 0; i < address_num; i++) {
            fgets(line, 201, inFile);
            b = htoi(line);
            L = b / 10;
            R = b % 10;
            j = seq_search(index, address_num, L);
            if (j == -1) {
                tag[i] = R;
                index[i] = L;
                cacheMiss++;
            }
            else {
                if (tag[j] = R) {
                    cacheHit++;
                }
                else {
                    tag[j] = R;
                }
            }
        }

        ratio(outFile);
        test--;
    }
    return 1;
}

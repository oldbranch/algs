#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

const int N = 100;
int prime[N];
int main(void){
    int i,j;
    memset(prime,0,sizeof prime);
    prime[2] = 1;
    
    for (i = 2;i * i <= N;i++) {
        if (!prime[i]) {
            if (i > N/i) continue;
            for (j = i*i; j <= N; j+=i) {
                prime[j] = 1;
            }
        }
    }
    int test;
    while(printf("Enter number: ") && scanf("%d",&test)){
        if (prime[test]) {
            printf("Not Prime\n");
        } else {
            printf("Prime\n");
        }
    }
    return 0;
}
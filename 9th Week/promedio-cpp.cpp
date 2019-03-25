// ConsoleApplication1.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define MAX 100

void FillArray(int[MAX], int);
void nombreFuncion(int[MAX], int[MAX], int);

int main()
{
  int A[MAX] = {};
  int B[MAX] = {};
  int n;

  do {
    printf("Porfavor introduzca el tama%co del arreglo: ", -92);
    scanf("%d", &n);
    if (n<0 || n>MAX) {
      printf("\nEse valor no esta en el rango!!\n");
    }
  } while (n<0 || n>MAX);
  FillArray(A, n);
  nombreFuncion(A, B, n);

}

void FillArray(int A[MAX], int n) {
  for (int i = 0; i < n; i++) {
    printf("Deme el numero %d: ", i+1);
    scanf("%d", &A[i]);
  }
}

void nombreFuncion(int A[MAX], int B[MAX], int n) {
  int count = 0;
  int suma = 0;
  float c = 0;
	
  printf("\nValores Par: \n");
  for (int i = 0; i < n; i++) {
    if ((A[i] % 2) == 0) {
    	
      	printf("%d\n",A[i]);
    }else{
    	if(A[i] > 0 && A[i] < 101){
    		c += A[i];
    		count++;
		}
	}
  }
  printf("\nPromedio de impares: %f", (c/count));
}





// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file


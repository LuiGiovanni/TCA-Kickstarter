// ConsoleApplication1.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define MAX 100

void FillArray(int[MAX], int);
void PrintArray(int[MAX], int);

int main()
{
  srand(time(0));
  int A[MAX] = {};
  int n;

  do {
    printf("Porfavor introduzca el tamaño del arreglo: ");
    scanf_s("%d", &n);
    if (n<0 || n>MAX) {
      printf("\nEse valor no esta en el rango!!\n");
    }
  } while (n<0 || n>MAX);
  for (int i = 0; i <= n; i++) {
    A[i] = rand() % 101;
  }
  printf("\n");
  for (int j = 0; j <= n; j++) {
    printf("Valor numero %d: %d\n", j, A[MAX]);
  }
  /*FillArray(A, n);
  PrintArray(A, n);*/


}

void FillArray(int A[MAX], int n) {
  for (int i = 0; i <= n; i++) {
    A[i] = rand() % 101;
  }
}

void PrintArray(int A[MAX], int n) {
  printf("\n");
  for (int i = 0; i <= n; i++) {
    printf("Valor numero %d: %d\n", i, A[MAX]);
  }
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


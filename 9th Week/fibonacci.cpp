// ConsoleApplication1.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <stdio.h>
#include <stdlib.h>

#define MAX 100

void fibonacci(int);

int main()
{
  int n;

  do {
    printf("Porfavor introduzca hasta que numero mostrare: ");
    scanf("%d", &n);
    if (n<0 || n>MAX) {
      printf("\nEse valor no esta en el rango!!\n");
    }
    system("cls");
  } while (n<0 || n>MAX);
  fibonacci(n);

}

void fibonacci(int n) {
	int actual=1;
	int pasado=0;
	int temp=0;
	
	printf("\nSerie de fibonacci: \n%d, %d", 0,1);
	for(int i=2;i<n;i++){
		printf(", %d", (pasado+actual));
		temp = pasado + actual;
		pasado = actual;
		actual = temp;
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


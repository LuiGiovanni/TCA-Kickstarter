// ConsoleApplication1.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define MAX 100

void anadir_elemento(int n);
void sort();
void mostrar_lista();
int encontrarPrimis();

struct nodo{
	int valor;
	nodo *siguiente;
};

nodo *primero, *ultimo, *primis;

int main(){
  int n, valor, posicion;

  do {
    printf("Porfavor introduzca el tama%co del arreglo: ", -92);
    scanf("%d", &n);
    if (n<0 || n>MAX) {
      printf("\nEse valor no esta en el rango!!\n");
    }
  } while (n<0 || n>MAX);
  for(int i=0;i<n;i++){
  	printf("Valor %d: ",i+1);
  	scanf("%d",&valor);
  	anadir_elemento(valor);
  }
  printf("\nMostrando la nodo antes del sort:\n");
  mostrar_lista();
  sort();
  printf("\nMostrando la nodo despues del sort:\n");
  mostrar_lista();
  posicion = encontrarPrimis();
  printf("\nLa nueva posicion del primer valor es: %d\n",posicion);
}

void sort(){
    nodo * list_end = NULL;
    primis = primero;
    while(list_end != primero){
        nodo *temp, *swap1;
        swap1 = primero;
        while( swap1->siguiente != list_end ){
            if(swap1->valor > swap1->siguiente->valor){
                nodo *swap2 = swap1->siguiente;
                swap1->siguiente = swap2->siguiente;
                swap2->siguiente = swap1;
                if(swap1 == primero){
                    primero = swap2;
                    swap1 = swap2;
                }else{
                    swap1 = swap2;
                    temp->siguiente = swap2;
                }
            }
            temp = swap1;
            swap1 = swap1->siguiente;
        }
        list_end = swap1;
    }
    
}

 void mostrar_lista() {
      nodo *auxiliar; /* lo usamos para recorrer la lista */
      int i;
 
      i=0;
      auxiliar = primero;
      while (auxiliar!=NULL) {
            printf( "Valor %d: %d\n",i+1,auxiliar->valor);
            auxiliar = auxiliar->siguiente;
            i++;
      }
      if (i==0) printf( "\nLa nodo está vacía!!\n" );
 }

void anadir_elemento(int valor){
    nodo *front, *tail;
    tail = new nodo;
    tail->valor = valor;
    tail->siguiente = NULL;
    if(primero == NULL) primero = tail;
    else{
        front = primero;
        while(front->siguiente!=NULL) front = front->siguiente;
        front->siguiente = tail;
    }
}

int encontrarPrimis(){
	nodo *auxiliar; /* lo usamos para recorrer la lista */
	int i;
	
	i=1;
	auxiliar = primero;
	while (auxiliar!=primis) {
	    i++;
	    auxiliar = auxiliar->siguiente;
	}
	return i;
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


#include<stdio.h>
#include<stdlib.h>

void insert_posn(int *, int, int, int);
void printArr(int * , int );
void swap(int *, int *);

int main()
{
	system("cls");

	int arr[10] = {1,2,3,4,5};
	int n = 4;

	//insert_posn -- array name, num, index, num of element in arr
	insert_posn(arr, 3 ,2, n);
	print_arr(arr , 5);

	return 0;
}

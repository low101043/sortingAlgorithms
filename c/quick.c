#include <stdio.h>
#include <stdlib.h>

typedef struct Tuple
{
     
    int *listToUse;
    int sizeOfList;

} Tuple;

int input(Tuple *toSendBack)
{

    int N, i;
    int *p;

    printf("Please enter how many different values you want: ");
    scanf("%d", &N);

    if ((p = (int *) malloc(N*sizeof(int))) == NULL)
    {
        printf("Allocation failed");
        return -1;
    }
    printf("\nProvide %d integers please \n", N);
    for (i=0; i<N; i++)
    {
        scanf("%d", p+i);
    }

    
    toSendBack->listToUse = p;
    toSendBack->sizeOfList = N;

    return 0;

}

void swap(int *c, int *d)
{
    int temp = *c;
    *c = *d;
    *d = temp;
}

int choosePivot(Tuple *data, int left, int right)
{
    return left;
}

int partition(Tuple *data, int left, int right)
{
    int pivotindex, pivot, leftmark, rightmark;
    pivotindex = choosePivot(data, left, right);
    pivot = *((data ->listToUse) + pivotindex);
    swap(((data->listToUse)+pivotindex), ((data->listToUse)+right));
    leftmark = left;
    rightmark = right - 1;
    while (leftmark <= rightmark)
    {
        while (leftmark <= rightmark && *((data->listToUse) + leftmark) < pivot)
        {
            leftmark++;
        }
        while (leftmark <= rightmark && *((data->listToUse) + rightmark) >= pivot)
        {
            rightmark--;
        }
        if (leftmark < rightmark)
        {
            swap(((data->listToUse)+leftmark), ((data->listToUse)+rightmark));
            leftmark++;
            rightmark++;
        }
    }
    swap(((data->listToUse)+leftmark), ((data->listToUse)+right));
    return leftmark;

}

int quicksort(Tuple *data, int left, int right)
{
    if (left < right)
    {
        int pivotIndex = partition(data, left,right);
        quicksort(data,left,pivotIndex-1);
        quicksort(data,pivotIndex+1,right);
    }
}

int quickAlgorithm(Tuple *data)
{
    quicksort(data, 0, (data->sizeOfList)-1);
}

int main()
{
    int *p, N, i;
    
    Tuple dataForList;
    Tuple *data = &dataForList;

    int finished = input(data);
    if (finished == -1)
    {
        exit(-1);
    }


    int end = quickAlgorithm(data);

    p = data->listToUse;
    N = data->sizeOfList;

    printf("\nThe List in order: ");
    for (i=0; i < N - 1; i++)
    {
        printf("%d, ", *(p+i));
    }
    printf("%d\n", *(p+i));
    free(p);
}
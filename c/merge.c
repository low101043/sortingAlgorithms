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

int merge(Tuple *data, int left, int mid, int right)
{
    int* ptr;
    int bcount, lcount, rcount;
    if ((ptr = (int *) malloc((right-left+1)*sizeof(int))) == NULL)
    {
        printf("Error\n");
        return -1;
    }
    bcount = 0;
    lcount = left;
    rcount = mid +1;
    while ((lcount <= mid) && (rcount <= right))
    {
        if (*((data->listToUse)+lcount) < *((data->listToUse)+rcount))
        {
            *(ptr + bcount) = *((data->listToUse)+lcount);
            bcount++;
            lcount++;
        }
        else
        {
            *(ptr + bcount) = *((data->listToUse)+rcount);
            bcount++;
            rcount++;
        }
    }
    if (lcount > mid)
    {
        while (rcount <= right)
        {
            *(ptr + bcount) = *((data->listToUse)+rcount);
            bcount++;
            rcount++;
        }
    }
    else
    {
        while (lcount <= mid)
        {
            *(ptr + bcount) = *((data->listToUse)+lcount);
            bcount++;
            lcount++;
        }
    }
    for (bcount = 0; bcount < right-left+1; bcount++)
    {
        *((data->listToUse) + left + bcount) = *(ptr + bcount);
    }
    
    free(ptr);
    return 0;
}

int mergeSort(Tuple *data, int left, int right)
{
    if (left < right)
    {
        printf("In mergesort \n");
        int mid;
        mid = (left + right) / 2;
        mergeSort(data, left, mid);
        mergeSort(data, mid+1, right);
        merge(data,left,mid,right);
        printf("Data -> :\n");
    }
}

int mergeAlgorithm(Tuple *data)
{
    mergeSort(data, 0, (data->sizeOfList)-1);
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


    int end = mergeAlgorithm(data);

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
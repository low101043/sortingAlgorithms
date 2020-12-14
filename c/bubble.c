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

int bubble(Tuple *data)
{
    
    int i, j;
    for (i=1; i<data->sizeOfList; i++)
    {
        for (j=data->sizeOfList - 1; j >= i; j--)
        {
            if (*((data->listToUse) + j) < *((data->listToUse) + j - 1))
            {
                swap(((data->listToUse) + j), ((data->listToUse) + j - 1));
            }
        }
    }
    return 0;
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


    int end = bubble(data);

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
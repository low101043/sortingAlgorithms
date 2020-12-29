#include <stdio.h>
#include <stdlib.h>

/**
 * This will get the input list 
 * @param toSendBack the empty list
 * @return an int to say if it's successful
 */
int input(Tuple *toSendBack)
{

    int N, i;
    int *p;

    printf("Please enter how many different values you want: ");
    scanf("%d", &N);

    if ((p = (int *) malloc(N*sizeof(int))) == NULL)  // This dynamically allocates the memory
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

/**
 * This outputs the list
 * @param data the list to be outputted
 */
void output(Tuple *data)
{
    int* p;
    int N, i;
    p = data->listToUse;
    N = data->sizeOfList;

    printf("\nThe List in order: ");
    for (i=0; i < N - 1; i++)
    {
        printf("%d, ", *(p+i));
    }
    printf("%d\n", *(p+i));
    free(p);  //Frees the list
}

/**
 * This is the menu to be outputted
 * @return the input number
 */
int menu()
{
    int input;
    printf("\nPlease select an option to choose a Sorting Algorithm.  \n 1. Bubble Sort  \n 2. Insertion Sort \n 3. Merge Sort \n 4. Quick Sort \n 5. Exit \n Enter 1, 2, 3, 4 or 5: ");
    scanf("%d", &input);
    printf("\n");

    //printf("Input: %d\n", input);
    //printf("input: %d\n", input != 1);
    while(input != 1 && input != 2 && input != 3 && input != 4 && input != 5)
    {
        printf("\nPlease enter a valid input: ");
        scanf("%d", &input);
        printf("\n");

    }

    return input;
}
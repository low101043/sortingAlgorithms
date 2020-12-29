#include <stdio.h>
#include <stdlib.h>

/*
/**
 * This will swap two pointers around
 * @param c Pointer to the first data to be swapped
 * @param d Pointer to the second data to be swapped
 *//*
void swap(int *c, int *d)
{
    int temp = *c;
    *c = *d;
    *d = temp;
}
*/

/**
 * 
 * This will sort the list using Bubble sort in ascending order numericallu
 * @param data Pointer to the data which has the list
 */
int bubble(Tuple *data)
{
    
    int i, j;

    for (i=1; i<data->sizeOfList; i++)
    {
        for (j=data->sizeOfList - 1; j >= i; j--)
        {
            if (*((data->listToUse) + j) < *((data->listToUse) + j - 1))
            {
                swap(((data->listToUse) + j), ((data->listToUse) + j - 1));  //Swaps the data
            }
        }
    }
    return 0;
}

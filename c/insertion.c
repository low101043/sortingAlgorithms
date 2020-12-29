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
 * This will sort data using insertion sort.  Done in ascending order
 * @param data Pointer to the list to be sorted
 */
int insertion(Tuple *data)
{
    int i,j,t;

    for (i=1; i<data->sizeOfList; i++)
    {
        j = i;
        t = *((data-> listToUse) + j);

        while (j > 0 && t < *((data->listToUse)+ (j-1)))
        {
            *((data->listToUse) + j) = *((data->listToUse) + (j-1));
            j = j -1;
        }

        *((data->listToUse) + j) = t; //Puts the data in the correct position
    }

    return 0;
}

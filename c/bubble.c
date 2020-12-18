#include <stdio.h>
#include <stdlib.h>

//#include "utils.h"
//#include "utils.c"


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

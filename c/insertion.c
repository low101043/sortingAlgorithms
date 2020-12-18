#include <stdio.h>
#include <stdlib.h>

//#include "utils.h"
//#include "utils.c"


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

        *((data->listToUse) + j) = t;
    }

    return 0;
}

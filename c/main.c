#include <stdio.h>
#include <stdlib.h>

#include "utils.h"

#include "utils.c"
#include "bubble.c"
#include "io.c"
#include "merge.c"
#include "quick.c"
#include "insertion.c"

int main()
{
    int choice;
    Tuple dataForList;
    Tuple *data;
    data = &dataForList;
    choice = menu();

    while (choice != 5)
    {   
        input(data);
        if (choice == 1)
        {
            
            printf("Performing Bubble Sort\n");
            bubble(data);
            
        }
        else if (choice == 2)
        {
            printf("Performing Insertion Sort\n");
            insertion(data);
        }
        else if (choice == 3)
        {
            printf("Performing Merge Sort \n");
            mergeAlgorithm(data);
        }
        else
        {
            printf("Performing Quick Sort\n");
            quickAlgorithm(data);
        }

        output(data);
        choice = menu();
    }
}
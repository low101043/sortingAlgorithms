#include <stdio.h>
#include <stdlib.h>

//#include "utils.h"
//#include "utils.c"

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

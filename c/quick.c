#include <stdio.h>
#include <stdlib.h>

/**
 * This will choose the pivot
 * @param data The list to be sorted
 * @param left the furtherest left you can go
 * @param right the furtherest right you can go
 */
int choosePivot(Tuple *data, int left, int right)
{
    return left;
}

/**
 * Will sort the data on a pivot
 * @param data The list to be sorted
 * @param left the furtherest left you can go
 * @param right the furtherest right you can go
 * @return where the data has been sorted up to
 */
int partition(Tuple *data, int left, int right)
{
    int pivotindex, pivot, leftmark, rightmark;
    pivotindex = choosePivot(data, left, right);
    pivot = *((data ->listToUse) + pivotindex);

    swap(((data->listToUse)+pivotindex), ((data->listToUse)+right));
    leftmark = left;
    rightmark = right - 1;

    //This will sort the data around the pivot
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

/**
 * This is the recursive step
 * @param data The list to be sorted 
 * @param left the furtherest left you can go
 * @param right the furtherest right you can go
 */
int quicksort(Tuple *data, int left, int right)
{
    if (left < right)
    {
        int pivotIndex = partition(data, left,right);
        quicksort(data,left,pivotIndex-1);
        quicksort(data,pivotIndex+1,right);
    }
}

/**
 * Starts the algorithm
 * @param data The data to be sorted
 */
int quickAlgorithm(Tuple *data)
{
    quicksort(data, 0, (data->sizeOfList)-1);
}

def quick_sort(data_array):
    
    """ Sorts the list numerically in ascending order
    data_array - The list to be sorted
    returns the sorted list
    """

    if len(data_array) == 1 or len(data_array) == 0:                                       # base case for the recursive call
        return data_array
    else:
        pivot = data_array[0]            # using first value as the pivot value
        i = 0
        
        for j in range(len(data_array)-1):                                                           # rearranging values around  pivot
            if data_array[j+1] < pivot:
                data_array[j+1],data_array[i+1] = data_array[i+1], data_array[j+1]
                i = i + 1
        data_array[0],data_array[i] = data_array[i],data_array[0]
        
        #print("dataArray sorted either side of pivot", dataArray,"pivot", pivot)
        
        first_part = quick_sort(data_array[:i])                                                    # recursive calls on either side of pivot
        second_part = quick_sort(data_array[i+1:])
        first_part.append(data_array[i])                                                             # put pivot in correct position
        
        #print("first part",first_part, "second part", second_part,"dataArray", dataArray)
        return first_part + second_part
    
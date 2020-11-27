def quick_sort(dataArray):
    #print("running quick sort\n")
    if len(dataArray) == 1 or len(dataArray) == 0:                                       # base case for the recursive call
        return dataArray
    else:
        pivot = dataArray[0]            # using first value as the pivot value
        i = 0
        
        for j in range(len(dataArray)-1):                                                           # rearranging values around  pivot
            if dataArray[j+1] < pivot:
                dataArray[j+1],dataArray[i+1] = dataArray[i+1], dataArray[j+1]
                i = i + 1
        dataArray[0],dataArray[i] = dataArray[i],dataArray[0]
        
        #print("dataArray sorted either side of pivot", dataArray,"pivot", pivot)
        
        first_part = quick_sort(dataArray[:i])                                                    # recursive calls on either side of pivot
        second_part = quick_sort(dataArray[i+1:])
        first_part.append(dataArray[i])                                                             # put pivot in correct position
        
        #print("first part",first_part, "second part", second_part,"dataArray", dataArray)
        return first_part + second_part
    
print(quick_sort([1,35,57,23487,45,23668,23]))
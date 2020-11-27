def merge_sort(mergeList):
    
    if len(mergeList) > 1:
        mid = len(mergeList) // 2
        leftHalf = mergeList[:mid]
        rightHalf = mergeList[mid:]
        
        merge_sort(leftHalf)
        merge_sort(rightHalf)
        
        leftHalfPos = 0
        rightHalfPos = 0
        mainListPos = 0
        
        while leftHalfPos < len(leftHalf) and rightHalfPos < len(rightHalf):
            
            if leftHalf[leftHalfPos] < rightHalf[rightHalfPos]:
                
                mergeList[mainListPos] = leftHalf[leftHalfPos]
                leftHalfPos = leftHalfPos + 1
                
            else:
                mergeList[mainListPos] = rightHalf[rightHalfPos]
                rightHalfPos = rightHalfPos + 1
        
            mainListPos = mainListPos + 1
    
        while leftHalfPos < len(leftHalf):
            
            mergeList[mainListPos] = leftHalf[leftHalfPos]
            leftHalfPos = leftHalfPos + 1
            mainListPos = mainListPos + 1
            
        while rightHalfPos < len(rightHalf):
            
            mergeList[mainListPos] = rightHalf[rightHalfPos]
            rightHalfPos = rightHalfPos + 1
            mainListPos = mainListPos + 1
            
    return mergeList

print(merge_sort([13,64,5424,64]))
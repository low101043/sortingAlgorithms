def insertion(dataArray):
    
    for index in range(1, len(dataArray)):
        currentData = dataArray[index]
        position = index
        
        while position > 0 and dataArray[position - 1] < currentData:
            
            dataArray[position] = dataArray[position - 1]
            position = position - 1
        
        dataArray[position] = currentData
        
    return dataArray

print(insertion([46,232,76,13,9,234]))
def insertion(data_array):

    """ This will sort the data numerically in ascending order
    data_array - This is the data to be sorted
    returns the data to be sorted
    """
    
    for index in range(1, len(data_array)): #Will insert each data in the right position

        current_data = data_array[index]  #Gets the current data
        position = index #Gets the index
        
        while position > 0 and data_array[position - 1] > current_data: #Whilst the index is larger than 0 and the data to be inserted is smaller than the data in the sorted part of the list
            
            data_array[position] = data_array[position - 1]
            position = position - 1
        
        data_array[position] = current_data
        
    return data_array

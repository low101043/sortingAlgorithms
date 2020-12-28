def merge_sort(merge_list):

    """Sort the list using merge sort numerically in ascending order
    merge_list - the list to be sorted
    returns the sorted list
    """
    
    #If the list is larger than one
    if len(merge_list) > 1: 

        #Splits the list in two
        mid = len(merge_list) // 2  
        left_half = merge_list[:mid]
        right_half = merge_list[mid:]
        
        #Sorts the lists
        merge_sort(left_half)
        merge_sort(right_half)
        
        left_half_pos = 0
        right_half_pos = 0
        main_list_pos = 0
        
        #Adds the two lists together
        while left_half_pos < len(left_half) and right_half_pos < len(right_half):
            
            if left_half[left_half_pos] < right_half[right_half_pos]:
                
                merge_list[main_list_pos] = left_half[left_half_pos]
                left_half_pos = left_half_pos + 1
                
            else:
                merge_list[main_list_pos] = right_half[right_half_pos]
                right_half_pos = right_half_pos + 1
        
            main_list_pos = main_list_pos + 1
    
        while left_half_pos < len(left_half):
            
            merge_list[main_list_pos] = left_half[left_half_pos]
            left_half_pos = left_half_pos + 1
            main_list_pos = main_list_pos + 1
            
        while right_half_pos < len(right_half):
            
            merge_list[main_list_pos] = right_half[right_half_pos]
            right_half_pos = right_half_pos + 1
            main_list_pos = main_list_pos + 1
            
    return merge_list

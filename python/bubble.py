def bubble(a_list):

    """Will Sort the list numerically ascending
    a_list - The list to be sorted
    returns a sorted list"""
    
    passnum = len(a_list) -1
    for outer_loop in range(passnum):    #Checks where you are in the list
        
        for inner_loop in range(passnum):    #does each comparison
            
            if a_list[inner_loop] > a_list[inner_loop+1]:   #comparing
                temp = a_list[inner_loop]         #swap
                alist[inner_loop]= a_list[inner_loop+1]    #swap
                alist[inner_loop + 1] = temp     #swap
            #print(alist)
            
        #print("End of pass", outerLoop + 1)
        
    return a_list

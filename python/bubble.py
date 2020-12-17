def bubble(alist):
    
    passnum = len(alist) -1
    for outerLoop in range(passnum):    #Checks where you are in the list
        
        for innerLoop in range(passnum):    #does each comparison
            
            if alist[innerLoop] > alist[innerLoop+1]:   #comparing
                temp = alist[innerLoop]         #swap
                alist[innerLoop]= alist[innerLoop+1]    #swap
                alist[innerLoop + 1] = temp     #swap
            #print(alist)
            
        #print("End of pass", outerLoop + 1)
        
    return alist

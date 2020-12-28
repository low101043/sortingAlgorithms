def input_to_choose():

    """This will input the list
    returns the list to be sorted
    """
    
    num_to_choose = input("\nPlease enter the number of elements to be sorted: ")  #The number of elements to be sorted

    #Checks it is an actual number
    while not num_to_choose.isnumeric():
        num_to_choose = input("\nPlease enter a number: ")

    output_list = []

    # This will get the numbers to be sorted
    print("Please enter", num_to_choose, "integers: ")
    for i in range(int(num_to_choose)):
        number_chosen = input()
        
        #If the input is not a number
        while not number_chosen.isnumeric():
            number_chosen = input("Enter a number: ")
        
        output_list.append(int(number_chosen))

    return output_list

def output_list(to_output):

    """Outputs the list
    to_output - The list to be outputted
    """

    string_to_output = "The List in order is: "
    #If the output list is empty
    if to_output == []:
        string_to_output = ""
    else:
        string_to_output = "The List in order is: "
        
        #Takes each element and add to the output string
        for element in to_output:
            string_to_output += (str(element) + ", ")
    
    print(string_to_output[:-2])

def menu():

    """The menu for the program
    returns which output to be chosen
    """

    menu_option = input("\nPlease select an option to choose a Sorting Algorithm.  \n 1. Bubble Sort  \n 2. Insertion Sort \n 3. Merge Sort \n 4. Quick Sort \n 5. Exit \n Enter 1, 2, 3, 4 or 5: ")  #This will ask the user which conversion they want to do

    while menu_option not in["1", "2", "3", "4", "5"]:
        menu_option = input("\nChoose an option.  \n 1. Bubble Sort  \n 2. Insertion Sort \n 3. Merge Sort \n 4. Quick Sort \n 5. Exit \n Enter 1, 2, 3, 4 or 5: ")  #This will ask the user which conversion they want to d

    return menu_option


def input_to_choose():
    
    num_to_choose = input("\nPlease enter the number of elements to be sorted: ")

    while not num_to_choose.isnumeric():
        num_to_choose = input("\nPlease enter a number: ")

    output_list = []

    print("Please enter", num_to_choose, "integers: ")
    for i in range(int(num_to_choose)):
        number_chosen = input()
        while not number_chosen.isnumeric():
            number_chosen = input("Enter a number: ")
        
        output_list.append(int(number_chosen))

    return output_list

def output_list(to_output):
    string_to_output = "The List in order is: "
    if to_output == []:
        string_to_output = ""
    else:
        string_to_output = "The List in order is: "
        for element in to_output:
            string_to_output += (str(element) + ", ")
    
    print(string_to_output[:-2])

def menu():
    menu_option = input("\nPlease select an option to choose a Sorting Algorithm.  \n 1. Bubble Sort  \n 2. Insertion Sort \n 3. Merge Sort \n 4. Quick Sort \n 5. Exit \n Enter 1, 2, 3, 4 or 5: ")  #This will ask the user which conversion they want to do

    while menu_option not in["1", "2", "3", "4", "5"]:
        menu_option = input("\nChoose an option.  \n 1. Bubble Sort  \n 2. Insertion Sort \n 3. Merge Sort \n 4. Quick Sort \n 5. Exit \n Enter 1, 2, 3, 4 or 5: ")  #This will ask the user which conversion they want to d

    return menu_option


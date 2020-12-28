import inputOutput
import bubble
import insertion
import merge
import quick

looper = True
print("Welcome to the Python Version of the Sorting Algorithms")
while looper:
    
    menu_choice = inputOutput.menu()
    if menu_choice == "1":
        data_chosen = inputOutput.input_to_choose()
        print("Performing Bubble Sort")
        output = bubble.bubble(data_chosen)
        inputOutput.output_list(output)
    elif menu_choice == "2":
        data_chosen = inputOutput.input_to_choose()
        print("Performing Insertion Sort")
        output = insertion.insertion(data_chosen)
        inputOutput.output_list(output)
    elif menu_choice == "3":
        data_chosen = inputOutput.input_to_choose()
        print("Performing Merge Sort")
        output = merge.merge_sort(data_chosen)
        inputOutput.output_list(output)
    elif menu_choice == "4":
        data_chosen = inputOutput.input_to_choose()
        print("Performing Quick Sort")
        output = quick.quick_sort(data_chosen)
        inputOutput.output_list(output)
    else:
        looper = False

print("Goodbye")
        
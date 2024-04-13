number_list = [10, 20, 30, 40, 50] #1

print("Lenght of the list: ", len(number_list)) #2
print("First number of the list: ", number_list[0]) #3
print("Last number of the list: ", number_list[-1]) #4

number_list.append(60) #5
print(number_list) #6

number_list.remove(number_list[1]) #7
print(number_list) #8

if number_list.count(30) > 0: #9
    print("30 is in the list")
else:
    print("30 is not in the list")

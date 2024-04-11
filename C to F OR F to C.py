#C to F
#(C × 9/5) + 32
#F to C
#5/9(F-32)

try:
  choice = input("Would you like to enter C or F?: ")

  if choice == "c" or choice == "C":
    temp = float(input("Please enter temperature in C: "))
    f = round((temp * (9/5)) + 32, 2)
    print(f"{temp}C is {f}F")

  elif choice == "f" or choice == "F":
    temp = float(input("Please enter temperature in F: "))
    c = round((5/9)*(temp-32), 2)
    print(f"{temp}F is {c}C")
    
  else:
    print("Invalid answer, please enter C or F")

except Exception as e:
    print(f"Wrong input: {e}!") 

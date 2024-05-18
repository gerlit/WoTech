print("Welcome to the Bank")

balance = 0

while True:
  answer = input("\nWould you like to?: \n1. Deposit to your account\n2. Withdraw from your account\n3. Check balance\n4. Exit\n")
  if answer == "1":
    try:
      deposit = int(input("\nHow much would you like to deposit to your bank account? "))
      balance = balance + deposit
    except:
      print("Invalid input. Please enter a whole numeric value for the deposit.")
  elif answer == "2":
    try:
      withdraw = int(input("\nHow much would you like to withdraw from your bank account? "))
      if withdraw > balance:
        print("You do not have enough funds on your bank account")
      else:
        balance = balance - withdraw
    except:
      print("Invalid input. Please enter a whole numeric value for the withdraw.")
  elif answer == "3":
    print(f"\nYour total account balance is {balance}")
  elif answer == "4":
    print(f"\nHave a nice day!")
    break
  else:
    print("\nPlease enter a number from these 4 options")

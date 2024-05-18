print("Welcome to the Bank")

balance = 0

while True:
    answer = input("Would you like to make a deposit? yes/no ")
    if answer == "no":
        print(f"Your account balance is {balance}, have a nice day!")
        break
    else:
        try:
            deposit = float(input("How much would you like to deposit to your bank account? "))
            balance = balance + deposit
        except:
            print("Invalid input. Please enter a numeric value for the deposit.")

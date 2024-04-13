name = input("Enter your name: ")
speed_limit = input("Enter the speed limit: ")
actual_speed = input("Enter your actual speed: ")

try:
  speed_limit = int(speed_limit)
  actual_speed = int(actual_speed)
except:
  print("Wrong input")
else:
  difference = actual_speed - speed_limit
  fine = difference * 3
  if speed_limit < 0 or actual_speed < 0:
    print("Speed limit must be positive.")
  elif speed_limit >= actual_speed:
    print("Speed limit in not exceeded. No fine applied.")
  else:
    if fine <= 190:
      print(f"Your fine is {fine}€")
    else:
      print("Your fine 190€")

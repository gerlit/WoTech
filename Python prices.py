filename = "/content/prices.txt"

with open(filename, "r") as file:
    lines = file.readlines()

total_price = 0
total_items = 0

for line in lines:
    try:
        price = float(line)
        total_price += price
    except ValueError:
        total_items += 1
        continue

print(f"Total Price: {total_price}")
print(f"Total Number of Items: {total_items}")

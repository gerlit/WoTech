class Client:
  def __init__(self, name):
    self.name = name
    self.transactions = []

  def add_transaction(self, transaction):
    self.transactions.append(transaction)

class Item:
  def __init__(self, name, price):
    self.name = name
    self.price = price

class Transaction:
  def __init__(self, item):
    self.item = item

clients = []
clients.append(Client("Alice"))
clients.append(Client("Bob"))
clients.append(Client("Chris"))

items = []
items.append(Item("oats", 2.4))
items.append(Item("banana", 0.9))
items.append(Item("yogurt", 1.7))
items.append(Item("eggs", 3.8))
items.append(Item("bacon", 4.6))
items.append(Item("beans", 1.5))

clients[0].add_transaction(Transaction(items[0]))
clients[0].add_transaction(Transaction(items[1]))
clients[0].add_transaction(Transaction(items[2]))
clients[1].add_transaction(Transaction(items[3]))
clients[1].add_transaction(Transaction(items[4]))
clients[1].add_transaction(Transaction(items[5]))
clients[2].add_transaction(Transaction(items[0]))
clients[2].add_transaction(Transaction(items[4]))

for client in clients:
  print(f"{client.name} has made the following purchase:")
  for transaction in client.transactions:
    print({transaction.item.name})

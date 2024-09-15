import pandas as pd
import matplotlib.pyplot as plt

url = 'https://web.stanford.edu/class/archive/cs/cs109/cs109.1166/stuff/titanic.csv'
titanic_data = pd.read_csv(url)

print(titanic_data.head())

print(f"Dimensions of dataset: {titanic_data.shape}")

print(titanic_data.isnull().sum())

titanic_data['Age'].fillna(titanic_data['Age'].median(), inplace=True)
print(titanic_data.describe())

print(titanic_data['Sex'].value_counts())

plt.figure(figsize=(8, 6))
titanic_data['Pclass'].value_counts().sort_index().plot(kind='bar', color='skyblue')
plt.xlabel('Passenger Class')
plt.ylabel('Number of Passengers')
plt.title('Distribution of Passenger Classes on the Titanic')
plt.show()

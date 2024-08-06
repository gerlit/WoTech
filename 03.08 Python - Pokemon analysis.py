# 1. How many % of all pokemons have type 1 of water?

water_pokemons = len(pokemon_df[pokemon_df['Type 1'] == 'Water'])
water_percentage = (100 * water_pokemons)/unique_names
print(f"{water_percentage}% of pokemons have type 1 of water.")

# 2. What is the maximum 'Speed' value? 
# What is the minimum 'Speed' value? 
# What is the difference between max and min 'Speed'?

speed_max = pokemon_df['Speed'].max()
speed_min = pokemon_df['Speed'].min()
speed_dif = speed_max - speed_min
print(f"The maximum speed is {speed_max}, the minimum is {speed_min} and the difference is {speed_dif}")

# 3.Filter the DataFrame to include only the Pokémon with 'Speed' >= 80. 
# How many Pokémon meet this criterion? 
# Display this DataFrame using your preferred visualization method.

fast_pokemons = pokemon_df[pokemon_df['Speed'] >= 80]
fast_pokemons_num = len(fast_pokemons)

plt.hist(fast_pokemons['Speed'], bins=range(80, speed_max+10, 10), color='orange', edgecolor='black')
plt.xlabel('Speed')
plt.ylabel('Number of Pokémons')
plt.title(f'Pokemons as fast or faster than 80, total of {fast_pokemons_num}')
plt.show()

# 4.(DIFFICULT) Find Pokémon with the longest name (excluding spaces)? What is this pokemons name?

# Extract the 'Name' column
names = pokemon_df['Name']

# Remove spaces and calculate lengths
name_lengths = names.apply(lambda name: len(name.replace(" ", "")))

# Find the index of the longest name
longest_name_index = name_lengths.idxmax()

# Get the longest name using the index
longest_name = names[longest_name_index]
print(f"Pokémon with the longest name: {longest_name}")

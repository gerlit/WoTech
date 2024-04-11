#BMI = kg/m^2

kg = input("Please enter your weight in kg: ")
kg_float = float(kg)

m = input("Please enter your height in m: ")
m_float = float(m)

m2= m_float * m_float

bmi= round(kg_float / m2, 2)
print(f"Your BMI is: {bmi}")

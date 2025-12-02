# Program to find product of two numbers using O(1) and O(N) approaches

# O(1) → direct multiplication
def o1(a, b):
    total = a * b
    print("\nO(1) iteration result:", total)

# O(N) → repeated addition
def oN(a, b):
    total = 0
    for _ in range(a):   # run loop 'a' times
        total += b
    print("O(N) iteration result:", total)

# Input
a = int(input("Enter first number (a): "))
b = int(input("Enter second number (b): "))

# Function calls
o1(a, b)
oN(a, b)

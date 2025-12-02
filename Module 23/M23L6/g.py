# take two input from user
lower = int(input("Enter the lower range: "))
upper = int(input("Enter the upper range: "))

print("Prime numbers between", lower, "and", upper, "are:")

# iterate loop from lower limit to upper limit
for num in range(lower, upper + 1):
    if num > 1:
        for i in range(2, num):
            if (num % i) == 0:
                break
        else:   # this else belongs to 'for', executes only if loop not broken
            print(num)

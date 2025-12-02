# Three approaches to calculate the sum of first n numbers

def fun1(n):
    """
    Function 1: Direct formula approach
    Time Complexity: O(1) - constant time
    """
    return n * (n + 1) // 2

def fun2(n):
    """
    Function 2: Iterative approach
    Time Complexity: O(n) - linear time
    """
    sum = 0
    for i in range(1, n + 1):
        sum += i
    return sum

def fun3(n):
    """
    Function 3: Nested loop approach
    Time Complexity: O(n²) - quadratic time
    """
    sum = 0
    for i in range(1, n + 1):
        for j in range(1, i + 1):
            sum += 1
    return sum

# Test the functions
if _name_ == "_main_":
    n = 4
    
    print(f"Testing with n = {n}")
    print(f"fun1({n}) = {fun1(n)}")  # Direct formula: 4*(4+1)/2 = 10
    print(f"fun2({n}) = {fun2(n)}")  # Iterative: 1+2+3+4 = 10
    print(f"fun3({n}) = {fun3(n)}")  # Nested loops: 1+(1+1)+(1+1+1)+(1+1+1+1) = 10
    
    # Time Complexity Analysis:
    print("\nTime Complexity Analysis:")
    print("fun1(n): O(1) - Uses direct mathematical formula")
    print("fun2(n): O(n) - Single loop from 1 to n")
    print("fun3(n): O(n²) - Nested loops, outer runs n times, inner runs i times")
    
    # Detailed breakdown for fun3:
    print("\nDetailed analysis for fun3:")
    print("Outer loop runs n times")
    print("Inner loop runs 1+2+3+...+n = n(n+1)/2 times total")
    print("Therefore, time complexity is O(n²)")
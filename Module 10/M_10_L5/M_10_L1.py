number = int(input("Enter your Number : "))
store=number
reverse=int(0)
while(number>0):
 rem = (number%10)
 reverse = reverse*10 + rem
 number//=10

print("\nReversed number : ",reverse)

if(store==reverse):
  print("\nPalindrome")
else:
  print("\nNot palindrome")

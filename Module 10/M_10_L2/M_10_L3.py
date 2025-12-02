def test(n):
  iteration = 0
  for i in range(0,n):
    for j in range(0,n):
      print("*",end="")
      iteration+=1
    print("")
  print("\nwhen n is",n,"iteration =",iteration)
test(6)
test(3)
test(2)

print("\n with every 'n' the taken = n^2")
print("(n^2)")
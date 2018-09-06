''' This is a Fizz buzz program that displays the fizz for the multiple
of 3 and buzz for the mulitple of 5 and both fizzbuzz if multiple of both
3 and 5 '''

if __name__ == "__main__":
    
    for x in range (0,100):
        if (x % 3 == 0 and x % 5 == 0):
            print ("Frizzbuzz")
        elif (x % 3 == 0):
            print ("Frizz")
        elif (x % 5 == 0):
            print ("Buzz")
        else:
            print (x)



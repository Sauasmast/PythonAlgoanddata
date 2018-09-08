''' This class is responsible for checking whether the name is palindrome or not.
If not can we make it palindrome by taking off one of the alphabet. If we can how so,
which index should we take out and  if we cannot return -1  '''
    
def palindromeIndex(s):
    if (s == s[::-1]):
        print("Printing form here")
        return (-1)
    else:
        for x in range(0,len(s)):
            new_string = s[:x] + s[x+1:]
            print (new_string)
            if (new_string == new_string[::-1]):
                success = x
                break
        if success:
            return success
        else:
            return (-1)


if __name__ == "__main__":
    palindrome_string = input("Please enter the string: ")
    print(palindromeIndex(palindrome_string))
            

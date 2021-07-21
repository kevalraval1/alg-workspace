palindrome = "Racecar"

if palindrome.lower() == ("".join(reversed(palindrome.lower()))):
    print (True)
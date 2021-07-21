palindrome = "Was it a car or a cat I saw?"

#removing common punctuations as it doesn't matter in palindromes
removeList = ["!", "?", " ", ".", "...", "(", ")", "/", "&"]

#.lower() as capitalization doesn't matter either
checkString = "".join((palindrome[i].lower() for i in range(len(palindrome)) if i not in removeList))

#can remove checkString variable and just add the .join into the if statement, but this way is more cleaner in my opinion
if palindrome.lower() == (checkString):
    print (True)
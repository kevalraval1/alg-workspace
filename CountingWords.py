#Using the built in regex module
import re

#Input sentence
sentence = "It was difficult for Mary to admit that 1235fa facts most of her workout consisted of exercising poor judgment 2015-2019.."

# Splitting sentence into a list using regex with spaces, slashes and dashes as defining splitters. 
# Can be modified to include multiple slashes in case of typos, would just be {1,} like the one used for spaces
sentenceList = re.split(" {1,}|/|–", sentence)

# counting amount of elements in the list created
# Using (len) doesn't work for sentences with numbers, not counting any digits as words so have to do it this way
count = 0

# Iterating through the made list, checking if element contains
for i in sentenceList:
    if bool(re.search('\d', i)):
        continue
    count += 1

print (count)

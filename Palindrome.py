
#takes input
word = input("Enter a word: ").lower()

#makes input a list so we can compare it
wordList = list(word)

#reverses the word inputted as a string 
#stored as backwardsWord
backwardsWord = wordList[::-1]


#Checks weather or not the backwardsWord is 
#equal to the word originally inputted
if backwardsWord == wordList:
    print('Palindrome!')
else:
    print('Not a palindrome')
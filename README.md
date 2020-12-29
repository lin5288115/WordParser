This is a java maven project which will parse in a string, and find all possible english words in the Dictionary. 
We assume in real world, there is online Dictionary, so I wrote a OnlineDict which implements Dictionary, 
and we can use it later if we connect the real online Dictionary.  
Now here I wrote the MockDict implements Dictionary which has isEnglishWord(String word) to query a word in Dictionary or not.

### **How to run the project:**
- Make sure to be in the root directory
- This project uses java 11

`mvn clean test`


### Functionality:
- "readWords" is used to load all word in Dictionary.txt into MockDict.Dict
- "isEnglishWord" is used to check whether a word in Dictionary 
- "findAllWordsInString" is used to find all the possible word in Dictionary
- "searchWord" is helper method to build possible words, and search the word in Dictionary


**Note**: 
The all valid words are in  src/main/resources/Dictionary.txt
All words in Dictionary are uppercase





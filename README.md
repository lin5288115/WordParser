This is a java maven project which will be passed in a string, and find all possible english words in the Dictionary basing on the input String. 
We assume in real world, there is online Dictionary, so I wrote a OnlineDictImp which implements Dictionary, 
and we can use it later if we connect the real online Dictionary.  
The MockDictImp actually implements Dictionary which has isEnglishWord(String word) to query a word in Dictionary or not.
It will be accessed by FindWords class

### **How to run the project:**
- Make sure to be in the root directory
- This project uses java 11

`mvn clean test`


### Functionality:
- "readWords" is used to load all words in Dictionary.txt into MockDict.Dict
- "isEnglishWord" is used to check whether a word in Dictionary 
- "findAllWordsInString" is used to find all the possible word in Dictionary
- "searchWord" is helper method to build possible words, and search the word in Dictionary


**Note**: 
The all valid words are in  src/main/resources/Dictionary.txt
All words in Dictionary are uppercase





import Util.Dictionary;
import Util.MockDict;

import java.util.ArrayList;
import java.util.List;

public class FindWords {

    Dictionary dict = new MockDict();

    //find all the possible word in Dictionary by using the characters in the parse in String str
    public List<String> findAllWordsInString(String str) {

        List<String> res = new ArrayList<>();
        if(str == null || str.length() == 0) {
            return res;
        }
        str = str.toUpperCase();//All words in Dictionary are uppercase, so change str to upper case for later convenience
        int[] charCount = new int[26];

        for(int i = 0; i< str.length(); i++) {
            char temp = str.charAt(i);
            //count each character in str, and save the count in charCount
            //it will skip special character if there is in str
            if(temp - 'A' >= 0 && temp - 'A' <26) {
                charCount[temp - 'A']++;
            }
        }
        searchWord(charCount, res, new StringBuilder());
        return res;
    }

    //Using DFS to build word, and if the word in dictionary, add to result list
    public void searchWord(int[] charCount, List<String> result, StringBuilder sb) {

        for(int i = 0; i < 26; i++) {
            if(charCount[i] > 0) {
                // build possible word by adding one char each time
                sb.append((char)('A'+i));

                // add to result list if dictionary has the word
                if(dict.isEnglishWord(sb.toString())) {
                    result.add(sb.toString());
                }

                charCount[i]--;
                //DFS
                searchWord(charCount, result, sb);

                charCount[i]++; // backtrace
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}

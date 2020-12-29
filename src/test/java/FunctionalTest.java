import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FunctionalTest {

    @Test(dataProvider = "testSet")
    public void testFindAllWords(String testString, List<String> expectResult) {

        FindWords fw = new FindWords();
        List<String> actualResult = fw.findAllWordsInString(testString);
        System.out.println("Actual result: " + actualResult);

        Collections.sort(actualResult);
        Collections.sort(expectResult);

        Assert.assertEquals(actualResult, expectResult, "The Actual result is incorrect");
    }

    @DataProvider(name = "testSet")
    public Object[][] provideTestData() {
        List<String> resExpect1 = Arrays.asList("GO", "KING", "KNOW", "RING", "ROW", "WORK");
        List<String> resExpect2 = Arrays.asList("ACT", "AND", "AT", "CAN", "CAT", "CATS", "COAT", "COT", "DO",
                "DOG", "DOGS", "DOT", "GO", "GOAT", "NOT", "GOT", "SAD", "SAND", "SAT", "SO", "SOD", "STAND", "TAG", "TAN");
        List<String> resExpect3 = new ArrayList<>();

        return new Object[][] {
                {"WORKING",resExpect1},
                {"catsanddog", resExpect2},
                {"catsANDdog", resExpect2},// input a String combining uppercase and lowercase, expect returning uppercase since all words in Dictionary is uppercase
                {"89Working%^&",resExpect1},//input a String with special characters, expect returning word without special character
                {"c", resExpect3}, // c is not in the Dictionary, expect returning an empty list
                {"", resExpect3}
        };

    }


}

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class stringAnagramTest {

    @org.junit.Test
    public void stringAnagram() {
        List<String> dic = new ArrayList<>();
        List<String> query = new ArrayList<>();
        dic.add("heater");
        dic.add("cold");
        dic.add("clod");
        dic.add("reheat");
        dic.add("docl");


        query.add("codl");
        query.add("heater");
        query.add("abcd");

        List<Integer> ans = stringAnagram.stringAnagram(dic, query);

        Integer[] ground = new Integer[] {3,2,0};

        for (int i = 0; i  < ans.size(); i++) {
            assertEquals(ground[i], ans.get(i));
        }
    }
}
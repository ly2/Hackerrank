import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * Complete the 'stringAnagram' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. STRING_ARRAY dictionary
 *  2. STRING_ARRAY query
 */


public class stringAnagram {


    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        // Write your code here


        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < dictionary.size(); i++) {
            String s = dictionary.get(i);

            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String strSort = new String(chars);

            if (!map.containsKey(strSort)) {
                map.put(strSort, new ArrayList<>());
            }

            map.get(strSort).add(i);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < query.size(); i++) {
            String s = query.get(i);

            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String strSort = new String(chars);

            // Create a ArrayList for the sorted string.
            if (map.containsKey(strSort)) {
                ans.add(map.get(strSort).size());
            } else {
                ans.add(0);
            }

        }
        return ans;
    }
}

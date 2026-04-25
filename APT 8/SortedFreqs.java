import java.util.*;

public class SortedFreqs {
      public int[] freqs(String[] data) {
            Map<String, Integer> counts = new HashMap<>();
            for (String s : data) {
                counts.put(s, counts.getOrDefault(s, 0) + 1);
            }
            List<String> words = new ArrayList<>(counts.keySet());
            Collections.sort(words); 
            int[] result = new int[words.size()];
            for (int i = 0; i < words.size(); i++) {
                result[i] = counts.get(words.get(i));
            }
        
            return result;
      }
   }
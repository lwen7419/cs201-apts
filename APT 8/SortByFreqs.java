import java.util.*;

public class SortByFreqs {
      public String[] sort(String[] data) {
            Map<String, Integer> counts = new HashMap<>();
                for (String s : data) {
                    counts.put(s, counts.getOrDefault(s, 0) + 1);
                }
            List<String> list = new ArrayList<>(counts.keySet());
            Comparator<String> comp = new Comparator<String>() {
            public int compare(String a, String b) {
                int freqDiff = counts.get(b) - counts.get(a);
                if (freqDiff != 0) {
                    return freqDiff;
                }
                return a.compareTo(b);
            }};
            Collections.sort(list, comp);
            return list.toArray(new String[0]);
      }
   }
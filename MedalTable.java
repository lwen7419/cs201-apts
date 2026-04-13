import java.util.*;
public class MedalTable {
   public String[] generate(String[] results) {
      Map<String, int[]> map = new HashMap<>();
      for (String s : results) {
            String[] parts = s.split(" ");
            
            String gold = parts[0];
            String silver = parts[1];
            String bronze = parts[2];
            
            map.putIfAbsent(gold, new int[3]);
            map.putIfAbsent(silver, new int[3]);
            map.putIfAbsent(bronze, new int[3]);
            
            map.get(gold)[0]++;
            map.get(silver)[1]++;
            map.get(bronze)[2]++;
        }
      List<String> countries = new ArrayList<>(map.keySet());
      Collections.sort(countries, new Comparator<String>() {
            public int compare(String a, String b) {
                int[] A = map.get(a);
                int[] B = map.get(b);
                //gold
                if (A[0] != B[0]) return B[0] - A[0];
                //siilver
                if (A[1] != B[1]) return B[1] - A[1];
                //bronze
                if (A[2] != B[2]) return B[2] - A[2];
                return a.compareTo(b);
                }
        });
        String[] result = new String[countries.size()];
        for (int i = 0; i < countries.size(); i++) {
            String c = countries.get(i);
            int[] m = map.get(c);
            result[i] = c + " " + m[0] + " " + m[1] + " " + m[2];
        }
        return result;
               
   }
 }
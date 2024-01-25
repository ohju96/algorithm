import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class java42576 { // 완주하지 못한 선수
    public static void main(String[] args) {

        String participant[] = {"leo", "kiki", "eden"};
        String completion[] = {"eden", "kiki"};

        String answer = solution(participant, completion);
        System.out.println(answer);
    }

    public static String solution(String[] participant, String[] completion) {

        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> v = iterator.next();
            if (v.getValue() != 0) {
                answer = v.getKey();
                break;
            }
        }

        return answer;
    }
}

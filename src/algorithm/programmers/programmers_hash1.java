package algorithm.programmers;

import java.util.HashMap;
import java.util.Map;

public class programmers_hash1 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        //1.HashMap의 특성 key값은 중복 될 수 없다. 덮어 써진다.
        //방안
        //map에 다가 key 값을 넣음. value 값은 맵에 저장된 개수 +1
        //getOrDefault(key, defaultValue) : map에서 찾는 Key가 없다면 defaultValue를 리턴함
        for (String part: participant) {
            map.put(part, map.getOrDefault(part, 0)+1);
        }

        System.out.println("map1  = " + map);

        for (String comp: completion) {
            map.put(comp, map.get(comp)-1);
        }

        System.out.println("map2  = " + map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 0) {
                System.out.println("entry.getKey() = " + entry.getKey());
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[] { "mislav", "stanko", "mislav", "ana" }, new String[] { "stanko", "ana", "mislav" }));
    }
}



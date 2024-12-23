package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();


        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
//        System.out.println(studentMap);

        // 같은 키에 저장시 기존 값이 교체
        studentMap.put("studentA", 100);
        System.out.println(studentMap);

        // containsKey(key) : 해당 키가 존재하는지 확인
        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println("containsKey = " + containsKey);

        // 특정 학생의 값 삭제
        studentMap.remove("studentA");
        System.out.println(studentMap);

    }
}

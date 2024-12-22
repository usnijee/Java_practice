package collection.set.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 문제 설명
 * 여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라.
 * 30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다.
 * 데이터의 값 순서로 출력해라.
 * 출력 예): 10, 20, 30
 */
public class UniqueNamesTest3 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        printInput(inputArr);
    }

    private static void printInput(Integer[] inputArr) {
        Set<Integer> treeset = new TreeSet<>();
        treeset.addAll(List.of(inputArr));
        for (Integer num : treeset) {
            System.out.println(num);
        }
    }
}

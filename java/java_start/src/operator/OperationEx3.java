package operator;
/*
    int 형 변수 score 를 선언하세요.
    score 가 80점 이상이고, 100점 이하이면 true 를 출력하고, 아니면 false 를 출력하세요.
 */

public class OperationEx3 {
    public static void main(String[] args) {
        int score = 70;
        boolean result = (score >= 80) && (score <= 100);
        System.out.println(result);
    }
}

package overloading;

public class Overloading3 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1.2, 1.5));
    }

    //첫 번째 add 메서드 : 두 정수를 받아서 합출력
    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b){
        System.out.println("2번 호출");
        return a + b;
    }
}

package nested.test;

public class OuterClass2Main {

    public static void main(String[] args) {
        //여기에서 InnerClass의 hello() 메서드를 호출하라.
        OuterClass2 outerClass = new OuterClass2();
        OuterClass2.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.hello();
    }
}

package poly.basic;

// 다운 캐스팅의 문제점
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1; // 다운 캐스팅
        child1.childMethod();

        Parent parent2 = new Parent(); // parent2에는 부모 클래스의 객체에 대한 메모리 참조값이 저장됨
        Child child2 = (Child) parent2; // 런타임에러 발생 - ClassCastException
        child2.childMethod(); // 실행 불가

        /*
        why?
            1. 상속 관계에서 자식 클래스의 인스턴스를 생성하면 메모리에 자식과 모든 부모에 대한 정보가 저장된다
            2. 반대로, 부모 클래스의 인스턴스를 생성하면 메모리에는 해닫 부모의 부모와 자신에 대한 정보가 저장된다. 즉, 자식에 대한 정보는 없다
            3. 따라서, 부모 클래스의 인스턴스를 생성시 다운캐스팅을 진행하면 자식에 대한 정보가 메모리에 없기에 런타임 에러가 발생한다
         */

        /*
        다운 캐스팅 vs 업 캐스팅

            1. 업 캐스팅 -> 에러가 절대 발생 x
             - 업 캐스팅 : 자식의 타입을 부모의 타입으로 바꾸는 것
             - 기본적으로, 객체를 생성한다면
                - 상속관계가 없는 경우 --> 해당 클래스의 내용(필드 ,메소드)이 인스턴스화 되어 메모리에 생성
                - 상속관계가 있는 경우 --> 해당 클래스의 내용 + 해당 클래스의 조상님들이 메모리에 생성
             즉, 인스턴스를 생성하면 기본적으로 본인 + 조상님이 다 생성되기에 업캐스팅은 에러가 발생할 수 없음

            2. 다운 캐스팅 -> 런타임 에러 발생 가능성 O
             - 상속관계가 없는 클래스는 객체 생성시 메모리에 자기 클래스에 대한 정보 이외의 정보가 없음
             - 즉 캐스팅이 불가능하다는 의미
         */
    }
}

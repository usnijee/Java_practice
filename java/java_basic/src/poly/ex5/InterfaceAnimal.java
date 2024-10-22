package poly.ex5;
/*
    순수추상클래스는 인터페이스 키워드를 통해 '구현'하면 된다.
    순수 추상 클래스 = 인터페이스

    순수 추상 클래스는 자식 클래스 입장에서 '상속'(extends)보다는 다형성을 위한 '구현'(implements)에 가깝다

    그렇다면 왜 순수 추상 클래스를 사용하지 않고 인터페이스를 사용할까?

    - 제약 : 인터페이스를 사용하면 순수 추상 클래스와 달리 클래스 내에는 반드시 추상메서드만 존재해야하며 실행 가능한
    body가 있는 메서드가 있을 시 컴파일 에러를 발생시킨다. 이 제약이 필요한 이유는 순수 추상 클래스의 경우는 실행 가능한 메서드
    가 존재해도 에러가 발생하지 않는데, 해당 메서드를 자식 클래스에서 구현하지 않을수도 있고 더이상 순수 추상 클래스가 아니기 때문이다

        - 인터페이스는 반드시 추상 클래스내의 추상 메서드만 제공하기에 자식 클래스에서 오버라이딩을 하지 않아도 에러 발생한다

    - 다중구현(상속) : 인터페이스의 경우 일반 클래스와 달리 다중 상속(구현)이 가능하다

 */
public interface InterfaceAnimal {
//    public abstract void sound(); public abstract 생략 가능
//    public abstract void move();

    void sound();
    void move();
}
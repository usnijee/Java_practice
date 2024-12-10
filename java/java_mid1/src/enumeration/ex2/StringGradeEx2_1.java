package enumeration.ex2;

public class StringGradeEx2_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC,price); // == discountService.discount(x001, price)
        int gold = discountService.discount(ClassGrade.GOLD,price);
        int diamond = discountService.discount(ClassGrade.DIAMOND,price);

        // 불가능한 경우
        //int errorcase1 = discountService.discount(2,price);
        //int errorcase2 = discountService.discount(new ClassGrade(),price);
        //int errorcase3 = discountService.discount(ClassGrade.VIP,price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }



}

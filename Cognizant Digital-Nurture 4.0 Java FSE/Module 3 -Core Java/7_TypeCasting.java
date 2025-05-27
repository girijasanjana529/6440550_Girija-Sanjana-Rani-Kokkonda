public class TypeCasting {

    public static void main(String[] args) {
        double decimalValue = 9.75;
        int intValue = (int) decimalValue; 

        System.out.println("Double value: " + decimalValue);
        System.out.println("After casting to int: " + intValue);

        int integerValue = 5;
        double doubleValue = (double) integerValue; 

        System.out.println("Int value: " + integerValue);
        System.out.println("After casting to double: " + doubleValue);
    }
}

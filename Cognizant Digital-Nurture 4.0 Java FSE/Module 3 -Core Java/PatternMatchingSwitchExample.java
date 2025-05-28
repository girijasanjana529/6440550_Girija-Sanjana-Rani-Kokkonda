public class PatternMatchingSwitchExample {
    public static void main(String[] args) {
        printType(42);             // Integer
        printType("Hello Java!");  // String
        printType(3.14);           // Double
        printType(true);           // Boolean
    }

    public static void printType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("The object is an Integer: " + i);
            case String s -> System.out.println("The object is a String: " + s);
            case Double d -> System.out.println("The object is a Double: " + d);
            case Boolean b -> System.out.println("The object is a Boolean: " + b);
            default -> System.out.println("Unknown type: " + obj.getClass().getName());
        }
    }
}

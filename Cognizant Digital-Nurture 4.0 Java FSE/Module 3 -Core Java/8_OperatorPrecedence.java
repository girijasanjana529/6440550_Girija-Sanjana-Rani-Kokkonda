public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;

        
        int result1 = a + b * c;   
        System.out.println("a + b * c = " + result1);  
        
        int result2 = (a + b) * c; 
        System.out.println("(a + b) * c = " + result2);  

       
        int result3 = a + b * c - b / c;
        System.out.println("a + b * c - b / c = " + result3);
        
}

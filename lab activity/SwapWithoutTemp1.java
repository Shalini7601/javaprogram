public class SwapWithoutTemp1 {  
    public static void main(String args[]) {  
        String a = "ICE";  
        String b = "CREAM";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  
    }  
}
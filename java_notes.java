/*
 * we are using "const" method in java, we just use "final" in front of variables; 
 * final float pi = 3.14
 */

// DATA TYPES AND VARIABLES

public class java_notes {
    
    public static void main(String[] args) {
        
        byte b = 10; // 1 Byte
        System.out.println(b);

        short s = 20; // 2 Byte
        System.out.println(s);

        int i = 40; // 4 Byte
        System.out.println(i);

        long l = 80; // 8 Byte
        System.out.println(l);

        float pi = 3.14f; // 4 Byte
        System.out.println(pi);

        double d = 23.32233223; // 8 Byte
        System.out.println(d);

        char c = 'c'; // 2 Byte
        System.out.println(c);

        boolean bool = true;
        System.out.println(bool);

        char ch = "abc".charAt(1);
        System.out.print("ch: "+ch+"\n");
    }
}
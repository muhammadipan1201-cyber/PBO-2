
package javaapplication11;


public class operatorincremen {

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Nilai awal x: " + x);
        
        // Post-increment
        System.out.println("Nilai x++: " + (x++));
        System.out.println("Nilai x setelah x++: " + x);
        
        // Pre-increment
        System.out.println("Nilai ++x: " + (++x));
    }
}   


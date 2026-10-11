public class KonversiSuhu {
    public static void main(String[] args) {
        double C = 10;
        double F = 15;
        double R = 5;

        System.out.println("=== NILAI AWAL ===");
        System.out.println("Celcius    = " + C);
        System.out.println("Fahrenheit = " + F);
        System.out.println("Reamur     = " + R);
       
        double cToF = (C * 9.0 / 5.0) + 32;
        double fToC = (F - 32) * 5.0 / 9.0;
        System.out.println("\n--- a. Celcius & Fahrenheit ---");
        System.out.println(C + " °C ke Fahrenheit = " + cToF + " °F");
        System.out.println(F + " °F ke Celcius    = " + fToC + " °C");

        double cToR = C * 4.0 / 5.0;
        double rToC = R * 5.0 / 4.0;
        System.out.println("\n--- b. Celcius & Reamur ---");
        System.out.println(C + " °C ke Reamur = " + cToR + " °R");
        System.out.println(R + " °R ke Celcius = " + rToC + " °C");

        double fToR = 4.0 / 9.0 * (F - 32);
        double rToF = (9.0 / 4.0 * R) + 32;
        System.out.println("\n--- c. Fahrenheit & Reamur ---");
        System.out.println(F + " °F ke Reamur = " + fToR + " °R");
        System.out.println(R + " °R ke Fahrenheit = " + rToF + " °F");
    }
}
   

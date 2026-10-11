
package javaapplication11;

public class WaktuTempuhCahayakeBulanatahari {
    
    public static void main(String[] args) {
        double kecepatanCahaya = 300000; //
        
        double jarakBulan = 384400; 
        double jarakMatahari = 152.1 * 1000000;
        
        double waktuKeBulan = jarakBulan / kecepatanCahaya; 
        double waktuKeMatahari = jarakMatahari / kecepatanCahaya; 
        
        System.out.println("Waktu tempuh ke Bulan: " + waktuKeBulan + " detik");
        System.out.println("Waktu tempuh ke Matahari: " + waktuKeMatahari + " detik (" + (waktuKeMatahari / 60) + " menit)");
    }
}
    


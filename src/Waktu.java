import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Diva Sabila Ramadhan 
 * Nama  : Diva Sabila Ramadhan
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program ini menampilkan tanggal berdasarkan lokasi dan waktu sekarang
 */
public class Waktu {

    static Date date = new Date();
    static Locale lokal= Locale.forLanguageTag("id");
    static SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", lokal);
    
    public static void tampilWaktu(){
        System.out.println("Hari ini adalah hari : " + formatter.format(date));
    }
    
    public static void main(String[] args) {
        tampilWaktu();
        System.out.println("Developed by : Diva Sabila Ramadhan");
    }
    
}

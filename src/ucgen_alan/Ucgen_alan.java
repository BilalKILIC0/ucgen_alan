
//Üçgenin Alanını Veren Program.


/*
Adım 1: Başla.
Adım 2: Kullanıcından 2 tane sayı al.
Adım 3: (taban alanı*yükseklik)/2 formülüyle alan hesapla,
Adım 4: Hesapladığın değeri ekrana yazdır.
Adım 5: Dur.
*/

package ucgen_alan;
import java.util.Scanner; //Javanın util kütüphanesinden Scanner class'ı inport edildi.

public class Ucgen_alan {

  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);  //Konsldan değer almak için tanımladık.
        System.out.println("Lütfen Üçgenin Yüksekliğini Giriniz :");
        double yukseklik = input.nextDouble();
        System.out.println("Lütfen Taban Uzunluğunu Giriniz :");
        double taban =input.nextDouble();
        
        double alan = (yukseklik*taban)/2;
        
        System.out.println("Güçgeninizin Alanı : " +alan); //Aldığımız değerleri gerekli işlemler yaptırarak ekrana yazdırdık.
        
        
    }
    
}

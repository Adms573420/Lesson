import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Scanner;

public class Lesson_6Homework {
   /* public static void main(String args[]) {
        //Kullanıcıdan kredi kartı numarasını ve bu numaranın üçüncü,
        // dördüncü ve sonuncu rakamlarını ekrana yazdırınız.

        System.out.print("Kart Numarasını Giriniz:");
        Scanner scanner = new Scanner(System.in);


        int card_no = scanner.nextInt();

        int kart = card_no;

        for (int i = 1; i <= kart; i++) {
            if (i == 3) {
                System.out.println("Kartın ücüncü rakamı:"+i);
            }
            if(i==4){
                System.out.println("Kartın dördüncü rakamı:"+i);
            }
            if(i==card_no%10){
                System.out.println("Kartın son rakamı:"+i);
            }
          }
      }

    public static void main (String args[] ){
        //Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin kaç harften oluştuğunu ekrana yazdırın.


        System.out.print("İsmini Yazınız:");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.nextLine();
        int ilk= name.length();
        System.out.println("Adınız"+" "+ilk+" "+"harflidir.");


        System.out.print("Soyadınızı Yazınız:");
        String soyad= scanner.nextLine();
        int soy= soyad.length();
        System.out.println("Soyadınız"+" "+soy+" "+"harflidir.");

    }

    public static void main(String args[]) {
        //Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdırın.

        System.out.print("Adınızı Yazınız:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String username = name.substring(0, 1).toUpperCase(Locale.ROOT);
        System.out.println("ilk harf:" + username);


        System.out.print("Soyadınızı Yazınız:");
        String secondName = scanner.nextLine();

        String username2 = secondName.substring(0, 1).toUpperCase(Locale.ROOT);
        System.out.println("ilk harf:" + username2);


    }

    public static void main (String args[]){
        //Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ismi Amerika ise ekrana USA, İngiltere ise ekrana UK,
        //Almanya ise ekrana DE yazdırın.Diger ülkeler ise NA yazdırın.

        String ulke;
        Scanner ulke_kisaltma = new Scanner(System.in);
        System.out.print("Bir Ulke  Giriniz: ");
        ulke = ulke_kisaltma.next();
        String trim_ulke = ulke.trim();
        boolean amerika=trim_ulke.equals("Amerika");
        boolean england=trim_ulke.equals("Ingiltere");
        boolean almanya=trim_ulke.equals("Almanya");
        if (amerika)  {
            System.out.println("USA");
        } else if (england) {
            System.out.println(" UK");
        } else if(almanya) {
            System.out.println(" DE");
        }
        else {
            System.out.println("Yanlis NA");
        }
    }
    public static void main (String args[]){
        System.out.println("Ülke adı giriniz:");
        Scanner scanner=new Scanner(System.in);

        String name= scanner.nextLine();

        String country=name.substring(0,2).toUpperCase(Locale.ROOT);
        System.out.println(country);

    }*/
   public static void main(String args[]) {
       //Kullanıcıdan yasadığı ülkenin adını alın bu ülkenin bastan ikinci harfi ile
       // sondan ikinci harfini büyük harf olarak yazdırınız.

       String ulke;
       Scanner u_girdi = new Scanner(System.in);
       System.out.println("Yasadiginiz Ulkeyi Griniz...>");
       ulke = u_girdi.next();
       ulke = ulke.trim();
       ulke = ulke.toLowerCase(Locale.ROOT);
       ulke =  ulke.substring(0,1) +
               ulke.substring(1,2).toUpperCase() +
               ulke.substring(2,ulke.length()-2) +
               ulke.substring(ulke.length()-2,ulke.length()-1).toUpperCase() +
               ulke.charAt(ulke.length()-1);
       System.out.println(ulke);

   }
}



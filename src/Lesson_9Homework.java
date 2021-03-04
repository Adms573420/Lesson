import java.util.ArrayList;
import java.util.List;

public class Lesson_9Homework {
    public static void main(String[] args) {

        /*ArrayList<String>  haftanın_gunleri=new ArrayList<>();

        haftanın_gunleri.add("Pazartesi");
        haftanın_gunleri.add("Salı");
        haftanın_gunleri.add("Carsamba");
        haftanın_gunleri.add("Persembe");
        haftanın_gunleri.add("Cuma");
        haftanın_gunleri.add("Cumartesi");
        haftanın_gunleri.add("Pazar");
         int uzunluk=haftanın_gunleri.size();
         System.out.println("Uzunluk: "+uzunluk);
        for (int i = 0; i < haftanın_gunleri.size(); i++) {

            System.out.println((i+1)+".nci gun: "+haftanın_gunleri.get(i));
        }
        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();

        List1.add(1);
        List1.add(2);
        List1.add(3);
        List1.add(4);
        List1.add(5);

        List2.add(6);
        List2.add(7);
        List2.add(8);
        List2.add(4);
        List2.add(10);

        for (int i = 0; i < List1.size(); i++) {
            List1.indexOf(i);

            for (int j = 0; j < List2.size(); j++)
            {
                List2.indexOf(j);

                if(List1.indexOf(i) == List2.indexOf(j)){
                    System.out.println((i+1)+".nci elemana "+(j+1)+".nci elemana esittir."+List2.get(j));

                }

            }


        }

        ArrayList<String> List = new ArrayList<>();

        List.add("Volvo");
        List.add("Audı");
        List.add("Bmw");
        List.add("Ford");
        List.add("Honda");
        List.add("Kia");
        List.add("Toyota");

        List.remove(2);

        for (int i = 0; i < List.size(); i++) {
            System.out.println((i + 1) + ".nci eleman:" + List.get(i));
        }
        System.out.println("--------------------");
        List.set(3, "Mercedes");
        for (int i = 0; i < List.size(); i++) {
            System.out.println((i + 1) + ".nci eleman:" + List.get(i));

        }*/

        ArrayList<Integer> List=new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);

        for (int i = List.size()-1; i>=0 ; i--) {
            System.out.println((i + 1) + ".nci eleman:" + List.get(i));
        }


    }
}

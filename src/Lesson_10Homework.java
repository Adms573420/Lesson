import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lesson_10Homework {
    /*public static void main(String[] args) {
        int[] int_array = {45, 6, 1, 543, 13, 98};
    /*
    int_array de 10 sayisindan buyuk olanlarin
    toplamini for ve if kullarak bulunuz.

        int toplam=0;
        for (int i = 0; i < int_array.length; i++) {
            if(int_array[i]>10){
                toplam +=int_array[i];
            }
        }
        System.out.println("toplam: "+toplam);


    }
        public static void main(String args[]) {

    /*
    list1 ArrayListine 5 tane eleman atayiniz,
    list2 adinda farkli bir ArrayList<String>
    olusturunuz ve list1 in elemanlarini tersten
    list2'ye atayiniz.

            ArrayList<String> List1=new ArrayList<>();
            List1.add("Ev");
            List1.add("Araba");
            List1.add("Ali");
            List1.add("Ata");
            List1.add("Bak");

            ArrayList<String> List2= new ArrayList<>();
            List2.addAll(List1);

            for (int i =List2.size(); i>=0; i--) {
                System.out.print(" "+List2.get(i-1));
            }
        } */
    public static void main(String args[]) {
       // ArrayList<Integer> list3 = new ArrayList<>();
    /*
    list3'e 10 adet eleman atayiniz daha sonra
    2. elemani 10 degeri ile 7. elemani 20 degeri
    ile degistiriniz.
    list3'un ilk ve son elemanlarini list3'den siliniz.
    list3'un elemanlarini kucukten buyuge ve buyukten
    kucuge siralayiniz.
    list3 un icinde 8 sayisi var mi kontrol ediniz.

        list3.add(1);
        list3.add(2);
        list3.add(4);
        list3.add(8);
        list3.add(16);
        list3.add(32);
        list3.add(64);
        list3.add(128);
        list3.add(256);
        list3.add(512);

        list3.set(2, 10);
        list3.set(7, 20);
        list3.remove(0);
        list3.remove(8);
        Object[] array=list3.toArray();
        for (int i = 0; i < array.length(); i++) {
            for (int j = 0; j < array; j++) {
                if(array[i]<array[j]){
                    int yedek=array[i];
                    array[i]=array[j];
                    array[j]=yedek;


                }
            }
        //Declare an array numArray of 15 elements of type int.
        int[] dizi={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        List<Integer> list=new ArrayList<>(dizi.length);
        

        for (int i = 0; i < dizi.length; i++) {
            list.add(dizi[i]);
        }
        list.set(5,35);

       for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
        int sum=0;
        sum+=list.get(6)+list.get(13);
        System.out.println(sum);*/
        int[] int_array2 = {13,2,5,7,24};


        List<Integer> list1=new ArrayList<>(int_array2.length);
        for (int i = 0; i < int_array2.length; i++) {
            list1.add(int_array2[i]);
        }


        for (int i = 0; i < list1.size(); i++) {

        }
        Collections.sort(list1);

        System.out.println(list1);










    }




}



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lesson_10Homework {
    /* public static void main(String[] args) {


     int_array de 10 sayisindan buyuk olanlarin
     toplamini for ve if kullarak bulunuz.

        int[] int_array = {45,6,1,543,13,98};
        int sum=0;

        for (int i = 0; i <int_array.length ; i++) {
            if(int_array[i]>10){
                sum+=int_array[i];
            }
        }
        System.out.println(sum);


    }*/
    public static void main(String args[]){
         /*
    list1 ArrayListine 5 tane eleman atayiniz,
    list2 adinda farkli bir ArrayList<String>
    olusturunuz ve list1 in elemanlarini tersten
    list2'ye atayiniz.

        ArrayList<String> list1=new ArrayList<>();
        list1.add("Audı");
        list1.add("Bmw");
        list1.add("Ford");
        list1.add("Mercedes");
        list1.add("Opel");
        ArrayList<String> list2=new ArrayList<>();

        list2.addAll(list1);
        for (int i = list2.size()-1; i>=0 ; i--) {
            System.out.println(list2.get(i));
        }
        System.out.println("-------------");

        for (int i = 0; i < list2.size(); i++) {
            System.out.println((i+".nci eleman:"+list2.get(i)));
        }*/
        ArrayList<Integer> list3= new ArrayList<>();

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

        list3.set(2,10);
        list3.set(7,20);
        list3.remove(0);
        list3.remove(8);
     boolean sekiz_varmı= list3.contains(8);
     Integer[] a= list3.toArray(new Integer[0]);
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);

        }

       for (int i=0; i<a.length; i++) {
          for (int j = 0; j <a.length; j++) {
              if(a[i]<a[j]){
                  int yedek=a[i];
                  a[i]=a[j];
                  a[j]=yedek;
              }

              }
          }
       System.out.println(Arrays.toString(a));




           }
       }




















package access;

import java.util.Scanner;

public class DecimaltoBinary {
    public static int Converter(){
        int number,i=0;
        int[] binary =new int[100];
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        number=scan.nextInt();
        while(number>0)
        {
            binary[i]=number%2;
            number=number/2;
            i++;
        }
        System.out.print("Binary value is:");
        for (int j = i-1; j >0 ; j--) {
            System.out.print(binary[j]);



        }
        return number;



    }

    public static void main(String[] args) {
     System.out.println(Converter());

        }

    }







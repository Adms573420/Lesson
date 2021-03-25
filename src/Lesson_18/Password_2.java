package Lesson_18;

import java.util.Scanner;

public class Password_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sifre = "";
        int sonuc = 0;
        do {
            System.out.println("Lutfen sifrenizi giriniz.");
            sifre = scan.nextLine();
            sonuc = uzunluk(sifre) + harfVarMi(sifre) + sayıVarMi(sifre);

        } while (sonuc != 3);
        System.out.println("Sifreniz basarı ile kaydedildi.");

    }

    public static int uzunluk(String sifre) {

        int flaguzunluk = 0;
        int index=0;

        if (sifre.length() >= 10) {
            flaguzunluk = 1;
        } else {
            System.out.println("Sifre 10 karakterden azdır.");
        }
        return flaguzunluk;
    }

    public static int harfVarMi(String sifre) {
        int flagharf = 0;
        int index = 0;
        while (index < sifre.length()) {
            if (sifre.charAt(index) >= 'A' && sifre.charAt(index) <= 'Z' || sifre.charAt(index) >= 'a' && sifre.charAt(index) <= 'z') {
                flagharf = 1;
            }
            index++;
        }
        if (flagharf == 0) {
            System.out.print("Sifre harf icermelidir.");
        }
        return flagharf;

    }

    public static int sayıVarMi(String sifre) {
        int flagSayi = 0;
        int index = 0;
        int sayi = 0;
        for (int i = 0; i <=9 ; i++) {
            sifre.charAt(i);
            sayi++;
        }
        if (sayi >= 2) {
            flagSayi = 1;
        }
        if (flagSayi == 0) {
            System.out.println("sifre en az iki sayı icermelidir.");
        }
        return flagSayi;
    }
}



package com.mycompany.idmanprogram;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Idman Programi");
        String idmanlar = "Gecerli Hareketler;\n"
                + "Burpee\n"
                + "Pushup(Sınav)\n"
                + "Situp(Mekik)\n"
                + "Squat";
        System.out.println(idmanlar);

        System.out.println("Bir idman olusturun.");

        System.out.println("Burpee Sayisi: ");
        int burpee = scanner.nextInt();
        System.out.println("Pushup Sayisi: ");
        int pushup = scanner.nextInt();
        System.out.println("Situp Sayisi: ");
        int situp = scanner.nextInt();
        System.out.println("Squat Sayisi: ");
        int squat = scanner.nextInt();
        scanner.nextLine();

        Idman idman = new Idman(burpee, pushup, situp, squat);
        System.out.println("Idman basliyor...");

        while (idman.idmanBittiMi() == false) {
            System.out.println("Hareket Turu(Burpee,Pushup,Situp,Squat): ");
            String tur = scanner.nextLine();
            System.out.println("Bu hareketten kac tane yapacaksiniz: ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);
        }
        System.out.println("Idman Bitti...");
    }
}

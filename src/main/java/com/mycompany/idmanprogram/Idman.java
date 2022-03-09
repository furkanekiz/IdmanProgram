package com.mycompany.idmanprogram;

public class Idman {

    private int burpeeSayisi;
    private int pushUpSayisi;
    private int sitUpSayisi;
    private int squatSayisi;

    public Idman(int burpeeSayisi, int pushUpSayisi, int sitUpSayisi, int squatSayisi) {
        this.burpeeSayisi = burpeeSayisi;
        this.pushUpSayisi = pushUpSayisi;
        this.sitUpSayisi = sitUpSayisi;
        this.squatSayisi = squatSayisi;
    }

    public int getBurpeeSayisi() {
        return burpeeSayisi;
    }

    public void setBurpeeSayisi(int burpeeSayisi) {
        this.burpeeSayisi = burpeeSayisi;
    }

    public int getPushUpSayisi() {
        return pushUpSayisi;
    }

    public void setPushUpSayisi(int pushUpSayisi) {
        this.pushUpSayisi = pushUpSayisi;
    }

    public int getSitUpSayisi() {
        return sitUpSayisi;
    }

    public void setSitUpSayisi(int sitUpSayisi) {
        this.sitUpSayisi = sitUpSayisi;
    }

    public int getSquatSayisi() {
        return squatSayisi;
    }

    public void setSquatSayisi(int squatSayisi) {
        this.squatSayisi = squatSayisi;
    }

    public void burpeeYap(int sayi) {
        if (burpeeSayisi == 0) {
            System.out.println("Yapacak burpee kalmadı.");
        }
        if (burpeeSayisi - sayi < 0) {
            System.out.println("Hedeflediğin burpee gectin.Tebrikler!");
            burpeeSayisi = 0;
            System.out.println("Kalan Burpee: " + burpeeSayisi);
        } else {
            burpeeSayisi -= sayi;
            System.out.println("Kalan Burpee: " + burpeeSayisi);
        }
    }

    public void pushupYap(int sayi) {
        if (pushUpSayisi == 0) {
            System.out.println("Yapacak Pushup kalmadı.");
        }
        if (pushUpSayisi - sayi < 0) {
            System.out.println("Hedeflediğin Pushup gectin.Tebrikler!");
            pushUpSayisi = 0;
            System.out.println("Kalan Pushup: " + pushUpSayisi);
        } else {
            pushUpSayisi -= sayi;
            System.out.println("Kalan Pushup: " + pushUpSayisi);
        }
    }

    public void situpYap(int sayi) {
        if (sitUpSayisi == 0) {
            System.out.println("Yapacak Situp kalmadı.");
        }
        if (sitUpSayisi - sayi < 0) {
            System.out.println("Hedeflediğin Situp gectin.Tebrikler!");
            sitUpSayisi = 0;
            System.out.println("Kalan Situp: " + sitUpSayisi);
        } else {
            sitUpSayisi -= sayi;
            System.out.println("Kalan Situp: " + sitUpSayisi);
        }
    }

    public void squatYap(int sayi) {
        if (squatSayisi == 0) {
            System.out.println("Yapacak Squat kalmadı.");
        }
        if (squatSayisi - sayi < 0) {
            System.out.println("Hedeflediğin Squat gectin.Tebrikler!");
            squatSayisi = 0;
            System.out.println("Kalan Squat: " + squatSayisi);
        } else {
            squatSayisi -= sayi;
            System.out.println("Kalan Squat: " + squatSayisi);
        }
    }

    public void hareketYap(String hareketTuru, int sayi) {
        if (hareketTuru.equals("Burpee")) {
            burpeeYap(sayi);
        } else if (hareketTuru.equals("Pushup")) {
            pushupYap(sayi);
        } else if (hareketTuru.equals("Situp")) {
            situpYap(sayi);
        } else if (hareketTuru.equals("Squat")) {
            squatYap(sayi);
        } else {
            System.out.println("Gecersiz Hareket...");
        }

    }

    public boolean idmanBittiMi() {
        return (burpeeSayisi == 0) && (pushUpSayisi == 0) && (sitUpSayisi == 0) && (squatSayisi == 0);
    }

}

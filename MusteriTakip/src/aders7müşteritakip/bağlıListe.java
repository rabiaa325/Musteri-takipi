package aders7müşteritakip;

import java.util.Scanner;

public class bağlıListe {

    Scanner scanner = new Scanner(System.in);

    MüşteriNode head = null;
    MüşteriNode tail = null;
    int id;
    String ad;
    String soyad;
    String tel;
    String adres;
    String ürün;

    void ekle() {
        System.out.println("müşteri bilgilerini giriniz");
        System.out.print("numara:");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("adı:");
        ad = scanner.nextLine();
        System.out.print("soyadı:");
        soyad = scanner.nextLine();
        System.out.print("adres:");
        tel = scanner.nextLine();
        System.out.print("tel numarısı:");
        adres = scanner.nextLine();
        System.out.print("ürün bilgileri:");
        ürün = scanner.nextLine();

        MüşteriNode eleman = new MüşteriNode(id, ad, soyad, tel, adres, ürün);

        if (head == null) {
            head = eleman;
            tail = eleman;
            System.out.print("liste oluşturuldu ilk eleman eklendi");
        } else {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            System.out.print("numaralı müşteri kayıt edildi");
        }
    }

    void sil() {
        boolean sonuç = false;
        if (head == null) {
            System.out.print("liste boş!!:");

        } else {
            System.out.print("silinecek müşteri numarası   :");
            id = scanner.nextInt();
            scanner.nextLine();
            if (head.next == null && head.id == id) {//en baştaki (head) siler ama başka elemanyok
                head = null;
                tail = null;
                System.out.print(id + "kişi silindi");
                sonuç = true;
            } else if (head.next != null && head.id == id) {//en baştaki (head) siler ama başka elemanlarda var
                head = head.next;
                head.prev = null;
                System.out.print(id + "kişi silindi");
                sonuç = true;

            } else if (tail.id == id) {//son düğüm silme
                tail = tail.prev;
                tail.next = null;
                System.out.print(id + "kişi silindi");
                sonuç = true;
            } else {
                MüşteriNode temp = head;
                while (temp != null) {//son düğüme kadar gitsin
                    if (temp.id == id) {
                        temp.next.prev = temp.prev;//temp silmek istenen
                        temp.prev.next = temp.next;
                        sonuç = true;
                        break;//döngüden çık demek
                    }
                    temp = temp.next;
                }
            }

        }
        if (sonuç == false) {
            System.out.print(id + "kişi listede yok");
        }
    }

    void güncelle() {
        boolean sonuç = false;
        if (head == null) {
            System.out.print("liste boş!!:");

        } else {
            System.out.print("güncellenecek müşteri numarası   :");
            id = scanner.nextInt();
            scanner.nextLine();
            MüşteriNode temp = head;
            while (temp != null) {//son düğüme kadar gitsin
                if (temp.id == id) {
                    System.out.print(id + "güncellenecek müşterinin bilgileri   :");
                    System.out.print("numara   :");

                    scanner.nextLine();
                    System.out.print("adı   :" + temp.ad);
                    System.out.print("soyadı   :" + temp.soyad);
                    System.out.print("tel numarısı   :" + temp.tel);
                    System.out.print("adresi   :" + temp.adres);
                    System.out.print("ürün bilgileri   :" + temp.ürün);

                    System.out.print("ürün bilgisini güncelleyiniz :");
                    temp.ürün = scanner.nextLine();//ürün bilgisinin adını kullanıcı girsin demek
                    System.out.print("ürün bilgisi güncellendi:");
                    sonuç = true;
                    break;//döngüden çık demek
                }
                temp = temp.next;
            }
        }
    }

    void müşteriara() {
        boolean sonuç = false;
        if (head == null) {
            System.out.print("liste boş!!:");

        } else {
            System.out.print("arayacağınız müşteri numarası   :");
            id = scanner.nextInt();
            scanner.nextLine();
            MüşteriNode temp = head;

            while (temp != null) {//son düğüme kadar gitsin

                if (temp.id == id) {
                    System.out.print(id + "arayacağınız müşterinin bilgileri   :");
                    System.out.print("numara   :");

                    scanner.nextLine();
                    System.out.print("adı   :" + temp.ad);
                    System.out.print("soyadı   :" + temp.soyad);
                    System.out.print("tel numarısı   :" + temp.tel);
                    System.out.print("adresi   :" + temp.adres);
                    System.out.print("ürün bilgileri   :" + temp.ürün);

                    sonuç = true;
                    break;//döngüden çık demek
                }
                temp = temp.next;
            }
        }
    }

    void yazdir() {

        if (head == null) {
            System.out.print("liste boş!!:");

        } else {
            System.out.println("numara-ad-soyad-tel-adres-ürün");
            
            MüşteriNode temp = head;

            while (temp != null) {//son düğüme kadar gitsin

                System.out.print(temp.id + "\t" + temp.ad + "\t"  + temp.soyad +"\t"  + temp.adres +"\t"  + temp.tel + "\t"  + temp.ürün + "\t" );

            }
            temp = temp.next;
        }
    }
}

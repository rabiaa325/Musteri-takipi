package aders7müşteritakip;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Aders7MüşteriTakip {

    public static void main(String[] args) {
        bağlıListe bl = new bağlıListe();
        Scanner scanner = new Scanner(System.in);
        int seçim =-1;
        while (seçim != 0) {
            System.out.println("1 ekle");
            System.out.println("2 sil");
            System.out.println("3 güncelle");
            System.out.println("4 müşteri ara");
            System.out.println("5 yazıdır");
            System.out.println("0 çıkış");
            System.out.println("seçiminiz");
            seçim = scanner.nextInt();
            scanner.nextLine();
            switch (seçim) {
                case 1:
                    bl.ekle();
                    break;
                case 2:
                    bl.sil();
                    break;
                case 3:
                    bl.güncelle();
                    break;
                case 4:
                    bl.ekle();
                    break;
                case 5:
                    bl.müşteriara();
                    break;
                case 0:
                    System.out.println("çıkış yaptınız");
                    break;
                default:
                    System.out.println("hatalı giriş yaptınız");
                    break;
            }

        }

    }

}

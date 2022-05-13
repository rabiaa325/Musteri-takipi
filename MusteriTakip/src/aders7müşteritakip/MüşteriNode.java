package aders7müşteritakip;

public class MüşteriNode {

    int id;
    String ad;
    String soyad;
    String tel;
    String adres;
    String ürün;

    MüşteriNode next;
    MüşteriNode prev;

    public MüşteriNode(int id, String ad, String soyad, String tel, String adres, String ürün) {
        // super(); kalıtım almadık
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.tel = tel;
        this.adres = adres;
        this.ürün = ürün;
        next=null;
        prev=null;

    }

   
}

public class Yonetici extends Calisan {

    public Yonetici(String ad, String soyad, int maas) {
        super(ad, soyad, maas);
    }

    @Override
    public void islemler(int a) {
        if (a == 1) {
            System.out.println("ÇALIŞAN KOVULDU...");
        } else if (a == 2) {
            System.out.println("ÇALIŞANLARA ZAM YAPILDI...");
        } else if (a == 3) {
            System.out.println("ÇALIŞANA İZİN VERİLDİ...");
        } else {
            System.out.println("GEÇERSİZ İŞLEM...");
        }
    }
}

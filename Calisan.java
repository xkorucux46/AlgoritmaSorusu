public class Calisan {

    private String ad;
    private String soyad;
    private int maas;

    public Calisan(String ad, String soyad, int maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
    }

    public void bilgiGoster() {
        System.out.println("ADINIZ: " + this.ad + ",SOYADINIZ: " + this.soyad + ",MAASINIZ: " + this.maas);
    }

    public void islemler(int a) {
        if (a == 1) {
            System.out.println("İŞTEN AYRILDINIZ.Tazminatınız Verilecektir...");
        } else if (a == 2) {
            System.out.println("ZAM TALEBİNİZ ALINDI.Size dönüş yapacağız.");
        } else if (a == 3) {
            System.out.println("İZİN TALEBİNİZ ALINDI.SİZE DÖNÜŞ YAPILACAK");
        } else {
            System.out.println("GEÇERSİZ İŞLEM...");
        }
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getMaas() {
        return maas;
    }

}

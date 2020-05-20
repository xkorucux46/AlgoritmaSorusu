import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Login l = new Login("yonetici", 12345, "calisan", 12345);
        Calisan c = new Calisan("MUSTAFA", "KORUCU", 3000);
        Yonetici y = new Yonetici("FURKAN", "DEGER", 7000);
        System.out.println("İŞYERİMİZE HOŞGELDİNİZ...");
        System.out.println("Yönetici iseniz 1 e,çalışan iseniz 2 ye basınız.");
        Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();
        if (secim == 1) {
            System.out.println("KULLANICI ADINIZI GİRİNİZ.");
            String a = scan.nextLine();
            String kullanici_adi = scan.nextLine();
            System.out.println("ŞİFRENİZİ GİRİNİZ.");
            int pw = scan.nextInt();
            if (kullanici_adi.equals(l.getYoneticiID()) && pw == l.getYoneticiPW()) {
                boolean kontrol = true;
                while (kontrol == true) {
                    Yonetıcı();
                    int karar = scan.nextInt();
                    if (karar == 4) {
                        break;
                    }
                    y.islemler(karar);
                }

            }
        } else if (secim == 2) {
            System.out.println("KULLANICI ADINIZI GİRİNİZ.");
            String s = scan.nextLine();
            String kullanici_adi = scan.nextLine();
            System.out.println("ŞİFRENİZİ GİRİNİZ.");
            int pw = scan.nextInt();
            if (kullanici_adi.equals(l.getIsciID()) && pw == l.getIsciPW()) {
                boolean kontrol = true;
                while (kontrol == true) {
                    İsci();
                    int karar = scan.nextInt();
                    if (karar == 4) {
                        break;
                    }
                    c.islemler(karar);
                }
            }

        }
        System.out.println("SİSTEMDEN ÇIKIŞ YAPILIYOR...");
    }

    private static void Yonetıcı() {
        System.out.println("GİRİŞ BAŞARILI...");
        System.out.println("HANGİ İŞLEMİ GERÇEKLEŞTİRMEK İSTİYORSUNUZ?");
        System.out.println("1.İŞLEM:ÇALIŞAN KOVUN");
        System.out.println("2.İŞLEM:ÇALIŞANA ZAM YAPIN");
        System.out.println("3.İŞLEM:ÇALIŞANA İZİN VERİN");
        System.out.println("4.İŞLEM ÇIKIŞ.");
    }

    private static void İsci() {
        System.out.println("GİRİŞ BAŞARILI...");
        System.out.println("HANGİ İŞLEMİ GERÇEKLEŞTİRMEK İSTİYORSUNUZ?");
        System.out.println("1.İŞLEM:İŞTEN AYRIL.");
        System.out.println("2.İŞLEM:ZAM İSTE.");
        System.out.println("3.İŞLEM:İZİN İSTE.");
        System.out.println("4.İŞLEM ÇIKIŞ.");
    }
}

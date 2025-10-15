import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String message = "Sayı tahmin oyunumuza Hoş Geldiniz!\n" +
                "Oyunumuzda 0 ile 20 arasında bir sayı rastgele seçilir.\n" +
                "Amacınız bu sayıyı 5 hak içinde bulmaktır.\n" +
                "Başarılar dilerim! :D";

        short tahminHakki = 5;
        int toplamPuan = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(message);
            int tahminEdilecekSayi = random.nextInt(21);
            int puan = 0;

            for (int i = tahminHakki; i > 0; i--) {
                System.out.print("Tahmininizi giriniz (0-20): ");
                int tahminEdilenDeger = scanner.nextInt();

                if (tahminEdilecekSayi == tahminEdilenDeger) {
                    puan = i * 20; // 5 hak → 100 puan, hak azaldıkça düşer
                    toplamPuan += puan;
                    System.out.println("Tebrikler! Sayıyı doğru tahmin ettiniz 🎉");
                    System.out.println("Kalan hakkınız: " + (i - 1));
                    System.out.println("Bu turda kazandığınız puan: " + puan);
                    System.out.println("Toplam puanınız: " + toplamPuan);
                    System.out.println("Çıkış için 0'a, tekrar oynamak için 1'e basınız: ");
                    int cevap = scanner.nextInt();
                    if (cevap == 0) {
                        System.out.println("Oyun sona erdi!");
                        System.out.println("Toplam puanınız: " + toplamPuan);
                        return;
                    } else if (cevap == 1) {
                        System.out.println("Yeni oyun başlıyor...\n");
                        break;
                    } else {
                        System.out.println("Hatalı giriş yaptınız! Oyun sonlandırılıyor.");
                        System.out.println("Toplam puanınız: " + toplamPuan);
                        return;
                    }

                } else {
                    System.out.println("Tahmininiz yanlış!");
                    yakınlıkDurumu(tahminEdilenDeger, tahminEdilecekSayi);
                    System.out.println("Kalan hakkınız: " + (i - 1));
                    System.out.println(" ");
                    if (i == 1) {
                        System.out.println("Tahmin hakkınız kalmadı!");
                        System.out.println("Doğru sayı: " + tahminEdilecekSayi);
                        System.out.println("Bu turdan puan kazanamadınız.");
                        System.out.println("Toplam puanınız: " + toplamPuan);
                        System.out.println("Çıkış için 0'a, tekrar oynamak için 1'e basınız:");
                        int cevap = scanner.nextInt();
                        if (cevap == 0) {
                            System.out.println("Oyun sona erdi!");
                            System.out.println("Toplam puanınız: " + toplamPuan);
                            return;
                        } else if (cevap == 1) {
                            System.out.println("Yeni oyun başlıyor...\n");
                            break;
                        } else {
                            System.out.println("Geçersiz giriş yaptınız, oyun kapatılıyor.");
                            System.out.println("Toplam puanınız: " + toplamPuan);
                            return;
                        }
                    }
                }
            }
        }
    }

    public static void yakınlıkDurumu(int tahminEdilenDeger, int tahminEdileceksayi) {
        int fark = tahminEdileceksayi - tahminEdilenDeger;

        if (Math.abs(fark) < 2) {
            System.out.println("Sayının hemen dibindesin!");
        } else if (Math.abs(fark) < 4) {
            System.out.println("Sayıya yaklaşıyorsun!");
        } else if (Math.abs(fark) < 14) {
            System.out.println("Sayıdan uzaksın!");
        } else {
            System.out.println("Sayıyla uzaktan yakından alakan yok *_*");
        }
    }
}

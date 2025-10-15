  Oyunun Konsepti ve Amacı
Bu proje, Java dilinde geliştirilmiş, klasik sayı tahmin oyununa modern ve kullanıcı dostu özellikler katan bir konsol uygulamasıdır. Oyunun temel amacı, bilgisayarın 0 ile 20 arasında rastgele belirlediği bir sayıyı, oyuncunun 5 deneme hakkı içinde tahmin etmesidir. Oyuncuyu sadece "doğru" ya da "yanlış" ikilemine bırakmak yerine, akıllı ipuçları ve dinamik puanlama sistemi ile zenginleştirilmiş bir deneyim sunar.
Bu projenin kodunu ve oynanışını "efektif" kılan temel özellikler şunlardır:

  Dinamik Puanlama Sistemi:
Oyuncunun kazandığı puan, kalan tahmin hakkıyla doğru orantılıdır. Sayıyı ne kadar erken bulursa o kadar yüksek puan alır (puan = kalanHak * 20). Bu sistem, oyuncuyu sadece doğru tahmini bulmaya değil, aynı zamanda bunu en az denemede yapmaya teşvik eder.
  Akıllı İpucu Mekanizması (yakınlıkDurumu metodu):
Oyun, yanlış tahminlerde oyuncuya "daha büyük" veya "daha küçük" gibi basit yönlendirmeler yapmak yerine, tahminin gizli sayıya olan uzaklığına göre niteliksel ipuçları verir.
"Sayının hemen dibindesin!", "Sayıya yaklaşıyorsun!" veya "Sayıdan uzaksın!" gibi geri bildirimler, oyuncunun strateji geliştirmesine yardımcı olur ve oyunu daha sezgisel hale getirir.
  Tekrarlanabilir Oyun Döngüsü:
Oyun, while(true) döngüsü içinde çalışarak her tur sonunda (kazanma veya kaybetme durumunda) oyuncuya tekrar oynama veya çıkış yapma seçeneği sunar. Bu, programı yeniden başlatmaya gerek kalmadan kesintisiz bir oyun deneyimi sağlar.
  Kümülatif Skor Takibi:
toplamPuan değişkeni sayesinde oyuncunun birden fazla tur boyunca kazandığı puanlar biriktirilir. Bu, oyuncuya kendi rekorunu kırma hedefi vererek oyunun tekrar oynanabilirliğini artırır.

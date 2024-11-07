# Sıcaklık Dönüştürücü - Java Swing Uygulaması

Bu proje, kullanıcıların Celsius, Fahrenheit ve Kelvin birimleri arasında sıcaklık dönüşümü yapmasına olanak tanıyan bir **Java Swing** uygulamasıdır. Basit ve kullanıcı dostu bir arayüz ile sıcaklık değerini girip birimi seçerek dönüşüm yapabilirsiniz. 

## Özellikler

- **Kullanıcı Dostu Arayüz**: Sıcaklık birimini ve dönüşüm yapılacak değeri girmek için basit bir arayüz.
- **Birden Fazla Dönüşüm**: Celsius, Fahrenheit ve Kelvin arasında dönüşüm yapma yeteneği.
- **Sonuç Ekranı**: Dönüşüm sonuçları, tüm birimlerde detaylı bir şekilde görüntülenir.
- **Hata Kontrolü**: Geçersiz bir giriş durumunda kullanıcıya hata mesajı gösterir.

## Ekran Görüntüsü
![image](https://github.com/user-attachments/assets/d00b0012-1acd-4463-8198-47c2d667e6d3)
![image](https://github.com/user-attachments/assets/2acd7f0c-1531-41c6-b424-d6d0840930bf)

## Kullanım

1. Sıcaklık değerini girin.
2. Dönüştürmek istediğiniz birimi seçin.
3. **Dönüştür** butonuna tıklayın.
4. Sonuçlar, seçilen birimin karşılıklarıyla birlikte farklı birimlerde görüntülenir.

## Koddan Notlar

- **GridBagLayout** kullanılarak arayüz düzenlenmiştir.
- `JComboBox` ile birim seçimi yapılabilir.
- `JButton` ile dönüşüm başlatılır, sonuçlar `JTextArea` alanında gösterilir.
- **Dönüşüm Formülleri**:
  - Celsius’tan Fahrenheit’e: `(Celsius * 9/5) + 32`
  - Fahrenheit’ten Celsius’a: `(Fahrenheit - 32) * 5/9`
  - Celsius’tan Kelvin’e: `Celsius + 273.15`
  - Kelvin’den Celsius’a: `Kelvin - 273.15`

## Geliştirme İpuçları

Projeyi geliştirmek için bazı öneriler:
- Farklı sıcaklık birimlerini desteklemek.
- Arayüzü daha modern bir görünümle güncellemek.
- Grafik kütüphaneleri ile sonuçları grafiksel olarak göstermek.

## Katkıda Bulunun

Katkıda bulunmak isterseniz, **fork** yaparak projeyi kopyalayabilir, geliştirmelerinizi ekleyip **pull request** gönderebilirsiniz.

---

**Lisans:** Bu proje [MIT Lisansı](LICENSE) altında lisanslanmıştır.

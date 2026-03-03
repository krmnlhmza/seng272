# Software Project Registration Form (Lab 1)

Bu proje, Java Swing kullanılarak geliştirilmiş basit bir masaüstü form uygulamasıdır. "Yazılım Projesi II" dersinin (SENG272) 1. Laboratuvar görevi kapsamında hazırlanmıştır.

## Özellikler
* **Kullanıcı Arayüzü (GUI):** Proje adı, takım lideri, takım büyüklüğü, proje türü ve başlangıç tarihi bilgilerini alan sade bir kayıt formu.
* **Veri Kaydetme (File I/O):** Doğrulanmış veriler, o anki sistem saati (zaman damgası) ile birlikte otomatik olarak yerel bir `projects.txt` dosyasına alt alta kaydedilir.
* **Girdi Kontrolü:** Formda eksik alan bırakıldığında kullanıcıyı uyarır ve hatalı/eksik kayıt yapılmasını engeller.

## Nasıl Çalıştırılır?
1. Projeyi yerel bilgisayarınıza indirin (`git clone`).
2. IntelliJ IDEA, Eclipse veya herhangi bir Java destekli IDE ile projeyi açın.
3. `src/ProjectFormApp.java` dosyasını çalıştırın.
4. Formu doldurup "Save" butonuna basarak `projects.txt` dosyasının oluştuğunu gözlemleyin.

## Kullanılan Teknolojiler
* Java (Swing & AWT)
* File I/O (FileWriter)
* java.time API

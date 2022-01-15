## 1. Imperative Programming ve Declarative Programming kavramlarını kısaca açıklayıp farklarını belirtiniz.

  Imperative programming programın nasıl yürütüldüğünü açıklayan bir tür programlama paradigmasıdır. Imperative programlamada bilgisayara bir dizi talimat veriyoruz ve bilgisayar da sırayla istediğimizi yapıyor.
  
  Declarative programlamanın ana özelliği bilgisayar sistemlerinin gerçekleştirmesi gereken görevlerin tanımıdır. Imperative programlamadan farklı olarak declarative programlama bir görevin nasıl işleneceğini netleştirmez.
  
## 2. Veri tabanlarının sorgu optimizasyonlarında index oluşturmanın avantajı nedir ? Sık index kullanmak bir probleme yol açar mı?
  
  Veritabanı sorgularında index kullanmak telefon rehberinden bir kişiyi ararken teker teker scroll yapmak yerine önce harfleri scrolllayıp aradığımız kişinin ilk harfi olan harfe gelip orda o kişiyi aramamıza benzer. Kısacası index yapacağımız sorgulara daha hızlı ulaşmamızı sağlar.
  
  Index’ler ekstra yer kaplayan objelerdir. Bu sebeple filtreleme yapmayacağımız anahtar-değer’ler için index oluşturmak, disk üzerinde gereksiz yer kaplayacaktır ve tablolara değer eklendikçe indexler yenileneceği için index olan tablolarda DELETE, INSERT ve UPDATE işlemeri normalden daha yavaş çalışacaktır.
  
## 3. İlişkisel veritabanları için normalizasyon kavramı neyi ifade etmektedir ? İlk 3 normal formu örnek üzerinden açıklayınız.

  Normalizasyon veritabanı tasarlarken veri tekrarını ve ya kaybını önlemek için yapılır.
  
    1NF -> Tekrarlayan kolonlar olmamalı
    2NF -> Kısmi bağımlılıklar olamamlı
    3NF -> Dolaylı bağımlılıklar bulunmamalı
    
## 4. ORM kütüphaneleri kullanmak her zaman avantajlı mıdır ? ORM kütüphanelerinin ne gibi dezavantajları olabilir ?

  - Oluşturulan SQL en optimize SQL olmayabilir.
  - Performans olarak native SQL den daha yavaştır.
  - yeni başlayanlar için yazım kuralları farklı gelebilir.

## 5. Domain Specific Language (DSL) kavramını açıklayınız.

  Domain Specific Language belirli bir sorun sınıfı için optimize edilmiş daha yüksek bir soyutlama düzeyine sahip bir programlama dilidir. Bir DSL, alan veya etki alanındaki kavramları ve kuralları kullanır.
   
   DSL genellikle Java, C veya Ruby gibi genel amaçlı(General Purpose) bir dilden daha az karmaşıktır. Genel olarak, DSL'ler, DSL'nin tasarlandığı alandaki uzmanlarla yakın koordinasyon içinde geliştirilir. Çoğu durumda, DSL'lerin yazılım çalışanları tarafından değil, DSL adresleri alanında akıcı olan programcı olmayan kişiler tarafından kullanılması amaçlanmıştır.
   
## 6. Long lived transaction kavramı hangi tip transactionları ifade etmektedir ? Dezavantajları var mıdır ? Varsa nelerdir ?

  Long lived transaction birden çok veritabanı işlemini kapsayan bir işlemdir. İşlem "uzun ömürlü" olarak kabul edilir, çünkü sınırları, iş mantığı gereği, tek bir veritabanı işlemini geçmesi gerekir. Uzun ömürlü bir işlem, tek bir atomik sonuç elde etmek için gruplandırılmış bir veritabanı işlemleri dizisi olarak düşünülebilir.
  
## 7. Thread Pool nedir ? Nerelerde kullanılır ?

  Bir thread pool iş verilmeye hazır olan, önceden oluşturulmuş, boşta olan bir iş parçacığı grubudur. Bunlar, az sayıda uzun görev yerine yapılacak çok sayıda kısa görev olduğunda, her görev için yeni iş parçacıklarının başlatılması yerine tercih edilir. Bu, çok sayıda iş parçacığı oluşturma ek yüküne maruz kalmayı önler.

## 8. Scalability nedir ? Horizontal ve Vertical Scalability kavramlarını açıklayınız.

  Scalability bir projede kaynak kullanımının artmasıyla verdiğiniz servisin kapasitesinin artmasının hesaplanabilmesidir. Scalability ne kadar yüksekse proje için o kadar iyidir.
  
  Horizontal Scalability, uygulamanın çalıştırıldığı sanal ve ya fiziksel makine sayısının arttırılmasıdır.
  
  Vertical Scalability, uygulamanın üzerinde çalıştığı server'a daha fazla kaynak ekleme(cpu,ram,disk) işlemidir.
  
## 9. Data replication ve sharding nedir ? Aralarında nasıl bir fark bulunmaktadır ?

  Data replication, ortamda biriken verilerin birden fazla konumda tutulmasıdır. Data sharding ise veritabanında tutulan verilerin benzersiz küçük parçalara ayrılmasıdır.
  

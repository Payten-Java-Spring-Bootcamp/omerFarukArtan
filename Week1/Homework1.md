# Ödev 1 

## 1. Pass by value, pass by reference kavramları nedir ? Java’ ile ilişkili olarak açıklayınız.

Aşağıdaki sitelerden bu konuyu araştırdım:
- https://www.geeksforgeeks.org/g-fact-31-java-is-strictly-pass-by-value/
- https://www.baeldung.com/java-pass-by-value-or-pass-by-reference

Java Pass by Value bir dildir. Java da geçen parametre her zaman değere göre geçer. Ancak bağlam ilkel tiplerle(Primitives) mi yok sa nesnelerle(Objects) mi uğraştığımıza bağlıdır. İlkel türler için parametreler değere göre geçer Nesne türleri için, nesne referansı değere göre geçer.

## 2. Immutability nedir, neden önemlidir ? Bir Java sınıfı nasıl immutable yapılır ?

Aşağıdaki medium makalesini okudum
- https://medium.com/kodcular/immutable-class-nedir-ve-neden-class-final-i%CC%87%C5%9Faretlenmeli-c75c9cd33cee

Immutability değişmezlik anlamına gelir. Immutable nesneler tek ve değişmez oldukları için bize büyük rahatlık sağlarlar ve ilk değerlerini aldıktan sonra o değerde sabit kalırlar ve senkronize çalışmak zorunda kalmazlar. Bu da onların thread-safe olmasını sağlar.

Bir java sınıfının immutable olması için gerekli özellikler şunlardır:

- Class içerisinde tanımlanan değişkenler private olmalı.
- Setter metodu içermemeli.
- Değişkenler final olmalı.
- Değişkenlerin ilk değerleri constructor ile verilmeli.
- Class'ın da final olması gerekir(extend edilmemesi için).

## 3. Framework ve library arasındaki fark nedir ?

İkiside başkası tarafından yazılan tekrar kullanılabilen kodlardır. Amaçları alışılagelmiş problemleri kolay bir şekilde çözmeyi sağlamaktır. Farkları ise teknik anlamda ortaya çıkar. Uygulamanın akışını lifecycle ını yönetmiyorsa library yönetiyorsa frameworkdür.

## 4. Java’da Garbage Collector’ un görevi nedir ?

JVM'de bulunan GC arkaplanda bellek yönetimi yapar. Mesela bir String tanımladığımızda onun değerini her değiştirişimizde yeni bir nesne oluşturulacaktır ve kullanılmayan eski instance lar GC tarafından otomatik olarak temizlenecektir. Kendimiz manuel olarakta GC'yi çalıştırabiliriz. GC developerların endişe duymadan yeni nesneler yaratması sağlar.

## 5. Memory leak nedir ? Java’da memory leak oluşması mümkün müdür ?

Memory Leak programın kullandığı hafıza ile işi bittiği halde ilgili hafıza bloğunu serbest bırakmamasıdır. Java'da da memory leak oluşması mümkündür. Birkaç farklı şekilde oluşabilir çok fazla static variable kullanılılması örnek gösterilebilir.

## 6. Yeni Java sürümleri ne sıklıkla çıkmaktadır ?

Java 10 sürümünden beri her 6 ayda bir yeni sürümler çıkmaktadır.

## 7. Stack ve Heap nedir ? Java’da hangi yapılar stack ile, hangi yapılar heap ile ilişkilidir ?

Kodumuz işletim sisteminde bir yer kapladığından stack ve heap alanlarına ihtiyaç duyarız. Eğer program esnasında boyutları bildirilmiş değişmez bir değer kullanıyorsak **stack**, değişebilir bir değer kullanıyorsak **heap** uygun olacaktır.

## 8. OpenJDK ve OracleJDK arasındaki farklar nelerdir ?

OpenJDK Java SE Platform Edition'ın ücretsiz ve açık kaynaklı bir implemantasyonu olup aralarında neredeyse hiçbir fark yoktur. OracleJDK sürümleri zaman zaman lisans farkından dolayı kullanım ücretleri almış. Günümüzde genelde kurumsal şirketler OracleJDK tercih etmektedir, sebebi ise ihtiyaç halinde Oracle tarafından teknik destek sunulmasıdır.

## 9. @FunctionalInterface anotasyonu nerelerde kullanılabilir, neleri sağlar ?

Tek bir soyut metoda sahip arayüzlere fonksiyonel arayüz denir. Tabi **default** metodlar eklenirse implementatiton'ı olduğu için bu kuralı bozmaz. Lambda ifadelerinin tipi fonksiyonel arayüz olmak zorundadır. Yani Lambda ifadeleriyle gerçekleştirilecek arayüzlerde sadece ve sadece bir tane soyut metod olmalıdır, Lambda ifadesi de o tek olan soyut metoda gerçekleştirme verir.

## 10. Java’da hangi functional interface’ler yer almaktadır ? Yaptığınız araştırmada en popüler/göze çarpanlar hangileridir ?

Java da en temel fonksiyonel arayüzler java.util.function paketinin altında tanımlanmıştır. Bunlara hazır fonksiyonel arayüzler denir. Aşağıdaki functional interface ler örnek verilebilir:

- BiConsumer
- BiFunction
- BinaryOperator
- BiPredicate
- BooleanSupplier
- Consumer

## 1. Spring dışında dependency injection için kullanabileceğimiz framework’ler / kütüphaneler nelerdir ? (Herhangi bir programlama dili için olabilir.)

- Ruby on Rails
- Django
- Angular
- ASP.NET

## 2. @SpringBootApplication anotasyonu hangi anotasyonları kapsamaktadır ? Görevlerini kısaca açıklayınız.

@SpringBootApplication anotasyonu aşağıdaki anotasyonları kapsamaktadır:
- @EnableAutoConfiguration: Spring-Boot'un auto-configuration özelliğini aktif eder.
- @ComponentScan: Uygulamanın bulunduğu pakette @Component taramasını etkinleştir.
- @Configuration: Context de ekstra Bean kaydetmeye veya ek yapılandırma sınıflarını içe aktarmaya izin verir.

## 3. @Primary, @Qualifier anotasyonlarının kullanım amaçlarını açıklayınız.

@Primary anotasyonunu aynı tipte birden fazla bean olduğu zaman birisine öncelik vermek istediğimiz zaman kullanırız.
@Quailifier anotasyonunu aynı arayüzden kalıtılan birden fazla bean olduğunda belirtilen isme sahip bean'e erişebilmeyi sağlar.

## 4. Convention over configuration kavramını seçtiğiniz bir örnek üzerinden açıklayınız.

Convention over Configuration framework tarafından yazılımcının vermesi gereken kararları azaltmaya çalışan bir yazılım tasarım paradgmasıdır.Günlük hayattan örnek vermek gerekirse Amerika'da kapıların bir açılma kuralı vardır.Dışarıdan geliyorsanız kapıyı çekersiniz, içeriden çıkıyorsanız itersiniz.Binaların, dairelerin vb. hepsi bu kurala uyar ve karışıklık çıkmaz.Yazılım ile ilgili bir örnek vermek gerekirse Maven'in bizim için default project structure oluşturulması örnek verilebilir.Bu herkes için faydalı bir şeydir fakat framework'ler daha kompleks şeyler de sağlayabiliyor, bu noktada görüş ayrılıkları ortaya çıkabiliyor ve çoğu zaman spesifik ve komplike şeylerde convention over configuration kullanmak kodu kafa karıştırıcı hale getirebilir.

## 5. Aspect Oriented Programlama nedir ? Avantajları ve dezavantajları nelerdir ?

Aspect Oriented Programlama, yazılımın karmaşıklığını azaltmaya, modülariteyi artırmaya yarayan bir yaklaşım biçimidir. Yazdığımız kodun okunabilir, reusable ve bakımının kolay olmasını isteriz. Aspect Oriented Programlama da yazılımın karmaşıklığını azaltarak ve modülariteyi arttırarak bize bunu sağlar. Uygulama süresince sistemi birçok bölümünde kullanılan, fonksiyonel olmayan kodun ufak parçalara ayrılmasıdır(Seperation of Cross Cutting Concerns). Genel olarak AOP bir sorunu çözmektense var olan sistemin daha güzel bir hale getirilmesini de sağlamaya yardımcı olur.

Avantajları
- Tekrar eden kod bloklarından bizi kurtarır ve daha temiz ve anlaşılır bir yapı sunar.
- Uygulamaların bakım ve geliştirme maliyetlerini azaltmış olur.
- Modüler bir yapı elde etmemizi sağlar.

Dezavantajları
- Uygulanması o kadar da kolay değildir.
- Hata ayıklamayı zorlaştırır
- **public** metodlar haricinde uygulanması pek tavsiye edilmiyor.

## 6. SOLID prensiplerini kısaca açıklayınız. Sizce her koşulda bu prensipler çerçevesinde mi kod yazılmalıdır ? Neden ?

### Single-responsibility principle

Sınıfların iyi tanımlanmış tek bir sorumluluğu olması gerekir ve fonksiyonların da yapması gereken yalnızca tek bir işi olması gerekir.

### Open-closed principle

Programlar geliştirilmeye açık ama değiştirilmeye kapalı olmalıdır.

### Liskov substitution principle

Kodlarımızda herhangi bir değişiklik yapmaya gerek duymadan alt sınıfları, türedikleri(üst) sınıfların yerine kullanabilmeliyiz.

### Interface segregation principle

Sorumlulukların hepsini tek bir arayüze toplamak yerine daha özelleştirilmiş birden fazla arayüz oluşturmalıyız.

### Dependency Inversion Principle

Sınıflar arası bağımlılıklar olabildiğince az olmalıdır özellikle üst seviye sınıflar alt seviye sınıflara bağımlı olmamalıdır.

  Her koşulda bu prensipleri uygulamak mümkün olmayabilir. Sonuçta tüm yazılımların değişmesi gerekiyor ve değişimi tahmin etmek gerçekten zor. Bu nedenle neyin değişeceği ve neyin kalacağı konusunda net bir sınır belirlemek zor. Kaldı ki her proje büyük olmadığı için bu prensipler çerçevesinde kod yazmak bazen over engineering olmuş olur. Büyük projelerde ise sınıflar arası bağımlılıkları düşük seviyede tutmak zor olabilir. Bu yüzden her prensibi strict bir şekilde uymaya çalışmak her zaman doğru olmayabilir.
  
## 7. Swagger nedir, ne amaçla kullanılmaktadır ?

Swagger, JSON kullanılarak ifade edilen RESTful API'leri açıklamak için bir arayüz tanımlama dilidir. API geliştirmede en önemli ihtiyaçlardan biri dokümantasyon ihtiyacıdır. Çünkü API methodlarının ne işe yaradığı ve nasıl kullanıldığı dokümantasyon içeresinde anlaşılır olması gerekir. API dökümantasyonunu elle yazmak hem zordur hem de güncel tutması mümnkün değildir. Bu noktada swagger devreye giriyor. Swagger’ın önemli bir amacı RestApi ler için bir arayüz sağlamaktır. Bu arayüz sayesinde kaynak koda erişmeden Rest Api'lerin özelliklerini görüp inceleyebiliriz.

## 8. Richardson Maturity Model’i seviyeleriyle birlikte açıklayınız.

Richardson Maturity Model REST'i hangi seviyelerde kullandığımızı gösteren bir olgunluk modelidir. Bu model 4 seviyeden oluşur. 

### Level 0: Swamp of POX

REST'i bir taşıma protokolü olarak değerlendirip kullanmaktır. Servisimizdeki sadece tek metod üzerinden POST olarak erişebildiğimiz seviyedir.

### Level 1: Resources

Servimizdeki URI üzerinden bir metot üzerinden erişilebildiğimiz seviyedir. Örnek URI http://localhost/members/1

### Level 2: HTTP verbs

Bu seviyede sadece POST ile URI’lar çağrılmaz. Bunun yanında PUT, DELETE, POST ve GET metodları çağrılır. Bu sayede her birisi için ayrı URI’lar oluşturma ihtiyacı olmaz.

### Level 3: Hypermedia controls

HATEOAS (Hypertext As The Engine Of Application State) kullanılan seviyedir.
Not: Bu kısmı pek anlamadım.

## 9. URL, URI, URN kavramlarını bir örnek üzerinden açıklayınız.

![](https://sp-ao.shortpixel.ai/client/to_avif,q_glossy,ret_img,w_750/https://rojhat.com/wp-content/uploads/2021/02/URI-URL-ve-URN-Nedir-.jpg)





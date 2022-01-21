# The Practical Test Pyramid Summary

### Top

  Test pyramid yazılım testlerini gruplandırmamızı söyleyen bir metafordur. Ürün production'a çıkmadan önce test edilmelidir. Ekipler bu noktada testleri otomatize etmeye yöneldi. 
Bu sayede yazılımın bozulup bozulmadığı günler ve haftalar yerine saniyeler sürmeye başladı. Test otomasyonu agile geliştirme, CI/CD ve DevOps kültürüyle el ele gider.
Etkili bir yazılım testi yaklaşımına sahip olmak, ekiplerin hızlı ve güvenle hareket etmelerini sağlar.

### The Importance of (Test) Automation

  Derlemeden testlere, dağıtıma ve altyapıya kadar her şeyi otomatikleştirmek, ileriye dönük tek yoldur. Geleneksel olarak yazılım testi, uygulamanızı bir test ortamına dağıtarak ve ardından bazı black-box stili testleri gerçekleştirerek yapılır.
Tüm değişiklikleri manuel olarak test etmek sıkıcı ve zaman alıcıdır. Ayrıca hatalara yol açar. Neysek tekrarlayan görevler için bir çare var: otomasyon.
Eğer büyük ölçekli bir yeniden düzenleme yapacaksanız ve testleri yazılmamışsa vay halinize. Bir şeyleri patlattınız mı diye teker teker test etmek zorunda kalırsınız.

### The Test Pyramid

  Otomatize testler konusunda bilmeniz gereken bir kavram vardır: test piramidi. Farklı test katmanları hakkında düşünmenizi söyleyen harika bir görsel metafor. Ayrıca her katmanda ne kadar test yapmanız gerektiğini de söyler.

![](https://martinfowler.com/articles/practical-test-pyramid/testPyramid.png)

Mike Cohn'un orijinal test piramidi, test takımınızın (aşağıdan yukarıya) içermesi gereken üç katmandan oluşur:
- Unit Tests
- Service Tests
- User Interface Tests

Modern bir bakış açısından, test piramidi aşırı derecede basit görünüyor ve bu nedenle yanıltıcı olabilir. Yine de Aşağıdaki konseptleri benimsemek iyi olacaktır:
- Farklı ayrıntı düzeyine sahip testler yazın.
- Ne kadar yüksek seviye alırsanız, o kadar az test yaptırmanız gerekir.

  Bakımı kolay bir test paketi bulmak için piramit şekline bağlı kalın. Çok fazla Unit Test yazın. e2e testler ve çok az sayıda üst düzey test yazın.
React ve angular gibi single page application frameworklerinin olduğu günlerde UI testlerinin piramidinizin en üst seviyesinde olması gerekmediği açıkça ortaya çıkıyor.
Codebase'inizle ve takımınızın tartışmalarıyla tutarlı olacak şekilde test katmanlarına farklı adlar verebilirsiniz.

### The Sample Application

Test piramidinin farklı katmanları için testler içeren bir test takımı içeren basit bir mikro hizmet yazılmış. 

#### Functionality

Uygulama 3 tane endpoint sağlıyor.


GET /hello -> "Hello World" döndürüyor.

GET /hello/{lastname} -> Verilen soy ada sahip kişi biliniyorsa "Hello isim soyisim" döndürür.

GET /weather -> Mevcut hava durumunu döndürür.

#### High-level Structure

sistemin yapısı aşağıdaki gibidir:

![](https://martinfowler.com/articles/practical-test-pyramid/testService.png)

#### Internal Architecture

Dahili olarak, Spring Service, Spring'e özgü bir mimariye sahiptir:

![](https://martinfowler.com/articles/practical-test-pyramid/testArchitecture.png)

Uygulama basit olduğu için service katmanı eklenmemiş. Uygulama için Spring Data kullanmış.

### Unit tests

  Testlerin temeli unit testlerden oluşacaktır. Unit test, kod tabanınızın belirli bir biriminin (test edilen konunuz) amaçlandığı gibi çalıştığından emin olur. 
Unit testler kapsam olarak en dar kapsama sahiptir ve sayıca diğer test türlerinden daha fazla olacaktır.

#### What's a Unit?

  Unit ten kastın ne olduğu çok kesin değildir. İşlevsel bir dilde çalışıyorsanız, bir birim büyük olasılıkla tek bir işlev olacaktır. Nesne yönelimli bir dilde bir birim, tek bir yöntemden tüm bir sınıfa kadar değişebilir.

#### Sociable and Solitary

  Solitary mi Social Unit Test mi yapacağınıza karar vermek önemli değil. Ö nemli olan testlerin otomatize edilmesidir. Gerçek işbirlikçileri kullanmak garip hale gelirse mock ve stub ları rahatça kullanabiliriz. Gerçek işbirlikçiyi dahil etmek  bir testte daha fazla güven veriyorsa, hizmetin yalnızca en dış kısımlarını kullanabiliriz.

#### Mocking and Stubbing

  Mock ve stublar iki farklı türde test ikilileridir. Testte size yardımcı olan bir uygulama ile üretimde kullanacağınız nesneleri değiştirmek için test çiftlerini kullanabilirsiniz. Basit bir deyişle, gerçek bir şeyi o şeyin sahte bir versiyonuyla değiştirdiğiniz anlamına gelir. 
Sahte sürüm gerçek gibi görünür ve davranır ancak birim testinizin başında kendi tanımladığınız hazır yanıtlarla yanıtlar.

  Test çiftlerinin kullanılması, Unit teste özgü değildir. Sisteminizin tüm parçalarını kontrollü bir şekilde simüle etmek için daha ayrıntılı test çiftleri kullanılabilir.
  
  Teknoloji seçiminiz ne olursa olsun, dilinizin standart library'si veya bazı popüler third party library'lerin size denemeler oluşturmanın zarif yollarını sağlama olasılığı yüksektir. Unit testler çok hızlı çalışacaktır. Birkaç dakika içinde binlerce birim test çalıştırabilirsiniz. Kod tabanınızın küçük parçalarını ayrı ayrı test edin ve testlerinizi hızlı tutmak için veritabanlarına, dosya sistemine veya HTTP sorgularını başlatmaktan (bu parçalar için sahte ve taslaklar kullanarak) kaçının.
  
  Unit testleri yazmayı bir kez öğrendikten sonra, onları yazarken daha akıcı hale geleceksiniz. Test Odaklı Geliştirmeye bakın ve birim testlerinizin geliştirmenize rehberlik etmesine izin verin. Bu harika bir akışa girmenize ve iyi ve bakımı kolay bir tasarım oluşturmanıza yardımcı olabilir.
  
#### What to Test?

  Birim testlerinin iyi yanı tüm üretim kodu sınıflarınız için yazabilmenizdir. 
    
  Bir Unit test sınıfı en azından sınıfın genel arabirimini test etmelidir. Özel yöntemler zaten test edilemez çünkü onları farklı bir test sınıfından çağıramazsınız. Birim testleri yazarken önemsiz olmayan tüm kod yollarınızın test edilmesini sağlamalıdırlar. Aynı zamanda, uygulamanıza çok yakından bağlı olmamalıdırlar çünkü refactoring yaptığınızda birim testleriniz patlar. Bu yüzden Unit testlerinizde dahili kod yapısını yansıtmayın. Örnek olarak ben x ve ye değerlerini girdiğimde sonuç z oluyor mu diye test etmektense, ben x ve y girdiğimde metod önce A sınıfını sonra B sınıfını çağırıp A sınıfıyla B sınıfının toplamını return ediyor mu şeklinde test etmek daha doğrudur.
  
  Private metodlar genellikle bir uygulama detayı olarak düşünülmelidir. Bu yüzden onları test etmeye yeltenmemelisiniz. 
  
  Yüksek bir test coverage elde etmek için tüm yöntemlerinizi test etmeniz gerektiğinde unit test yazmanın anlamsız hale geldiğini savunanlarda var. Genellikle test coverage'ı %100 görmek isteyen patronları olduğu için getter setter lara bile test yazmak zorunda kaldıklarından bahsederler. Bu kadarı da fazla ve saçma.
  
#### Test Structure

  Tüm testler için güzel bir yapı:
  
  1. Test verilerini ayarlayın
  2. Metodunuzu test altında çağırın
  3. Beklenen sonuçların döndürüldüğünü iddia edin

  "Arrange, Act, Assert" yani "Düzenle, Harekete Geç, İddia Et". "given", "when", "then" burada given kurulumu, when yöntemin ne zaman çağrıldığını ve then onaylama bölümünü yansıtır. Bu model testlerinizin okunmasının kolay ve tutarlı kalmasını sağlar.
  
#### Implementing a Unit Test

  

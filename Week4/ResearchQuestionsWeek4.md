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



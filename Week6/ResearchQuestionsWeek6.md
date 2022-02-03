## 1. Conway’in Kanunu’ nu (Conway’s Law) açıklayınız.

  1968 yılında Melvin Conway tarafından ortaya atılmış. Sistemleri tasarlayan organizasyonlar kendi iletişim yapılarının birer kopyasını üretmekle sınırlıdır şeklinde ifade edilebilir.
  Yaklaşım çok sayıdaki farklı modül farklı kişiler tarafından geliştirilirken yaşanan iletişimin yazılıma da yansıdığından bahsetmektedir. Üründeki her özellik bu iletişimin  bir sonucu
  olacak ve yazılımın başarısından işlevselliğinde kadar bu iletişime bağlı olacaktır.
  
## 2. Software as a Service (SaaS), Platform as a Service (PaaS), Infrastructure as a Service (IaaS), On-Premises kavramlarını örneklerle açıklayınız.

  SaaS kısaca; müşteriler tarafından ulaşılmak istenen verilere internet bağlantısı ve web tarayıcısı olan herhangi bir cihazdan erişilmesini sağlayan bulut tabanlı bir yazılım sağlama servisidir. Bu servis ile yazılımı sağlayıcısı, sunucu ve veritabanı gibi sistemleri barındırmak ve bunların bakımını yapmakla sorumludur.

  PaaS, geliştiricilere internet üzerinden geliştirme ve dağıtım için eksiksiz bir ortam sağlar. PaaS ile geliştiriciler basit uygulamalardan karmaşık bulut tabanlı iş yazılımlarına kadar her şeyi oluşturabilir. SaaS'ye benzer şekilde, kullanıcılarının başka türlü karşılayamayacakları veya bakımını yapamayacakları güncel araçlara erişmesine olanak tanır.
  
  IaaS, kullanıcılara çeşitli görevleri gerçekleştirebilecekleri donanımları sağlar. Bu, depolama alanı, gelişmiş veya özel işlemcilerle bilgi işlem süresi veya sanallaştırma hizmetleri anlamına gelebilir. IaaS kendi şirket içi veri merkezlerini koruma ihtiyacını hafifletmek isteyenler tarafından kullanılır.  
  
  On-Premises kurum içi yazılım, yazılım dağıtmanın bir yöntemidir. On-prem ile bilgisayar programları, CD'ler veya USB sürücüler aracılığıyla doğrudan kullanıcıların bilgisayarlarına yüklenir. Tesis dışı ile ise yükleyici Web'de herhangi bir yerde bulunabilir.

Birçok şirket, üçüncü taraf erişimi gerektirmediği, sahiplerine sunucu donanımı ve yazılımı üzerinde fiziksel kontrol sağladığı ve erişim için her ay ödeme yapmalarını gerektirmediği için şirket içi tercih eder.

Fast food yemeğinizi nasıl satın aldığınızı düşünün. Onu satın alabilir ve tesiste restoranda yiyebilirsiniz. Ya da arayabilir, yemeğinizi sipariş edebilir ve evinize teslim edilmesini sağlayabilirsiniz.

## 3. Continuous Integration, Continuous Delivery ve Continuous Deployment kavramlarını açıklayınız.

  CI, Sürekli entegrasyon, kod üzerinde yapılan değişiklik sonrasında sistemin çalışır durumda olduğunu, yapılan değişikliğin sorunlara yol açmadığını tespit etmek için kullanılan yöntemdir. Sorunları ve kırılmaları tespit edebilmek için birim testleri kullanılır. Yapılan değişiklikler yeni bir yapının parçası olduğundan dolayı testlerde oluşan hatalar, yapılan değişikliğin sistemi kırdığı anlamına gelmektedir. Bu durumda tüm programcılar bilgilendirilerek hatanın bir an önce giderilmesi sağlanır. Sürekli entegrasyon ile programcılar tarafından kod üzerinde yapılan çalışmalar neticesinde her zaman çalışır bir sürümün oluşması sağlanmış olur.
  
  CD, Sürekli teslimat, sürekli entegrasyonun doğal bir uzantısıdır.

Sürekli teslimat, başarılı olan bir yapıyı (build) bir ortama atma durumunun otomatik olan yoludur. Teslimat ile dağıtım arasında küçük bir fark vardır. Teslimat manuel yolla, dağıtım ise otomatik yapılır. Sürekli teslimat düzgün bir şekilde uygulanırsa, müşteriler standartlaştırılmış bir test sürecinden geçmiş yapıya sahip olacaklardır.

Örnek verecek olursak; Netflix, tamamen otomatik bir sürekli dağıtım sistemine sahiptir. Dağıtımlar otomatik olduğundan ve herhangi bir zamanda gerçekleşebileceğinden, uygulamanız, yeni bir sürüm dağıtıldığında geçici kesintilerden etkilenmeyecek şekilde tasarlanmalıdır.

## 4. API Gateway pattern’ı açıklayınız.
  
  API Gateway pattern'ı birden çok istemci uygulamasıyla karmaşık, büyük mikro hizmet tabanlı uygulamalar tasarlamak ve oluşturmak istiyorsanız önerilir. Model, nesne yönelimli tasarımdaki cephe modeline benzer, ancak senkronize bir iletişim modeli olarak kullanmak için dağıtılmış bir sistem ters proxy veya ağ geçidi yönlendirmesinin bir parçasıdır.
  
## 5. Backend for frontend (BFF) pattern’ ı açıklayınız.

  Her client için ayrı bir api-gateway tanımlanmasını konu alır. Her client için ayrı bir BFF Api oluşturarak farklı clientların farklı data ihtiyacına çözüm getiriyoruz.
  
![](https://miro.medium.com/max/1044/1*2No7rXS0JfJpSaxzJ-e-eQ.png)

## 6. Circuit-breaker pattern’ ı açıklayınız.

  Circuit-breaker, belli bir eşik değerin üstünde hata alındığında response dönemeyen servise gelen requestleri servise iletmeden requestlere bir hata mesajı dönerek sistemin gereksiz yere aşırı yüklenmesine engel olur. Belli bir süre sonra gelen requestlerin bir kısmını servise ileterek test yapıp sistem durumunu kontrol eder. Sıkıntı giderilmişse bütün isteklerin geçmesine izin verir. Eğer test çağrıları da hata alıyosa yine requestlere hata dönüp aynı şeyleri tekrarlar.
  
## 7. Microservice chassis pattern’ ı kısaca açıklayınız.

  Microservice chassis pattern temeldeki işlevsel mantığı tek bir modülde birleştirmeyi ve onu çeşitli hizmetlerde yeniden kullanım için hazırlamayı amaçlar. AOP'nin dışa dönük uygulama özelliklerini ayrı kod birimlerine ayırması gibi, mikro hizmet mimarilerini çoğaltan arka uç operasyonel işlevler için ayrı modüller oluşturur.
  

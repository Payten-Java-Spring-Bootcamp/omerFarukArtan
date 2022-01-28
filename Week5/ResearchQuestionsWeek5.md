## 1. Concurrent programlama ve Parallel Programlama nedir ? Aralarında çalışma şekli olarak nasıl bir fark bulunmaktadır ?

  Concurrent programlama örtüşüyormuş gibi görünen operasyonlar ve öncelikle belirleyici olmayan kontrol akışı nedeniyle ortaya çıkan karmaşıklıkla ilgilidir. Eşzamanlı programlarla ilişkili nicel maliyetler tipik olarak hem verim hem de gecikmedir.
  
  Paralel programlama, iş hacmini iyileştirme hedefi için çakışan işlemler ile ilgilidir. Eşzamanlı programlamanın zorlukları, kontrol akışını deterministik hale getirerek önlenir. Genellikle, programlar paralel çalışan alt görev kümeleri oluşturur ve üst görev yalnızca her alt görev tamamlandığında devam eder.

## 2. Mutex ve Semaphore kavramlarını açıklayınız. Hangi tür durumlarda bunlara başvurmamız gerekir ?

  Mutex, Bir bilgisayar uygulaması başlatıldığında, bir muteks oluşturacak ve onu bir kaynağa ekleyecektir. Kaynak bir iş parçacığı tarafından kullanıldığında kilitlenir ve diğer iş parçacıkları onu kullanamaz. Başka bir iş parçacığı aynı kaynağı kullanmak isterse, bir istekte bulunmalıdır. Daha sonra bu iş parçacığı, kaynakla ilk iş parçacığı bitene kadar bir kuyruğa yerleştirilecektir. Kaynakla ilk iş parçacığı bittiğinde, kilit kaldırılır ve kuyrukta bekleyen iş parçacığı kaynağa erişebilir. Kuyrukta bekleyen birden fazla iş parçacığı varsa, bunlara dönüşümlü olarak erişim verilir. Pratik olarak, muteks bir kaynağa erişimi birkaç iş parçacığı arasında değiştirdiğinde, birden çok iş parçacığı aynı anda bir kaynak tüketirken görünür olacaktır. Ancak dahili olarak belirli bir zamanda kaynağa yalnızca tek bir iş parçacığı erişiyor.

  Semafor, kritik bölümlere karşılıklı dışlama sağlamak için kullanılan bir veri yapısıdır. Semaforlar esas olarak bekleme (tarihsel olarak P olarak bilinir) ve sinyal (tarihsel olarak V olarak bilinir) olarak adlandırılan iki işlemi destekler. Bekleme işlemi, semafor açılana ve sinyal işlemi başka bir işlemin (iş parçacığı) girmesine izin verene kadar bir işlemi engeller. Her semafor, bir bekleme süreci kuyruğu ile ilişkilendirilir. Bekleme işlemi bir evre tarafından çağrıldığında, semafor açıksa evre devam edebilir. Bekleme işlemi bir iş parçacığı tarafından çağrıldığında semafor kapalıysa, iş parçacığı engellenir ve kuyrukta beklemesi gerekir. Sinyal işlemi bir semafor açar ve kuyrukta zaten bekleyen bir iş parçacığı varsa, bu işlemin devam etmesine izin verilir ve kuyrukta bekleyen iş parçacığı yoksa sinyal sonraki evreler için hatırlanır. Muteks semaforları ve sayma semaforları olarak adlandırılan iki tür semafor vardır. Mutex semaforları, bir kaynağa tek bir erişime izin verir ve sayma semaforları, birden çok iş parçacığının bir kaynağa erişmesine izin verir.
    
   Paralel programlama ortamlarında karşılıklı dışlamayı sağlamak için hem semaforlar hem de muteks nesneler kullanılsa da, bazı farklılıkları vardır. Muteks nesnesi yalnızca tek bir iş parçacığının bir kaynağı veya kritik bir bölümü tüketmesine izin verirken, semaforlar bir kaynağa sınırlı sayıda eşzamanlı erişime izin verir (izin verilen maksimum sayının altında). Mutex nesneleriyle, kaynağa erişmek isteyen diğer evreler, kaynağı kullanarak geçerli iş parçacığı bitene kadar bir kuyrukta beklemek zorundadır.
   
## 3. Java’da Error ve Exception arasındaki fark nedir ? Throwable ile ilişkileri nasıldır ? Hangi tür durumlarda Error hangi tür durumlarda Exception meydana gelebilir ? Örneklerler açıklayınız.
  
  Error sistemsel durumlardan kaynaklanır. Exceptionlar throwable iken errorları throw edemeyiz. sonsuz döngüye girilirse stackoverflow error alırız, olmayan bir indexe ulaşmaya çalışırsak indexOutOfBounds exception alırız.
  
## 4. Spring’te yer alan @Scheduled anotasyonunun kullanım amaçlarını ve kullanım şeklini açıklayınız.

  Timer sınıfının görevi verilen zamanda yürütmesi üzere zamanlamak için kullanılır. Verilen zaman geçmişteyse, görev yürütme için o harekette planlanır. @Scheduled anotasyonunu kullanmamız için metodumuzun void olması lazım ya da return edilen değer görmezden gelinir. Bir de metodumuzun parametre almaması lazım. Önce classa aşağıdaki anotasyonları ekleriz.
  
  ```
  @Configuration
@EnableScheduling
public class SpringConfig {
    ...
}
  ```

  Sonra aşağıdaki gibi metodumuza anotasyon ekleyerek istediimiz süreyi koyarız.
  
  ```
  @Scheduled(fixedDelay = 1000)
public void scheduleFixedDelayTask() {
    System.out.println(
      "Fixed delay task - " + System.currentTimeMillis() / 1000);
}
```
  
## 5. Spring’te yer alan @Async anotasyonunun kullanım amaçlarını ve kullanım şeklini açıklayınız.

  Metodun başka bir thread içinde çalıştırılması için kullanılır. Bu anotasyonu kullanabilmek için main methodda @EnableAsync anotasyonunun tanımlı olması gerekir.
  Kullanımı ise şu şekildedir:
  
  ```
  @Async
public Future<String> asyncMethodWithReturnType() {
    System.out.println("Execute method asynchronously - " 
      + Thread.currentThread().getName());
    try {
        Thread.sleep(5000);
        return new AsyncResult<String>("hello world !!!!");
    } catch (InterruptedException e) {
        //
    }

    return null;
}
```

## 6. High Availability (HA) kavramını kısa açıklayınız.

  High Availability bir sistemin belirli bir süre boyunca arızalanmadan sürekli çalışma yeteneğidir. HA, bir sistemin üzerinde anlaşmaya varılan bir operasyonel performans seviyesini karşılamasını sağlamak için çalışır.
  
## 7. Entity ve Value Object kavramlarını Domain Driven Design (DDD) kapsamında açıklayınız.
  
  
  

# Ödev 2

## Collection Pipeline

### First Encounters

Java'ya fonksiyonel programlama özellikleri gelmeden önceki zorluklardan bahsedilmiş.

### Defining Collection Pipeline

Burada bir collection alınarak her işlemde filter vb. başka bir collection'a çevirildiğini anlatmış.

### Exploring more pipelines and operations

Burada map, reduce ve group by gibi pipeline operasyonlarına Ruby ile örnekler vermiş.

### Alternatives

Collection pipeline operasyonlarıyla yapılan işlemlerin loop'larla nasıl yapıldığını göstermiş.

### Nested Operator Expressions

Collection'ların set operasyonlarıyla değiştirilmesine örnekler vermiş.

### Laziness

Collection'lar üzerinde işlem yapılırken bütün elemanları gezmek yerine tembellik yaparak ihtiyacımız olan elemanlarda işlem yapmamız diye anladım.

### Parallelism

Birden fazla pipeline operasyonu kullandığımızda elementler birbirlerini etkilemiyorsa paralel olarak birden fazla çekirdek kullanarak hızlandırabiliriz fakat iyi test edilmesi gerekir, hatalara yol açabilir.

### Immutability

Collection pipeline'lar immutable veri yapılarıdır. Bir pipeline oluştuğunda her operasyonda yeni bir collection oluşur.

### Debugging

Collection pipeline'ları debug etmenin zor olduğuna değinilmiş.

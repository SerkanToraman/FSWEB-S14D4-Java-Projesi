#  Java Abstraction 

### Proje Kurulumu

Projeyi öncelikle forklayın ve clone edin.
Daha sonra projeyi IntellijIDEA kullanarak açınız. README.md dosyasını dikkatli bir şekilde okuyarak istenenleri yapmaya çalışın.
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

### Hedeflerimiz:

### Product For Sale

 * ProductForSale isimli bir ```abstract``` sınıf oluşturunuz.
 * Bu sınıf içerisinde 3 tane ```private``` değişken tanımlayınız. ```type, price, description```. Tiplerinin ne olması gerektiğine karar veriniz ve hepsi için birer getter metodu yazınız.
 * Tek bir tane ```constructor``` metodu tanımlayınız. 3 ```instance variable``` değerini de set etmeli.
 * ProductForSale sınıfına ```getSalesPrice(int quantity)``` isimli bir metod ekleyiniz. ```quantity*price``` değerini dönmeli.
 * ProductForSale sınıfına ```showDetails``` isimli ```abstract``` bir metod ekleyiniz. Dönüş değeri olmamalı.

 * ```Chocolate, Coke, Bread``` isimli 3 tane yeni sınıf oluşturunuz. 3 sınıfta ```ProductForSale``` sınıfından türemeli.
 * Her sınıfa o sınıfa özgü en az bir tane daha ```instance variable``` değeri ekleyiniz.
 * ```showDetails``` isimli metot, ProductForSale üzerinde var olan ve kendine özgü olan tüm ```instance variable``` değerlerini anlaşılabilir bir şekilde ekrana bastırmalı.

 * com.workintech.S18G4.main.Store sınıfı içerisinde bulanan ```listProducts``` metodu parametre olarak aldığı ```products``` dizisini gezmeli ve her bir değer için  ```showDetails``` metodunu çağırmalı.
 * com.workintech.S18G4.main.Store sınıfında main metodu içerisinde ProductForSale değeri alabilen bir dizi oluşturmalısınız. 
 * Bu dizinin içerisine ```Chocolate, Coke, Bread``` objelerinden birer adet eklemelsiniz.
 * Bu diziyi ```listProducts``` metoduna parametre olarak geçiniz.
 * Her bir ```showDetails``` metodu çağırıldığında çağırıldığı objeye göre mesaj döndüğünden emin olunuz.

### Monster For Simple RPG Game

 * ```Monster``` isminde bir ```abstract``` sınıf tanımlayınız.
 * ```Monster``` sınıfının 3 tane ```instance variable``` olmalı. ```name => String, hitPoints => int, damage => double```
 * Monster sınıfı için bir tane ```constructor``` metodu tanımlanmalı. İlgili 3 sınıf değişkenini de set edebilmeli.
 * 3 sınıf değişkeni içinde getter metodu tanımlanmalı.
 * Monster sınıfı parent olucak şekilde  Monster türünde bir sınıf tanımlayınız.(Troll, Werewolf vs.)

 * ```Bleedable``` isimli bir interface tanımlayınız içerisinde ```bleed``` isimli bir method olmalı ve double değer dönmeli.
 * ```Poisonable``` isimli bir interface tanımlayınız içerisinde ```poison``` isimli bir method olmalı ve double değer dönmeli.
 * Eğer yaratığın saldırdığında kanatma olasılığı varsa ```bleed``` metodu ```getDamage()*0.25``` değerini dönmeli.
 * Eğer yaratığın saldırdığında zehirleme olasılığı varsa ```poison``` metodu ```getDamage()*0.3``` değerini dönmeli.
 * Monster sınıfına  ```attack``` isimli bir method ekleyin. ```getDamage() + bleed() + poison()``` değerini dönmeli.

 

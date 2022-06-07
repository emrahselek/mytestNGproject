package com.techproed._NewJob_First;

public class SpringAnnotations {

    /*
    https://www.blogkafem.net/2020/05/spring-anotasyonlarinin-calisma-mantigi-ve-temel-spring-anotasyonlari.html

        Bean mean; object-(NESNE)

        @Component   :  auto-scan için genel bir ifade. Spring tarafından yönetilen Bean'leri tarar ve IoC Container içine ekler.
        @Repository  :  veritabanı işlemleri gerçekleştiren sınıflarda kullanılır.
        @Service     :  yazılımın bussines logic kısmını gerçekleştiren sınıflar için kullanılır.
        @Controller  :  frontend veya api isteklerinin karşılayan sınıfları tanımlamak için kullanılır
        @Autowired   :  injects object dependency implicitly.
                        Bu annotation sadece " Constructor, Değişken yada Setter" metodlar için dependency injection işlemi gerçekleştirir


    @Autowired
        The @Autowired annotation injects object dependency implicitly.
        We can use this annotation with a constructor, setter, or field (property).
        Not for primitive/String dataType.

        [Constructor, Değişken yada setter metodlar için dependency injection işlemi gerçekleştirir.

       * Spring Contex, container enjeksiyon noktalarını bularak, orada bir nesne oluştrur.
         New anahtar kelimesi ile bir nesne oluşturulmaz. Kullanılacak nesne Spring tarafından oluşturulur.
         Bu sayede, dependency injection tasarım kalıbı (design pattern) da uygulanmış olur.
       * Özetle @Autowired yalnızca injection için kullanılır. @Autowired ifadesini kullanabilmek için,
         her iki sınıf da Bean sınıfı olmalı.
       * Örneğin @Service anotasyonu ile tanımlanmış bir servis sınıfı, @Repository ile tanımlanmış bir sınıftan
         @Autowired ile bir nesne üreterek, veritabanı işlemlerini gerçekleştirebiliyor.
         Burada @Servie ve @Repository tanımlarının yapıldığı sınıflar için Spring IoC Container (application context)
         içerisinde gerekli Bean'ler oluşturulduğu için, her iki sınıf da aslında Bean sınıfı olmuş oluyor.
         Dolayısıyla service sınıfı içerisinde repository sınıfı için @Autowired işlemi yapılabiliyor.
       * Kısaca @Autowired, bean nesnesinin istenilen alana, başka bir bean nesnesinin alınıp, yerleştirilmesiyle olur.

            #1- Private properties: (custom object) - Field injection
                    class Car {
                        @Autowired
                        Engine engine;
                        }

            #2- Setter Method injection:
                    class Car {
                        Engine engine;
                        @Autowired
                        void setEngine(Engine engine) {
                        this.engine = engine;
                        }}

           #3- Constructor injection:
                    class Car {
                        Engine engine;
                        @Autowired
                        Car(Engine engine) {
                            this.engine = engine;
                            }}

            Example----->
            **First, let's define a fooFormatter bean:
                @Component("fooFormatter")
                    public class FooFormatter {
                        public String format() {
                            return "foo";
                        }
                    }
            **Then, we'll inject this bean into the FooService bean using @Autowired on the field definition:
                @Component
                public class FooService {
                    @Autowired
                    private FooFormatter fooFormatter;
                    }
            **As a result, Spring injects fooFormatter when FooService is created.


    @Qualifier
        This annotation is used along with @Autowired annotation.
        When you need more control of the dependency injection process, @Qualifier can be used.
        @Qualifier can be specified on individual constructor arguments or method parameters.

        [EĞER BIR INTERFACE BIRDEN FAZLA SINIF TARAFINDAN IMPLEMENT EDILDIYSE, BU SINIFLARDAN HANGSINE
        AIT FONKSIYONUN KULLANILACAĞINI BILMEK IÇIN, @AUTOWIRED TANIMLAMASINA EK OLARAK @QUALIFIER(“SINIFADI”)
        ADINDA BIR ANNOTATION DAHA EKLENDIĞI TAKDIRDE, YINE NEW ILE O SINIFTAN ÖZEL BIR NESNE TÜRETMEYE GEREK KALMADAN,
        O SINIFIN FONKSIYONUNU (GEREKLIYSE PARAMETRE GÖNDEREREK) KULLANABILIYORUZ.]

        ForExample:
                @Component("posts")
                    public class POSTS implements Blogafem{
                            public String print() { return "post";}}

                @Component("comments")
                    public class COMMENTS implements Blogkafem{
                            public String print() { return "comment"; }}

                @Service
                    public class BlogkafemService{
                            @Autowired
                            @Qualifier("posts")
                            private Blogkafem blogkafem;
                            }

    @Component
        This annotation is used on classes to indicate a Spring component.

       [* Bir sınıfı “Bean” olarak işaretler. (spring tarafından yönetilen bean)
        * Bu sayede Spring’in component tarayıcısı bu sınıfı alıp “App Context” içine ekler.
        * Genel amaçlı kullanımlar içindir.
        * @Component ile context:component-scan projedeki tüm @Component ifadelerini tarar.
        * Component taraması sırasında bu anotasyona ait sınıflar taranır.
        * @Repository, @Service, @Configuration ve @Controller anotasyonlarının tamamı @Component anotasyonudur.
        * BIR SPRING BILEŞENINI BELIRTMEK IÇIN SINIFLARDA KULLANILIR]

        * @Component bazlı anotasyonları özetle şu şekilde ifade edebiliriz:
          @Service, @Controller, @Repository, @Configuration = {@Component + ek işlevsel özellikler}
        * Yani başka bir deyişle, @Service, @Repository, @Controller, @Configuration tanımları, daha özel kullanımlar
          için @Component tanımlamasının özelleşmiş halleridir.
          En basit örneği özelleşmiş exception çıktıları almak. Bu tür özel tanımlamaları amacına uygun yerlerde
          kullanarak, daha özel exception çıktıları alınabilir.
          Örneğin, @Repository kullanımı, kullanıldığı sınıfta herhangi bir istisna durum oluşursa,
          hata olarak veritabanına özel exceptionlar dönecektir.



    @Service
        This annotation is used on a class.
        The @Service marks a Java class that performs some service,
        such as execute business logic, perform calculations and call external APIs.
        This annotation is a specialized form of the @Component annotation intended to be used in the service layer.

        * Belirtilen sınıfın bir servis sınıfı olduğunu belirtir.
        * @Service, projenin bussines logic kısmında kullanılır ve tanımlandığı sınıfı “Bean” sınıf haline getirir.
        * @Service anotasyonu yerine aynı işlemi yapan ve temel annotation olan @Component de kullanılabilir
          fakat, @Service anotasyonu amacımıza yönelik daha fazla şey sunuyor.
          Yani @Component tanımlamasının aynısı ama bir üst modelidir denilebilir.
          Ayrıca @Service anotasyonunun kullanımı, tanımlandığı sınıfın bir servis sınıfı olduğunu belirtip,
          anlaşılırlığı arttırması açısından da daha uygundur.
          Bu sayede artık, Controller tarafından yakalanan istekler ile veritabanı sorgularını gerçekleştiren Repository
          sınıfı arasında köprü görevi görerek, son kullanıcıya gerekli cevabı üretecek bir sınıf olduğu anlaşılır.
          Bu aynı zamanda kod bütünlüğünü de sağlar. Projeye sonradan dahil olacak kişi, Service sınıfının hangisi olduğunu
          ve Controller aracılığıyla kullanıcıdan gelen isteklerin nerede işlemesi gerektiğini bilir.


    @Repository
        This annotation is used on Java classes which directly access the database.
        The @Repository annotation works as marker for any class that fulfills
        the role of repository or Data Access Object.
        This annotation has a automatic translation feature.
        For example, when an exception occurs in the @Repository there is a handler
        for that exception and there is no need to add a try catch block.

        * Veritabanı sorgularının gerçekleştirildiği sınıfları belirten bir anotasyondur.

        [BU AÇIKLAMA, VERITABANINA DOĞRUDAN ERIŞEN JAVA SINIFLARINDA KULLANILIR.
        BU@DEPOAÇIKLAMA, HAVUZ VEYA VERI ERIŞIM NESNESI ROLÜNÜ YERINE GETIREN
        HERHANGI BIR SINIF IÇIN IŞARETLEYICI OLARAK ÇALIŞIR.
        BU NOTUN OTOMATIK ÇEVIRI ÖZELLIĞI VARDIR. ÖRNEĞIN, BIR ISTISNA OLUŞTUĞUNDA@DEPOBU
        ISTISNA IÇIN BIR IŞLEYICI VAR VE BIR TRY CATCH BLOĞU EKLEMEYE GEREK YOK.]


     @Controller
        The @Controller annotation is used to indicate the class is a Spring controller.
        This annotation can be used to identify controllers for Spring MVC or Spring WebFlux.

        [@CONTROLLER EK AÇIKLAMASI, SINIFIN BIR SPRING DENETLEYICISI OLDUĞUNU BELIRTMEK IÇIN KULLANILIR.
        BU AÇIKLAMA, SPRING MVC VEYA SPRING WEBFLUX IÇIN KONTROLÖRLERI TANIMLAMAK IÇIN KULLANILABILIR.]

     */


}

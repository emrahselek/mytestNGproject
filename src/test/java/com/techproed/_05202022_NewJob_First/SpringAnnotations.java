package com.techproed._05202022_NewJob_First;

public class SpringAnnotations {

    /*
    https://www.blogkafem.net/2020/05/spring-anotasyonlarinin-calisma-mantigi-ve-temel-spring-anotasyonlari.html

        Bean mean; object-NESNE

    @Autowired
        The @Autowired annotation injects object dependency implicitly.
        We can use this annotation with a constructor, setter, or field injection. Not for primitive/String dataType

        [SPRING CONTEX, CONTAINER ENJEKSIYON NOKTALARINI BULARAK, ORADA BIR NESNE OLUŞTRUR.
         NEW ANAHTAR KELIMESI ILE BIR NESNE OLUŞTURULMAZ. KULLANILACAK NESNE SPRING TARAFINDAN OLUŞTURULUR.
         BU SAYEDE, DEPENDENCY INJECTION TASARIM KALIBI (DESIGN PATTERN) DA UYGULANMIŞ OLUR.
         ÖZETLE @AUTOWIRED YALNIZCA INJECTION IÇIN KULLANILIR. @AUTOWIRED IFADESINI KULLANABILMEK IÇIN,
         HER IKI SINIF DA BEAN SINIFI OLMALI.
         ÖRNEĞIN @SERVICE ANOTASYONU ILE TANIMLANMIŞ BIR SERVIS SINIFI, @REPOSITORY ILE TANIMLANMIŞ BIR SINIFTAN
         @AUTOWIRED ILE BIR NESNE ÜRETEREK, VERITABANI IŞLEMLERINI GERÇEKLEŞTIREBILIYOR. BURADA @SERVIE VE @REPOSITORY
         TANIMLARININ YAPILDIĞI SINIFLAR IÇIN SPRING IOC CONTAINER (APPLICATION CONTEXT) IÇERISINDE GEREKLI BEAN'LER
         OLUŞTURULDUĞU IÇIN, HER IKI SINIF DA ASLINDA BEAN SINIFI OLMUŞ OLUYOR. DOLAYISIYLA SERVICE SINIFI IÇERISINDE
         REPOSITORY SINIFI IÇIN @AUTOWIRED IŞLEMI YAPILABILIYOR.
         KISACA @AUTOWIRED, BEAN NESNESININ ISTENILEN ALANA, BAŞKA BIR BEAN NESNESININ ALINIP, YERLEŞTIRILMESIYLE OLUR.]

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

    @Qualifier
        This annotation is used along with @Autowired annotation.
        When you need more control of the dependency injection process, @Qualifier can be used.
        @Qualifier can be specified on individual constructor arguments or method parameters.
        This annotation is used to avoid confusion which occurs when you create
        more than one bean of the same type and want to wire only one of them with a property.

        [EĞER BIR INTERFACE BIRDEN FAZLA SINIF TARAFINDAN IMPLEMENT EDILDIYSE, BU SINIFLARDAN HANGSINE
        AIT FONKSIYONUN KULLANILACAĞINI BILMEK IÇIN, @AUTOWIRED TANIMLAMASINA EK OLARAK @QUALIFIER(“SINIFADI”)
        ADINDA BIR ANNOTATION DAHA EKLENDIĞI TAKDIRDE, YINE NEW ILE O SINIFTAN ÖZEL BIR NESNE TÜRETMEYE GEREK KALMADAN,
        O SINIFIN FONKSIYONUNU (GEREKLIYSE PARAMETRE GÖNDEREREK) KULLANABILIYORUZ.]

        ForExample:
                @Component("posts")
                    public class Posts implements Blogafem{
                            public String print() { return "post";}}

                @Component("comments")
                    public class Comments implements Blogkafem{
                            public String print() { return "comment"; }}

                @Service
                    public class BlogkafemService{
                            @Autowired
                            @Qualifier("posts")
                            private Blogkafem blogkafem;
                            }




     */


}

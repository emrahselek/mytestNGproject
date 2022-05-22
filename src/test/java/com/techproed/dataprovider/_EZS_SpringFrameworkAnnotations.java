package com.techproed.dataprovider;

public class _EZS_SpringFrameworkAnnotations {

    /*

    https://www.blogkafem.net/2020/05/spring-anotasyonlarinin-calisma-mantigi-ve-temel-spring-anotasyonlari.html

    Temel Spring Boot Anotasyonları:
        @Service - Belirtilen sınıfın bir servis sınıfı olduğunu belirtir.
        @Repository - Veritabanı işlemlerini gerçekleştirme yeteneği olan yapıldığı repository sınıfını belirtir.
        @Configuration - Bean tanımlamaları gibi tanımlamalar için bir Bean sınıfı olduğunu belirtir
        @Controller - Requestleri yakalayabilme yeteneği olan bir web controller sınıfını belirtir.
        @Autowired - Constructor, Değişken yada setter metodlar için dependency injection işlemi gerçekleştirir

    @Autowired
    This annotation is applied on fields, setter methods, and constructors.
    The @Autowired annotation injects object dependency implicitly.

    Noet: if you value; It is just use for private data type, not for primitive and String data types.

    # Private properties: (custom object)
        public class Customer {
                @Autowired
                private Person person;
                private int type;
                }

    # Setter Method:
        public class Customer {
            private Person person;
                @Autowired
                public void setPerson (Person person) {
                 this.person=person;
                    }
                }

    # Constructor:
        @Component
        public class Customer {
            private Person person;
                @Autowired
                public Customer (Person person) {
                  this.person=person;
                }
            }



     */


}

//package ru.itsjava.object;
//
//public class ObjectPractice {
//    public static void main(String[] args) {
//        Object obj1 = new Object();
//        Object obj2 = new Object();
//        System.out.println(obj1==obj2);
//        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));
//
//        obj2= obj1;
//        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));
//
//        Dog gurka = new Dog ("Журка",4 );
//        Dog gurka2 = new Dog ("Журка",4 );
//        Dog murka= new Dog("Мурка",4);
//
//        System.out.println("gurka.equals(gurka2) = " + gurka.equals(gurka2));
//        System.out.println("gurka.equals(murka) = " + gurka.equals(murka));

//        HomeElf dobby = new HomeElf("добби", 100);
//        HomeElf vinki = new HomeElf("винки", 900);
//        HomeElf vinki2 = new HomeElf("винки", 900);
//
//
//        System.out.println("dobby.equals(vinki) = " + dobby.equals(vinki));
//        System.out.println("dobby.equals(dobby) = " + dobby.equals(dobby));
//        System.out.println("vinki.equals(vinki2) = " + vinki.equals(vinki2));
//
//
//        System.out.println("gurka.toString() = " + gurka.toString());
//        System.out.println("gurka.toString() = " + gurka);
//
        // 1. Написать метод toString() к любому классу
//
//        HomeElf kikimer =new HomeElf("kikimer",1000);
//        System.out.println("kikimer.ToString() = " + kikimer);

//        2. Переписать классы с помощью аннотаций библиотеки Lombok (лучше все;))
//        DogWithLombok puppy = new DogWithLombok("puppy",4);
//        System.out.println("puppy.toString() = " + puppy.toString());
//
//        puppy.setName("Pushok");
//        System.out.println("puppy.getName() = " + puppy.getName());
//
//        DogWithLombok puppy2= new DogWithLombok("puppy2", 4);
//        System.out.println("puppy.equals(puppy2) = " + puppy.equals(puppy2));
//        System.out.println("puppy2.equals(puppy2) = " + puppy2.equals(puppy2));
//
//        HomeElfwithLombok kikimer = new HomeElfwithLombok ("kikimer", 900);
//
//        System.out.println("kikimer.toString() = " + kikimer.toString());
//
//        System.out.println("kikimer.equals(kikimer) = " + kikimer.equals(kikimer));
//
//        HomeElfwithLombok vinki = new HomeElfwithLombok ("vinki", 900);
//        System.out.println("kikimer.equals(vinki) = " + kikimer.equals(vinki));
//
//
//
//
//    }
//}

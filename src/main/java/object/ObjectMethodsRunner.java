package object;

import oop.Cat;

public class ObjectMethodsRunner {
    public static void main(String[] args) {
//        Object obj1 = new Object();
//        Object obj2 = new Object();
//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());
//
//        System.out.println("obj1.equals(obj1) = " + obj1.equals(obj1));
//        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));
//
//        System.out.println("obj1.toString() = " + obj1.toString());
//
//        System.out.println("obj1.getClass().getName() = " + obj1.getClass().getName());
//
//        Cat barsik = new Cat();
//        Cat cesar = new Cat();
//
//        System.out.println("barsik.equals(cesar) = " + barsik.equals(cesar));
        Telephone iphoneX = new Telephone("Iphone", 10);
        Telephone iphoneXI = new Telephone("Iphone", 11);
        Telephone samsungGalaxy3 = new Telephone("Samsung", 3);

        System.out.println(iphoneXI);
        System.out.println(iphoneX.toString());
        System.out.println("samsungGalaxy3.toString() = " + samsungGalaxy3.toString());

        System.out.println("iphoneX.equals(new Object()) = " + iphoneX.equals(new Object()));
        System.out.println("iphoneX.equals(iphoneXI) = " + iphoneX.equals(iphoneXI));

    }
}

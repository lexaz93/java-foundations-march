package oop.hw_with_lombok;

public class Earth {
    public static void main(String[] args) {
        Man alex = new Man("Алексей", "Мужской", "Русский");
        Man anna = new Man("Анна", "Женский");
        System.out.println("alex.getGender() = " + alex.getGender());
        System.out.println("anna.getNation() = " + anna.getNation());
        anna.setNation("Русская");
        System.out.println("anna.getNation() = " + anna.getNation());

        Shop lenta = new Shop("Лента", "Гипермаркет");
        Shop prod = new Shop("Продукты");
        System.out.println("lenta.getType() = " + lenta.getType());
        prod.setType("Забегаловка");
        System.out.println("prod.getType() = " + prod.getType());

        Cup kruzhka = new Cup("Железная", "Белая");
        System.out.println("kruzhka.getColor() до изменения " + kruzhka.getColor());
        kruzhka.setColor("Синяя");
        System.out.println("kruzhka.getColor() после изменения " + kruzhka.getColor());

        Telephone truba = new Telephone("Apple", 100000);
        System.out.println("truba.getCost() новый " + truba.getCost());
        truba.setCost(50000);
        System.out.println("truba.getCost() б/у " + truba.getCost());

        Notebook nout = new Notebook();
        nout.setType("Блокнот для записей");
        System.out.println("nout.getType() = " + nout.getType());

        Car myCar = new Car("Мазда", "Черный", 700000);
        System.out.println("myCar.getModel() = " + myCar.getModel());
        System.out.println("myCar.getPrice() = " + myCar.getPrice());

        Gun kalash = new Gun();
        kalash.setType("Автомат");
        kalash.setCountry("СССР");
        kalash.setClip(30);
        System.out.println("Характеристики оружия: " + kalash.getType() + " " + kalash.getCountry() + " " + kalash.getClip());

        House sweetHome = new House();
        sweetHome.setType("Квартира");
        sweetHome.setArea(61.2);
        System.out.println("sweetHome.getArea() = " + sweetHome.getArea());
    }
}

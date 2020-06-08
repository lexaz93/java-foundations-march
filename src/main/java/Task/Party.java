package Task;

public class Party {
    public static void main(String[] args) {
        Person yura = new Friends("Yura", "Petrov", 25);
        Person vanya = new Friends("Ivan", "Kvadratov", 31);
        Person nikita = new Friends("Nikita", "Peretyolkin", 17);
        Person alex = new Friends("Alexey", "Korotaev", 29);
        Person sergey = new Friends("Sergey", "Ilyushin", 35);
        Person anna = new Girlfriends("Anna", "Ptitsyna", 24);
        Person zhanna = new Girlfriends("Lyuba", "bratsy, Lyuba", 17);
        Person alena = new Girlfriends("Alena", "Hohlosyan", 18);
        Person masha = new Girlfriends("Maria", "Merlyn", 26);
        Person helga = new Girlfriends("Olga", "Greed", 24);

        Person[] party = new Person[]{yura, vanya, nikita, alex, sergey, anna, zhanna, alena, masha, helga};

        System.out.println("Вход 18+");
        for (Person value : party) {
            if (value.getAge() < 18) {
                System.out.println(value.getFirstName() + ": к сожалению вам нельзя");
            }
        }

        System.out.print("Бар без Люб\n{");
        for (Person person : party) {
            if (!person.getLastName().equals("Lyuba")) {
                System.out.print(person.getFirstName() + " ");
            }
        }
        System.out.println("}");


        PersonComparator comparator = new PersonComparator();
        System.out.println(comparator.compare(alex, yura));
        Person alex1 = new Friends("Alexey", "Korotaev", 29);
        System.out.println(comparator.compare(alex, alex1));
        System.out.println(comparator.compare(sergey, alex1));
    }
}

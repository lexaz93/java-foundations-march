package Task;

public class Party {
    public static void main(String[] args) {
        Person yura = new Friend("Yura", "Petrov", 25);
        Person vanya = new Friend("Ivan", "Kvadratov", 31);
        Person nikita = new Friend("Nikita", "Peretyolkin", 17);
        Person alex = new Friend("Alexey", "Korotaev", 29);
        Person sergey = new Friend("Sergey", "Ilyushin", 35);
        Person anna = new Girlfriend("Anna", "Ptitsyna", 24);
        Person zhanna = new Girlfriend("Lyuba", "bratsy, Lyuba", 17);
        Person alena = new Girlfriend("Alena", "Hohlosyan", 18);
        Person masha = new Girlfriend("Maria", "Merlyn", 26);
        Person helga = new Girlfriend("Olga", "Greed", 24);

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
        Person alex1 = new Friend("Alexey", "Korotaev", 29);
        System.out.println(comparator.compare(alex, alex1));
        System.out.println(comparator.compare(sergey, alex1));

        FriendsList friends = new FriendsList();
        friends.add(yura);
        friends.add(vanya);
        friends.add(nikita);
        friends.add(alex);
        friends.add(sergey);
        friends.add(anna);
        friends.add(3, zhanna);
        friends.add(alena);
        friends.add(masha);
        friends.add(helga);
        System.out.println(friends.toString());
        System.out.println("friends.contains(alex) = " + friends.contains(alex));
        friends.remove(helga);
        System.out.println(friends.toString());
        friends.remove(3);
        System.out.println(friends.toString());

        NewFriendsList <Person> friends2 = new NewFriendsList<>();
        friends2.addFriends(masha);
        friends2.addFriends(helga);
        friends2.addFriends(alena);
        friends2.addFriends(alex);
        friends2.removeFriends(alena);
        System.out.println(friends2.friendsList());
        System.out.println(friends2.getFriend(2));

    }
}

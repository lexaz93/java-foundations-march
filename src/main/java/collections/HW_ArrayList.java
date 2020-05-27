package collections;

import oop.hw.Men;
import oop.hw.Person;
import oop.hw.Women;


import java.util.ArrayList;
import java.util.List;

public class HW_ArrayList {
    public static void main(String[] args) {
        List<String> myFirstList = new ArrayList<>();
        List<String> mySecondList = new ArrayList<>(20);

        myFirstList.add("Ложка");
        myFirstList.add("Вилка");
        myFirstList.add("Нож");
        myFirstList.add("Кружка");
        myFirstList.add("Тарелка");
        myFirstList.add("Кастрюля");
        myFirstList.add("Сковорода");
        myFirstList.add("Чайник");
        printList(myFirstList);

        System.out.println("myFirstList.get(0) = " + myFirstList.get(0));
        System.out.println("myFirstList.get(myFirstList.size()-1) = " + myFirstList.get(myFirstList.size() - 1));

        mySecondList.add("Стул");
        mySecondList.add("Стол");
        mySecondList.add("Диван");
        mySecondList.add("Шкаф");
        mySecondList.add("Кровать");
        mySecondList.add(2, "Тумба");
        mySecondList.add(0, "Пуф");

        mySecondList.addAll(myFirstList);
        printList(mySecondList);

        mySecondList.remove(5);
        printList(mySecondList);
        mySecondList.remove("Тумба");
        printList(mySecondList);

        System.out.println("mySecondList.contains(\"Чайник\") = " + mySecondList.contains("Чайник"));

        System.out.print("List:\n{ ");
        for (String elements : mySecondList) {
            System.out.print("\"" + elements + "\"; ");
        }
        System.out.println("}");

        System.out.println("mySecondList.size() = " + mySecondList.size());

        System.out.println("Список с элементами, индексы которых делятся на 3: ");
        for (int i = 0; i < mySecondList.size(); i = i + 3) {
            System.out.print(mySecondList.get(i) + " ");
        }
        System.out.println();

        mySecondList.add("Диван");
        int count = 0;
        for (String elements : mySecondList) {
            if (elements.equals("Диван")) {
                count++;
            }
        }
        System.out.println("count(Диван) = " + count);

        System.out.println("Список без первых 3х элементов: ");
        for (int i = 3; i < mySecondList.size(); i++) {
            System.out.print(mySecondList.get(i) + " ");
        }
        System.out.println();


        System.out.println("Исключаем из коллекции диван");
        for (String elements : mySecondList) {
            if (!elements.equals("Диван")) {
                System.out.print(elements + " ");
            }
        }

        System.out.println("\nДобавили в коллекцию еще 4 ложки");
        mySecondList.add(0, "Ложка");
        mySecondList.add(7, "Ложка");
        mySecondList.add(10, "Ложка");
        mySecondList.add(15, "Ложка");
        printList(mySecondList);

        System.out.println("Коллекция без 2х ложек");
        int count1 = 0;
        for (String elements : mySecondList) {
            if (count1 > 1) {
                System.out.print(elements + " ");
            } else if (elements.equals("Ложка")) {
                count1++;
            } else {
                System.out.print(elements + " ");
            }
        }
        System.out.println();

        List<Integer> myThirdList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            myThirdList.add(i + 1);
        }
        System.out.print("MyList { ");
        for (Integer element : myThirdList) {
            System.out.print(element + " ");
        }
        System.out.println("}");

        System.out.println("Вернуть первый элемент делящийся на 3: ");
        for (int i = 0; i < myThirdList.size(); i++) {
            if (myThirdList.get(i) != 0 && myThirdList.get(i) % 3 == 0) {
                System.out.println(myThirdList.get(i));
                break;
            }
        }

        System.out.println("Вернуть все элементы делящиеся на 3: ");
        for (Integer integer : myThirdList) {
            if (integer != 0 && integer % 3 == 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();

        Person nikola = new Men("Nikolay", 26);
        Person nikita = new Men("Nikita", 18);
        Person alex = new Men("Alex", 26);
        Person anna = new Women("Anna", 23);
        Person zhanna = new Women("Zhanna", 35);
        Person natasha = new Women("Natasha", 20);

        List<Person> myPersonList = new ArrayList();

        myPersonList.add(nikola);
        myPersonList.add(nikita);
        myPersonList.add(alex);
        myPersonList.add(anna);
        myPersonList.add(zhanna);
        myPersonList.add(natasha);

        System.out.print("Вернуть всех военнообязанных мужчин: ");
        for (int i = 0; i < myPersonList.size(); i++) {
            if (myPersonList.get(i).isMale()) {
                if (myPersonList.get(i).getAge() >= 18 && myPersonList.get(i).getAge() < 27) {
                    if (myPersonList.get(i).getName().charAt(0) == 'N') {
                        System.out.print(myPersonList.get(i).getName() + " ");
                    }
                }
            }
        }

        System.out.print("\nСредний возраст женщин: ");
        int countWomen = 0;
        int countAge = 0;
        for (Person person : myPersonList) {
            if (!person.isMale()) {
                countAge += person.getAge();
                countWomen++;
            }
        }
        System.out.println(countAge / countWomen);//вернет 18, тк у Women переопределен метод getAge(), который всегда возвращает 18. Реальный средний возраст 26.


    }

    public static void printList(List<String> myList) {
        System.out.print("MyList { ");
        for (String element : myList) {
            System.out.print(element + " ");
        }
        System.out.println("}");
    }
}


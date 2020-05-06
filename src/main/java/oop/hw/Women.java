package oop.hw;

public class Women extends Person {
    public Women(String name, int age) {
        super.isMale = false;
        super.name = name;
        super.age = age;
    }


    @Override
    public void printAge() {
        System.out.println("Мне всегда 18");
    }

    public String toString() {
        String isMale;
        if (this.isMale) {
            isMale = "Мужичина";
        } else {
            isMale = "Девушка";
        }
        return "Пол " + isMale + ", Имя '" + name + '\'' + ", Возраст " + 18;
    }
}


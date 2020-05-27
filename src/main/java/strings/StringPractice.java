package strings;

public class StringPractice {
    public static void main(String[] args) {
        String name = "Alexey";
        String nameCopy = "Alexey";

        System.out.println(name == nameCopy);

        String nameConstructor = new String("Alexey");

        System.out.println(nameConstructor == name);

        String internName = nameConstructor.intern();
        System.out.println(internName == name);

        String favoriteStr = "I'm favorite string!";

        System.out.println(favoriteStr.substring(4));

        System.out.println(favoriteStr.substring(4, 12));

        System.out.println(favoriteStr.length());

        System.out.println("Begin cycle");
        StringBuilder sb = new StringBuilder(favoriteStr);
        for (int i = 0; i < 100; i++) {
            sb.append('!');
//            favoriteStr = favoriteStr + "!";
        }
        System.out.println("End cycle");
        System.out.println(sb.toString());

    }
}

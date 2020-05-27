package strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWorkWithStrings {
    public static void main(String[] args) {
        String str = "Я классная строка, поиграйся со мной!";
        String str1 = new String("Я классная строка, поиграйся со мной! ");
        System.out.println("str.length() = " + str.length());
        System.out.println("str.substring(0,10) = " + str.substring(0, 10));
        System.out.println("str.equals(str1) = " + str.equals(str1));
        System.out.println("str.compareTo(str1.trim()) = " + str.compareTo(str1.trim()));
        System.out.println("str.toString() = " + str.toString());
        System.out.println("str.concat(\"А я не оч)\") = " + str.concat("А я не оч)"));
        System.out.println("str.charAt(0) = " + str.charAt(0));
        System.out.println("Arrays.toString(str.toCharArray()) = " + Arrays.toString(str.toCharArray()));
        System.out.println("str.replace(\"и\", \"е\") = " + str.replace("и", "е"));
        System.out.println("str.indexOf(\"Я\") = " + str.indexOf("Я"));
        System.out.println("str.toLowerCase() = " + str.toLowerCase());
        System.out.println("str.hashCode() = " + str.hashCode());
        System.out.println("str.codePointAt(0) = " + str.codePointAt(0));
        System.out.println("str.endsWith(\"!\") = " + str.endsWith("!"));
        System.out.println("str.indent(4) = " + str.indent(4));
        System.out.println("str.isEmpty() = " + str.isEmpty());
        System.out.println("str.startsWith(\"Я\") = " + str.startsWith("Я"));
        System.out.println("str.replaceAll(\"классная\", \"ужасная\") = " + str.replaceAll("классная", "ужасная"));


//        String regexp = "^.+@.+(ru|com)$"; Этот я тоже переделал. Для многих прокатит)
        String regexp = "([A-Za-z0-9]{1,}[\\.-]{0,1}[A-Za-z0-9]{1,})+@([A-Za-z0-9]{1,}[\\.-]{0,1}[A-Za-z0-9]{1,})+[\\.]{1}[a-z]{2,4}";//Взял из интернета, но могу обьяснить)если что после урока)Вместо [A-Za-z0-9] можно использовать \\w
        String email = "wegw@google.com";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(email);
        System.out.println("matcher.find() = " + matcher.find());

//        String regexp1 = "89.........";
        String regexp1 = "^(89|\\+79)\\d{9}$";
        String phoneNumber = "+79210032783";

        Pattern pattern1 = Pattern.compile(regexp1);
        Matcher matcher1 = pattern1.matcher(phoneNumber);
        System.out.println("matcher1.find() = " + matcher1.find());
    }
}
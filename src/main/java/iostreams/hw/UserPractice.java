package iostreams.hw;

import java.io.*;

public class UserPractice {
    public static void main(String[] args) {
        User user = new User("Alex", "ptitsa93");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/user.out"))) {
            objectOutputStream.writeObject(user);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream (new FileInputStream("src/main/resources/user.out"))) {
            User userFromFile = (User) objectInputStream.readObject();
            System.out.println(userFromFile.getLogin());
            System.out.println(userFromFile.getPassword());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

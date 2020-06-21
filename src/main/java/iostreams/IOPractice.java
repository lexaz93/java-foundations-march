package iostreams;


import oop.hw_with_lombok.Man;

import java.io.*;

public class IOPractice {
    public static void main(String[] args) {

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        String input;
//        try {
//            input = bufferedReader.readLine();
//            System.out.println("Input: " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                bufferedReader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//                try {
//                    bufferedReader.close();
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }
//            }
//        }

//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            String input = reader.readLine();
//            System.out.println("Input: " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        File file = new File("src/main/resources/file.txt");
//        try (PrintWriter printWriter = new PrintWriter(file)) {
//            printWriter.println("Hello, first string in file!");
//            printWriter.println("Hello, second string in file!");
//            printWriter.println("Hello, third string in file!");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
//            while(fileReader.ready()) {
//                System.out.println(fileReader.readLine());
//            }
//        }  catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
//            String input;
//            while (!((input = reader.readLine()).equals("Конец"))) {
//                System.out.println(input);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Man man = new Man ("Alex");
//
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream (new FileOutputStream("src/main/resources/man.out"))) {
//            objectOutputStream.writeObject(man);
//            objectOutputStream.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream (new FileInputStream("src/main/resources/man.out"))) {
            Man manFromFile = (Man) objectInputStream.readObject();
            System.out.println(manFromFile.getNation());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

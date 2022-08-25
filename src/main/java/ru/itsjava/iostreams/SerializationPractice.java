package ru.itsjava.iostreams;

import ru.itsjava.collections.lists.maps.Man;

import java.io.*;

public class SerializationPractice {
    public static void main(String[] args) {
//        Man man = new Man ("Vitalik");
//
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
//                new FileOutputStream("src/main/resources/man.out"))) {
//            objectOutputStream.writeObject(man);
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

//        try (ObjectInputStream inputStream = new ObjectInputStream(
//                new FileInputStream("src/main/resources/man.out"))) {
//            Object obj = inputStream.readObject();
//            Man man = (Man) obj;
//            System.out.println("man = " + man);
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        User yasia = new User ("yasia","@1234" );
        System.out.println("yasia до серриализации= " + yasia);

//        Сериализовать объект.
        try (ObjectOutputStream objectOutputStream=new ObjectOutputStream(
                new FileOutputStream("src/main/resources/yasia.out"))) {
            objectOutputStream.writeObject(yasia);
            System.out.println("yasia после серриализации= " + yasia);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


//
//        После десериализовать объект и вывести поля login и password
//        try (ObjectInputStream objectInputStream=new ObjectInputStream(
//                new FileInputStream("src/main/resources/yasia.out"))) {
//
//
//           Object obj= objectInputStream.readObject();
//           User yasia1 = (User) obj;
//            System.out.println("yasia1 после серрилизации = " + yasia1);
//
//        } catch (FileNotFoundException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//
    }
}

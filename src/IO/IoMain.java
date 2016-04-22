package IO;

import inheritance.hierarce.Person;

import javax.xml.crypto.dsig.dom.DOMSignContext;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Created by User on 15.04.2016.
 */
public class IoMain {
    public static void main(String[] args) {
//        После создания После создания они уже не нужны, так как чтение из файла.
//        Person ivan = new Person("Ivan");
//        Car myCar = new Car ("BMW", 1985, ivan);
//        ivan.setCar(myCar);
//        myCar.setTenant(new Tenant("Nikolay"));
//
//        save(myCar);
        /******/
        Car deserializedCar = load();

        System.out.println(deserializedCar.toString());
        //System.out.println(deserializedCar == myCar);
    }

    public static void save(Car car) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("myFolder/car.dat"))) {
           outputStream.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static Car load(){
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("myFolder/car.dat"))) {
            return (Car) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


    private static void propertiesExample() {
        Properties properties = new Properties();
        try (FileInputStream inputStream = new FileInputStream("myFolder/settings.properties")){
            properties.load(inputStream);
            String db = properties.getProperty("DB");
            String password = properties.getProperty("password");
            int timeout = Integer.parseInt(properties.getProperty("timeout"));

            System.out.println(db + " " + password + " " + timeout);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void objectsExample() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("myFolder/object.dat"))) {
            int[] date = new int[] {15, 4, 2016};
            outputStream.writeObject(date);
            outputStream.writeObject("Hello");
            outputStream.writeObject(1);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("myFolder/object.dat"))) {
            int[] date = (int[]) inputStream.readObject();
            String someStr = (String) inputStream.readObject();
            Integer someInteger = (Integer) inputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void dataWrite() {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("myFolder/primitives.dat"))) {
            dataOutputStream.writeInt(15);
            dataOutputStream.writeInt(4);
            dataOutputStream.writeInt(2016);
            dataOutputStream.writeLong(Long.MAX_VALUE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("myFolder/primitives.dat"))) {
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readLong());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bufferedReader() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("myFolder/myFile.txt"), "windows-1251"))) {
            String value = null;
            while ((value =  reader.readLine()) != null){
                System.out.println(value);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readWithCodePage() {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("myFolder/myFile.txt"), "windows-1251")){
            int value = 0;
            while ((value = reader.read()) != -1){
                System.out.print((char) value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copy() {
        try {
            try (InputStream inputStream = new FileInputStream("myFolder/myFile.txt");
                 OutputStream outputStream = new FileOutputStream("myFolder/myFile_copy.txt")){
                int value;
                while ((value = inputStream.read()) != -1) {
                    outputStream.write(value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void tryWithResourses() {
        try (InputStream inputStream = new FileInputStream("myFolder/myFile.txt")) {
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void uglyPrior7Java() {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("myFolder/myFile.txt");
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null)
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    private static void absoluteAndRelativePaths() {
        System.out.println("yes\\no");
        System.out.println("c:\\temp\\myFile.txt");

        File file = new File("/temp/myFolder");
        System.out.println(file.exists());
        file.mkdirs();
        System.out.println(file.exists());

        File relativeFile = new File("myFolder/myFile.txt");
        System.out.println(relativeFile.getAbsolutePath());

        Path relativePath = Paths.get("myFolder/myFile.txt");
        Path parent = relativePath.getParent();
        Path resolve = parent.resolve(relativePath);
        System.out.println(parent);
        System.out.println(resolve);
        Path absolutePath = relativePath.toAbsolutePath();
        System.out.println(relativePath + ", is relative " + relativePath.isAbsolute());
        System.out.println(absolutePath + ", is absolute " + absolutePath.isAbsolute());

        try {
            Files.createDirectories(relativePath.getParent());
            Files.createFile(relativePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void someMethodCaller() {
        someMethod(1, 3, 2, 3, 4, 5, 6, 7);
        someMethod();
    }

    public static void someMethod(Integer... integers) {
        System.out.println(integers[0]);
        System.out.println(integers[1]);
        System.out.println(integers[2]);
    }

}

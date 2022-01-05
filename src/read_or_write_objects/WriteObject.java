package read_or_write_objects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"),
                new Person(3, "Tom"), new Person(4, "Kate")};

        try {
            FileOutputStream fos = new FileOutputStream(new File("src/read_or_write_objects/people.bin"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(people.length);
            for (Person person: people){
                oos.writeObject(person);
            }

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

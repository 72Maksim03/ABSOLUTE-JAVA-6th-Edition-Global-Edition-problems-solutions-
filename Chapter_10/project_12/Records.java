import java.io.*;

public class Records {
    private Person[] person;
    private final String fileName;
    private int recordsSize;
    private int count = 0;

    public Records(String name, int recSize){
        fileName = name;
        recordsSize = recSize;
        person = new Person[recordsSize];
        getData();
    }

    public Records(String fileName){this(fileName, 16);}

    public void delete(String name){
        for (int i = 0; i < count; i++){
            if (person[i].getName().equals(name)){
                person[i] = person[count - 1];
                person[count - 1] = null;
                count--;
                System.out.println(name + " is deleted");
                writeData();
                return;
            }
        }
        System.out.println(name + " is not found");
    }

    public void add(Person p){
        if (count == recordsSize) resize(2 * recordsSize);
        person[count] = p;
        count++;
        System.out.println(p.getName() + " successfully added");
        writeData();
    }

    public void display(String name){
        for (int i = 0; i < count; i++){
            if (person[i].getName().equals(name))
                System.out.println(person[i]);
        }
    }

    public void display(int minAge, int maxAge, Date current){
        for (int i = 0; i < count; i++){
            if (person[i].getAge(current) >= minAge && person[i].getAge(current) <= maxAge)
                System.out.println(person[i]);
        }
    }

    private void getData(){
        try(ObjectInputStream inp = new ObjectInputStream(new FileInputStream(fileName))){
            while (true){
                if (count == recordsSize) resize(2 * recordsSize);
                try {
                    person[count] = (Person) inp.readObject();
                    count++;
                } catch (ClassNotFoundException e) {
                    System.out.println("Class not found in the file");
                    System.exit(0);
                }
            }
        } catch (EOFException e){}
        catch (IOException e){
            System.out.println("Error accessing file");
            System.exit(0);
        }
    }

    private void writeData(){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
            for (int i = 0; i < count; i++) out.writeObject(person[i]);
        } catch (EOFException e){}
        catch (IOException e){
            System.out.println("Error accessing file");
            System.exit(0);
        }
    }

    private void resize(int newSize){
        Person[] newArray = new Person[newSize];
        for (int i = 0; i < count; i++){
            newArray[i] = person[i];
        }
        person = newArray;
        recordsSize = newSize;
    }
}

public class Main {
    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Name1", new Date(1, 2, 2016), 36000, "Obstetrician", 2.5);
        Doctor doc2 = new Doctor("Name2", new Date(1, 2, 2016), 48000, "Obstetrician", 2.5);
        Doctor doc3 = new Doctor("Name1", new Date(1, 2, 2016), 36000, "Obstetrician", 2.5);

        System.out.println("Doctor1:\n" + doc1 + "\n");
        System.out.println("Doctor2:\n" + doc2 + "\n");
        System.out.println("Doctor3:\n" + doc3 + "\n");

        System.out.println("Is Doctor1 equal to Doctor2? " + doc1.equals(doc2));
        System.out.println("Is Doctor1 equal to Doctor3? " + doc1.equals(doc3));
    }
}

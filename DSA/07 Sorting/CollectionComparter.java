import java.util.*;

// A class to represent a student
class Student {
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details
    public String toString() {
        return this.rollno + " " + this.name + " " + this.address;
    }
}

// Comparator to sort students by roll number
class Sortbyroll implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

// Main class (must match file name)
public class CollectionComparter {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));

        System.out.println("Unsorted:");
        for (Student s : ar)
            System.out.println(s);

        // Sorting using custom comparator
        Collections.sort(ar, new Sortbyroll());

        System.out.println("\nSorted by rollno:");
        for (Student s : ar)
            System.out.println(s);
    }
}

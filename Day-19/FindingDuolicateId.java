import java.util.*;

class Student {
    private int id;
    private String name;
    private int age;
    
    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public int getId()
    {
        return id;
    }
     public String getName()
    {
        return name;
    }
     public int getAge()
    {
        return age;
    }
    
    public String toString()
    {
        return "Student id :"+id+" and Name: "+ name +"age: "+ age;
    }
}
class FindingDuolicateId {
    public static void main(String[] args) {

        Student[] students = {
            new Student(101, "Raju", 20),
            new Student(102, "Malu", 21),
            new Student(103, "Spidy", 22),
            new Student(101, "Batman", 23), // duplicate id
            new Student(104, "Superman", 24),
            new Student(102, "Ironman", 25) // duplicate id
        };
        findDuplicateIds(students);
    }
    
    public static void findDuplicateIds(Student[] students) {
        Map<Integer, Integer> idCount = new HashMap<>();

        for (Student s : students) {
            int id = s.getId();
            idCount.put(id, idCount.getOrDefault(id, 0) + 1);
        }

        boolean hasDuplicates = false;

        for (Map.Entry<Integer, Integer> entry : idCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate ID: " + entry.getKey());
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }
    }
}


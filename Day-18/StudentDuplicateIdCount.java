import java.util.*;

class Student{
    private int id;
    private String name;
    
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public int getId()
    {
        return id;
    }
    public String toString()
    {
        return "Student id :"+id+" and Name: "+ name ;
    }
}

class StudentDuplicateIdCount {
    public static void main(String[] args) {
    Student[] arr = new Student[5];   
    
     arr[0] = new Student(101, "Raju");
     arr[1] = new Student(102, "Malu");
     arr[2] = new Student(102, "Batman");
     arr[3] = new Student(104, "Superman");
     arr[4] = new Student(101, "Spidy");
    
    Set<Integer> al = new HashSet<>();
    for(Student sp: arr)
    {
        al.add(sp.getId());
    }
    
    int count = arr.length - al.size();
    System.out.println(count);
    }
}
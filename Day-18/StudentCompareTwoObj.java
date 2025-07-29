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
    public String getName()
    {
        return name;
    }
    //Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same object
        if (obj == null || getClass() != obj.getClass()) return false;

        Student other = (Student) obj;
        return this.id == other.id && this.name.equals(other.name);
    }
    //HashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    //ToString
    public String toString()
    {
        return "Student id :"+id+" and Name: "+ name ;
    }
}

class StudentCompareTwoObj {
    public static void main(String[] args) {
    Student[] arr = new Student[5];   
    
     arr[0] = new Student(101, "Malu");
     arr[1] = new Student(102, "Malu");
     arr[2] = new Student(103, "Spidy");
     arr[3] = new Student(104, "Superman");
     arr[4] = new Student(105, "Spidy");
    
    Set<Student> al = new HashSet<>();
    int count = 0;
    
    for(Student sp: arr)
    {
        if (!al.add(sp) ) count++;
        
    }
    
    System.out.println(count);
    }
}
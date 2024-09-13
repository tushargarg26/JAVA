class Student{
    String name;
    int age;
    void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s3){
        this.name=s3.name;
        this.age=s3.age;
    }
    Student(){

    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name= "Aman";
        s1.age=23;
        Student s2= new Student(s1);
        s2.printinfo();
    }
}

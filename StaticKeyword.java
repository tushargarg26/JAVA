class Student{
    String name;
    static String school;
    //static String school= "ABC"; -->It is true as well 
}

public class StaticKeyword {
    @SuppressWarnings("static-access")  //bcz we are accessing school using object not by class for understanding static keyword
    public static void main(String[] args) {
        Student.school="ABC";
        Student s1 = new Student();
        s1.name = "Tony";
        Student s2 = new Student();
        System.out.println(s2.school); //---> Output= ABC
        s1.school="JVM"; //This will change value of school for all the further objects created so,
        // we can write Student.school="JVM" as well and tab bhi farak nahi pdega kuch but we should 
        // access static elements by its class name only
        System.out.println(s1.school); //--> Output = JVM
        Student s3 = new Student();
        System.out.println(s3.school);  //--> Output = JVM
        
    }
}


class Student{                            
    String name;
    int age; 

    void printinfo(String name){                     //Function-1
        System.out.println(name);
    }
    void printinfo(int age){                        //Function-2
        System.out.println(age);
    }
    void printinfo(String name, int age){          //Function-3
        System.out.println(name + " " + age);
    }
    void printinfo(){                             //Function-4
        System.out.println(this.name);
        System.out.println(this.age);
    }

}
public class MethodOverloading {
     public static void main(String[] args) {
        Student s1 = new Student();
        s1.name= "Tushar";
        s1.age=20;
        s1.printinfo(s1.name);                //Function-1 will be called
        s1.printinfo(s1.age);                 //Function-2 will be called
        s1.printinfo(s1.name,s1.age);         //Function-3 will be called
        s1.printinfo();                       //Function-4 will be called
    }
}
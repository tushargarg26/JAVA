class Base {
    void Print()
    {
        System.out.println("Parent class");
    }
}

class Child extends Base {

    void Print(){
        System.out.println("Child Class"); 
    }
}


public class MethodOverRiding {

    public static void main(String[] args)
    {

        Base a;
        a = new Child();
        a.Print();

    }
}
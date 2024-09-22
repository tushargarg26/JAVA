interface Animal{
    int eyes=2;
    void walk();
}
interface Herbivores{
     default void eat(){
        System.out.println("Herbivore eat grass only");
    }
}
class Horse implements Animal,Herbivores{
    public void walk() {
        System.out.println("Horse have 4 legs");
    }
}

public class Interface {

    // -->above warning is due to h1.eyes is used
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
        System.out.println(Animal.eyes);
        //System.out.println(h1.eyes);
        //We can write above line as well because horse class implements the Animal class
        // but as a good practise we should access the static data members by its class or
        // interface name AND it's value cannot be changed for different objects of different
        // classes implementing Animal as it is a final data member , so we write instead of h1.eyes-
        System.out.println(Animal.eyes);


    }
}

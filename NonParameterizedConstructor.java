class Pen{                            
    String color;
    String type; //ballpoint or gel;

    void printinfo(){
        System.out.println(this.color);
        System.out.println(this.type);
    }

    Pen(){
        System.out.println("Constructor Called");
    }
}
public class NonParameterizedConstructor {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type= "ballpoint";
        pen1.printinfo();

        Pen pen2 = new Pen();
        pen2.color="blue";
        pen2.type="gel";
        pen2.printinfo();
    }
}
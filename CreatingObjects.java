class Pen{
    String color;
    String type; //ballpoint or gel;

    void printcolor(){
        System.out.println(this.color);
    }
    void type(){
        System.out.println(this.type);
    }
}



public class CreatingObjects {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type= "ballpoint";

        Pen pen2 = new Pen();
        pen2.color="blue";
        pen2.type="gel";

        pen1.printcolor();
        pen2.type();
    }
}




class Pen{                            
    String color;
    String type; //ballpoint or gel;

    void printinfo(){
        System.out.println(this.color);
        System.out.println(this.type);
    }

    Pen(String color, String type){
        this.color= color;
        this.type= type;
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Pen pen1 = new Pen("Blue", "Ballpoint");

        Pen pen2 = new Pen("Black", "Gel");

        pen1.printinfo();
        pen2.printinfo();
    }
}
class Shape{
   public void area(){
        System.out.println("DISPLAY AREA");
    }
}
class Triangle extends Shape{
    public void area(int base, int height){
        int a = (base*height)/2;
        System.out.println("Area of Triangle= "+ a);
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(2,10);
        t1.area();
    }
}

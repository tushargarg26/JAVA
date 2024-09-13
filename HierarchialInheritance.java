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
class Circle extends Shape{
    public void area(int radius){
        double a = 3.14*radius*radius;
        System.out.println("Area of Triangle= "+ a);
    }
}
 
public class HierarchialInheritance{
    public static void main(String[] args) {
    Circle c1= new Circle();
    c1.area(5);
    c1.area();
    }
}
 

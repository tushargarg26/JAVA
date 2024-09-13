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
class EquilateralTriangle extends Triangle{
    public void area(int base, int height){
        int a = (base*height)/2;
        System.out.println("Area of Triangle= "+ a);
    }
}
 
public class MultiLevelInheritance{
    public static void main(String[] args) {
        EquilateralTriangle t1 = new EquilateralTriangle();
        t1.area(2,10);
        t1.area();
     }
 }
 

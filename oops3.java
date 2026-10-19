//inheritance

class Shape{
  String color;  
}

class Triangle extends Shape{//extends(inherited triangel into shape ,so automatically string color is in here also)

}
public class oops3 {
    public static void main(String args[]){
Triangle t1=new Triangle();
t1.color="blue";
System.out.println(t1.color);
System.out.println();
    }
}

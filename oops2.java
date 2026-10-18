//over loading
class Student{ 
String name;
int age;

public void printInfo(String name){
    System.out.println(name);
}

public void printInfo(int age){
    System.out.println(age);
}

public void printInfo(String name,int age){
    System.out.println(name+" "+age);
}
//using same printinfo for many steps is knowon as polymorphism.when ur doing this there shoud smtg diff with thm.eg in first u hav just name next u hav age ,n next u hav bith like tht.
}
public class oops2 {
    //poly(many)-morphism(forms)
    //complie time polymorphism /function overloading
public static void main(String args[]){
    Student s1=new Student();
    s1.name="may";
    s1.age=19;

    s1.printInfo(s1.name,s1.age);
}
}

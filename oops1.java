class Pen{
    String color;
    String type; //ballpoint,gel

    public void write() {
        System.out.println("writing smtg");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    
}



class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
}
//non pramatixsed
Student(){
    System.out.println("constructor called");
}

//paramatrised
Student(String name,int age){
    this.name=name;
    this.age=age;//as u hav donw evrtg here only just at line 53 in brackets of student if u write name and age it prints off
}

//copy constructor
Student(Student s2){
    this.name=s2.name;
    this.age=s2.age;
}

}



public class oops1 {
    public static void main(String args[]){
    Pen pen1=new Pen();
    pen1.color="blue";
    pen1.type="ball";

    pen1.write();

    Pen pen2=new Pen();
    pen2.color="black";
    pen2.type="gel";

    pen1.printColor();
    pen2.printColor();

    //now doing for student class
    Student s1=new Student();
    s1.name="mayank";
    s1.age=19;
     s1.printInfo();


    Student s2=new Student(s1);


    s2.printInfo();



    
}
}

import java.util.Scanner;
public class second {
    public static void printJava(){
        System.out.println("hello java"); //so this public stat void is to not to print same again n again instead write once and call
    }
    

    public static void printName(String name){ //if u wanna take same typa input again n again thn can use this .
        System.out.println(name);
    }


    //so to take inut and print sum
    public static void printSum(int a,int b){
        int sum=a + b;
        System.out.println(sum);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        //methods
        printJava();
        printJava();
       
        printName("mayank");
        printName("ise");

        printSum(2,3);



        //mini project

        int myNumber=(int)(Math.random()*100);
        int userNumber=0; //should initialise this here only instead of doing in 38 line cuz ur using this in while so if u use this inside do gives u error

        do{
            System.out.println("guess my number(1-100)-"); //to take input added line at 20 and 1
            userNumber=sc.nextInt();
            if (userNumber == myNumber){
                System.out.println("correct");
            }
            else if(userNumber >myNumber){
                System.out.println("ur number is large");

            }
            else{
                System.out.println("tooo smalll");
            }
        }while(userNumber>=0);
        

            System.out.println("my number was");
            System.out.println(myNumber);
        //if u type -1 it should wht was its number 




        




    }
}

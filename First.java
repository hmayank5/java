 import java.util.Arrays;
 import java.util.Scanner;
 class First {
    public static void main(String args[]){      //String-s capital
        System.out.println("hello world");    //System-s caps.   and if u write just print in ot u dont get a line 
        System.out.println(); //if u type sout ull get full system.out.print shortvute method ths all





        // variables
        int age=30;
        String neighbour="gowda";
        String lol=neighbour;
        System.out.println(lol);



        //primitive types 
        //byte - 1 [-128 to 127]
        //short - 2 bytes of memory needed
        //int - 4
        //long - 8
        //float - 4
        //doublt - 8
        // char - 2
        // boolean -1 true/false
        
       /*  byte age=30;
        int phone=1234567890; //if u add one more digit it gives error cuz it cant store more digits instead use long
        long phone2=12345678900L;
        float pi=3.14F;
        char letter='a';
        boolean isAdult=true;
        */




        //non primitive
        String name="mayank";
        System.out.println(name.length());   //prints 6




        //Strings
        //concatenate
        String name1="mayank";
        String name2="tanmay";
        String name3=name1 + " and " + name2;
        System.out.println(name3);


        //charAt
         String name4="mayank";
         System.out.println(name4.charAt(0));  //to print the particular char this is used basically like slicing kida in this
         
         //length
          System.out.println(name4.length()); //not required to write in ()


          //replace
          String name5=name4.replace("m","s");
          System.out.println(name5);

          //sub string
          String name6 = "aman and akku";
          System.out.println(name6.substring(0,4));

          //array
          int age1=30;
          int phy=56;
          int chem=44;
          int maths=47;


        int []marks=new int[3]; //after int put [] to know tht this is an array in java.and new is added cuz array is non primptive
        marks[0]=97;
        marks[1]=93;
        marks[2]=67;
        System.out.println(marks[0]);

        //length
        System.out.println(marks.length); //not required to write in () cuz this is not a method


        //sort
        // above at staring line imported java.util.array package to run this class
        System.out.println(marks[0]); //prints 97 here cuz the marks was not sorted 
        Arrays.sort(marks);
        System.out.println(marks[0]); //prints 67 here cuz the marks was sorted .so gives in ascending order



        //1-d array
        int []marks1={97,93,67}; //if u know wht to store in array thn can use and like this also instead of using new keyword

        //2-d array
        int [][]marks2={{97,93},{67,87}};
        System.out.println(marks2[0][1]); //prints 93 here







        //casting
        //implicit casting
        double price=100.00;
        double finalprice=price+18; //here 18 is int but it is automatically converted to double so this is implicit casting
        System.out.println(finalprice);

        //explicit casting
        int p=100;
        int fp=p+(int)18.18; //here 18.18 is double but it is explicitly converted to int so this is explicit eg.should write tht(int)so tht it is converted to int
        System.out.println(fp);







       
       
        //constants
        int age8=30;
        age=31;
        age=32; //this is not constant variable so it can be changed but if u want to make it constant thn use final keywprd like below
        final int AGE=30; //this is final value of age ,if again type int age thn gives error






        //did operators



        //maths
        System.out.println(Math.max(5,10));//prints 10  same can use min // and math-M caps





        //how to take input?
        Scanner sc=new Scanner (System.in); //before tis shoud write import java.util.Scanner thn do this only thn wroks 
               //s -caps

        System.out.println("input your age");
        int age3=sc.nextInt(); //nextint() used to take integer input
        System.out.println(age3);


        System.out.println("input your name");
        String name8=sc.next(); //next() used to take string or char input.this only gives you first word in sentence if u want full sentence it shoud be necxtline()
        System.out.println(name8);

        //comparision operator like == !=
        //conditional statement like if else
        //logical operator like &&

        Scanner sc1=new Scanner(System.in);
        int cash=sc1.nextInt();
        if(cash<10){
            System.out.println("waste");
        }
        else if(cash>10 && cash<40){ //else space if
            System.out.println("okayish");
        }
        else{
            System.out.println("good");
        }

        //switch

        //loops
        for(int q=0;q<=7;q++)
        {
        System.out.println(q);
    }

    //while
    int z=10;
    while(z>=1){
        System.out.println(z);
        z=z-1;
    }



    //do while
    int k=10;
    do{
        System.out.println(k);
    }while(k>=1); //have to put semi colon here remember


    //just one project typa
    Scanner sc2=new Scanner(System.in);
    int number=0;    //should initilise int outside do while brackets
    do{
        System.out.println("input number");
        number=sc2.nextInt();
        System.out.println("your number");
        System.out.println(number);
    }while(number >=0);
    System.out.println("the end");



    





        





        













       
        
            
        
















    }
}

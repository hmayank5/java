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


        int []marks=new int[3];
        marks[0]=97;
        marks[1]=93;
        marks[2]=67;
        marks[3]=55;
        {
            
        }
















    }
}

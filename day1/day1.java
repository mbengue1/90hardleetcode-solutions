
import java.awt.font.NumericShaper;
import javax.swing.border.SoftBevelBorder;
import javax.swing.event.SwingPropertyChangeSupport;
import org.w3c.dom.NameList;


//set cl;ass name must match the file name
public class day1 {
    //set the puiblic static void boiler plate 
    public static void main(String[] args) {
        //sysout --? system.out.println --> ln prints a new line 

        System.out.println("Day 1 LeetCode solution");


        //varaibles
        int age = 21;
        double gpa = 4.0;
        boolean isGraduated = false;
        char Grade = 'A';
        String name = "Mike";

        //operators 
            /**
             * + - * / %
             * Relation 
             *          ==,  !=, >, <, >=, <= 
             * Logical 
             *          &&, ||, !
             * Assignments 
             *          = += -= *= /= %=
             */

        //controling states
        if (age > 18) {
            System.out.println("Adult");
        }else {
            System.out.println("Minor");
        }

        //Switch cases 
        switch(grade) {
            case 'A' : System.out.println("Excellent grade"); break;
            case 'B' : System.out.println("Medium 3.0 activities"); break;
            default : System.out.println("Needs improving");
        }

        //loopd 
        for(int i = 0; i < 5; i++) {
            System.out.print(i);
        }// will print the numbers 0-4 in total 5 numbers up to the print 

        //while loop
        int j = 0;
        while (j < 5) {
            System.out.println(j); // this will print j up to 4
        }

        //do while loop
        int k = 0;
        do {
            System.out.println(k);
            k++; //increase the count by 1

        } while(k < 5);


    }

    //funcitions test
    public static int add(int a, int b) {
        return a+b;
    }

    //classes and objects
    public class Dog {
        String name;
        int age;
        //constructer
        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public void bark() {
            System.out.println(name + "says wolf");
        }
        
    }
    // //creating an obkect 
    // Dog myDog = new Dog('Buddy', 3); //dog named buddy aged 3
    // myDog.bark();


    //inheritance 
    class Animal {
        void speak() {
            System.out.println("Animal Speaks");
        }
    }

    class Cat extends Animal {
        void speak() {
            System.out.println("Meow");
        }
    }
    
    //array
    int[] nums = new int[5];
    int[] vals = {1,2,3,4,5};

    System.out.println(nums.length); //get the elgnth
    nums[0] = 10; //chaange value of first number
    for (int num : nums) {
        System.out.println(num + " "); //prunt each number
    }


    //Stringgs
    String s = "leetcode";
    String t = new String("Hello");

    s.length(); // get length
    s.charAt(0); //get character at index
    s.substring(0,4); //substring leet
    s.indexOf('e'); //get the index of string e
    s.equals(t); //content equality betwen string s and string t
    s.toCharArray(); //convert to char array 
    String.valueOf(123); //int to string 

    //String Builder 
    StringBuilder sb = new StringBuilder("abc");
    sb.append("d");
    sb.insert(1, "X"); 

     

}

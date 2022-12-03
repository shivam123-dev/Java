// import java.util.Arrays;
// import.java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        // First program 
        // System.out.println("Hello World!");
        
        // Variables
        // String name = "Shivam";
        // int age = 20;
        // String copy_name;
        // copy_name = name;
        // System.out.print(name + copy_name + age);
        
        // Data Types
        // 1. Primitive
        // byte = 1 [-128 to 127]
        // short = 2  
        // int = 4  
        // long = 8
        // float = 4
        // double  = 8
        // char = 2
        // boolean = 1
        // Examples:
        // byte age = 30;
        // int phone = 1234567890;
        // long phone2 = 12345678900L;
        // float pi = 3.14F;
        // char letter = 'S';
        // boolean isAdult = true;
        // boolean isNotAdult = false;

        // 2. Non-Primitive
        // String name =  "Shivam";
        // System.out.println(name.length()); // prints the length of the string name

        // 3. New Keyword
        // String name1 = new String("aKKU");
        // String name2 = new String("Akku");
        // System.out.println(name1 + '\n' + name2);

        // String Operations

        // 1. concatenate
        
        // String name1 = "Shivam";
        // String name2 = "Singh";
        // String name3 = name1 + name2;
        // System.out.println(name3);
        // String name4 = name1 +  " " + name2;
        // System.out.println(name4);

        // 2. charAt

        // String name = "Shivam";
        // System.out.println(name.charAt(0));

        // 3. length

        // String name = "Shivam";
        // System.out.println(name.length());

        // 4. replace

        // String name = "Shivam";
        // String name1 = name.replace('a', 'b');
        // System.out.println(name1);
        // System.out.println(name);

        // In Java, strings are immutable means if we want to change the string then we need to create a new string and then we can create a different string

        // 5. substring

        // String name = "Shivam";
        // System.out.println(name.substring(0, 6)); // endIndex is not included

        // Arrays

        // int[] marks = new int[3];
        // marks[0] = 98;
        // marks[1] = 94;
        // marks[2] = 100;
        // System.out.println("Original array: ");
        // for(int i=0;i<marks.length;i++) {
        //     System.out.print(marks[i]+" ");
        // }
        // // System.out.println(marks.length);
        // System.out.println();
        // System.out.println("Sorted Array");
        // Arrays.sort(marks);
        // for(int i=0;i<marks.length;i++)
        //     System.out.print(marks[i] + " ");


        // int[] marks = {97, 95, 98};
        // int[][] finalMarks = {{95, 96, 95}, {99, 90, 89}};
        // System.out.println(finalMarks[0][0]);
        // System.out.println(finalMarks[1][1]);

        // Casting
        // Storing int values in double without the help of type casting
        // double price = 100.00;
        // double finalPrice = price + 18;
        // System.out.println(finalPrice);
        // Storing double values in int with the help of type casting
        // int p = 100;
        // int fp = p + (int)18.0;
        // System.out.println(fp);
        
        // Since, Double's capacity is 8 bytes and Int's capacity 
        // is 4 bytes, so Double is bigger than Int in terms of
        // size. Hence, we need to type cast the double's values
        // when we need to convert them into int

        // Also after type casting, only the values before decimal
        // are considered.

        // Constants

        // final float PI = 3.14F;
        // System.out.println(PI);    

        // Operators
        // 1. Arithmetic Operators
        // double a = 1;
        // double b = 2;
        // double sum = a+b;
        // double diff = a-b;
        // double mul = a*b;
        // double div = a/b;
        // double rem = a%b;
        // System.out.println(sum);
        // System.out.println(diff);
        // System.out.println(mul);
        // System.out.println(div);
        // System.out.println(rem);
        // double a = 5;
        // double b = 3;
        // double modulo = a % b;
        // System.out.println(modulo);

        // 2. Assignment Operators

        // Assignment Operators are of two types:-
        // 1. Increment Operator:- Increment Operator is of two types:-
        // a. Post Increment Operator:- Post Increment Operator is the operator which increases the value of a number after the execution of the current statement.
        // b. Pre Increment Operator:- Pre Increment Operator is the operator which firstly increases the value of a number i.e. before the execution of the current statement.
        // 2. Decrement Operator
        // Same types of Increment Operator applies to Decrement Operator i.e. Post Decrement Operator and Pre Decrement Operator


        // int numb = 1;
        // // numb++;
        // System.out.println(numb++); // 1
        // System.out.println(numb); // 2

        // Below are used in the case of if-else statements
        // 3. Logical Operators

        // AND operator (&&) -> Checks both conditions should be true.
        //  int a = 20, b = 40;
        // if(a < 50 && b < 50)
        //     System.out.println("Both less than 50");
        // else
        //     System.out.println("Both greater than 50");
        // OR operator (||) -> checks atleast one condition should be true.
        // if(a < 50 || b < 20)
        //     System.out.println("Atleast one less than 50");
        // NOT Operator(!)
        // boolean isAdult = true;
        // if(!isAdult)
        //     System.out.println("is adult");
        // else    
        //     System.out.println("not adult");

        // 4. Comparison Operators 
        // a == b
        // a != b
        // a < b
        // a > b
        // a <= b
        // a >= b
        // Conditional Statements are the statements that define a condition 
        // boolean isSunUp = false;
        // if(isSunUp == true)
        //     System.out.println("day");
        // else
        //     System.out.println("night");
        
        // a small example program
        // Scanner ac = new Scanner(System.in);
        // int cash = ac.nextInt();
        // // pen = 10, notebook 40
        // if(cash < 10)
        //     System.out.println("cannot get anything");
        // else if(cash > 10 && cash < 50)
        //     System.out.println("Can get 1 thing");
        // else
        //     System.out.println("Can get both");
        
        // int age = 2;
        // if(age >= 18)
        //     System.out.println("can vote");
        // else
        //     System.out.println("cannot vote");



        // Math Class

        // 1. Math.max() -> Returns the maximum of two elements
        // System.out.println(Math.max(2, 3));
        // 2. Math.min() -> Returns the minimum of two elements
        // System.out.println(Math.min(2, 3));
        // 3. Math.random() -> Returns the value between 0.0 to 1.0 by default in the long form
        // System.out.println(Math.random());
        // random values in int form
        // System.out.println((int)(Math.random()*100));

        // How to take input?

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your age: ");
        // int age = sc.nextInt();
        // System.out.println(age);
        // System.out.print("Enter your name: ");
        // String name = sc.next();
        // System.out.println(name);
        // sc.close();



        // Switch Statements
        // Switch statement takes an input and then checks for it on multiple inputs / cases

        // Scanner sc = new Scanner(System.in);
        // int day = sc.nextInt();
        // sc.close();
        // switch(day) {
        //     case 1: System.out.println("Sunday"); break;
        //     case 2: System.out.println("Monday"); break;
        //     case 3: System.out.println("Tuesday"); break;
        //     case 4: System.out.println("Wednesday"); break;
        //     case 5: System.out.println("Thursday"); break;
        //     case 6: System.out.println("Friday"); break;
        //     case 7: System.out.println("Saturday"); break;
        //     default: System.out.println("Invalid day");
        // }

        // Loops Concept
        // 1. For Loop
        
        // for(int i=1;i<=10;i++)
        //     System.out.print(i + " ");
        // System.out.println();
        
        // 2. While Loop
        
        // int i=1;
        // while(i <= 10) {
        //     System.out.print(i + " ");
        //     i++;
        // }
        // System.out.println();

        // 3. Do while Loop
        
        // int i=1;
        // do {
        //     System.out.print(i + " ");
        //     i++;
        // }while(i <= 10);
        // System.out.println();


        // Exception Handling
        // int[] age = {18, 13, 14};
        // try {
        //     System.out.println(age[5]);
        // } catch (Exception e) {
        //     // do something after catching
        // }
        // System.out.println("Shivam");

    }
}

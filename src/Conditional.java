import java.util.Scanner;
import  java.lang.*;


public class Conditional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st num");
        int a = scanner.nextInt();
        System.out.println("enter 1st num");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Maximum number");
        }else{
        System.out.println("not Maximum number");}
    }
}
class max{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st num");
        int a = scanner.nextInt();
        System.out.println("enter 2nd num");
        int b = scanner.nextInt();
        System.out.println("enter 3rd num");
        int c = scanner.nextInt();
        if (a > b && a>c) {
            System.out.println("Maximum number is a");
        }else if (b>a && b>c){
            System.out.println(" Maximum number is b");}
        else {
            System.out.println("maximum number is c");
    }
}
}
class  integer{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any num");
        int a = scanner.nextInt();
        if (a==0) {
            System.out.println(" number is zero");
        }else if (a>0){
            System.out.println("  number is positive");}
        else {
            System.out.println("number is negative");}
        }
    }
    class divisible{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter any num");
            int a = scanner.nextInt();
            if (a % 5 == 0 && a % 11 == 0) {
                System.out.println(" number is divisible by 5 and 11");
            } else {
                System.out.println("number is not divisible ");
            }
        }
    }
    class even{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter any num");
            int a = scanner.nextInt();
            if (a%2==0) {
                System.out.println(" number is even");
            }
            else {
                System.out.println("number is odd");}
        }
    }
    class leap{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter any num");
            int a = scanner.nextInt();
            if ((a % 400 == 0 )||(( a%100!=0 )&& (a%4==0))) {
                System.out.println(" leap year");
            } else {
                System.out.println("not leap year");
            }
        }
    }
class iso{
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three sides:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c)
                System.out.println("Equilateral Triangle");
            else if(a==b||b==c||c==a)
                System.out.println("Isoceles Traingle");
            else
                System.out.println("Scalene Triangle");
        }
        else
            System.out.println("Cant form any traingle");
    }
}
class Triaa{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the sides of triangle:");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        if((a+b>c)&&(b+c>a)&&(a+c>b)){
            System.out.println("It is valid triangle");
        }
        else{
            System.out.println("It is not valid triangle");
        }
    }
}
class Trianglee{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first traingle:");
        System.out.println("Enter second trinagle:");
        System.out.println("Enter third triangle:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int total=a+b+c;
        if(total==180){
            System.out.println("It is valid!!");
        }
        else{
            System.out.println("It is not valid!!");
        }
    }
}

//class Month{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the month number(1-12):");
//        int month=scanner.nextInt();
//        System.out.println("enter the year");
//        int year= scanner.nextInt();
//        if(month==1){
//            System.out.println("January ");
//        }
//        else if (month==2){
//
//        }if ((year % 400 == 0 )||(( year%100!=0 )&& (year%4==0))) {
//            System.out.println(" leap year");
//            System.out.println("February 28 days");
//        } else {
//            System.out.println("not leap year");
//        }
//        else if(month==3){
//            System.out.println("March 31 days");
//        }
//        else if(month==4){
//            System.out.println("April 30 days");
//        }
//        else if(month==5) {
//            System.out.println("May 31 days");
//        }
//        else if(month==6){
//            System.out.println("June 30 days");
//        }
//        else if(month==7){
//            System.out.println("July 31 days");
//        }
//        else if(month==8){
//            System.out.println("August 31 days");
//        }
//        else if(month==9){
//            System.out.println("September 30 days");
//        }
//        else if(month==10){
//            System.out.println("October 31 days");
//        }
//        else if(month==11){
//            System.out.println("November 30 days");
//        }
//        else if(month==13){
//            System.out.println("December 31 days");
//        }
//        else{
//            System.out.println("Invalid input!");
//        }
//    }
//}
class countnumberofnotes{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter your amount");
        int amount = myobj.nextInt();
        int note1000,note500, note100, note50, note20, note10, note5, note2, note1;
        note1000 = note500 = note100 = note50 = note20 = note10 = note5 = note2 = note1 = 0;
        if(amount >= 1000)
        {
            note1000 = amount/1000;
            amount -= note1000 * 1000;
        }
        if(amount >= 500)
        {
            note500 = amount/500;
            amount -= note500 * 500;
        }
        if(amount >= 100)
        {
            note100 = amount/100;
            amount -= note100 * 100;
        }
        if(amount >= 50)
        {
            note50 = amount/50;
            amount -= note50 * 50;
        }
        if(amount >= 20)
        {
            note20 = amount/20;
            amount -= note20 * 20;
        }
        if(amount >= 10)
        {
            note10 = amount/10;
            amount -= note10 * 10;
        }
        if(amount >= 5)
        {
            note5 = amount/5;
            amount -= note5 * 5;
        }
        if(amount >= 2)
        {
            note2 = amount /2;
            amount -= note2 * 2;
        }
        if(amount >= 1)
        {
            note1 = amount;
        }

        System.out.println("Total number of notes = \n");
        System.out.println("1000 = "+note1000+"\n");
        System.out.println("500 = "+note500+"\n");
        System.out.println("100 = "+note100+"\n");
        System.out.println("50 = "+note50+"\n");
        System.out.println("20 = "+note20+"\n");
        System.out.println("10 = "+note10+"\n");
        System.out.println("5 = "+note5+"\n");
        System.out.println("2 = "+note2+"\n");
        System.out.println("1 = "+note1+"\n");
    }
}

class quadratic{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
//        double f=0;
//        double S=0;
        double d= (b * b) - (4.0 * a * c);
        double sqrt=Math.sqrt((d));
        if (d> 0)
        {
            double r1 = (-b + sqrt) / (2* a);
            double r2 = (-b - sqrt) / (2 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if (d == 0)
        {
//            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + (-b)/(2*a));
        }
        else
        {
            System.out.println("Roots are not real.");
        }
    }
}





 class isAlphabet {
    public static void main(String[] args) {
        char ch;//Declare variable
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a character: ");
        ch = src.next().charAt(0); // initailize char

        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
            System.out.print(ch+" is an alphabet");
        }else{
            System.out.print(ch+" is not an alphabet");

        }
    }
}


 class profit{
     public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter selling price");
         double SP= scanner.nextDouble();
         System.out.println("Enter cost price");
         double CP= scanner.nextDouble();
         if (SP>CP){
             System.out.println("Profit");
         }else{
             System.out.println("Loss");
         }

     }
 }
 class grade {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter marks in physics");
         double phy = scanner.nextDouble();
         System.out.println("Enter marks in chemistry");
         double che = scanner.nextDouble();
         System.out.println("Enter marks in biology");
         double bio = scanner.nextDouble();
         System.out.println("Enter marks in math");
         double math = scanner.nextDouble();
         System.out.println("Enter marks in computer");
         double com = scanner.nextDouble();
         double per = ((phy + che + bio + math + com) * 100) / 5;
         if (per >= 90) {
             System.out.println("Grade A");
         } else if (per >= 80 && per <= 89) {
             System.out.println("Grade B");
         } else if (per >= 70 && per <= 79) {
             System.out.println("Grade C");
         } else if (per >= 60 && per <= 69) {
             System.out.println("Grade D");
         } else if (per >= 40 && per <= 49) {
             System.out.println("Grade F");
         }
     }
}
class Salar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the salary: ");
        int salary = scanner.nextInt();

        if(salary<=10000){
            System.out.println("HRA=20%\nDA=80%");
        }
        else if(salary<=20000){
            System.out.println("HRA=25%\nDA=90%");
        }
        else {
            System.out.println("HRA=30%\nDA=95%");
        }
    }
}
class Upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");

        char ch = sc.next().charAt(0);

        if((ch >= 'A') && (ch<='Z'))
        {
            System.out.println("It is an Uppercase character");
        }
        else if((ch >= 'a') && (ch<='z'))
        {
            System.out.println("It is an lowercase character");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
//class Alpha {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a character: ");
//        char s = scanner.next().charAt(0);
////check whether it is alphabet or not
//        if(Character.isAlphabetic(s)){
//            System.out.println("The number is a alphabet");
//        }
//
//        else{
//            System.out.println("It is not a alphabet");
//        }
//    }
//}
class Characterr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character.");
        String a;
        a = scanner.next();
        String v = "aeiou";
        if (v.contains(a)) {
            System.out.println("The number is a vowel.");
        } else {
            System.out.println("The number is a consonant");
        }}

}
class Units {
    public static void main(String[] args) {
        int units;
        double Amount, Sur_charge, Total_amount;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter electricity unit: ");
        units = scanner.nextInt();
        if (units <= 50) {
            Amount = units * 0.5;
            Sur_charge = 0.2 * Amount;
        } else if (units <= 150) {
            Amount = 25 + (units - 50) * 0.5;
            Sur_charge = 0.2 * Amount;
        } else if (units <= 250) {
            Amount = 25 + 75 + ((units - 150) * 0.5);
            Sur_charge = 0.2 * Amount;
        } else {
            Amount = 25 + 75 + 120 + ((units - 250) * 0.5);
            Sur_charge = 0.2 * Amount;
        }
        Total_amount = Sur_charge + Amount;
        System.out.println("total cost is" + Total_amount);
    }
}
class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int a = scanner.nextInt();
        switch (a) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("monday");
            case 3 -> System.out.println("tuesday");
            case 4 -> System.out.println("wednesday");
            case 5 -> System.out.println("thursday");
            case 6 -> System.out.println("friday");
            case 7 -> System.out.println("saturday");
            default -> System.out.println("invalid");
        }
    }
}
class evenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int a = scanner.nextInt();
        switch (a%2) {
            case 0:
                System.out.println("even num");
                break;
            case 1:
                System.out.println("odd number");
            break;

        }
    }
}
class  maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int a = scanner.nextInt();
        System.out.println("enter 2nd number");
        int b = scanner.nextInt();
        switch ((a<b)?0:(b<a)?1:2){
            case 0:
            System.out.println("b is maximum");
            break;
            case 1:
                System.out.println("b is mimimum");
                break;
        }
    }
}

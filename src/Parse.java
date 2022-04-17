import java.util.Scanner;

public class Parse {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Student name");
        String name = scanner.nextLine();
        System.out.println("Enter student ID");
        String ID= scanner.nextLine();
        System.out.println("Enter student class");
        String clss = scanner.nextLine();
        System.out.println("Enter Roll no");
        String Rollno =scanner.nextLine();
        Double a=Double.parseDouble(ID);
        Double b=Double.parseDouble(clss);
        Double c=Double.parseDouble(Rollno);
        System.out.println("Student name is:"+name);
        System.out.println("Student ID is:"+ID);
        System.out.println("Student class is:"+clss);
        System.out.println("Student Roll no is:"+Rollno);
    }
}
class sum{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter 1st num");
        String num1= scanner.nextLine();
        System.out.println("enter 2nd num");
        String num2= scanner.nextLine();
        System.out.println("enter 3rd num");
        String num3= scanner.nextLine();
        System.out.println("enter 4th num");
        String num4=scanner.nextLine();
        double a=Double.parseDouble(num1);
        double b=Double.parseDouble(num2);
        double c=Double.parseDouble(num3);
        double d= Double.parseDouble(num4);
        double sum=a+b+c+d;
        System.out.println("Sum is:"+sum);

    }
}
class Mark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks in math");
        String math = scanner.nextLine();
        System.out.println("Enter marks in Science");
        String Sci = scanner.nextLine();
        System.out.println("Enter marks in Social");
        String Soc = scanner.nextLine();
        System.out.println("Enter marks in English");
        String Eng = scanner.nextLine();
        double a = Double.parseDouble(math);
        double b = Double.parseDouble(Sci);
        double c = Double.parseDouble(Soc);
        double d = Double.parseDouble(Eng);
        double percent = (a + b + c + d) / 4;
        System.out.println(percent);
        String division = (percent >= 70) ? "First class" : percent > 59 && percent < 70 ? "upper second class" : percent > 49 && percent < 59 ? "second class" : percent > 39 && percent < 49 ? "third class" : "fail";
        System.out.println("total percentage:" + percent+"Division" + division);

    }
    }
    class product{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter 1st num");
            String num1 = scanner.nextLine();
            System.out.println("enter 2nd num");
            String num2 = scanner.nextLine();
        double a=Double.parseDouble(num1);
        double b=Double.parseDouble(num2);
        double sum =a+b;
        double product=a*b;
        System.out.println(sum);
        System.out.println(product);

        }
        }
class  division{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st num");
        String num1 = scanner.nextLine();
        System.out.println("enter 2nd num");
        String num2 = scanner.nextLine();
        double a=Double.parseDouble(num1);
        double b=Double.parseDouble(num2);
        double sum =a+b;
        double product=a*b;
        double divison=sum/product;
        System.out.println(sum);
        System.out.println(product);
        System.out.println(divison);
    }
}
class area{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter breadth in double datatye");
        System.out.println("enter height in double datatye");
        String num1= scanner.nextLine();
        String num2= scanner.nextLine();
        double b=Double.parseDouble(num1);
        double h=Double.parseDouble(num2);
        int area = (int) (b*h);
        System.out.println(area);
    }
}

class details{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your name");
        String name= scanner.nextLine();
        System.out.println("Enter your roll no");
        String rollno= scanner.nextLine();
        System.out.println("enter your field of interest");
        String interest= scanner.nextLine();
        int R=Integer.parseInt(rollno);
        System.out.println(" Hey,My name is"+name+".and MY roll no is"+R+".My interest of field is"+interest);
    }
}
class volume{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter principle");
        float p= scanner.nextFloat();
        System.out.println("enter rate");
        float r= scanner.nextFloat();
        System.out.println("enter time");
        float t= scanner.nextFloat();
        float SI=(p*t*r)/100;
        System.out.println("Simple interest is:"+SI);
        System.out.println("Enter base");
        float b=scanner.nextFloat();
        System.out.println("enter height");
        float h= scanner.nextFloat();
        float Area=b*h/2;
        System.out.println("Area of triangle is:"+Area);
        System.out.println("Enter length");
        float l= scanner.nextFloat();
        float volofcube=l*l*l;
        System.out.println("Volumn of cube is:"+volofcube);
        float volofcuboid=l*b*h;
        System.out.println("Volume of cuboid is:"+volofcuboid);
        float areaofsq=l*l;
        System.out.println("Area of square is:"+areaofsq);
        float perimeter=4*l;
        System.out.println("Perimeter of square is:" +perimeter);
    }
}
class  square{
    public static void main(String[] args) {
        double l;
l=Double.parseDouble("2");
double area=l*l;
System.out.println("Area of square is:"+area);
    }
}
 class string{
     public static void main(String[] args) {
        String a="code";
        String b="dope";
        System.out.println(a+b);

     }
 }
 class  ternary{
     public static void main(String[] args) {
         int a=2,b=4,c=4;
         String equal=(a == c) && (a == b)?"all are equal":(a==b)||(b==c)?"any two are equal":"";
         System.out.println(equal);
     }
 }
 class compare{
     public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter value of a");
         double a=scanner.nextDouble();
         System.out.println("Enter value of b");
         double b= scanner.nextDouble();
         System.out.println((a<50)&&(a<b));
     }
 }
 class marks{
     public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter marks in english");
         double Eng= scanner.nextDouble();
         System.out.println("Enter marks in social");
         double Soc= scanner.nextDouble();
         System.out.println("Enter marks in math");
         double Math= scanner.nextDouble();
         double total=Eng+Soc+Math;
         double Percent=(total*100)/3;
         System.out.println("Total marks of Robert:"+total+"\nTotal percentage of Robert :"+Percent);
     }
 }
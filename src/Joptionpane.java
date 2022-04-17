import javax.swing.*;
import javax.xml.crypto.dsig.spec.XPathFilterParameterSpec;

public class Joptionpane {

    public static void main(String[] args) {
        Float a,b,c,d,sum;
        a=Float.parseFloat(JOptionPane.showInputDialog(null, "First Integer"));
        b=Float.parseFloat(JOptionPane.showInputDialog(null, "second Integer"));
        c=Float.parseFloat(JOptionPane.showInputDialog(null, "third Integer"));
        d=Float.parseFloat(JOptionPane.showInputDialog(null, "fourth Integer"));
        sum=a+b+c+d;
        JOptionPane.showInputDialog(null,"the sum is"+sum);
    }
}
class Markss {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int math,sci,eng,soc,percent;
        math=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter marks in math"));
        sci=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter marks in science"));
        eng=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter marks in english"));
        soc=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter marks in social"));
         percent = (math + sci + eng + soc) / 4;
        JOptionPane.showInputDialog(null,"percentage is:"+percent);
        String division = (percent >= 70) ? "First class" : percent > 59 && percent < 70 ? "upper second class" : percent > 49 && percent < 59 ? "second class" : percent > 39 && percent < 49 ? "third class" : "fail";
        JOptionPane.showInputDialog(null,"total percentage:" + percent + "Division" + division);

    }
}
class add{
    public static void main(String[] args) {
        int a,b,sum,product;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1st num"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 2nd num"));
        sum=a+b;
        product=a*b;
        JOptionPane.showInputDialog(null,"sum is:"+sum);
        JOptionPane.showInputDialog(null,"product is:"+product);
    }
}
class div{
    public static void main(String[] args) {
        int a,b,sum,product,division;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1st num"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 2nd num"));
        sum=a+b;
        product=a*b;
        division=sum/product;
        JOptionPane.showInputDialog(null,"sum is:"+sum);
        JOptionPane.showInputDialog(null,"product is:"+product);
        JOptionPane.showInputDialog(null,"division  is:"+division);

    }

}
class Area{
    public static void main(String[] args) {
        double l,b,area;
        l=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter length"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter breadth"));
        area=l*b;
        JOptionPane.showInputDialog(null,"Area of rectangle is:"+area);

    }
}
//class interestt{
//    public static void main(String[] args)
//    {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter your name");
//        String name= scanner.nextLine();
//        System.out.println("Enter your roll no");
//        String rollno= scanner.nextLine();
//        System.out.println("enter your field of interest");
//        String interest= scanner.nextLine();
//        int R=Integer.parseInt(rollno);
//        JOptionPane.showInputDialog("My name is "+name+"and my roll no is"+R+"My field of interest is"+interest);System.exit(0);
//
//    }
//}
class sq {
    public static void main(String[] args) {
        float l,p,t,r,b,h,areaofsq,SI,perimeter,volofcube,volofcuboid,areaoftri;
        l=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter length"));
        b=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter breadth"));
        h=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter height"));
        t=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter time"));
        r=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter rate"));
        p=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter principal"));
        areaofsq=l*l;
        perimeter=4*l;
        SI=(p*t*r)/100;
        volofcube=l*l*l;
        volofcuboid=l*b*h;
        areaoftri=(b*h)/2;
        JOptionPane.showInputDialog(null,"Area of square is:"+areaofsq);
        JOptionPane.showInputDialog(null,"perimeter of square is:"+perimeter);
        JOptionPane.showInputDialog(null,"simple interest is:"+SI);
        JOptionPane.showInputDialog(null,"volume of cube is:"+volofcube);
        JOptionPane.showInputDialog(null,"volume of cuboid is:" + volofcuboid);
        JOptionPane.showInputDialog(null,"area of traingle is:"+areaoftri);
    }
}
class Sqr {
    public static void main(String[] args) {
        float num,square;
        num=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the number in square:"));
        square=num*num;
        JOptionPane.showMessageDialog(null,"The square of num "+square);
    }
}
class Std{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"Enter your name: ");
        String batch_no = JOptionPane.showInputDialog(null,"Enter you batch number: ");
        String address = JOptionPane.showInputDialog(null,"Enter your address: ");
        JOptionPane.showMessageDialog(null,"Name: "+name+"\nBatch no: "+batch_no+"\nAddress: "+address);

    }
}
class Str{
    public static void main(String[] args) {
        String a=JOptionPane.showInputDialog(null,"Enter code");
        String b=JOptionPane.showInputDialog(null,"Enter Dope ");
        JOptionPane.showInputDialog(null,a+b);
    }
}
class  vbl{
    public static void main(String[] args) {
       int a,b;
       a=Integer.parseInt(JOptionPane.showInputDialog(null,"enter variable a"));
       b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter variable b"));
       JOptionPane.showInputDialog(null,(a<50)&&(a<b));
    }
}
class  input{
    public static void main(String[] args) {
        int a,b,c;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"enter variable a"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter variable b"));
        c=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter variable c"));
        String equal=(a == c) && (a == b)?"all are equal":(a==b)||(b==c)?"any two are equal":"";
        JOptionPane.showInputDialog(null,equal);
    }
}
class  sub{
    public static void main(String[] args) {
        int a,b,c,tot,per;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"enter marks in math"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter marks in science"));
        c=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter marks in social"));
        tot=a+b+c;
        per=(tot*100)/3;
        JOptionPane.showInputDialog(null,"Total marks :"+tot);
        JOptionPane.showInputDialog(null,"Total percentage :"+per);
    }
}
package asgn2;
import java.sql.SQLOutput;
import java.util.*;

class Rectangle{
    float l,b;
    void inputdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        l = sc.nextFloat();
        System.out.println("enter breadth");
        b = sc.nextFloat();
    }
    float calculateArea(){
        return l*b;
    }
    float calculatePerimeter(){
        return 2*(l+b);
    }
    void outputdate(){
        System.out.println("area: "+calculateArea());
        System.out.println("perimeter: "+ calculatePerimeter());
    }
}

public class oops_6 {
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.inputdata();
        r.outputdate();
    }
}

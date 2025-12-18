import java.util.*;

interface figure{
    double get_area(double x , double y);
}

class rectangle implements figure {
    public double get_area(double d1, double d2){
        return d1*d2;
    }
}

class triangle implements figure{
    public double get_area(double d1, double d2){
        double v = 0.5 * d1 * d2;
        return v;
    }
}

class inter__face{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length & breadth of a rectangle: ");
        double l=sc.nextDouble();
        double w=sc.nextDouble();
        figure ref;
        ref = new rectangle();
        System.out.println(ref.get_area(l,w));

        System.out.println("Enter base and height of a Triangle: ");
        l=sc.nextDouble();
        w=sc.nextDouble();
        ref = new triangle();
        System.out.println(ref.get_area(l,w));

    }
}

package asgn3;

import java.util.*;

interface figure{
    int getArea();
}

class rectangular implements figure{
    int l, b;
    rectangular(int len, int brd){
        l=len;
        b=brd;
    }

    @Override
    public int getArea(){
        return l*b;
    }
}

class triangle implements figure{
    int h,b;
    triangle(int a,int c){
        h=a;
        b=c;
    }

    @Override
    public int getArea() {
        return (b*h/2);
    }
}


public class runtime_poly {
    public static void main(String[] args){
        figure f;
        f = new rectangular(4,2);
        System.out.println("the area of rectangular: "+ f.getArea());
        f = new triangle(6,3);
        System.out.println("The area of triangle: "+f.getArea());

    }
}

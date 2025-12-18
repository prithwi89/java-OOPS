interface  drawable{
    void draw();
}

class rectangular implements drawable{
    public void draw (){
        System.out.println("Drawing rectangle");
    }
}

class circle implements drawable{
    public void draw(){
        System.out.println("Drawing a circle");
    }
}

public class interface2 {
    public static void main(String[] args){
        drawable d = new rectangular();
        d.draw();
        drawable d1 = new circle();
        d1.draw();
    }
}

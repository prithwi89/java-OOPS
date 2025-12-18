package interface_lern;

interface drawable{
    void draw();
    default void msg(){
        System.out.println("default method");
    }
}

class rectangular implements drawable{
    public void draw(){
        System.out.println("drawing rectangular");
    }
}

class default_Method_interface {
    public static void main(String[] args){
        drawable d=new rectangular() ;
            d.draw();
            d.msg();


    }
}

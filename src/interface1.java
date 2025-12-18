interface printable{
    void print();
}

public class interface1 implements printable {
    public void print(){
        System.out.println("bhi bhlo lg6e na java korte");
    }
    public static void main(String[] args){
        interface1 sc= new interface1();
        sc.print();

    }
}

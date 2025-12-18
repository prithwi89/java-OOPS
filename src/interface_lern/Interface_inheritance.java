package interface_lern;

interface prin_table{
    void print();
}
interface show_able extends prin_table{
    void show();
}

public class Interface_inheritance implements showable {
    public void print(){
        System.out.println("hello, bhi");
    }
    public void show(){
        System.out.println("show me bhi ur skills");
    }
    public  static void main(String[] args){
        Interface_inheritance obj = new Interface_inheritance();
        obj.print();
        obj.show();
    }
}

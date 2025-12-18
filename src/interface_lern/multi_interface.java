package interface_lern;

interface printable{
    void print();
}
interface  showable{
    void show();
}

class multi_interface implements printable, showable{
    public void print(){
        System.out.println("helelo");
    }
    public  void show(){
        System.out.println("show more ");
    }
    public  static void main(String[] args){
        multi_interface sc = new multi_interface();
        sc.print();
        sc.show();
    }
}

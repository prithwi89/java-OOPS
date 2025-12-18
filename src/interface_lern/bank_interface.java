package interface_lern;

interface bank{
    float rateOfinterest();
}
class SBI implements bank{
    public float rateOfinterest(){ return 9.69f;}
}

class PNB implements bank{
    public float rateOfinterest(){return 5.99f;}
}
public class bank_interface {
    public  static void main(String[] args){
        bank b = new PNB();
        System.out.println("The rate of interestis : " +b.rateOfinterest());
    }
}

package asgn2;
import java.util.*;
class employee{
    int pan;
    String name;
    double taxincome;
    double tax;
    void input(int pan,String name,double taxincome){
        this.pan=pan;
        this.name=name;
        this.taxincome=taxincome;
    }

    void cal(){
        if (this.taxincome<=250000){
            this.tax=0;
        }
        else if (this.taxincome>250000 && this.taxincome<=500000) {
            this.tax=(0.1*(this.taxincome-250000));
        }
        else if (this.taxincome>500000 && this.taxincome<=1000000) {
            this.tax=30000+(0.2*(this.taxincome-500000));
        }
        else {
            this.tax=500000+(0.3*(this.taxincome-1000000));
        }
    }

    void display(){
        System.out.println("Pan: "+pan);
        System.out.println("Name: "+name);
        System.out.println("tax: "+tax);
    }

}
public class oops_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the pin: ");
        int pin= sc.nextInt();
        System.out.println("Enter the income: ");
        double income = sc.nextDouble();

        employee emp = new employee();
        emp.input(pin,name,income);
        emp.cal();
        emp.display();

        sc.close();
    }


}

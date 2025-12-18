package asgn2;
import java.util.*;

class tele{
    int prv,pre,call;
    String name;
    double amt,total;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the customer: ");
        name=sc.nextLine();
        System.out.println("Enter previous meter reading: ");
        prv= sc.nextInt();
        System.out.println("Enter present meter reading: ");
        pre= sc.nextInt();
    }

    void cal(){
        call = pre-prv;
        if (call<=100){
            amt= 0;
        }
        else if (call<=200) {
            amt= (call-100)*0.90;
        }
        else if (call<=400) {
            amt= (100*0.90)+(call-200)*0.80;
        }
        else {
            amt=(100*0.90)+(200*0.80)+(call-400)*0.70;
        }
        total = 180+amt;
    }

    void display(){
        System.out.println("customer name: "+name);
        System.out.println("calls made: "+call);
        System.out.println();
    }
}

public class oops_9 {

}

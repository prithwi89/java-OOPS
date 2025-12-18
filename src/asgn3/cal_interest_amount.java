package asgn3;

import java.util.Scanner;

class account{
    int acno;
    float balance;
    account(int a, float b){
        acno=a;
        balance=b;
    }
    void withdraw(int w){
        balance=balance-w;
    }
    void deposit(int d){
        balance=balance+d;
    }
}

class calculate extends account{
    int r,t;
    float si,amt;
    calculate(int a, float b){
        super(a,b);
    }
    void accept(int x, int y){
        r=x;
        t=y;
        amt=0;
    }
    void compute(){
        si = (balance*r*t)/100;
        amt=amt+si;
    }
    void display(){
        System.out.println("Account number:"+acno);
        System.out.println("Balance: "+balance);
        System.out.println("Interest: "+si);
        System.out.println("Amount: "+amt);
    }
}

public class cal_interest_amount {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the acc no: ");
        int a=sc.nextInt();
        System.out.println("enter balance: ");
        float b=sc.nextFloat();
        calculate cl = new calculate(a,b);
        System.out.println("Enter the rate of interest: ");
        int x= sc.nextInt();
        System.out.println("Enter the time: ");
        int y=sc.nextInt();
        cl.accept(x,y);
        cl.compute();
        cl.display();
        sc.close();
    }
}

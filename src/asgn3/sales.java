package asgn3;

import java.util.Scanner;

class sale {
    String title, author, publication;
    double price;
    void input(String t,String a, String p, double pr ){
        title=t;
        author=a;
        publication=p;
        price=pr;
    }
    void display(){
        System.out.println("title: "+title);
        System.out.println("author: "+author);
        System.out.println("publication: "+publication);
        System.out.println("price of a book: "+price);
    }
}

class Purchase extends sale{
    int noc,amount;

    void accept(int n){
        noc=n;
    }
    void cal(){

        amount=noc*(int)price;
    }
    void show(){
        super.display();
        System.out.println("the number of copies: "+noc);
        System.out.println("amount: "+amount);
    }
}
public class sales {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the title: ");
        String title = sc.nextLine();
        System.out.println("Enter the author: ");
        String author =sc.nextLine();
        System.out.println("Enter the publication: ");
        String publication = sc.nextLine();
        System.out.println("Enter the price: ");
        double price = sc.nextDouble();
        Purchase p = new Purchase();
        p.input(title,author,publication,price);
        System.out.println("Enter the noc for purchase: ");
        int n = sc.nextInt();
        p.accept(n);
        p.cal();
        p.show();
        sc.close();
    }
}
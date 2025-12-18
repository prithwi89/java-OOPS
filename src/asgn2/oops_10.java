package asgn2;
import java.util.*;
class unqid{
    static int uid=0;
    static int gen_id(){
        uid+=2;
        return  uid;
    }
}
public class oops_10 {
    public static void main(String[] args){
        int a=unqid.gen_id();
        System.out.println(a);
    }


}

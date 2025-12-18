class myemp{
    private int id;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String n){
        name=n;
    }

    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}

public class modifiers_setter_getters {

    public static void main(String[] args) {
        myemp p = new myemp();
        //p.id=10;
        //p.name="Prithwiraj";
        p.setName("hello, universe");
        System.out.println(p.getName());
        p.setId(9);
        System.out.println(p.getId());

    }
}

package zad_4;

class nauczyciel{
    private int id;
    private String name;
    private int age;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

public class zad_4_privejt {
    public static void main(String[] args) {
        nauczyciel J=new nauczyciel();
        J.setId(12);
        J.setName("Janusz");
        J.setAge(46);
        System.out.println(J.getId()+ " "+J.getName()+" "+J.getAge());
    }
}

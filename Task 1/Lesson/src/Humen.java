public class Humen {
    String name;
    String gender;
    int age;
    public Humen(){

    }
    public Humen(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Humen(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;


    }
    public void walk(int stepCount){
        System.out.println(name + "прошел "+ stepCount + " шагов ");;;
    }
}

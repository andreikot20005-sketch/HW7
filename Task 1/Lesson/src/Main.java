public class Main {
    public static void main(String[] args){
Humen vasya = new Humen(" Вася",34);
vasya.walk(10);

System.out.println(" Имя " + vasya.name + " Возраст " + vasya.age + " Пол "+ vasya.gender);
Humen petya = new Humen("Петя", "w", 54);
petya.walk(32);
        System.out.println(" Имя " + petya.name + " Возраст " + petya.age + " Пол "+ petya.gender);
    }
}

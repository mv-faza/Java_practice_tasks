public class Person{
    String name;
    int age;

}
class  ClasesAndObjects{
    public static void main(String[] args){
        Person person1=new Person();
        person1.name="Fazliddin Musaev";
        person1.age=20;

        Person person2=new Person();
        person2.name="Dean Dean";
        person2.age=20;
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person2.name);
        System.out.println(person2.age);

    }


}


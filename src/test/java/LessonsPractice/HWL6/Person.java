package LessonsPractice.HWL6;

public class Person {
    String fullName;
    int age;

    public void move(){
        System.out.println(fullName +" moving");
    }

    public void talk(){
        System.out.println(fullName +" talking");
    }
    public Person(){

    }
    public Person(String fullName,int age){
        this.fullName=fullName;
        this.age=age;
    }

    public static void main(String[] args) {
        Person person1=new Person();
        person1.fullName="Ivan_Mazepa";
        person1.age=383;
        Person person2=new Person("Bohdan_Hmelnytskyi",426);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();

    }

}

package LessonsPractice.HWL6;

public class Phone {
    long number;
    String model;
    int weight;

    public void reciveCall(String name){
        System.out.println(name +" is Calling");
    }
    public static long getNumber(long number){
        return number;
    }
    public Phone(long number,String model,int weight){
        this.number=number;
        this.model=model;
        this.weight=weight;
    }
    public Phone(long number,String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(){

    }



    public static void main(String[] args) {

        Phone phone1=new Phone();
        phone1.number=380639379992l;
        phone1.model="Meizu";
        phone1.weight=300;

        Phone phone2=new Phone();
        phone2.number=380632278548l;
        phone2.model="Samsung";
        phone2.weight=200;

        Phone phone3=new Phone();
        phone3.number=380634458245l;
        phone3.model="Iphone";
        phone3.weight=250;

        System.out.println("Phone1: number: "+phone1.number +", model: "+phone1.model+", weight: "+phone1.weight);
        System.out.println("Phone2: number: "+phone2.number +", model: "+phone2.model+", weight: "+phone2.weight);
        System.out.println("Phone3: number: "+phone3.number +", model: "+phone3.model+", weight: "+phone3.weight);

        phone1.reciveCall("Max");
        phone2.reciveCall("Roma");
        phone3.reciveCall("Gleb");



    }


}
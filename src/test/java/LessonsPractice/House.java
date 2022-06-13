package LessonsPractice;

public class House {
    double square;
    int quantityOfWindows;
    String color;

    public  void getElectricity(){
        System.out.println("you electricity provided by cyivOblEnergo");
    }
    static int count;

    public House(double square, int quantityOfWindows, String color){
        this.square=square;
        this.quantityOfWindows=quantityOfWindows;
        this.color=color;

    }

    public static void main(String[] args) {
        House Brvr=new House(60,10,"red");
        House Vld=new House(60,10,"blue");

        System.out.println("color brovary house: "+Brvr.color);
        System.out.println("color Volodymyr house: "+Vld.color);


    }
}

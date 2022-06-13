package LessonsPractice.HWL6;

public class ReaderBook {
    String fullName;
    int numberOfTicket;
    long phoneNumber;

    public void takeBooks(int takeBook,int haveBook){
        System.out.println("Reader "+fullName+" took today "+takeBook+" books. In jeneral reader have "+(haveBook+takeBook)+" books.");
        if((haveBook+takeBook)>5){
            System.out.println("Limit exceeded. The amount of the fine is: "+((haveBook+takeBook-5)*50));
        } else if((haveBook+takeBook)<=5){
            System.out.println("Limit not exceeded");
        }

    }
    public void returnBooks(int haveBooks,int returnBooks){
        System.out.println("Reader "+fullName+" returned today "+returnBooks+" books. In jeneral reader have "+(haveBooks-returnBooks)+" books.");
        if((haveBooks-returnBooks)>5){
            System.out.println("Penalty for the previous period of exceeding the limit is:" + (haveBooks-5)*50 +
                    ". Penalty for the current period: "+ (haveBooks-returnBooks-5)*50+". Total penalty is: "+((haveBooks-5)*50+(haveBooks-returnBooks-5)*50)) ;

        } else if (haveBooks>5){
            System.out.println("Penalty for the previous period of exceeding the limit is:" + (haveBooks-5)*50);
        }else if(haveBooks<=5){
            System.out.println("Limit not exceeded");
        }

    }

    public static void main(String[] args) {
        ReaderBook reader1=new ReaderBook();
        reader1.takeBooks(4,2);
        reader1.returnBooks(6,4);
    }

}
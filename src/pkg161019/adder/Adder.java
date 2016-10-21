
package pkg161019.adder;

public class Adder {
    public static void main(String[] args) {
        int score,num=0,total=0;
        
        do{
            Add add1=new Add();
            score=add1.back1();
            num=add1.back2();
            total+=score;
        }while(num!=999);
        System.out.println("Your score is "+total);
    }
    
}

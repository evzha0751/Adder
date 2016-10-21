package pkg161019.adder;
import java.util.*;

public class Add {
    private int num1,num2,answer1,answer2,tries=1,score;
    Scanner input=new Scanner(System.in);
    
    /**
     * Do the math for the player and get the score player gets
     * pre: none
     * post: the score of player get in that math question
     */
    public Add(){
        num1=(int)(Math.random()*20+1);
        num2=(int)(Math.random()*20+1);
        answer1=num1+num2;
        
        do{
            System.out.print(num1+" + "+num2+" = ");
            answer2=input.nextInt();
            
            if(answer1==answer2){
                if(tries==1){
                    score=5;
                }else if(tries==2){
                    score=3;
                }else if(tries==3){
                    score=1;
                }
            }
            if(answer1!=answer2){
                if(answer2==999){
                    break;
                }
               if(tries<=3){ 
                System.out.println("Wrong answer, try again:");
                tries+=1;
               }else{
                System.out.println("The true answer is "+answer1);
                }
            }
        }while(answer1!=answer2);
    }
    
    /**
     * Return the value of score
     * pre: none
     * post: return the score to add the the total
     */
    public int back1(){
        return(score);
    }
    
    /**
     * Return the value of answer2
     * pre: none
     * post: return the answer2 that if it is equal to 999
     * then end the program.
     */
    public int back2(){
        return(answer2);
    }
}

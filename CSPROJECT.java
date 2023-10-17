package Quarter1;
import java.util.*;
public class CSPROJECT {
    public static void main (String[]args){
        System.out.println("▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄");
        System.out.println("WELCOME TO TRILANDIA!");
        System.out.println("[1] automations \n[2] game \n[0] exit");
        
        Scanner response= new Scanner(System.in);
        System.out.print("Enter choice: ");
       
        int choice=response.nextInt();
        switch(choice){
            case 1:
                int i=0;
                while (i!=3) {
                    System.out.println("Trex or Flop");
                    System.out.println("Surprise quiz! Provided 3 sides, determine if they are possible side lengths of a triangle");
                    System.out.println("Write 'Trex' for TRUE and 'Flop' for FALSE");
                    int c=response.nextInt();
                    i=c;
                    
                    if (c==1){
                        
                    }
                    else if(c==2){
                        
                    }
                }
                break;
             
              
                
              
        }
    }
}

import java.util.Scanner;

public class RunQuad {
    public static void main(String[]args){
        
       Scanner input = new Scanner(System.in);
        
       System.out.println("Press R for Rectangle or S for Square.");
       String choice = input.nextLine();
       
       if(choice.equalsIgnoreCase("R")){
           Rectangle r = new Rectangle();
           System.out.println("A Rectangle");
           r.showDescription();
       }else if (choice.equalsIgnoreCase("S")){
           Square s = new Square();
           System.out.println("A Square");
           s.showDescription();
       }else{
           System.out.println("Invalid input, Please Type R or S.");
       }
    }
}

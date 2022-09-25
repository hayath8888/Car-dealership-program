import java.util.Scanner;

import javax.sound.midi.SysexMessage;
public class dealership{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to java dealership");
        System.out.println("\n-> enter 'a' to buy a car");
        System.out.println("-> enter 'b' to sell a car");
        String option =sc.nextLine();
        switch(option){
           case "a": System.out.println("\nwhat is your budget");
                     int budget= sc.nextInt();
                     if(budget>=10000){
                        System.out.println("\nyes, Maruthi Suzuki is available");
                        System.out.println("\ndo you have insurence sir? write 'yes' or 'no'.");
                        sc.nextLine();
                        String insurence=sc.nextLine();
                        System.out.println("\n do you have lisence sir? write 'yes' or 'no");
                        String lisence=sc.nextLine();
                        System.out.println("\nwhat is your credit score?");
                        int credit=sc.nextInt();
                        if(insurence.equals("yes") && lisence.equals("yes") && credit>=660){
                            System.out.println("\n Sold, Pleasure doing business with you");
                        }
                        else{
                            System.out.println("\nwe're sorry, you are not eligible");
                        }
                    }
                     else{
                        System.out.println("\nSorry sir, we don't have car under 10000");
                     }
                     break;
           case "b": System.out.println("\n what you car valued at?");
                    int value=sc.nextInt();
                    System.out.println("\nwhat is your selling price?");
                    int sell=sc.nextInt();
                    if(value>sell && sell<30000){
                        System.out.println("\nwe will buy your car, Pleasure doing business with you.");

                    } 
                    else{
                        System.out.println("\nSorry we are not interested.");
                    }
                    break;
           default:System.out.println("enter valid option");
        }

    }
        
}

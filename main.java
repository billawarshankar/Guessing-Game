import java.util.Scanner;
public class Main {
  
}
   public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
       int number = (int)(Math.random()*10);
       int user = 0;
       do{
           System.out.println("guess the number");
            user= sc.nextInt();

           if(user == number){
               System.out.println("you say correct");
               break;
           } else if (user> number) {
               System.out.println("your number is large");
               
           }
           else{
               System.out.println("your number is small");
           }
       }while (user >=0);
       System.out.println("my number is: ");
       System.out.println(number);


   }

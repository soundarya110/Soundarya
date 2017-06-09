import java.util.Scanner;
class positivenegativeorzero{
      public static void main(String[] args){
             int number;
             Scanner sc=new Scanner(System.in);
             number=sc.nextInt();
             if (number==0){
                        System.out.println("The given number is zero");
                           }
             else if(number>0){
                         System.out.println("The given number is positive");
                           }  
             else{
                System.out.println("The given number is negative");
                           } 
                   }
             }
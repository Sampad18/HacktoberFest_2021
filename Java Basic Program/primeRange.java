import java.util.Scanner;


public class primeRange {

    public static void main(String[] args) {
     
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the begining of the range.- ");
        int r1=sc.nextInt();
        System.out.println("Enter the end of the range.- ");
        int r2=sc.nextInt();
        for(int i = r1; i <= r2; i++){
             for(int j = 2; j < i; j++){
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
             if(flag == 1)
             {
                 System.out.println(i);
             }
         }
        sc.close();
    }
    
}
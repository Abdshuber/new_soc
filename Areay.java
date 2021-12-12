
package tester;
import java.util.Scanner;
public class Areay {
    public static void main(String[] args) {
        Scanner ee=new Scanner (System.in);
         int size;
          System.out.println( " Enter The Size  Of Aray = ");
           size =ee.nextInt();
      double [ ]number=new double[ size ];
 
   for(int i=0;i<number.length;i++)
{
    System.out.println("Enter The umber  number  of waive =  " + (i+1 ));
    number[i]=ee.nextInt();
}
  int sum=0;
for(int i =0;i<number.length;i++) 
{
    if(number[i]>0);
    sum+=number[i];
  int count = 0;
    count++;
}
System.out.println("The Sum of Waive  Is" +sum);      
System.out.println("The Avarege of the Wives  "+sum/number.length);
    
      
    }
    
}

import java.util.*;
public class Factorial{
public static void main(String args[]){
Scanner scan=new Scanner(System.in); 
System.out.println("Enter a numbers");
int a=scan.nextInt();
int fact=1;
for(int i=1;i<=a;i++)
{
fact=fact*i;
}
System.out.println("Factorial opf the number  is:"+fact);
}
}
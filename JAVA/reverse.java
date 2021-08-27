import java.util.*;
class reverse{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n,rev=0,rem=0;
System.out.print("enter num:");
n= sc.nextInt();
while(n>0)
{
rem=n%10;
rev=(rev*10)+rem;
n=n/10;
}
System.out.println("reverse is:"+rev);
}}


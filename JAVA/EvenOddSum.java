import java .util.*;

public class EvenOddSum{
public static void main(String s[] )
{
int n,oddsum=0,evensum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number in array: ");
n=sc.nextInt();
int  a[]=new int[n];
if(n<0){
System.out.println("Invalid array size");
System.exit(0);
}else{

System.out.println("Enter elements ");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
if (a[i]<0)
{
System.out.println("Invalid input");
System.exit(0);
}

}

for(int i=0;i<n;i++){
if(a[i]%2==0)
{
evensum=evensum+a[i];
}
else
{
oddsum=oddsum+a[i];
}
}
System.out.println("Sum of even number:"+evensum);
System.out.println("Sum of odd number:"+oddsum);
}

if(evensum>oddsum)
{
System.out.println("Sum of evensum is : "+evensum);
}
else{
System.out.println("Sum of oddsum is : "+oddsum);
}
}
}
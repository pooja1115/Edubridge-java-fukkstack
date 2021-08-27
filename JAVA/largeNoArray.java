import java.util.*;
class largeNoArray{
public static void main(String s[])
{
int n;

int a[]=new int[5];
Scanner sc = new Scanner(System.in);
System.out.print("Enter the elements :");
for(int i=0;i<5;i++){
a[i]=sc.nextInt();
}
int large=a[0];

 for(int i=0;i<5;i++)
{
if(a[i]>large)

large=a[i];
}
System.out.print(large+ " is largest element");
}
}

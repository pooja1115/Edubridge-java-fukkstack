import java.util.*;
class smallNoArray{
public static void main(String s[])
{
int n;

int a[]=new int[5];
Scanner sc = new Scanner(System.in);
System.out.print("Enter the elements :");
for(int i=0;i<5;i++){
a[i]=sc.nextInt();
}
int small=a[0];

 for(int i=0;i<5;i++)
{
if(a[i]<small)

small=a[i];
}
System.out.print(small+ " is smallest element");
}
}

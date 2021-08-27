import java .util.*;

public class AddsubMat{
public static void main(String s[] )
{
int a[][]=new int[2][2];
int b[][]=new int[2][2];
int c[][]=new int[2][2];
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 array elements :");
for( i=0;i<2;i++)
{
for( j=0;j<2;j++)
{
 a[i][j]=sc.nextInt();
}
System.out.println("\n");
}

System.out.println("Enter 2 array elements :");
for( i=0;i<2;i++)
{
for( j=0;j<2;j++)
{
 b[i][j]=sc.nextInt();
}
System.out.println("\n");
}

System.out.println("addition of two matrix :");
for( i=0;i<2;i++)
{
for( j=0;j<2;j++)
{
 c[i][j]=a[i][j]+b[i][j];
System.out.println(c[i][j]+" \n");
}
}

}
}
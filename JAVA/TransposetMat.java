import java .util.*;

public class TransposetMat{
public static void main(String s[] )
{

int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter row and col elements :");
int row =sc.nextInt();
int col =sc.nextInt();
int a[][] = new int[row][col];
System.out.println("Enter matrix: ");
for( i=0;i<row;i++)
{
for( j=0;j<col;j++)
{
 a[i][j]=sc.nextInt();
System.out.println(" ");
}

}

System.out.println("Abovr matrix befor transpose is : ");
for( i=0;i<row;i++)
{
for( j=0;j<col;j++)
{
System.out.println(a[i][j]+"");
}
System.out.println("\n");
}

System.out.println("Abovr matrix after transpose is : ");
for( i=0;i<row;i++)
{
for( j=0;j<col;j++)
{
System.out.println(a[j][i]+"");

}
System.out.println(" ");
}


}
}
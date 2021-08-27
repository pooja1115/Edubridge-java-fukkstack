import java .util.*;

public class RowColSum{
public static void main(String s[] )
{
int a[][]={{1,2,3,4},{1,2,31,4},{11,32,3,4},{18,2,3,4}};

int rowsum=0,colsum=0;

System.out.println("row sum: ");
for(int i=0;i<4;i++)
{
 rowsum=0;
for(int j=0;j<4;j++)
{
rowsum = rowsum+a[i][j];
}
System.out.println("row sum is: \n" +rowsum);
}


System.out.println("columnsum \n");
for(int i=0;i<4;i++)
{
colsum=0;
for(int j=0;j<4;j++)
{
colsum=colsum+a[j][i];
}
System.out.println("columnsum is:  "  +colsum);
}
}
}
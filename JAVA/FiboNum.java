import java .util.*;

public class FiboNum{
public static void main(String[] args)
{
int a=1,b=1,c,i=1,n=10;

while(i<n)
{
c=a+b;
System.out.print("");
System.out.println(c);
a=b;
b=c;
i++;

}}}
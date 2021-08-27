import java.util.*;
class delarray{
public static void main(String s[])
{
int arr[]=new int[5];
int loc;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the elements :");
for(int i=0;i<5;i++){
arr[i]=sc.nextInt();
}

System.out.print("elements are:  \n");
for(int i=0;i<5;i++){
System.out.print(arr[i]+",");
}

System.out.print("\nEnter location u want to delete:\n");
loc=sc.nextInt();

for(int i=loc;i<4;i++)
{arr[i]=arr[i+1];
}

System.out.print("New array is\t ");
for(int i=0;i<4;i++){
System.out.print(arr[i]);
}

}
}

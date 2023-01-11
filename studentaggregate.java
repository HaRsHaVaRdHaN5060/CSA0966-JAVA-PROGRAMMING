import java.util.Scanner;
class studentaggregate
{
public static void main(String args[])
{
int marks[] = new int[6];
int i;
float total = 0;
float avg;
Scanner sc = new Scanner(System.in);
for(i=0;i<6;i++)
{
System.out.print("enter marks of the subject" +(i+1)+ ":");
marks[i]=sc.nextInt();
total=total+marks[i];
}
sc.close();
avg = total/6;
System.out.print("The student grade is :");
if(avg >=75)
{
System.out.print("distinction");
}
if(avg >=60 && avg<75)
{
System.out.print("1st division ");
}
if(avg >=50 && avg<60)
{
System.out.print("2nd division ");
}
if(avg >=40 && avg<50)
{
System.out.print("3rd division");
}
if(avg <40)
{
System.out.print("fail");
}
}
}



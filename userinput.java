import java.util.Scanner;

class userinput
{
    public static void main(String args[])
        {
	System.out.println("Input the frist no. to add");
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();

	System.out.println("Input the second no. to add");
	int num2 = sc.nextInt();

	int num3= num1+num2;
	System.out.println("The answer : "+num3);
        }
}
import java.util.Scanner;
class sumOfNnumbers{
static long  sum = 0;
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n: ");
long n = sc.nextInt();
System.out.println("Using FOR loop");
for (int i = 1; i <= n; i++) {
    sum+=i;
}
System.out.println("Sum is: " +sum);
System.out.println("Using Formula: ");
sum = (n * (n+1))/2;
System.out.println("Sum is: " + sum);
sc.close();
}

}
import java.util.Scanner;
public class NizaOdBroeviKoiNeSeDeliviSo3  {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);        
System.out.print("Внесете големина на низата: ");
int n = scanner.nextInt();        
int[] numbers = new int[n];
System.out.println("Внесете ги броевите во низата:");
for (int i = 0; i < n; i++) {
System.out.print("Елемент " + (i + 1) + ": ");
numbers[i] = scanner.nextInt();
}
System.out.println("Броеви кои не се делливи со 3:");
for (int number : numbers) {
if (number % 3 != 0) {
System.out.print(number + " ");
}
}
}
}
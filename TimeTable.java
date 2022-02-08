import java.util.Scanner;
public class TimeTable { // Save as "TimeTable.java"
public static void main (String [] args) {
Scanner in = new Scanner(System.in);
int size = in.nextInt();
System.out.print(" * ");
for (int i = 1; i < size+1; ++i)
	System.out.printf("%4d", i);
System.out.println();
for (int i = 1; i < size + 2; ++i)
	System.out.printf("-------");
System.out.println();
for (int i = 1; i < size +1; ++i) {
	System.out.printf("%2d |", i);
	for (int j = 1; j < size + 1; ++j)
		System.out.printf("%4d", j*i);
	System.out.println();
}
}
}
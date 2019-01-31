package Bagg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Round06 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = 
				new BufferedReader(
						new InputStreamReader(
								System.in));
		int korean = 0, english = 0 , math = 0, total = 0;
		char scores = 0;
		float average = 0.0f;

		do {
			System.out.print("korean = ");
			korean = Integer.
					parseInt(in.readLine());
		} while (korean < 0 || korean > 100);

		do {
			System.out.print("english = ");
			english = Integer.parseInt(in.readLine());
		} while (english < 0 || english > 100);

		do {
			System.out.print("math = ");
			math = Integer.parseInt(in.readLine());
		} while (math < 0 || math > 100);

		total = korean + english + math;
		average = total / 3.0f;

		switch ((int) (average / 10)) {
		case 10:
		case 9:
			scores = 'A';
			break;
		case 8:
			scores = 'B';
			break;
		case 7:
			scores = 'C';
			break;
		case 6:
			scores = 'D';
			break;
		default:
			scores = 'F';
		}

		System.out.println();
		System.out.println("total = " + total);
		System.out.println("average = "+ average);
		System.out.printf("average = %s%n", average);
		System.out.println("scores = " + scores + " point");
	}
}

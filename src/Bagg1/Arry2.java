
package Bagg1;
public class Arry2 {
	public static void main(String[] args) {
		int[] num;
		num = new int[5];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		System.out.println(num[0]);

		String[][] names = { { "oras", "abd" }, { "Ali", "Hussein" } };
		System.out.println(names[0][0] + " " + names[0][1]);
		System.out.println(names[1][0] + " " + names[1][1]);

		String[][] employees = new String[2][2];
		employees[0][0] = "oras";
		employees[0][1] = "Khidhr";
		employees[1][0] = "Ali";
		employees[1][1] = "Mohamed";
		System.out.println(employees[0][1]);

		for (int i = 0; i < employees.length; i++) {
			StringBuilder name = new StringBuilder();
			for (int j = 0; j < employees.length; j++) {
				if(j==0) {
					name.append(" name :");
				}else {
					name.append(" father name is:");
				}
				name.append(employees[i][j]);
			}
			System.out.println(name);

		}

	}
}

package excelread;

import java.io.IOException;

public class ExcelClass1Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(ExcelClass1.getStringData(0, 0));
		System.out.println(ExcelClass1.getStringData(0, 1));
		System.out.println(ExcelClass1.getStringData(1, 0));
		System.out.println(ExcelClass1.getIntegerData(1, 1));
		System.out.println(ExcelClass1.getStringData(2, 0));
		System.out.println(ExcelClass1.getIntegerData(2, 1));

	}

}

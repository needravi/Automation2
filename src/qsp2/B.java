package qsp2;

import java.io.File;
/*import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;*/
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class B {

	public static void main(String[] args) throws Exception{
		Workbook w = WorkbookFactory.create(new File("./data/d2.xlsx"));
		String d = w.getSheet("sheet1").getRow(0).getCell(1).toString();
		System.out.println(d);
	}

}

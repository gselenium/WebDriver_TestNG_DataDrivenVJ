package Rough;

import com.gktech.util.XLS_Reader;

public class GetTestDataRunmodes {
	public static void main(String[] args) {
		XLS_Reader xls=new XLS_Reader("D:/OnlineTraining/VijayUK/WebDriver_TestNG_DataDriven/src/com/gktech/xlsfiles/newcars.xlsx");
		getTestDataRunmodes(xls, "Login");
	}
	
	//to get the runmodes of the test data 
	public static String[] getTestDataRunmodes(XLS_Reader xls, String sheetName){
		String[] runmodes;
		if(!xls.isSheetExist(sheetName)){
			System.out.println("Test data sheet not found");
		}
		//size declaration
		runmodes=new String[xls.getRowCount(sheetName)-1];
		//values declaration
		for(int i=2;i<=xls.getRowCount(sheetName);i++){
			System.out.println(xls.getCellData(sheetName, "Runmode", i));
			runmodes[i-2]=xls.getCellData(sheetName, "Runmode", i);
		}		
		return runmodes;		
	}

}

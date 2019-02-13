/**
 * 
 */
package executionEngine;
import org.testng.annotations.Test;
import utility.ExcelUtils;
import config.ActionKeywords;

/**
 * @author AGL-Amit Sharma
 *
 */
public class DriverScript {
	/*WebDriver driver;
	String driverPath= "D:/Selenium/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe";
	String url="https://www.marutisuzuki.com";
	@BeforeMethod
	public void initializeBrowser(){
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver= new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}*/
	
	
	@Test
	public void test1() throws Exception{
		System.out.println("Testing started");
		ActionKeywords.initBrowser();
		String spath= "C:\\Users\\AGL\\AmitSharma\\workspace\\agl1\\src\\main\\java\\dataEngine\\DataEngine.xlsx";
	    	// Declaring the path of the Excel file with the name of the Excel file
	    		    	// Here we are passing the Excel path and SheetName as arguments to connect with Excel file 
	    	ExcelUtils.setExcelFile(spath, "Test Steps");

	    	//Hard coded values are used for Excel row & columns for now
	    	//In later chapters we will replace these hard coded values with varibales
	    	//This is the loop for reading the values of the column 3 (Action Keyword) row by row
	    	for (int iRow=1;iRow<5;iRow++){
			    //Storing the value of excel cell in sActionKeyword string variable
	    		String sActionKeyword = ExcelUtils.getCellData(iRow, 3);

	    		//Comparing the value of Excel cell with all the project keywords
	    		if(sActionKeyword.equals("openBrowser")){
	                        //This will execute if the excel cell value is 'openBrowser'
	    			//Action Keyword is called here to perform action
	    			ActionKeywords.openBrowser();}
	    		else if(sActionKeyword.equals("navigate")){
	    			ActionKeywords.navigate();}
	    		else if(sActionKeyword.equals("clickProfile")){
	    			ActionKeywords.clickProfile();}
	    		else if(sActionKeyword.equals("closeBrowser")){
	    			ActionKeywords.closeBrowser();}
	    		

	    		}
	    	}
	 }
	
	/*@AfterMethod
	public void browserClose(){
		driver.quit();
	}*/

	
	

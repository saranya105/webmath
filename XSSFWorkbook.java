package Apachepoi;
import java.io.FileInputStream;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webmath_Plots_Geometry {

	public static  void main(String[] args) {
	
				 try {
				    	ChromeDriver driver =new ChromeDriver();
					    driver.manage().window().maximize();
					    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					    driver.get("https://www.webmath.com/");
					    Thread.sleep(2000);  
					   FileInputStream file = new FileInputStream("C:\\Users\\91939\\Desktop\\Webmath Project (2).xls");
					    XSSFWorkbook workbook = new XSSFWorkbook();
					    XSSFSheet sheet =  workbook.getSheet("Sheet1");
					    int rowcount = sheet.getLastRowNum();
					    int colcount = sheet.getRow(1))).getLastCellNum();
					    
					    for(int i=1; i<=rowcount; i++)
					    {
					    	String value1= new DataFormatter().formatCellValue(sheet.getRow(i))).getCell(1));
					    	String value2= new DataFormatter().formatCellValue ( sheet.getRow(i))).getCell(2));
					    	String value3= new DataFormatter().formatCellValue(sheet.getRow(i))).getCell(3));
					    	String value4= new DataFormatter().formatCellValue(sheet.getRow(i))).getCell(4));
					    
					    
					    	
					   //Two points
					    	driver.findElement(By.id("navBox-3")).click();
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[1]")).click();
					    	driver.findElement(By.name("m1")).sendKeys("point1");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("m2")).sendKeys("point2");
					    	Thread.sleep(1000);
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/center/form/input[5]")).click();
					    	 Thread.sleep(2000);
					    	 
		               //Point and slope			    	 
					    	 driver.findElement(By.id("navBox-3")).click();
					    	 Thread.sleep(1000);
					    	 driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[2]")).click();
					    	 driver.findElement(By.name("m1")).sendKeys("point1");
					    	 Thread.sleep(1000);
						     driver.findElement(By.name("m2")).sendKeys("slope");

						     Thread.sleep(1000);
						     driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/center/form/input[5]")).click();
						     Thread.sleep(2000);
						     
		               //slope    
					    	 driver.findElement(By.id("navBox-3")).click();
					    	 Thread.sleep(1000);
					    	 driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[3]")).click();
					    	 driver.findElement(By.name("m1")).sendKeys("slope");
					    	 Thread.sleep(1000);
						     driver.findElement(By.name("m2")).sendKeys("Intercept");
						     Thread.sleep(1000);
						     driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/input[3]")).click();
						     Thread.sleep(2000);
						     
		                //y-int
						     driver.findElement(By.id("navBox-3")).click();
						     Thread.sleep(1000);
						     driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[4]")).click();
						     driver.findElement(By.name("")).sendKeys("point2");
						     Thread.sleep(1000);
						     driver.findElement(By.name("Y-coordinate")).sendKeys("point1");
						     Thread.sleep(1000);
						     driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/b/form/center/input")).click();   
						     Thread.sleep(2000);
		              	
		               //XY-Plot	
						     driver.findElement(By.id("navBox-3")).click();
						     Thread.sleep(1000);
						     driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[5]")).click();
						     driver.findElement(By.name("XY-Plot")).sendKeys("point1");
						     Thread.sleep(1000);
						     driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/center/p[2]/input[2]")).click();
						     Thread.sleep(2000);
						     
						//Inequalities
						     driver.findElement(By.id("navBox-3")).click();
						     Thread.sleep(2000);
						     driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[6]")).click();
						     driver.findElement(By.name("X-coordinates")).sendKeys("beyond across origin");
						     Thread.sleep(1000);
						     driver.findElement(By.name("Y-Coordinates")).click();
						     Thread.sleep(500);
						     driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/center/p[3]/select/option[3]")).click();
						     Thread.sleep(1000);
						     driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/center/center/input")).click();   
						     Thread.sleep(2000);
						     
					    //Polar-Plot
					    	driver.findElement(By.id("navBox-3")).click();
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[7]")).click();
					    	Thread.sleep(1000);
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/center/p[1]/input")).sendKeys(value4);
					    	Thread.sleep(1000);
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/center/p[2]/input[1]")).click();
					    	Thread.sleep(2000);
					    	driver.findElement(By.xpath("//*[@id=\"select color dropdown button")).click();
					    	Thread.sleep(2000);

					    //points
					    	driver.findElement(By.id("navBox-3")).click();
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[8]")).click();
					    	driver.findElement(By.name("n1")).sendKeys(value2);
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("n2")).sendKeys(value3);
					    	Thread.sleep(1000);
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/center/p[2]/input")).clear();
					    	Thread.sleep(2000);
					    	 
					    //lines
					    	driver.findElement(By.id("navBox-3")).click();
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[1]/font/font/a[1]")).click();
					    	driver.findElement(By.name("Equation passing through X-Axis in Y-coordinate")).sendKeys("2,5");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("Equation passing through Y-Axis in X-coordinate")).sendKeys("5,7");
					    	Thread.sleep(1000);
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/font/center/input")).click();
					    	Thread.sleep(2000);

					    //Conic Sections			    	 
					    	driver.findElement(By.id("navBox-3")).click();
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[1]/font/font/a[2]")).click();
					    	driver.findElement(By.name("a")).sendKeys("Circles");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("b")).sendKeys("parabolas");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("c")).sendKeys("Ellipses");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("d")).sendKeys("Hyperbolas");
					    	Thread.sleep(1000);
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/font/center/center/input")).click();
					    	Thread.sleep(2000);
						
					    //Circles
					        driver.findElement(By.id("Circle(x,y,radius")).click();
						    driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/font/a[1]")).click();
						   	driver.findElement(By.name("a")).sendKeys("Input:X=50");
						   	Thread.sleep(1000);
					    	driver.findElement(By.name("d")).sendKeys("y=200");
					    	Thread.sleep(1000);
						    driver.findElement(By.xpath("//*[@id=\"radius")).click();
						    Thread.sleep(2000); 
					    	 
					    //Parabolas
					    	driver.findElement(By.id("parabola(X,Y")).click();
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/font/a[2]")).click();
					    	driver.findElement(By.name("X2")).sendKeys("4ay");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("X2")).sendKeys("-4ay");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("Y2")).sendKeys("4ax");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("Y2")).sendKeys("-4ax");
					    	Thread.sleep(1000);
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/center/center/input")).click();
					    	Thread.sleep(2000);
					    	
					    //Ecllipses
					    	driver.findElement(By.id("Ellipses(X-Coordinate,Y-Coordinate")).click();
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/font/a[2]")).click();
					    	driver.findElement(By.name("y=1")).sendKeys("0,1");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("y=-1")).sendKeys("0,-1");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("x=5")).sendKeys("4,7");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("x=9")).sendKeys("-2,9");
					    	Thread.sleep(1000);
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/center/center/input")).click();
					    	Thread.sleep(2000);
					    	
					    	
					   //hyperbolas
					    	driver.findElement(By.id("hyperbolas(X-Coordinate,Y-Coordinate")).click();
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/font/font/a[2]")).click();
					    	driver.findElement(By.name("x,y")).sendKeys("locus of pointsin focus greater than1");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("directrix")).click();
					    	Thread.sleep(1000);
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/p[1]/select/option[4]")).click();
					    	Thread.sleep(1000);
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/p[2]/input")).click();
					    	Thread.sleep(2000);

					    //Rectangles
					    	driver.findElement(By.id("navBox-3")).click();
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/font/font/a[3]")).click();
					    	driver.findElement(By.name("width")).sendKeys(value1);
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("height")).sendKeys(value2);
					    	Thread.sleep(1000);
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/font/input[1]")).click();
					    	Thread.sleep(2000);
					    	
					    //Circles
					    	driver.findElement(By.id("navBox-3")).click();
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/font/font/a[4]")).click();
					    	driver.findElement(By.name("C1")).sendKeys("2,6 ");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("C2")).sendKeys("3,8 ");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("Radius")).sendKeys("4 ");
					    	Thread.sleep(1000);
					    	System.out.println("result");
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/p/input")).click();
					    	Thread.sleep(2000);
				    	
					    //Squares
					    	driver.findElement(By.id("navBox-3")).click();
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/font/font/a[4]")).click();
					    	driver.findElement(By.name("m")).sendKeys("2");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("n")).sendKeys("5");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("Size")).sendKeys("4 into 4 ");
					    	Thread.sleep(1000);
					    	System.out.println("result");
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/p/input")).click();
					    	Thread.sleep(2000);
					    	 //Cylinders
					    	driver.findElement(By.id("navBox-3")).click();
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/font/font/a[4]")).click();
					    	driver.findElement(By.name("length")).sendKeys("2cm");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("height")).sendKeys("6feets");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("radiu5")).sendKeys("4");
					    	Thread.sleep(1000);
					    	System.out.println("result");
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/p/input")).click();
					    	Thread.sleep(2000);
					    	 //Squares
					    	driver.findElement(By.id("navBox-3")).click();
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/font/font/a[4]")).click();
					    	driver.findElement(By.name("side")).sendKeys("m=2");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("area")).sendKeys("n=5");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("parameter")).sendKeys("3 ");
					    	Thread.sleep(1000);
					    	System.out.println("result");
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/p/input")).click();
					    	Thread.sleep(2000);
					    	
					    	 //Boxes
					    	driver.findElement(By.id("navBox-3")).click();
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/font/font/a[4]")).click();
					    	driver.findElement(By.name("width")).sendKeys("300px");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("border")).sendKeys("15px");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("padding")).sendKeys("30px");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("margin")).sendKeys("20px");
					    	Thread.sleep(1000);
					    	System.out.println("result");
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/p/input")).click();
					    	Thread.sleep(2000);
					    	 //Right Triangles
					    	driver.findElement(By.id("navBox-3")).click();
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/font/font/a[4]")).click();
					    	driver.findElement(By.name("x1,y1")).sendKeys("12");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("x2,y2")).sendKeys("15");
					    	Thread.sleep(1000);
					    	driver.findElement(By.name("x3,y3")).sendKeys("7 ");
					    	Thread.sleep(1000);
					    	System.out.println("result");
					    	driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/p/input")).click();
					    	Thread.sleep(2000);
					  	
					    	
					    }

					    driver.quit();
					    workbook.close();
			     	} 
				    catch (Exception e) {
					   System.out.println(e.getMessage());
			     	}
			}

	

		


	}


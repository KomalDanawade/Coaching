package Practise_Exer;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4 {
@Test
public void dataProvider() {
	
	System.out.println("day4");
}
@BeforeTest
public void dataProvider2() {
	
	System.out.println("BeforeTest-dataprovider2");
}
@BeforeClass
public void dataProvider3() {
	
	System.out.println("BC-day4");
}

//@BeforeTest
//public void demo1() {
//	
//	System.out.println("Running test");
//}
//@BeforeClass
//public void demo2() {
//	
//	System.out.println("Running class");
//}
//@BeforeMethod
//public void demo3() {
//	
//	System.out.println("Running Method");
//}


}

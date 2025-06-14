package day1;

import org.testng.annotations.Test;

import jdk.javadoc.doclet.Reporter;

public class HappyTest {
@Test
public void createcontactTest() {
	String URL=System.getProperty("url");
	String BROWSER=System.getProperty("browser","chrome");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	System.out.println("YOu are very happy");
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	System.out.println("execute create contact Test");
	
	
}
@Test
private void modifycontactTest() {
	// TODO Auto-generated method stub
System.out.println("execute modifycontactTest");
}
}

package attendanceregister;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromFile {

	public static void main(String[] args) throws IOException, ParseException {
		 
		 Scanner myObj = new Scanner(System.in);  
	     System.out.println("Enter employee name:");
	     String employe = myObj.nextLine();   
	     System.out.println("employe Name: " +employe);     
		
		JSONParser jsonP = new JSONParser();
		  FileReader reader=new FileReader(".\\json\\attendanceregister.json");
		  Object obj = jsonP.parse(reader);
		  JSONArray empList = (JSONArray) obj;		  
		  System.out.println("Each element of ArrayList");  

		  
		  for (Object o : empList ) {
			  JSONObject emp = (JSONObject)o;	            
	            if(employe.equals(emp.get("employeName"))) {
	            	System.out.println(emp);	
	            }
	        }

	}		

}

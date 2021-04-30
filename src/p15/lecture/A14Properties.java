package p15.lecture;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class A14Properties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		String path = "bin/p15/lecture/config1.properties";
		
		pro.load(new FileReader(path));
		
		System.out.println(pro.get("id"));
		System.out.println(pro.get("password"));
		
//		String idValue = (String) pro.get("id");
		String value = pro.getProperty("id");
	}
}

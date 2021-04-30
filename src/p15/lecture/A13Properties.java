package p15.lecture;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class A13Properties {
	public static void main(String[] args) throws FileNotFoundException {
		Map<String, String> map = new HashMap<>();

		String path = "bin/p15/lecture/config1.properties";
		Scanner s = new Scanner(new File(path));

		while (s.hasNextLine()) {
//			System.out.println(s.nextLine());
			String line = s.nextLine();
			int e = line.indexOf("=");
			String key = line.substring(0, e);
			String value = line.substring(e + 1);

			map.put(key, value);
		}

		s.close();
	}
}

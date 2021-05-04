package p18.textbook;

import java.io.*;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		int data = -1;
		long start = 0, end = 0;
		String src = "C:\\myworkspace\\0_Web\\1_JavaScript\\audi.jfif";
		String des = "C:\\myworkspace\\1_Java\\java_core\\pic\\audi_copy.jfif";
		fis = new FileInputStream(src);
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream(des);
		
		start = System.nanoTime();
		while ((data = bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.nanoTime();
		
		fis.close();
		bis.close();
		fos.close();
		System.out.println("사용하지 않을 때 : " + (end - start) + "ms");

		fis = new FileInputStream(src);
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream(des);
		bos = new BufferedOutputStream(fos);
		
		start = System.nanoTime();
		while ((data = bis.read()) != -1) {
			bos.write(data);
		}
		bos.flush();
		end = System.nanoTime();
		fis.close();
		bis.close();
		fos.close();
		bos.close();
		System.out.println("사용했을 때 : " + (end - start) + "ms");

	}
}

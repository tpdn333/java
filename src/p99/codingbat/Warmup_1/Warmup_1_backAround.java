package p99.codingbat;

public class Warmup_1_backAround {
	public String backAround(String str) {
		  String res = "";
		  int len = str.length();
		  String last = str.substring(len-1, len);
		  
		  res = last + str + last;
		  return res;
		}
}

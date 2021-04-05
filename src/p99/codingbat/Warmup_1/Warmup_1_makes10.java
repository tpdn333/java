package p99.codingbat.Warmup_1;

public class Warmup_1_makes10 {
	public boolean makes10(int a, int b) {
		  if( a == 10 || b == 10 ){
		    return true;
		  }
		  if ( a + b == 10){
		    return true;
		  }
		  return false;
		}

}

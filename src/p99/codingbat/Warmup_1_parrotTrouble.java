package p99.codingbat;

public class Warmup_1_parrotTrouble {
	public boolean parrotTrouble(boolean talking, int hour) {
		  if( talking ) {
		    if(hour < 7 || hour > 20){
		      return true;
		    }
		  }
		  return false;
		}

}

package p99.programmers;

public class p12903_getMidChar {
	public String solution(String s) {
        String answer = "";
        int len = s.length();
        if(len % 2 != 0){
            answer = s.substring(len/2,len/2 + 1);
        } else
            answer = s.substring(len/2-1,len/2+1);
        return answer;
    }
	// return word.substring((word.length()-1) / 2, word.length()/2 + 1);    
	
}

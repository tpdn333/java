package p09.textbook.s09_04_01;

public class ButtonExample {
	public static void main(String[] args) {
		Button b1 = new Button();
		
		b1.setOnClickListener(new CallListener());
		b1.touch();
		
		b1.setOnClickListener(new MessageListener());
		b1.touch();
	}
}

package first;

public class Appl {
	public static void main(String[] args) {
		int speed = 0;
		int fine=0;
		for(speed = 0;speed<90;speed+=10)
		{
			if (speed>=75) 
			{
				fine=300;
			}
			if (speed>= 65 && speed <75)
			{
				fine=150;
			}
			if (speed>55 && speed <65) 
			{
				fine=100;
			}
			System.out.println("if your speed is "+speed+" you need to pay fine of "+fine);
		}
	}

}
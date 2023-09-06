package week3.day1.assignment3;

public class Automation extends MultipleLangauge implements Language, TestTool{
	
	public static void main(String[] args) {
		Automation at = new Automation();
		at.Java();
		at.Selenium();
		at.ruby();
		at.python();
		
	}

	@Override
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium");
		
	}

	@Override
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
		
	}

}

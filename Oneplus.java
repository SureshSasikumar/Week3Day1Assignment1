package week3.day1.experiment1;

public class Oneplus extends AndroidTV implements Android{
	public static void main(String[] args) {
		
	
		
	Oneplus op = new Oneplus();
	op.openApp();
	op.playVideo();
	op.openNew();
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("play");
	}
	
	public void openApp() {
			// TODO Auto-generated method stub
		System.out.println("open");
		
		
	}

	@Override
	public void openNew() {
		// TODO Auto-generated method stub
		System.out.println("openedNew");
	}
	

}

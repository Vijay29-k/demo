package oops_concept;

abstract class FirstRelease {
	
	public void classRoom() {
		System.out.println("Class Room Trainig is Started...");
	}
	public abstract void online();
	public abstract void corporate();
}

abstract class SecondRelease extends FirstRelease {

	@Override
	public void online() {
		System.out.println("Online Trainig is Started...");
	}

}


public class FinalRelease  extends SecondRelease {

	@Override
	public void corporate() {
		System.out.println("Corporate Training is Started...");
		
	}
	
	public static void main(String[] args) {

        FinalRelease f = new FinalRelease();
        
        f.classRoom();
        f.online();
        f.corporate();
		
	}


}

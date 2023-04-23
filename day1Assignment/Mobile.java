package week1.day1Assignment;

public class Mobile {

	public void makeCall()
	{
		String Mobile="Xioami";
		float Weight=23.4f;
		System.out.println(Mobile);
		System.out.println(Weight);
		
	
	}
	public void sendMsg()
	{
		boolean isFullCharged=true;
		int Cost=23000;
		System.out.println(isFullCharged);
		System.out.println(Cost);
		
	
	}
	
		public static void main(String[] args) {
		Mobile objMobile=new Mobile();
		objMobile.makeCall();
		objMobile.sendMsg();
		System.out.println("This is My Mobile");

	}

}

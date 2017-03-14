import mypackage.*;

public final class mainClass {

	public static void main(String[] args) {
		// 
		myClass c = new myClass("joe");
		for(int i=1; i<2; i++){
			System.out.println(i + " time: " + c.dosomething());
			}
		System.out.println(myEnum.ONE.doSth("opt1", "opt2"));
		System.out.println(myEnum.TWO.doSth("opt11", "opt22"));
		}
	
	
	
}

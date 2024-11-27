package Variables;

public class globalvariable {
    
	//a variable whice is decleread into inside a class out side a method with static key word 

	static String name="Atchutarao";
	static int no=123;
	
	public void Result(String name, int no) {
		this.name= name;
		this.no=no;
		
	}
	public void print() {
		System.out.println("Name : "+name+"\n"+"Roll no : "+no);
	}
	public static void main(String[] args) {
		globalvariable gb= new globalvariable();
		gb.print();
	}
}

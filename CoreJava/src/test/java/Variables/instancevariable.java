package Variables;

public class instancevariable {
   
	// a variable whic is decleread inside class ou side a method with out static key word is called is called instance variable
	
    String name="Atchutarao";
    int no=121;
	
    public void details(String name,int no) {
    	this.name=name;
    	this.no=no;
    }
    public void result() {
    	System.out.println("Name : "+name+"\n"+"Roll no: "+no);
    }
	public static void main(String[] args) {
		 instancevariable in= new instancevariable();
		  in.result();
	}
    
    
}

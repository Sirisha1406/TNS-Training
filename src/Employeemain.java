
public class Employeemain {

	public static void main(String[] args) {
		Employee ob=new Employee();
		ob.Employeenumber =101;
		ob.ename="Sirisha";
		ob.ePHNo=123456;
		
		Employee on=new Employee();
		on.Employeenumber=102;
		on.ename="Siri";
		on.ePHNo=123457;
		
		Employee os=new Employee();
		os.Employeenumber=103;
		os.ename="isha";
		os.ePHNo=123458;
		
		System.out.println("The employes details:\n");
		
		ob.display();
		on.display();
		os.display();
		



	}

}

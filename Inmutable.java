
public class Inmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address oriAddr=new Address("india","kolhapur",416120);
		
		Student std=new Student(1,"Ram",oriAddr);
	
		
		System.out.println("Origional data of Student " );
		
		
		
		
		System.out.println(std);
		
		
		
		oriAddr.setCity("Pune");
		
		Student std1= new Student(2,"sham",oriAddr);
		System.out.println(std1);
		
		System.out.println("after change data City");
		
		System.out.println(std);
		
		System.out.println(oriAddr);
		
		
		String s1 =new String("abc");
		String s2=s1.concat("abc");
		String s3="abcabc";
		String s4=s2.intern();
		System.out.println(s2==s4);
		
	}

}

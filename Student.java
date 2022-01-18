


//what is String
// Whats is inmutable

public final class Student {
	
	private final int rollNo;
	private final String name;
	private final Address addr;
	
	public Student(int rollNo, String name, Address addr) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		//create address  copy
						Address copy=new Address();
						copy.setCountry(addr.getCountry());	
						copy.setCity(addr.getCity());
						copy.setPin(addr.getPin());
			
		this.addr = copy;
		//this.addr=addr;
	}
	public int getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public Address getAddr() {
		Address copy1=new Address();
		copy1.setCountry(addr.getCountry());	
		copy1.setCity(addr.getCity());
		copy1.setPin(addr.getPin());
		return copy1;
		//return addr;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", addr=" + addr + "]";
	}

	

}

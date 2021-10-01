public class Address {

	String city,state,country;

	public Address(String city,String state,String country) {

		this.city=city;

		this.state=state;

		this.country=country;
	}
}

public class Aggregation2 {

	int id;

	String name;

	Address address;

	public Employee(int id,String name,Address address) {

		this.id=id;

		this.name=name;

		this.address=address;
	}

	void display() {

		System.out.println(id+" "+name);

		System.out.println(address.city+" "+address.state+" "+address.country);
	}

	public static void main(String []args) {

		Address address1=new Address("Nagpur","Maharashtra","India");

		Address address2=new Address("Chandrapur","Maharashtra","India");

		Employee e1=new Employee(123,"Amit",address1);

		Employee e2=new Employee(124,"Amar",address2);

		e1.display();

		e2.display();
	}
}
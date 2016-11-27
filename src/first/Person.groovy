package first

class Address {
	String street, city
}

class Person {

	String firstName
	String lastName
	String phoneNumber
	int age
	def address
	
	Person (String firstName,String lastName){
	
		this.firstName = firstName;
		this.lastName = lastName;	
		
	}
	
	def moveToNewPlace(inputAsMap, newPhoneNumber) {
		address.street = inputAsMap.street
		address.city   = inputAsMap.city
		phoneNumber = newPhoneNumber

	}
	
	static void main(def args){
		
		Person p = new Person();
		p.setFirstName("Antoine");
		p.lastName = "Bour";
		p.address = "None";
		
		
		
		println(p.firstName + "--"+p.getLastName());
		
		Person y = new Person(firstName:"Wallace", lastName:"Maya");
		println(y.firstName + "---"+y.lastName);
		
		
		def address = new Address(street: 'Reeperbahn', city: 'Hamburg')
		def ppp = new Person(name: 'Lars', address: address, phoneNumber: '123456789')
		
		// Groovy translates the following call to:
		// p.move([street: 'Saselbeck', city: 'Hamburg'], '23456789')
		ppp.moveToNewPlace(street: 'Saselbeck', '23456789', city: 'Hamburg')
		
		
		assert 'Lars' == ppp.name
		assert 'Hamburg' == ppp.address.city
		assert 'Saselbeck' == ppp.address.street
		assert '23456789' == ppp.phoneNumber
	}
	
}

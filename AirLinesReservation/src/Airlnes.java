
public class Airlnes {
	Person[] people;

	public Airlnes() {
		this.people=new Person[11];
		
	}
	public Person getPeson(int index) {
		Person person= people[index];
		return new Person(person);
	}
	public void setPerson(Person person) {
		int index=person.getSeatNumber()-1;
		people[index]=new Person(person);
		
	}
	public void createReservation(Person person) {
		while(people[person.getSeatNumber()-1]!=null) {
			person.chooseSeat();
		}
		int index=person.getSeatNumber()-1;
		people[index]=new Person(person);
		System.out.println("tnx "+person.getName()+" for flying");


	}
	

}

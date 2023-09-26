
public class MainMethod {

	public static void main(String[] args) {
		Person[] people=new Person[] {
				new Person("kirna","indian","27/11/1997",1),
				new Person("Ashok","indian","17/11/1995",2),
				new Person("Umesh","indian","10/11/1992",3)

				};
		Airlnes airline=new Airlnes();
		
		for(int i=0;i<people.length;i++) {
			airline.setPerson(people[i]);

			
		}
		
		
		

		

	}
}

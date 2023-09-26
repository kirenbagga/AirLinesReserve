import java.util.Arrays;

public class Person {
	private String name;
	private String nationality; 
	private String dateOfBirth; 
	private String[] passport;
	private int seatNumber;
	
		
	public Person(String name, String nationality, String dateOfBirth, int seatNumber) {		
		this.name = name;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
		this.seatNumber = seatNumber;
		this.passport=new String[3];
	}
	public Person(Person source) {
		// TODO Auto-generated constructor stub
		this.name = source.name;
		this.nationality = source.nationality;
		this.dateOfBirth = source.dateOfBirth;
		this.seatNumber = source.seatNumber;
		this.passport=Arrays.copyOf(source.passport,source.passport.length);
	}
	public boolean applyPassport() {
		return (int)(Math.random()*2)==1;
	}
	public void chooseSeat() {
		 int number=(int)(Math.random()*11+1);
	}
	
		
		
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String[] getPassport() {
		return Arrays.copyOf(passport, passport.length);
	}
	public void setPassport() {
		this.passport = new String[] {name,nationality,dateOfBirth};
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", nationality=" + nationality + ", dateOfBirth=" + dateOfBirth + ", passport="
				+ Arrays.toString(passport) + ", seatNumber=" + seatNumber + "]";
	}
	
	
	

}

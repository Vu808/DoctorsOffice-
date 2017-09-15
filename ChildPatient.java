
public class ChildPatient extends Patient {
	private String parentName;
	
	public ChildPatient(String name, int age, String parentName) {
		super(name, age);
	}
	
	public double dosage() {
		return 300.0;
	}
	
	public String toString() {
		return "Patient " + this.getName() + " is " + this.getAge() + " years old and has parent " + parentName + ".";
	}
}

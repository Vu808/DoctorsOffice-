
public class Patient {
	
	private String name;
	private int age;
	
	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public double bmi(double heightInMeters, double weightInKilograms) {
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		return bmi;
	}
	
	public double bmi(double height, String heightUnits, double weight, String weightUnits) {
		double bmi;
		if (heightUnits.equals("cm")) {
			height = height/100;
			}
		if (heightUnits.equals("in")) {
			height = height/39.3701;
		}
		if (weightUnits.equals("lbs")) {
			weight = weight/2.20462;
		}
		if (weightUnits.equals("stone")) {
			weight = weight/0.157473;
		}
		bmi = weight/(height*height);
		return bmi;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double dosage () {
		return 600.0;
	}
	
	public String toString() {
		return "Patient " + name + " is " + age + " years old";
	}
}

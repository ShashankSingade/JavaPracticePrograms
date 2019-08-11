package testPrograms;

public class JavaConstructors {

	String modelName;
	int modelYear;
	
	public JavaConstructors(String carName, int carYear) 
	{
		modelYear=carYear;
		modelName=carName;
	}
	
	public static void main(String[] args) {

		JavaConstructors myCar = new JavaConstructors("HondaAccord", 2012);
		System.out.println(myCar.modelName + " " + myCar.modelYear);

	}

}

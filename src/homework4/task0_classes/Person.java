package homework4.task0_classes;

public class Person {
	private String name;
	private int age;

	// constructors
	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person() {
		this.name = "No name";
		this.age = -1;
	}

	// Setters and Getters (Properties)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
		this.age = age;
		}
	}

	public String greeting() {
		String result = "";
		if (this.name.equals(name) && this.age > 0) {
			result = "Hello, I am " + this.name + ". I am " + this.age + " years old.";
		} else if (this.name.equals(name) && this.age == 0) {
			result = "Hello, I am " + this.name + ".";
		} else if (this.name.equals("No name") && this.age == -1) {
			result = "I am John Doe.";
		}

		return result;
	}

	public static void main(String[] args) {
		Person hristo = new Person("Hristo", 45);
		Person hr = new Person();
		Person hk = new Person("Hristo");

		System.out.println(hristo.greeting());
		System.out.println(hr.greeting());
		System.out.println(hk.greeting());

	}
}

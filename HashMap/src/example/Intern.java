package example;

public class Intern {
	private String name;
	private int age;
	private String sex;
	
	public Intern(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

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
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String show() {
		String s = this.name + "\t" + Integer.toString(this.age) + " years old \t" + this.sex;
		return s;
	}
} 

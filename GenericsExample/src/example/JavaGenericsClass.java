package example;

class GenericsClass<T> {
	private T data;

	public GenericsClass(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

public class JavaGenericsClass {

	public static void main(String[] args) {
		GenericsClass<Integer> intObj = new GenericsClass(10);
		System.out.println("Generics Class return: " + intObj.getData());
		
		GenericsClass<String> strObj = new GenericsClass("Example");
		System.out.println("Generics Class return: " + strObj.getData());
	}

}

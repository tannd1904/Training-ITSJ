package example;

public class ImmutableObject {
	private final String content;

	public ImmutableObject(final String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}
	
	public static void main(String[] args) {
		//Initialize the object with content
		ImmutableObject ex = new ImmutableObject("Example Imutable Object");
		//Print the content after we create
		System.out.println(ex.getContent());
		//The immutable objects are objects whose value can not be changed after initialization
	}
	
}

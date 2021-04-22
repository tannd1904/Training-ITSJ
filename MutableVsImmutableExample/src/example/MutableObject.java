package example;

public class MutableObject {
	private String content;

	public MutableObject(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public static void main(String[] args) {
		//Initialize the object with content
		MutableObject ex = new MutableObject("Example Mutable Object");
		//Print the content after we create
		System.out.println(ex.getContent());
		//Using the setContent method to update the object
		ex.setContent("Another Example Mutable Object");
		//Print the content again
		System.out.println(ex.getContent());
	}
}

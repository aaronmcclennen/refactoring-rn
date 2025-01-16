package l_deleteholderclass;

public class JavaxWsResponse {
	private final String type;

	private JavaxWsResponse(String type) {
		this.type = type;
	}
	
	public static JavaxWsResponse build(String type) {
		return new JavaxWsResponse(type);
	}

	@Override
	public String toString() {
		return "JavaxWsResponse [type=" + type + "]";
	}
	
}

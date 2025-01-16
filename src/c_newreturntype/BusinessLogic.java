package c_newreturntype;

public class BusinessLogic {
	private boolean flag = true;
	
	public BusinessLogic(String payload) {
		flag = Boolean.parseBoolean(payload);
	}

	/* 
	  The problem with the doLogic method is that the network logic of the response is mixed up in the business logic.
	  Changing the return value allows us to separate the concerns.
	 */
	
	public JavaxWsResponse doLogic() {
		return newMethod();
	}

	public JavaxWsResponse newMethod() {
		if (flag) {
			return JavaxWsResponse.build("Success");
		}
		else {
			return JavaxWsResponse.build("Failure");
		}
	}
}

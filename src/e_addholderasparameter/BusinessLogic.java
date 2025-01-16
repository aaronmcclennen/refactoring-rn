package e_addholderasparameter;

public class BusinessLogic {
	private boolean flag = true;
	
	public BusinessLogic(String payload) {
		flag = Boolean.parseBoolean(payload);
	}

	/* 
	  The value in the Return Holder will be used shortly.
	 */
	
	public JavaxWsResponse doLogic() {
		return newMethod(new ReturnHolder());
	}

	public JavaxWsResponse newMethod(ReturnHolder ret) {
		if (flag) {
			return JavaxWsResponse.build("Success");
		}
		else {
			return JavaxWsResponse.build("Failure");
		}
	}
}

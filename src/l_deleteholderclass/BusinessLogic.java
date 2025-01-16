package l_deleteholderclass;

public class BusinessLogic {
	private boolean flag = true;
	
	public BusinessLogic(String payload) {
		flag = Boolean.parseBoolean(payload);
	}

	public JavaxWsResponse doLogic() {
		return HttpEndPoint.transmute(newMethod());  // pass result of new method to transmute.
	}

	public BusinessResult newMethod() { 
		if (flag) {
			return BusinessResult.OK;	
		}
		else {
			return BusinessResult.FAIL;				
		}
	}
}

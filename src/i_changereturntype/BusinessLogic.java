package i_changereturntype;

public class BusinessLogic {
	private boolean flag = true;
	
	public BusinessLogic(String payload) {
		flag = Boolean.parseBoolean(payload);
	}

	public JavaxWsResponse doLogic() {
		ReturnHolder ret = new ReturnHolder();
		newMethod(ret);
		return HttpEndPoint.transmute(ret.result);
	}

	public BusinessResult newMethod(ReturnHolder ret) {  	// change 1. causes compile errors
		if (flag) {
			ret.result = BusinessResult.OK;	
			return BusinessResult.OK;			// change 2. fixes one compile error
		}
		else {
			ret.result = BusinessResult.FAIL;	
			return BusinessResult.FAIL;						// change 3. fixes last error.
		}
	}
}

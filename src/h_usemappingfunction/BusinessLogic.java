package h_usemappingfunction;

public class BusinessLogic {
	private boolean flag = true;
	
	public BusinessLogic(String payload) {
		flag = Boolean.parseBoolean(payload);
	}

	/*
	 - extract local to get ret
	 - remove the original return statement. causes compile error
	 - return the result of transmute on the value in the holder. fixes compile error
	 ? should this be broken into more steps for crystal clarity.
	 */
	public JavaxWsResponse doLogic() {
		ReturnHolder ret = new ReturnHolder();
		newMethod(ret);
		return HttpEndPoint.transmute(ret.result);
	}

	public JavaxWsResponse newMethod(ReturnHolder ret) {
		if (flag) {
			ret.result = BusinessResult.OK;	
			return JavaxWsResponse.build("Success");
		}
		else {
			ret.result = BusinessResult.FAIL;
			return JavaxWsResponse.build("Failure");
		}
	}
}

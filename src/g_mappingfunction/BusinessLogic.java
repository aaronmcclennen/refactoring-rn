package g_mappingfunction;

public class BusinessLogic {
	private boolean flag = true;
	
	public BusinessLogic(String payload) {
		flag = Boolean.parseBoolean(payload);
	}

	public JavaxWsResponse doLogic() {
		return newMethod(new ReturnHolder());
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

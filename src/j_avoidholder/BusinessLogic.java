package j_avoidholder;

public class BusinessLogic {
	private boolean flag = true;
	
	public BusinessLogic(String payload) {
		flag = Boolean.parseBoolean(payload);
	}

	public JavaxWsResponse doLogic() {
		ReturnHolder ret = new ReturnHolder();

		return HttpEndPoint.transmute(newMethod(ret));  // pass result of new method to transmute.
	}

	public BusinessResult newMethod(ReturnHolder ret) {  	
		if (flag) {
			ret.result = BusinessResult.OK;	
			return BusinessResult.OK;			
		}
		else {
			ret.result = BusinessResult.FAIL;	
			return BusinessResult.FAIL;						
		}
	}
}

package m_inlineoldmethod;

public class BusinessLogic {
	private boolean flag = true;
	
	public BusinessLogic(String payload) {
		flag = Boolean.parseBoolean(payload);
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

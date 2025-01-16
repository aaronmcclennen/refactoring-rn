package d_holderclass;

public class HttpEndPoint {
	
	public JavaxWsResponse runBusinessLogic(String payload) {
		if (isValid (payload)) {
			return new BusinessLogic(payload).doLogic();
		}
		else {
			return JavaxWsResponse.build("error");
		}
	}

	private boolean isValid(String payload) {
		return false;
	}
}

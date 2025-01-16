package i_changereturntype;

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
	
	/*
	 I placed the mapping function here because I don't want any mention of JavaxWsResponse in the business logic when I am done.
	 */
	public static JavaxWsResponse transmute(BusinessResult businessResult) {
		switch (businessResult) {
		case OK:
			return  JavaxWsResponse.build("Success");
		case FAIL:
			return JavaxWsResponse.build("Failure");
		default:
			// I review of the code should show that this case is exceptional. but the compiler is picky.
			return JavaxWsResponse.build("Unexpected Failure");			
		}
	}
}

package autoinsurance;

public class AutoPolicy {
	private int accountNumber;
	private String makeAndModel;
	private String state;
	public AutoPolicy(int accountNumber,String makeAndModel,String state) {
		this.accountNumber=accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}
	public String getMakeAndModel() {
		return makeAndModel;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getState() {
		return state;
	}
	
	public Boolean isNoFaultState() {
		boolean nofaultstate;
		switch(getState()){
			case "MA": case " NY": case "NJ": case "PS":
				nofaultstate = true;
				break;
			default:
				nofaultstate= false;
		}
		return nofaultstate;
		
	}
}
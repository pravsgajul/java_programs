package autoinsurance;

public class AutoPolicyTest {
	public static void main(String[] args) {
		AutoPolicy autopolicy1 = new AutoPolicy(1234,"Toyota","MA");
		AutoPolicy autopolicy2 = new AutoPolicy(5432,"Lamborghini","CA");
		System.out.println(autopolicy1.isNoFaultState());
		System.out.println(autopolicy2.isNoFaultState());
	}
}

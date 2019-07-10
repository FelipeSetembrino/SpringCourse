package spring.services;

public class JsonTest {
	
	private String attrA, attrB, attrC;
	
	public JsonTest() {
		
	}
	
	public JsonTest(String a, String b, String c) {
		setAllFields(a, b, c);
	}

	public void setAllFields(String a, String b, String c) {
		attrA = a;
		attrB = b;
		attrC = c;
	}
	
	public String getAttrA() {
		return attrA;
	}

	public void setAttrA(String attrA) {
		this.attrA = attrA;
	}

	public String getAttrB() {
		return attrB;
	}

	public void setAttrB(String attrB) {
		this.attrB = attrB;
	}

	public String getAttrC() {
		return attrC;
	}

	public void setAttrC(String attrC) {
		this.attrC = attrC;
	}
	
	
	
}

package java1;

public class Customer {
	private int custNo;
	private String custName;
	private String custAddress;
	private static int billNo;
	static {
        billNo = 0; 
    }
	Customer(){
		this.custNo= 0;
		this.custName="unknown";
		this.custAddress="unknown";
		billNo++;
		
	}
	Customer(int custNo,String custName, String custAddress){
		this.custNo= custNo;
		this.custName=custName;
		this.custAddress=custAddress;
		billNo++;
		
	}
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	
	
	public void init() {
		custNo =0;
		custName ="swati";
		custAddress ="Chennai";
	}
	public void display() {
		System.out.println("Customer No : "+custNo);
		System.out.println("Customer Name : "+custName);
		System.out.println("Customer Address : "+custAddress);
	}
	 public static void printBillNo() {
	        System.out.println("Bill Number: " + billNo);
	    }

}

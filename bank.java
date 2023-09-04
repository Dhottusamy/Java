package test;

public class bank {
	@SuppressWarnings("unused")
	private int money;
	private String bankname;
	private String depositername;
	int getmoney1() {
		return getmoney1();
		}
		public void getdate2(int date) {
		}
	public void getmoney2(int money) {
		this.money=money;
	}
	public String getbankname() {
		return bankname;
	}
	public String getdepositername() {
		return depositername;
	}
	public void getdate1(int date) {
		this.money=date;
	}
public  void setbankname(String strbankname,String bankname) {
	this.bankname=bankname;
}
public void setmoney(String string,int money) {
	this.money=money;	
}
}
class main{
	public main(String args[]) {
	bank a1=new bank();
				a1.setmoney("33",0);
		a1.setbankname("21",null);
		System.out.println(a1.getmoney1());
	}
	}

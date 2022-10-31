//WAP to craete  ATM  where customer enter our details ,pin and withdrawal cash or deposit cash.. In this program you have to use encapculation for hinding user details and inheritance,polymorphism and interface.
public class bankprocess {
	
	private int pass=12345678;
	private int ac_bal=100000;
	//Creating getter setter methods to access private variables in other class
	public int getPass() {
		return pass;
	}
	public void setPass(int ps) {
		this.pass = ps;
	}
	//cr method for credit process
	public int getAc_balcr() {
		return ac_bal;
	}
	public void setAc_balcr(int bl) {
		this.ac_bal += bl;
	}
	//db method for debit process
	public int getAc_baldb() {
		return ac_bal;
	}
	public void setAc_baldb(int bl) {
		this.ac_bal -= bl;
	}
	
}

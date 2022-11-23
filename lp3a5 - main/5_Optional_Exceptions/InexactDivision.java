public class InexactDivision extends Exception {

	private int num;
	private int dem;
	
	public InexactDivision(int num, int dem) {
		super();
		this.num = num;
		this.dem = dem;
	}

	@Override
	public String toString() {
		return "Result of " + num + "/" + dem + " is not a whole number";
	}
	
}
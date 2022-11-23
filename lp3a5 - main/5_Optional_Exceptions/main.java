public class main {

	public static void main(String[] args) {
		
		try {
			test();
		} catch (InexactDivision e) {
			e.printStackTrace();
		}
	}
	
	public static void test() throws InexactDivision{
		int[] numbers = {4, 8, 5, 16, 32, 21, 64, 128};
		int[] demon = {2, 0, 4, 8, 0, 2, 4};

		for (int i=0; i<numbers.length; i++){
			try{
				if (numbers[i] % 2 != 0){
					throw new InexactDivision(numbers[i], demon[i]); 
				}
				System.out.println(numbers[i] + "/" + demon[i] + " = " + (numbers[i]/demon[i]));
			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
				System.out.println("An error ocurred");
				e.printStackTrace();
			}
		}
	}


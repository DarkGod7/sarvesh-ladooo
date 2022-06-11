package gitLab_practise;

public class adder {

	int num1, num2;
	
	adder(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
		System.out.printf("I am in constructor:", num1,num2);
	}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	//xxxxxxx
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

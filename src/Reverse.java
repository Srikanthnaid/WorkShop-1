
public class Reverse {
	public void toReverseNumber() {
		int num = 123,sum = 0;
		while(num!=0) {
		int rem = num %10;
		sum = sum *10 +rem;
		num = num/10;
		}
		System.out.println("After reverse a number"+sum);
	}

	public static void main(String[] args) {
		Reverse  rev = new Reverse();
		rev.toReverseNumber();

	}

}

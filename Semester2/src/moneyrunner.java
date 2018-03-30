import java.util.ArrayList;
import java.util.List;
public class moneyrunner {
	public static void main(String[]args) {
		List<Money>piggybank= new ArrayList<Money>();
		piggybank.add(new Quarter());
		piggybank.add(new Bill(1));
		piggybank.add(new Nickle());
		piggybank.add(new Dime());
		piggybank.add(new Bill(5));
		piggybank.add(new Quarter());

		System.out.println(piggybank);
		double amount=0;
		for (Money item: piggybank) {
			amount+=item.getAmount();
		}
		System.out.printf("The piggybank holds $%.2f\n", amount);
	}
}

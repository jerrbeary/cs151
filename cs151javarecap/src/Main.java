public class Main {
	public static void main(String args[]) {
		Candidate Ash = new Candidate(123, "Ash", "Ketchum", "Republican");
		Candidate Steve = new Candidate(456, "Steve", "Madden", "Democratic");
		
		Voter Jay = new Voter(678, "Jay", "Saminathen", false);
		Voter Yuito = new Voter(910, "Yuito", "Yamada", true);

		Utility.printInfo(Ash);
		Utility.printInfo(Steve);
		Utility.printInfo(Jay);
		Utility.printInfo(Yuito);
	}
}
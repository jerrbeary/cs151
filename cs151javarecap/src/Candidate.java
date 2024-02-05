public class Candidate {

	private int candId;
	private String firstName;
	private String lastName;
	private String party;

	public Candidate(final int candidateId, String firstName, String lastName, String party) {
		this.candId = candidateId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.party = party;
	}

	public void setCandFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}

	public void setCandLastName(String newLastName) {
		this.lastName = newLastName;
	}

	public String getCandFirstName() {
		return this.firstName.toUpperCase();
	}

	public String getCandLastName() {
		return this.lastName.toUpperCase();
	}

	public String getCandFullName() {
		String fullName = this.firstName + " " + this.lastName;
		return fullName.toUpperCase();
	}

	public String getParty() {
		return this.party;
	}

	public int getCandId() {
		return this.candId;
	}

}
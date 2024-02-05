public class Voter {

	private int voterId;
	private String firstName;
	private String lastName;
	private boolean hasVoted;

	public Voter(final int voterId, String firstName, String lastName, boolean hasVoted) {
		this.voterId = voterId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.hasVoted = hasVoted;
	}

	public void setVoterName(String newFirstName, String newLastName) {
		this.firstName = newFirstName;
		this.lastName = newLastName;
	}

	public String getVoterFirstName() {
		return this.firstName.toUpperCase();
	}

	public String getVoterLastName() {
		return this.lastName.toUpperCase();
	}

	public String getVoterFullName() {
		String fullName = this.firstName + " " + this.lastName;
		return fullName.toUpperCase();
	}

	public int getVoterId() {
		return this.voterId;
	}

	public boolean hasVoted() {
		return hasVoted;
	}
}

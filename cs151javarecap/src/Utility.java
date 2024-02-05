public final class Utility {

	private Utility() {
	}

	public static void printInfo(Candidate c) {
		System.out.println("The candidate's first name is " + c.getCandFirstName() + ". Their last name is "
				+ c.getCandLastName() + ". " + "Their full name is " + c.getCandFullName() + ". Their id is "
				+ c.getCandId() + ". Their political party is " + c.getParty() + ".\n");
	}

	public static void printInfo(Voter v) {
		System.out.println("The voter's first name is " + v.getVoterFirstName() + ". Their last name is "
				+ v.getVoterLastName() + ". " + "Their full name is " + v.getVoterFullName() + ". Their id is "
				+ v.getVoterId() + ". Have they voted? " + v.hasVoted() + ".\n");
	}
}
class SpinLimitException extends Exception {
	@Override
	public String toString() {
		return "The current limit of spins has been reached";

	}
}
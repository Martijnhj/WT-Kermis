class Kermis {
	private double[] bankSaldo = new double[6];
	private double belastbaarGokInkomen;

	void deposit(int index, double price) {
		if(index==5) {
			belastbaarGokInkomen += price;
		} else {
			bankSaldo[index] += price;
		}
	}

	public double getBankSaldo(int index) {
		return bankSaldo[index];
	}

	public double getBelastbaarInkomen() {
		return belastbaarGokInkomen;
	}

	int sumBankSaldo() {
		int sum = 0;
		for (double revenue: bankSaldo) {
			sum += revenue;
		}
		return sum;
	}

	@Override
	public String toString() {
		return "Huidig saldo is " + (sumBankSaldo() + belastbaarGokInkomen);
	}

}

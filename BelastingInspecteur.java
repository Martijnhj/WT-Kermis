//wanneer gebruiken: BelastingInspecteur pieter = new BelastingInspecteur();
//System.out.println(pieter.belastingBerekenen(pieter.gokBelasting, saldoaantal));








class BelastingInsepcteur {
	Belasting gokBelasting = (a) -> a * 0.30;

	double belastingBerekenen(Belasting b, double saldo) {
		return b.berekenenBelasting(saldo);
	}

}

@FunctionalInterface
interface Belasting {
	double berekenenBelasting(double saldo);
}
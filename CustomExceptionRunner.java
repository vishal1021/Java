package com.exceptionhandling;

class AmountR {
	private String currency1;
	private int amountR;

	public AmountR(String currency, int amountR) {
		super();
		this.currency1 = currency;
		this.amountR = amountR;
	}

	public void add(AmountR that) throws CurrenciesDoNotMatchException {

		if (!this.currency1.equals(that.currency1)) {
			// throw new RuntimeException("Currencies Don't Match" + this.currency + " & " +
			// that.currency);
			throw new CurrenciesDoNotMatchException(
					"Currencies Don't Match " + this.currency1 + " & " + that.currency1);
		}

		this.amountR = this.amountR + that.amountR;
	}

	@Override
	public String toString() {
		return amountR + " " + currency1;
	}
}

class CurrenciesDoNotMatchException extends Exception {
	public CurrenciesDoNotMatchException(String msg) {

		super(msg);
	}

}


public class CustomExceptionRunner {

	public static void main(String[] args) throws CurrenciesDoNotMatchException {

		AmountR amount1 = new AmountR("USD", 10);
		AmountR amount2 = new AmountR("EUR", 10);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}

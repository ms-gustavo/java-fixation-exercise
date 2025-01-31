package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {

	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;

	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
	    double baseTax = (getAnualIncome() < 20000.0) ? 
	                     getAnualIncome() * 0.15 : 
	                     getAnualIncome() * 0.25;

	    double discount = (healthExpenditures > 0) ? healthExpenditures * 0.5 : 0.0;

	    return Math.max(0.0, baseTax - discount);
	}

}

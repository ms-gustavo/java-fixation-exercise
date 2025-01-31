package entities;

public class Company extends TaxPayer {

	public Integer numberOfEmployees;

	public Company() {
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double baseTax = (numberOfEmployees > 10) ? getAnualIncome() * 0.14 : getAnualIncome() * 0.16;

		return baseTax;

	}

}

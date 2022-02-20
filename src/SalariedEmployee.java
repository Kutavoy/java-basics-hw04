public class SalariedEmployee extends Employee {
  public String socialSecurityNumber;
  public double fixedMonthlyPayment;


  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    super(employeeId, name);
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment() {
    return fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    this.fixedMonthlyPayment = fixedMonthlyPayment;
  }

  public void calculatePay() {
    averageMonthlySalary = fixedMonthlyPayment;
  }

  @Override
  public String toString() {
    this.getAverageMonthlySalary();
    return getName() + String.format("%.2f", fixedMonthlyPayment);
  }

}
public class ContractedEmployee extends Employee {
  public String federalTaxId;
  public static double numberOfHoursWorked;
  public double hourlyRate;
  public double averageMonthlySalary;


  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super(federalTaxId, name);
    this.name = name;
    this.federalTaxId = federalTaxId;
  }

  public String getFederalTaxId() {
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {
    return numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    this.numberOfHoursWorked = numberOfHoursWorked;
  }

  public double getAverageMonthlySalary() {
    return averageMonthlySalary;
  }

  public void calculatePay() {
    averageMonthlySalary = numberOfHoursWorked * hourlyRate;
  }

  @Override
  public String toString() {
    this.getAverageMonthlySalary();
    return getName() + String.format("%.2f", averageMonthlySalary);
  }
}
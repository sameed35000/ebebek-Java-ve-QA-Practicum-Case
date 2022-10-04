public class Employee {
	private String name;
	private int salary;
	private int workHours;
	private int hireYear;

	Employee(String name, int salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	double tax() {
		double salaryTax = 0.0;
		if (this.salary <= 1000) {
			salaryTax = 0.0;
			return 0.0;
		} else if (this.salary > 1000) {
			salaryTax = this.salary * 0.03;
		}
		return salaryTax;
	}

	double bonus() {
		double overTime;
		double salaryBonus = 0.0;
		if (this.workHours > 40) {
			overTime = this.workHours - 40;
			salaryBonus = overTime * 30.0;
		}
		return salaryBonus;
	}

	double raiseSalary() {
		double raiseAmount = 0.0;
		int currentYear = 2021;
		if (currentYear - this.hireYear < 10) {
			raiseAmount = this.salary * 0.05;
		} else if (9 < currentYear - this.hireYear && currentYear - this.hireYear < 20) {
			raiseAmount = this.salary * 0.10;
		} else if (currentYear - this.hireYear > 19) {
			raiseAmount = this.salary * 0.15;
		}
		return raiseAmount;
	}

	public String toString() {
		System.out.println("Adı: " + this.name);
		System.out.println("Maaşı: " + this.salary);
		System.out.println("Çalışma Saati: " + this.workHours);
		System.out.println("Başlangıç Yılı: " + this.hireYear);
		System.out.println("Kesilecek Vergi: " + tax());
		System.out.println("Fazla Mesai Bonusu: " + bonus());
		System.out.println("Deneyime Göre Yapılacak Maaş Zammı: " + raiseSalary());
		System.out.println("Toplam Maaş: " + (this.salary + bonus() + raiseSalary()));
		System.out.println("Vergiler Kesildikten Sonraki Maaş: " + ((this.salary + bonus() + raiseSalary()) - tax()));
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

}

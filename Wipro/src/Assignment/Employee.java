package Assignment;

public class Employee {
int empno;
String name;
String date;
String deptcode;
String dept;
int basic;
int hra;
int it;
String designation;
int dA;
int salary;

public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getDeptcode() {
	return deptcode;
}
public void setDeptcode(String deptcode) {
	this.deptcode = deptcode;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getdA() {
	return dA;
}
public void setdA(int dA) {
	this.dA = dA;
}
public Employee(int empno, String name, String date, String deptcode,
		String dept, int basic, int hra, int it) {
	this.empno = empno;
	this.name = name;
	this.date = date;
	this.dept = dept;
	this.deptcode = deptcode;
	this.basic = basic;
	this.hra = hra;
	this.it = it;
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getDeptCode() {
	return deptcode;
}
public void setDeptCode(String deptCode) {
	this.deptcode = deptCode;
}
public int getBasic() {
	return basic;
}
public void setBasic(int basic) {
	this.basic = basic;
}
public int getHra() {
	return hra;
}
public void setHra(int hra) {
	this.hra = hra;
}
public int getIt() {
	return it;
}
public void setIt(int it) {
	this.it = it;
}
public String toString() {
	return "Employee [empno=" + empno + ", name=" + name + ", date=" + date
			+ ", dept=" + dept + ", deptCode=" + deptcode + ", basic=" + basic
			+ ", hra=" + hra + ", it=" + it + "]";
}
void getDAsal(String s)
{
	switch(s)
	{
	case "e":
		setDesignation("Engineer");
		setdA(20000);
		setSalary(getBasic()+getHra()+getdA()-getIt());
		break;
	case "c":
		setDesignation("Consultant");
		setdA(32000);
		setSalary(getBasic()+getHra()+getdA()-getIt());
		break;
	case "k":
		setDesignation("Clerk");
		setdA(12000);
		setSalary(getBasic()+getHra()+getdA()-getIt());
		break;
	case "r":
		setDesignation("Receptionist");
		setdA(15000);
		setSalary(getBasic()+getHra()+getdA()-getIt());
		break;	
	case "m":
		setDesignation("Manager");
		setdA(40000);
		setSalary(getBasic()+getHra()+getdA()-getIt());
		break;		
	}
}
}

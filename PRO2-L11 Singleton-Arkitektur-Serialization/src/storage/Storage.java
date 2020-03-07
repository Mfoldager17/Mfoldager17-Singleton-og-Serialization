package storage;

import java.io.Serializable;
import java.util.ArrayList;

import application.model.Company;
import application.model.Employee;

public class Storage implements Serializable {
	private static ArrayList<Company> companies = new ArrayList<>();
	private static ArrayList<Employee> employees = new ArrayList<>();
	private static Storage newStorage;

	private Storage() {
	}

	public static Storage getStorage() {
		if (newStorage == null) {
			newStorage = new Storage();
		}
		return newStorage;
	}

	// -------------------------------------------------------------------------

	public ArrayList<Company> getCompanies() {
		return new ArrayList<Company>(companies);
	}

	public void addCompany(Company company) {
		companies.add(company);
	}

	public void removeCompany(Company company) {
		companies.remove(company);
	}

	// -------------------------------------------------------------------------

	public ArrayList<Employee> getEmployees() {
		return new ArrayList<Employee>(employees);
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	// -------------------------------------------------------------------------

}

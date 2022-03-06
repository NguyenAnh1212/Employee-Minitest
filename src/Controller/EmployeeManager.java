package Controller;

import Model.Employee;
import Model.FulltimeEmployee;
import Model.ParttimeEmployee;

import java.util.ArrayList;

public class EmployeeManager {
    public static ArrayList<Employee> employeeList;

    public static void showAllEmployee(){
        for(Employee m : employeeList){
            System.out.println(m);
        }
    }

    public static void addNewEmployee(Employee newEmployee){
        employeeList.add(newEmployee);
    }

    public static void editEmployeeById(int index, Employee newEmployee){
        employeeList.set(index, newEmployee);
    }

    public static void deleteEmployeeById(int index){
        employeeList.remove(index);
    }

    public static int getIndexById(String inputEmployeeId) {
        int index = -1;
        for (int i = 0; i < employeeList.size() ; i++) {
            Employee employee = employeeList.get(i);
            if (inputEmployeeId.equals(employee.getEmployeeId())){
                index = i;
            }
        }
        return index;
    }

    // Liệt kê danh sách nhân viên fulltime có mức lương thấp hơn
    // mức lương trung bình của nhân viên trong công ty.
    public static double getAvgSalary() {
        double SumSalary = 0;
        double AvgSalary;
        for (Employee e: employeeList
        ) {
            SumSalary += e.getNetSalary();
        }
        AvgSalary = SumSalary/ employeeList.size();
        return AvgSalary;
    }

    public static ArrayList<Employee> showUnderAvgSalaryFulltimeEmployee(){
        ArrayList<Employee> employees = new ArrayList<>();
        for (Employee e: employeeList
        ) {
            if(e instanceof FulltimeEmployee){
                if(e.getNetSalary() < getAvgSalary()){
                    System.out.println(e);
                }
            }
        }
        return employees;
    }

    public static double getSumSalaryParttimeEmployee(){
        double SumSalary = 0;
        for (Employee e: employeeList
        ) {
            if (e instanceof ParttimeEmployee){
                SumSalary += e.getNetSalary();
            }
        }
        return SumSalary;
    }
    // lấy danh sách fulltime
    public static ArrayList<FulltimeEmployee> getFulltimeEmployees(){
        ArrayList<FulltimeEmployee> fulltimeEmployees = new ArrayList<>();
        for (Employee e: employeeList
        ) {
            if (e instanceof FulltimeEmployee){
                fulltimeEmployees.add((FulltimeEmployee) e);
            }
        }
        return fulltimeEmployees;
    }
}

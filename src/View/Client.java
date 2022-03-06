package View;

import Controller.EmployeeManager;
import Model.Employee;
import Model.FulltimeEmployee;
import Model.ParttimeEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private static ArrayList<Employee> employeeListClient = EmployeeManager.employeeList;

    public static void main(String[] args) {
//        showAllEmployee();
        addNewEmployee();
        System.out.println();
    }
    public static void showAllEmployee(){
        if(employeeListClient.size() == 0){
            System.out.print("Nothing to see here...");
        }else{
            for (Employee e: employeeListClient
            ) {
                System.out.println(e);
            }
        }
    }

    public static void addNewEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhấn 1 để thêm mới Fulltime, nhấn 2 để thêm mới parttime");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                addNewFulltimeEmployee();
            case 2:
                addNewParttimeEmployee();
        }
    }
    public static void addNewFulltimeEmployee(){
        Employee fulltimeEmployee = creatNewFulltimeEmployee();
        EmployeeManager.addNewEmployee(fulltimeEmployee);
    }
    public static void addNewParttimeEmployee(){
        Employee parttimeEmployee = creatNewParttimeEmployee();
        EmployeeManager.addNewEmployee(parttimeEmployee);
    }

    public static Employee creatNewFulltimeEmployee(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: " );
        String employeeId = scanner1.nextLine();

        System.out.println("Nhập họ tên: ");
        Scanner scanner2 = new Scanner(System.in);
        String fullName = scanner2.nextLine();

        System.out.println("Nhập tuổi: ");
        Scanner scanner3 = new Scanner(System.in);
        int age = scanner3.nextInt();

        System.out.println("Nhập số điện thoại: ");
        Scanner scanner4 = new Scanner(System.in);
        String phoneNumber = scanner4.nextLine();

        System.out.println("Nhập email: ");
        Scanner scanner5 = new Scanner(System.in);
        String email = scanner5.nextLine();

        System.out.println("Nhập tiền thưởng: ");
        Scanner scanner6 = new Scanner(System.in);
        int bonus = scanner6.nextInt();

        System.out.println("Nhập tiền phạt: ");
        Scanner scanner7 = new Scanner(System.in);
        int fineMoney = scanner7.nextInt();

        System.out.println("Nhập lương cơ bản: ");
        Scanner scanner8 = new Scanner(System.in);
        int basicSalary = scanner8.nextInt();

        Employee fulltimeEmployee = new FulltimeEmployee(employeeId, fullName, age, phoneNumber, email, bonus, fineMoney, basicSalary ) ;
        return fulltimeEmployee;
    }

    public static Employee creatNewParttimeEmployee(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: " );
        String employeeId = scanner1.nextLine();

        System.out.println("Nhập học tên: ");
        Scanner scanner2 = new Scanner(System.in);
        String fullName = scanner2.nextLine();

        System.out.println("Nhập tuổi: ");
        Scanner scanner3 = new Scanner(System.in);
        int age = scanner3.nextInt();

        System.out.println("Nhập số điện thoại: ");
        Scanner scanner4 = new Scanner(System.in);
        String phoneNumber = scanner4.nextLine();

        System.out.println("Nhập email: ");
        Scanner scanner5 = new Scanner(System.in);
        String email = scanner5.nextLine();

        System.out.println("Nhập số giờ làm: ");
        Scanner scanner6 = new Scanner(System.in);
        double workHour = scanner6.nextDouble();

        Employee parttimeEmployee = new ParttimeEmployee(employeeId, fullName, age, phoneNumber, email, workHour ) ;
        return parttimeEmployee;
    }
}

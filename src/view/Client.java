package view;

import controller.EmployeeManager;
import model.Employee;
import model.FulltimeEmployee;
import model.ParttimeEmployee;
import storage.EmployeeFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private static ArrayList<Employee> employeeListClient = EmployeeFile.readFile();

    public static void main(String[] args) {
        System.out.println("Số nhân viên bạn muốn thêm vào: ");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        for (int i = 0; i < inputNumber; i++) {
            addNewEmployee();
        }
//        showAllEmployee();
//        System.out.println("\n");
//        EmployeeManager.deleteEmployeeById(0);
        showAllEmployee();
//        System.out.println("\n");
//        showAllEmployee();



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
                break;
            case 2:
                addNewParttimeEmployee();
                break;
            default:
                System.out.println("Mời nhập lại");
        }


    }
    public static void addNewFulltimeEmployee(){
        EmployeeManager.employeeList = employeeListClient;
        Employee fulltimeEmployee = creatNewFulltimeEmployee();
        EmployeeManager.addNewEmployee(fulltimeEmployee);
        try {
            EmployeeFile.writeFile(employeeListClient);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void addNewParttimeEmployee(){
        EmployeeManager.employeeList = employeeListClient;
        Employee parttimeEmployee = creatNewParttimeEmployee();
        EmployeeManager.addNewEmployee(parttimeEmployee);
        try {
            EmployeeFile.writeFile(employeeListClient);
        } catch (IOException e) {
            e.printStackTrace();
        }
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

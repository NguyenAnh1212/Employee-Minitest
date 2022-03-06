package Model;

public abstract class Employee {
    private String employeeId;
    private String fullName;
    private int age;
    private String phoneNumber;
    private String email;

    public Employee() {
    }

    public Employee(String employeeId, String fullName, int age, String phoneNumber, String email) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    public abstract double getNetSalary();

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "EmployeeId: " + employeeId +
                ", FullName: " + fullName +
                ", Age: " + age +
                ", Phone Number: " + phoneNumber +
                ", Email: " + email ;
    }
}

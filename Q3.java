import java.util.ArrayList;

class Employee{
    private int empId;
    private String empName;
    private String empDesignation;
    private int empSalary;
    private String empLocation;

    public Employee(int empId, String empName, String empDesignation, int empSalary, String empLocation) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
        this.empLocation = empLocation;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                ", empSalary=" + empSalary +
                ", empLocation='" + empLocation + '\'' +
                '}';
    }
}

public class Q3 {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Alferd","Janitor",9000,"Buffalo"));
        employees.add(new Employee(2,"Ben","Senior Executive",85000,"Lockport"));
        employees.add(new Employee(3,"Clark","CEO",145000,"Middletown"));
        employees.add(new Employee(4,"Danny","COO",145000,"Ithaca"));
        employees.add(new Employee(5,"Eva","COT",145000,"Mount Vernon"));
        employees.add(new Employee(6,"Florence","Assistant Manager",55000,"Geneva"));
        employees.add(new Employee(7,"Garret","Tech Support Manager",70000,"Newburgh"));
        employees.add(new Employee(8,"Hank","Finance",45000,"Rochester"));
        employees.add(new Employee(9,"Josh","Project Manager",50000,"Watertown"));
        employees.add(new Employee(10,"Ian","Assistant",32000,"Columbia"));

        System.out.println(" All names of employees: \n");
        employees.stream().forEach(e->System.out.println(e.getEmpName()));

        System.out.println("\n All salaries greater than 50,000: \n");
        employees.stream().filter(e->e.getEmpSalary()>50000).forEach(e->System.out.println("Name : " + e.getEmpName() + " , Salary : " + e.getEmpSalary()));

        System.out.println("\n All locations starting with letter \'M\' : \n");
        employees.stream().filter(e->e.getEmpLocation().startsWith("M")).forEach(e->System.out.println("Name : " + e.getEmpName() + " , Location : " + e.getEmpLocation()));

        System.out.println("\n All designations ending with \'E\'");
        employees.stream().filter(e->e.getEmpDesignation().endsWith("e")).forEach(e-> System.out.println("Name : " + e.getEmpName() + " , Designation : " + e.getEmpDesignation()));

    }
}

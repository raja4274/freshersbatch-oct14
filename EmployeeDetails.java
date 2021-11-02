import java.util.HashSet;
import java.util.Set;
 class Employe
{


    private int id;
    private String name;
    private int age;
    private double salary;
    private  String dept;



    public Employe(int id,String name, int age,double salary,String dept)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Employe employee = (Employe) o;

        if (id != employee.id) {
            return false;
        }
        if (!name.equals(employee.name)) {
            return false;
        }
        if (age != employee.age) {
            return false;
        }
        if (salary != employee.salary) {
            return false;
        }
        if (dept != employee.dept) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = name.hashCode();
         int result1 = dept.hashCode()+result;
        result1 = 31 * result1 + id+age;
        return result1;
    }

    @Override
    public String toString()
    {
        return "{" +
                "name='" + name + '\'' +
                ", age= " + age + " id= "+id+" salary= "+salary+" dept= "+dept+
                '}';
    }
}

class EmployeeDetails {
    public static void main(String[] args) {
        Employe e1 = new Employe(232,"Raja",21,6000,"EEE");
        Employe e2 = new Employe(233, "Anil",22,19000,"EEE");

        Set<Employe> getDetails = new HashSet<>();
        System.out.println("FIRST EMPLOYEE DETAILS");
        getDetails.add(e1);
        System.out.println(e1);
        System.out.println("SECOND EMPLOYEE DETAILS");
        getDetails.add(e2);
        System.out.println(e2);
    }
}
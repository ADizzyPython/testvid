class Employee
{
    String name;
    float total_salary, base_salary;
    void salary(float base_salary)
    {
        total_salary = (base_salary * (50/100)) + base_salary;
        return total_salary;
    }

public static void main(String args[])
{
 Employee obj = new Employee(); 
 float ans = obj.salary(1000000);
 System.out.println(ans);
}
}   
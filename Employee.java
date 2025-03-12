//package GetterSetterMethods;

public class Employee {
    




    String name,address,dept;
    int id,age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.setName("Vaishnavi");
    System.out.println("Name of employe is " +emp1.getName());

    emp1.setAddress("Mumbai");
    System.out.println("Address is " +emp1.getAddress());

    emp1.setAge(25);
    System.out.println("Age is " +emp1.getAge());

    emp1.setDept("B.Com");
    System.out.println("Department is " +emp1.getDept());

        
    }
    
}

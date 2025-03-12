//package Gettersettermethods;
public class Student{
    
    String name,address,course;

    int age ,id;
//Name SET/GET
    void setName(String newName)
    {
        this.name = newName;
    }

    String getName()
    {
        return name;
    }
//Address SET/GET
    void setAddress(String newAddress)
    {
        this.address = newAddress;
    }
    String getAddress()
    {
        return address;
    }
 //Age SET/GET
 void setAge(int newAge)
 {
    this.age = newAge;
 }
 int getAge()
 {
    return age;
 }

 public static void main(String[]args)
 {
    Student student1 = new Student();
    student1.setName("Vaishnavi");
    System.out.println("Name of stud is " +student1.getName());

    student1.setAddress("Mumbai");
    System.out.println("Address is" +student1.getAddress());

    student1.setAge(25);
    System.out.println("Age is" +student1.getAge());

 }
}





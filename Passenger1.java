public class Passenger1{


    String name,ticketNumber;
    int age;

     // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Getter and Setter for ticketNumber
    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public static void main(String[]args){
        Passenger1 p1=new Passenger1();

        p1.setName("Vaishnavi");
        System.out.println("Passenger Name: " + p1.getName());

        p1.setAge(20);
        System.out.println("Passenger Age: " + p1.getAge());

        p1.setTicketNumber("A12345");
        System.out.println("Passenger Ticket Number: " + p1.getTicketNumber());

    }
}
/**
 * Class Employee created to represent a type of Person   
 */
public class Employee extends Person{
    private String position;
    private double salary;

    /**
     * Default constructor
     */
    public Employee(){
        super();
        position = "none";
        salary = 0.0;
    }

    /**
     * Constructor with five parameters from base class + parameters for current class
     * @param id initial value for the id
     * @param name initial value for the name
     * @param address initial value for the address
     * @param phone initial value for the phone number
     * @param email initial value for the email address
     * @param position initial value for the position
     * @param salary initial value for the salary
     */
    public Employee(int id, String name, String address, String phone, String email, String position, double salary){
        super(id, name, address, phone, email);
        this.position = position;
        this.salary = salary;
    }

    /**
     * Accessor for the position
     * @return value of the position
     */
    public String getPosition(){return position;}
    /**
     * Accessor for the salary
     * @return value of the salary
     */
    public double getSalary(){return salary;}

    /**
     * Accessor for the Employee attributes
     * @return formatted string with the object attributes
     */
    @Override
    public String toString(){
        String str = String.format("Position: %s\nSalary: $%.2f\n", position, salary);
        return super.toString() + str;
    }

    /**
     * Mutator for the position
     * @param id value of the position
     */
    public void setPosition(String position){this.position = position;}
    /**
     * Mutator for the salary
     * @param id value of the salary
     */    
    public void setSalary(double salary){this.salary = salary;}
}
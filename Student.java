/**
 * Class Student created to represent a type of Person   
 */
public class Student extends Person{
    private String major;

    /**
     * Default constructor
     */
    public Student(){
        super();
        major = "None";
    }

    /**
     * Constructor with five parameters from base class + parameters for current class
     * @param id initial value for the id
     * @param name initial value for the name
     * @param address initial value for the address
     * @param phone initial value for the phone number
     * @param email initial value for the email address
     * @param major initial value for the major
     */
    public Student(int id, String name, String address, String phone, String email, String major){
        super(id, name, address, phone, email);
        this.major = major;
    }

    /**
     * Accessor for the major
     * @return value of the major
     */
    public String getMajor(){return major;}

    /**
     * Accessor for the Student attributes
     * @return formatted string with the object attributes
     */
    @Override
    public String toString(){
        String str = String.format("Major: %s\n", major);
        return super.toString() + str;
    }

    /**
     * Mutator for the major
     * @param id value of the major
     */
    public void setMajor(String major){this.major = major;}
}
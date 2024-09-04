/**
 * Class Faculty created to represent a type of Employee   
 */
public class Faculty extends Employee{
    private String rank;

    /**
     * Default constructor
     */
    public Faculty(){
        super();
        this.rank = "none";
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
     * @param rank initial value for the rank
     */
    public Faculty(int id, String name, String address, String phone, String email, String position, double salary, String rank){
        super(id, name, address, phone, email, position, salary);
        this.rank = rank;
    }

    /**
     * Accessor for the rank
     * @return value of the rank
     */
    public String getRank(){return rank;}

    /**
     * Accessor for the Faculty attributes
     * @return formatted string with the object attributes
     */
    @Override
    public String toString(){
        String str = String.format("Rank: %s\n", rank);
        return super.toString() + str;
    }

    /**
     * Mutator for the rank
     * @param id value of the rank
     */ 
    public void setRank(String rank){this.rank = rank;}
}
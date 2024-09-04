/**
 * Test class created to test the Person, Student, Employee, and Faculty classes
 */
public class Test{
    public static void main(String[]args){
        //creating and initializing the Person array
        Person[] people = new Person[3];
        people[0] = new Student(123456789, "Paul Leister", "972 4th Street, Allentown", "610-331-7177", "pleister@gmail.com", "CSE");
        people[1] = new Employee(334422110, "Beth Down", "234 Main Street, Philadelphia", "484-222-4433", "bdown@gmail.com", "System Administrator", 75000.00);
        people[2] = new Faculty(222222222, "Mark Jones", "21 Orchid Street, Bethlehem", "610-333-2211", "mjones@gmail.com", "Faculty", 100000.00, "Associate Professor");

        //printing the original list in the array
        System.out.println("Original list:");
        printArray(people);

        //sort and print by name
        System.out.println("List sorted by name:");
        sortArray(people, true);
        printArray(people);

        //sort and print by ID
        System.out.println("List sorted by ID:");
        sortArray(people, false);
        printArray(people);
    }

    /**
     * Printer of the Person array
     * @param list The Person array being printed
     */
    public static void printArray(Person[]list){
        for (Person p : list){
            System.out.println(p);
        }
    }

    /**
     * Selection sort algorith to sort by either name or id
     * @param list The Person array being sorted
     * @param b True/False value that determines what to sort by
     */
    public static void sortArray(Person[]list, boolean b){
    	for(int i=0; i<list.length; i++){
      		int minIndex = i;
      		for(int j=i+1; j<list.length; j++){    
                if(b){ //sort by name
                    if(list[j].getName().compareTo(list[minIndex].getName()) < 0)
                        minIndex=j;
                }
                else{ //sort by ID
                    if(list[j].getID() < list[minIndex].getID())
                        minIndex=j;  
                }
            }
      		Person temp = list[i];
      		list[i] = list[minIndex];
      		list[minIndex] = temp;
    	}
    }
}
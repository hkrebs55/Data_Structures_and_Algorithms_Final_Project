public class Main {


    public static void main(String[] args) {
        Queue run = new Queue();

        //add persons
        run.inputPersons();
        System.out.println("The persons you entered are:\n" + run.queuedPerson.toString());

        //change queue to ArrayList
        run.queueToArrayList(run.queuedPerson);

        //sort by last name, change to queue, and print
        run.quickSortForLastName(run.listPerson, 0, run.listPerson.size() - 1);
        run.arrayListToQueue(run.listPerson);
        System.out.println("The list has been sorted by last name and is as follows:\n" + run.queuedPerson.toString());

        //change queue to ArrayList to sort again
        run.queueToArrayList(run.queuedPerson);

        //sort by age, change to queue, and print
        run.quickSortForAge(run.listPerson, 0, run.listPerson.size() - 1);
        run.arrayListToQueue(run.listPerson);
        System.out.println("The list has been sorted by age and is as follows:\n" + run.queuedPerson.toString());
    }
}

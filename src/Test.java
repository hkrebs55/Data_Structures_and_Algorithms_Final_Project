public class Test {

    Queue testQueue = new Queue();

    //test that a person was added
    void personWasAdded1() {
        testQueue.addPerson(new PersonAndAge("Test", "Subject", 1));
        System.out.println(testQueue.queuedPerson.toString());
    }

    //test that two persons were added
    void personsWereAdded1() {
        testQueue.addPerson(new PersonAndAge("Test", "Subject", 1));
        testQueue.addPerson(new PersonAndAge("Test", "Subject", 2));
        System.out.println(testQueue.queuedPerson.toString());

    }

    //test Scanner add persons
    void personsWereAddedViaScanner() {
        testQueue.inputPersons();
        System.out.println(testQueue.queuedPerson.toString());
    }

    //test sorting by age in descending order
    //add persons and print queue
    //change queue to ArrayList to sort
    //sort and print ArrayList
    //change ArrayList to queue
    //print sorted queue and blank ArrayList
    void sortByAge() {
        testQueue.addPerson(new PersonAndAge("Test", "Subject", 1));
        testQueue.addPerson(new PersonAndAge("Test", "Subject", 2));
        testQueue.addPerson(new PersonAndAge("Test", "Subject", 3));
        testQueue.addPerson(new PersonAndAge("Test", "Subject", 4));
        System.out.println(testQueue.queuedPerson.toString());

        testQueue.queueToArrayList(testQueue.queuedPerson);

        testQueue.quickSortForAge(testQueue.listPerson, 0, testQueue.listPerson.size() - 1);
        System.out.println(testQueue.listPerson);

        testQueue.arrayListToQueue(testQueue.listPerson);
        System.out.println(testQueue.queuedPerson.toString());
        System.out.println(testQueue.listPerson);
    }

    //test sorting by last name in descending order
    //add persons and print queue
    //change queue to ArrayList to sort
    //sort and print ArrayList
    //change ArrayList to queue and print sorted queue
    void sortByName() {
        testQueue.addPerson(new PersonAndAge("Test", "Alex", 1));
        testQueue.addPerson(new PersonAndAge("Test", "Brenda", 2));
        testQueue.addPerson(new PersonAndAge("Test", "Charlie", 3));
        testQueue.addPerson(new PersonAndAge("Test", "Dexter", 4));

        System.out.println(testQueue.queuedPerson.toString());

        testQueue.queueToArrayList(testQueue.queuedPerson);

        testQueue.quickSortForLastName(testQueue.listPerson, 0, testQueue.listPerson.size() - 1);
        System.out.println(testQueue.listPerson);

        testQueue.arrayListToQueue(testQueue.listPerson);
        System.out.println(testQueue.queuedPerson.toString());
    }


    public static void main(String[] args) {
        Test test = new Test();

        test.personWasAdded1();
        test.personsWereAdded1();
        test.personsWereAddedViaScanner();
        test.sortByAge();
        test.sortByName();
    }
}

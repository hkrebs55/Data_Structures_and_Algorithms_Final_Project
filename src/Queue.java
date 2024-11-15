import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Queue {

    PriorityQueue<PersonAndAge> queuedPerson = new PriorityQueue<>();
    ArrayList<PersonAndAge> listPerson = new ArrayList<>();

    //add inputted info to the queue
    public void addPerson(PersonAndAge person) {
        queuedPerson.add(person);
    }

    public void inputPersons() {
        int entries = 0;
        Scanner input = new Scanner(System.in);

        try {
            while (entries < 5) {
                System.out.println("Enter in the persons first name:");
                String firstName = input.nextLine();
                System.out.println("Enter in the persons last name:");
                String lastName = input.nextLine();
                System.out.println("Enter in the persons age:");
                int age = input.nextInt();
                input.nextLine();

                entries = entries + 1;

                addPerson(new PersonAndAge(firstName, lastName, age));
            }
        } catch (Exception e) {
            System.out.println("Something was entered in incorrectly.");
        }
    }

    //change queue to ArrayList so it can be sorted
    public void queueToArrayList(PriorityQueue<PersonAndAge> queue) {
        while (!queue.isEmpty()) {
            listPerson.add(queue.remove());
        }
    }

    //change ArrayList to queue
    public void arrayListToQueue(ArrayList<PersonAndAge> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            queuedPerson.add(arrayList.get(i));
        }
        arrayList.removeAll(arrayList);
    }

    //For Age
    //set divide point and arrange elements according to that
    private int partitionForAge(ArrayList<PersonAndAge> listAge, int frontAge, int endAge) {
        int pivotPoint = listAge.get(endAge).getAge();
        int i = frontAge - 1;
        for (int j = frontAge; j < endAge; j++) {
            if (listAge.get(j).getAge() >= pivotPoint) {
                i++;

                PersonAndAge tempSpot = listAge.get(i);
                listAge.set(i, listAge.get(j));
                listAge.set(j, tempSpot);
            }
        }

        PersonAndAge tempSport = listAge.get(i + 1);
        listAge.set(i + 1, listAge.get(endAge));
        listAge.set(endAge, tempSport);

        return i + 1;
    }

    //sort list in descending order by age
    public void quickSortForAge(ArrayList<PersonAndAge> listAge, int frontAge, int endAge) {
        if (frontAge < endAge) {
            int partitionIndex = partitionForAge(listAge, frontAge, endAge);

            quickSortForAge(listAge, frontAge, partitionIndex - 1);
            quickSortForAge(listAge, partitionIndex + 1, endAge);

        }
    }


    //For Last Name
    //set divide point and arrange elements according to that
    private int partitionForLastName(ArrayList<PersonAndAge> listLastName, int frontLastName, int endLastName) {
        String pivotPoint = listLastName.get(endLastName).getLastName();
        int i = frontLastName - 1;
        for (int j = frontLastName; j < endLastName; j++) {
            if (listLastName.get(j).getLastName().compareTo(pivotPoint) > 0) {
                i++;

                PersonAndAge tempSpot = listLastName.get(i);
                listLastName.set(i, listLastName.get(j));
                listLastName.set(j, tempSpot);
            }
        }

        PersonAndAge tempSport = listLastName.get(i + 1);
        listLastName.set(i + 1, listLastName.get(endLastName));
        listLastName.set(endLastName, tempSport);

        return i + 1;
    }

    //sort list in descending order by age
    public void quickSortForLastName(ArrayList<PersonAndAge> listLastName, int frontLastName, int endLastName) {
        if (frontLastName < endLastName) {
            int partitionIndex = partitionForLastName(listLastName, frontLastName, endLastName);

            quickSortForLastName(listLastName, frontLastName, partitionIndex - 1);
            quickSortForLastName(listLastName, partitionIndex + 1, endLastName);

        }
    }

}

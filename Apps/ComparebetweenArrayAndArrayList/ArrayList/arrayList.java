package ArrayList;

public class arrayList {

    public static void main(String[] args) {
        Course automation = new Course();

        Topic firstTopic = new Topic("JavaScript");
        Topic secondTopic = new Topic("Eclipse IDE");
        Topic thirdTopic = new Topic("Exceptions");
        Topic forthTopic = new Topic("Collections");

        automation.addTopic(firstTopic);
        automation.printCourse1();
        automation.getNumOfDefinedTopics();
        System.out.println("-----------------------------------------------------------------------------------------");

        automation.addTopic(secondTopic);
        automation.printCourse1();
        automation.getNumOfDefinedTopics();
        System.out.println("-----------------------------------------------------------------------------------------");

        automation.addTopic(thirdTopic);
        automation.printCourse1();
        automation.getNumOfDefinedTopics();
        System.out.println("-----------------------------------------------------------------------------------------");

        automation.addTopic(forthTopic);
        automation.printCourse1();
        automation.getNumOfDefinedTopics();
        System.out.println("-----------------------------------------------------------------------------------------");

        automation.removeTopic(2);
        System.out.println("-----------------------------------------------------------------------------------------");

        automation.removeTopic(8);
        System.out.println("-----------------------------------------------------------------------------------------");

        automation.printCourse1();
        automation.getNumOfDefinedTopics();
        System.out.println("-----------------------------------------------------------------------------------------");

        automation.printCourse(2);
        System.out.println("-----------------------------------------------------------------------------------------");

        automation.printCourse(7);
        System.out.println("-----------------------------------------------------------------------------------------");

    }

}

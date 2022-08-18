package Array;

public class array {

    public static void main(String[] args) {
        Course automation = new Course();

        Topic firstTopic = new Topic("JavaScript");
        Topic secondTopic = new Topic("Eclipse IDE");
        Topic thirdTopic = new Topic("Exceptions");
        Topic forthTopic = new Topic("Collections");

        automation.addTopic(firstTopic);
        automation.printCourse();
        automation.getNumOfDefinedTopics();
        System.out.println("-----------------------------------------------------------------------------------------");

        automation.addTopic(secondTopic);
        automation.printCourse();
        automation.getNumOfDefinedTopics();
        System.out.println("-----------------------------------------------------------------------------------------");

        automation.addTopic(thirdTopic);
        automation.printCourse();
        automation.getNumOfDefinedTopics();
        System.out.println("-----------------------------------------------------------------------------------------");

        automation.addTopic(forthTopic);
        automation.printCourse();
        automation.getNumOfDefinedTopics();
        System.out.println("-----------------------------------------------------------------------------------------");

        automation.removeTopic(1);
        System.out.println("-----------------------------------------------------------------------------------------");

        automation.printCourse();
        automation.getNumOfDefinedTopics();
        System.out.println("-----------------------------------------------------------------------------------------");

        automation.addTopic(forthTopic);
        automation.printCourse();
        automation.getNumOfDefinedTopics();
        System.out.println("-----------------------------------------------------------------------------------------");

        automation.addTopic(thirdTopic);
        automation.printCourse();
        automation.getNumOfDefinedTopics();
        System.out.println("-----------------------------------------------------------------------------------------");

        automation.printCourse(1);
        System.out.println("-----------------------------------------------------------------------------------------");

        automation.printCourse(6);
        System.out.println("-----------------------------------------------------------------------------------------");

    }
}

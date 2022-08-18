package ArrayList;


import java.util.ArrayList;

public class Course {

    ArrayList<Topic> topics = new ArrayList<Topic>();

    public void addTopic (Topic myTopic){
        topics.add(myTopic);
    }

    public void removeTopic (int myIndex){
        try {
            System.out.println("\nWe remove the topic in index no. "+(myIndex+1)+" with name: "+topics.get(myIndex).getName());
            topics.remove(myIndex);
            System.out.println("Topic Deleted! :)\n");
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("\nThe index no. "+(myIndex+1)+" is Invalid!!\n");
        }
    }

    public void getNumOfDefinedTopics(){
        if(topics.size()==1) System.out.println("\nThere is "+topics.size()+" Topic in our Course\n");
        else System.out.println("\nThere are "+topics.size()+" Topics in our Course\n");
    }

    //with integer i
    public  void  printCourse (){
        System.out.println("\nAll the topics we have until now\n");
        for(int i=0;i<topics.size();i++){
            System.out.println("Topic name " +topics.get(i).getName() +" with ID number: "+topics.get(i).getID());
        }
    }

    // with an arraylist
    public  void  printCourse1 (){
        System.out.println("\nAll the topics we have until now\n");
        for(Topic mySearchTopic : topics){
            System.out.println("Topic name " +mySearchTopic.getName()+" with ID number: "+mySearchTopic.getID());
        }
    }

    public  void  printCourse (int place){
        try {
            System.out.println("\nThe topic we have in index number "+(place+1)+":");
            System.out.println("Topic name " + topics.get(place).getName()+" with ID number: "+topics.get(place).getID()+"\n");
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("The index no. "+(place+1)+" is Invalid!!\n");
        }
    }
}

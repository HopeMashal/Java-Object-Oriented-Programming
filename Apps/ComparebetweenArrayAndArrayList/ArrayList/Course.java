package ArrayList;


import java.util.ArrayList;

public class Course {

    ArrayList<Topic> topics = new ArrayList<Topic>();

    public void addTopic (Topic myTopic){
        topics.add(myTopic);
    }

    public void removeTopic (int myIndex){
        try {
            System.out.println("We remove the topic in index no. "+(myIndex+1)+" with name: "+topics.get(myIndex).getName());
            topics.remove(myIndex);
            System.out.println("Topic Deleted! :)");
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("The index no. "+(myIndex+1)+" is Invalid!!");
        }
    }

    public void getNumOfDefinedTopics(){
        if(topics.size()==1) System.out.println("There is "+topics.size()+" Topic in our Course");
        else System.out.println("There are "+topics.size()+" Topics in our Course");
    }

    //with integer i
    public  void  printCourse (){
        System.out.println("All the topics we have until now");
        for(int i=0;i<topics.size();i++){
            System.out.println("Topic name " +topics.get(i).getName() +" with ID number: "+topics.get(i).getID());
        }
    }

    // with an arraylist
    public  void  printCourse1 (){
        System.out.println("All the topics we have until now");
        for(Topic mySearchTopic : topics){
            System.out.println("Topic name " +mySearchTopic.getName()+" with ID number: "+mySearchTopic.getID());
        }
    }

    public  void  printCourse (int place){
        try {
            System.out.println("The topic we have in index number "+(place+1)+":");
            System.out.println("Topic name " + topics.get(place).getName()+" with ID number: "+topics.get(place).getID());
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("The index no. "+(place+1)+" is Invalid!!");
        }
    }
}

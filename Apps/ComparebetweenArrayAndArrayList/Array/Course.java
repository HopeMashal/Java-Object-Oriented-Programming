package Array;

public class Course {
    private int size=3;
    Topic[] topics= new Topic[size];
    private static int index=0;
    private static  int elementDeleted=0;

    public void addTopic (Topic myTopic){
        try{
            topics[index-elementDeleted]=myTopic;
            index++;
        } catch (Exception e){
            System.out.println("\nOur array is FULL!!");
        }
    }

    public void removeTopic (int myIndex){
        try {
            System.out.println("\nWe remove the topic in index no. "+(myIndex+1)+" with name: "+topics[myIndex].getName());
            topics[myIndex]=null;
            elementDeleted++;
            for(int i = myIndex;i<(index-elementDeleted);i++){
                topics[i]=topics[i+1];
            }
            System.out.println("Topic Deleted! :)\n");
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("\nThe index no. "+(myIndex+1)+" is Invalid!!\n");
        }
    }

    public void getNumOfDefinedTopics(){
        if (index-elementDeleted == 1){
            System.out.println("\nThere is "+(index-elementDeleted)+" Topic in our Course\n");
        }
        else {
            System.out.println("\nThere are "+(index-elementDeleted)+" Topics in our Course\n");
        }
    }

    public  void  printCourse (){
        System.out.println("\nAll the topics we have until now\n");
        for(int i=0;i<(index-elementDeleted);i++){
            System.out.println("Topic name " + topics[i].getName() +" with ID number: "+topics[i].getID());
        }
    }

    public  void  printCourse (int place){
        try {
            System.out.println("\nThe topic we have in index number "+(place+1)+":");
            System.out.println("Topic name " + topics[place].getName()+" with ID number: "+topics[place].getID()+"\n");
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("The index no. "+(place+1)+" is Invalid!!\n");
        }
    }
}

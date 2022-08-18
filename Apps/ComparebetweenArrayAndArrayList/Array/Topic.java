package Array;

public class Topic {
    private String Name;
    private  static  int mainID = 0;
    private int id = 0;

    public Topic(String Name){
        this.Name = Name;
        mainID++;
        this.id=mainID;
    }

    public String getName(){
        return Name;
    }

    public void setName (String name){
        this.Name = name;
    }

    public int getID(){
        return id;
    }

}

package Notes.lesson_4;

public class Car {
  private String CarMarker;
  private int CarModel;
  private static int noOfObjects;

  public Car(String marker,int model){
    CarMarker=marker;
    CarModel=model;
    noOfObjects++;
  }

  public String getCarMarker() {
    return CarMarker;
  }

  public void setCarMarker(String carMarker) {
    CarMarker = carMarker;
  }

  public int getCarModel() {
    return CarModel;
  }

  public void setCarModel(int carModel) {
    CarModel = carModel;
  }

  public static int getNoOfObjects() {
    return noOfObjects;
  }
  
}

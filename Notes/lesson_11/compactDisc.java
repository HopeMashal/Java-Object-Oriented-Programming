package Notes.lesson_11;

public class compactDisc implements RetailItem, Displayable {
  private String title, artist;
  private double retailPrice;

  public compactDisc(String title, String artist, double retailPrice) {
    this.title = title;
    this.artist = artist;
    this.retailPrice = retailPrice;
  }

  public compactDisc() {
  }

  public double getRetailPrice(){
    return retailPrice;
  }

  @Override
  public void display() {
    System.out.println("Store = "+storeName+". Title = "+title+". Price = "+retailPrice+". Artist = "+artist);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public void setRetailPrice(double retailPrice) {
    this.retailPrice = retailPrice;
  }

  
}

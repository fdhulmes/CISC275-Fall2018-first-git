

public abstract class Animal implements Comparable<Animal>{
  int legs;
  String name;

  public int getLegs(){
    return this.legs;
  }

  @Override
  public int compareTo(Animal a){
    return this.legs - a.getLegs();
  }
}

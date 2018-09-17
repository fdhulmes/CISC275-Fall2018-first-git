public class Dog extends Animal{

  public String toString(){
    return name + " has " + legs + " legs";
  }
  public Dog(String name, int numLegs){
    this.legs = numLegs;
    this.name = name;
  }
}

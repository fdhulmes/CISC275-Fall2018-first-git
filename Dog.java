public class Dog{
  int legs;
  String name;

  public Dog(String name, int numLegs){
    this.legs = numLegs;
    this.name = name;
  }

  public toString(){
    return name + " has " + numLegs + " legs";
  }
}

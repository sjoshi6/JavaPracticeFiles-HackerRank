interface Homosapiens {
  void showYourPowers();
  void showYourPowers(Object h);
  void showYourPowers(Homosapiens h);
}

class Human implements Homosapiens {
  public void showYourPowers() {
    System.out.println("C");
  }
  public void showYourPowers(Object h) {
    System.out.println("D");
  }
  public void showYourPowers(Homosapiens h) {
    System.out.println("E");
  }
}

class Mutant extends Human implements Homosapiens {
  public void showYourPowers() {
    System.out.println("A");
  }
  public void showYourPowers(Object h){
    System.out.println("B");
  }
  public void showYourPowers(Homosapiens h){
    System.out.println("F");
  }
}

public class Main { 
  public static void main(String[] args) { 
    Object h = new Mutant();
    Mutant mutant = new Mutant();
    Human human = new Human();
    Human person = new Mutant();
       mutant.showYourPowers();
    mutant.showYourPowers(h);
       human.showYourPowers();
    human.showYourPowers(h);
    human.showYourPowers(person);
    mutant.showYourPowers(person); 
  }
}
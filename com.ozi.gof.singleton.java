class Singlton {
private Singlton instance = null;

private Singltone(){}

public Singlton getInstance (){
  if (instance == null) {
    instance = new Singltone();
    System.out.println("Singleton instance has been created.");
  } else {
    System.out.println("Used existed instanse.");
  }
  return instance;
}
}


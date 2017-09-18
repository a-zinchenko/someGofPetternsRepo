class Singlton {
private Singlton instance = null;

private Singltone(){}

public Singlton getInstance (){
  if (instance == null) {instance = new Singltone();
  }
  return instance;
}
}


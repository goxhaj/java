package oca.material;

import java.io.IOException;

public class Portconnector {
  public Portconnector(int port) throws IOException {}
}

class CleanConnector extends Portconnector {
  public CleanConnector(int port) throws IOException {
    super(port);
  }
}

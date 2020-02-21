package ocp.material.exceptions;

import java.io.IOException;

public class Device implements AutoCloseable {
  String header = null;

  public void open() {
    header = "OPENED";
    System.out.println("Device Opened");
  }

  public String read() throws IOException {
    throw new IOException("Unknown");
  }

  public void writeHeader(String str) throws IOException {
    System.out.println("Writing : " + str);
    header = str;
  }

  @Override
  public void close() {
    header = null;
    System.out.println("Device closed");
  }

  public static void testDevice() {
    try (Device d = new Device()) {
      d.open();
      d.read();
      d.writeHeader("TEST");
      d.close();
    } catch (IOException e) {
      System.out.println("Got Exception");
    }
  }

  public static void main(String[] args) {
    Device.testDevice();
  }

  private int getSortOrder(String firstName, final String lastName) {
    final String middleName = "Patricia";
    final String suffix = "JR";
    int id = 0;
    switch (firstName) {
      case "Test":
        return 52;
      case middleName: // DOES NOT COMPILE
        id = 5;
        break;
      case suffix:
        id = 0;
        break;
    }
    return id;
  }
}

package ocp.material;

public class Resource {
  private String data = "DATA";

  String getData() {
    return data;
  }

  void setData(String data) {
    this.data = data == null ? "" : data;
  }

  boolean equals(Resource r) {
    return (r != null && r.getData().equals(this.getData()));
  }

  public static void main(String args[]) {
    System.out.println(new Resource().equals(new Resource()));
  }
}

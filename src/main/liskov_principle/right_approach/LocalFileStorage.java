package main.liskov_principle.right_approach;

public class LocalFileStorage implements FileStorage {

  @Override
  public void saveFile(String fileName, byte[] fileContent) {
    System.out.println("File saving to local : " + fileName);
  }
}

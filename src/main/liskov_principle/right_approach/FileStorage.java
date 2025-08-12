package main.liskov_principle.right_approach;

public interface FileStorage {

  void saveFile(String fileName, byte[] fileContent);

}

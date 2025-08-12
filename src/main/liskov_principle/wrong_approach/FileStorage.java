package main.liskov_principle.wrong_approach;

import java.util.ArrayList;
import java.util.List;

public class FileStorage {

  public void saveFile(String fileName, byte[] fileContent) {
    System.out.println("File save to :" + fileName);
  }
}

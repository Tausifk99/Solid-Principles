package main.liskov_principle.wrong_approach;

import java.util.ArrayList;

public class S3FileStorage extends FileStorage {

  @Override
  public void saveFile(String fileName, byte[] fileContent) {
    if (!fileName.endsWith(".pdf")) {
      throw new RuntimeException("Invalid File Format, File should be pdf");
    }
    System.out.println("Uploading file to s3 : " + fileName);
  }

  //Parent is a function to save file but child is throwing unexpected exception
}

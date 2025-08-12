package main.liskov_principle.right_approach;

public class S3FileStorage implements FileStorage {

  @Override
  public void saveFile(String fileName, byte[] fileContent) {
    System.out.println("File uploading to s3 :" + fileName);
  }
}

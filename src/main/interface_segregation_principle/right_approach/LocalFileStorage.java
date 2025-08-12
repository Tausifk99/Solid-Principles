package main.interface_segregation_principle.right_approach;

public class LocalFileStorage implements FileUploader, FileDownloader {

  @Override
  public byte[] downloadFile(String fileName) {
    return new byte[0];
  }

  @Override
  public void uploadFile(String fileName, byte[] fileContent) {

  }
}

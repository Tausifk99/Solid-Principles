package main.interface_segregation_principle.wrong_approach;

public class LocalFileStorage implements FileStorage {

  @Override
  public void uploadFile(String fileName, byte[] fileContent) {
    //Support for localStorage
  }

  @Override
  public byte[] downloadFile(String fileName) {
    //Support for localStorage
    return new byte[0];
  }

  @Override
  public String generatePresignedUrl(String fileName) {
    //Not Support for localStorage
    return "";
  }

  @Override
  public void replicateToAnotherRegion(String fileName) {
    //Not Support for localStorage
  }

  //So In this class we have implement some methods which is not supported or not required
}

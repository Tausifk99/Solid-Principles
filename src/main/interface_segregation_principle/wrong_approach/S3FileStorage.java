package main.interface_segregation_principle.wrong_approach;

public class S3FileStorage implements FileStorage {

  @Override
  public void uploadFile(String fileName, byte[] fileContent) {
    //Support In S3
  }

  @Override
  public byte[] downloadFile(String fileName) {
    //Support In S3
    return new byte[0];
  }

  @Override
  public String generatePresignedUrl(String fileName) {
    //Support In S3
    return "";
  }

  @Override
  public void replicateToAnotherRegion(String fileName) {
    //Support In S3
  }
}

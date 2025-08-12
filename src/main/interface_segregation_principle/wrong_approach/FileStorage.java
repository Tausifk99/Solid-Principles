package main.interface_segregation_principle.wrong_approach;

public interface FileStorage {

  void uploadFile(String fileName,byte[] fileContent);
  byte[] downloadFile(String fileName);
  String generatePresignedUrl(String fileName);
  void replicateToAnotherRegion(String fileName);
}

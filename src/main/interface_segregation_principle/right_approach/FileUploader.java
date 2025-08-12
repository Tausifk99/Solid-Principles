package main.interface_segregation_principle.right_approach;

public interface FileUploader {

  void uploadFile(String fileName, byte[] fileContent);
}

package main.interface_segregation_principle.right_approach;

public interface FileDownloader {

  byte[] downloadFile(String fileName);
}

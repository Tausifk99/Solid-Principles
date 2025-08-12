package main.interface_segregation_principle.right_approach;

public class S3FileStorage implements FileUploader,FileDownloader,PresignedUrlGenerator,RegionReplicator{

  @Override
  public byte[] downloadFile(String fileName) {
    return new byte[0];
  }

  @Override
  public void uploadFile(String fileName, byte[] fileContent) {

  }

  @Override
  public String generatePresignedUrl(String fileName) {
    return "";
  }

  @Override
  public void replicateOneRegionToAnotherRegion(String fileName) {

  }
}

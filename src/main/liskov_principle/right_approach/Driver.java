package main.liskov_principle.right_approach;

public class Driver {

  public static void main(String[] args) {
    FileStorage fileStorage1 = new LocalFileStorage();
    fileStorage1.saveFile("LocalFile.pdf", new byte[3243]);

    FileStorage fileStorage2 = new S3FileStorage();
    fileStorage2.saveFile("S3File.pdf", new byte[34545]);
  }
}

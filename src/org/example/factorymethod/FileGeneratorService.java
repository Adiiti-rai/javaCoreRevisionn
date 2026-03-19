package org.example.factorymethod;
//Client class that uses the factory to generate files.
public class FileGeneratorService {
    public static void main(String[] args){
        // Create factory object
FileGeneratorFactory factory= new FileGeneratorFactory();

 FileGenerator fileGenerator= factory.createFileGenerator("pdf");
 fileGenerator.generateFile();
    }
}

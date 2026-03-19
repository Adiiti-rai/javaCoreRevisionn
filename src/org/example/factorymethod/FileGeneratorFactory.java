package org.example.factorymethod;

// here we have a factory class , Factory class responsible for creating FileGenerator objects.
// and FileGenerator is a return Type
// and createFileGenerator is a method where we have a parameter string fileType
// and based on the filetype we will create different - different objects.

public class FileGeneratorFactory {
    public FileGenerator createFileGenerator(String fileType){
        if(fileType.equalsIgnoreCase("pdf")){
            return new PdfFileGenerator();
        }
        else if(fileType.equalsIgnoreCase("csv")){
            return new CsvFileGenerator();
        }
        else if(fileType.equalsIgnoreCase("doc")){
            return new DocFileGenerator();
        }
        else{
            return null;
        }
    }
}

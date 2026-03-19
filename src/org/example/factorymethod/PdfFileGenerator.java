package org.example.factorymethod;
// Concrete implementation of FileGenerator for PDF files.

public class PdfFileGenerator implements FileGenerator{
    @Override
    public void generateFile(){
        System.out.println("generating a PDF file");
    }

}

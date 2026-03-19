package org.example.factorymethod;
//Concrete implementation of FileGenerator for DOC files.

public class DocFileGenerator implements FileGenerator{
    @Override
    public void generateFile(){
        System.out.println("generating the pdf file");
    }
}

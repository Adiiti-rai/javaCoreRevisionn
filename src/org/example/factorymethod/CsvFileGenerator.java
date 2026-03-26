package org.example.factorymethod;
//Concrete implementation of FileGenerator for CSV files.

public class CsvFileGenerator implements FileGenerator{
    @Override
    public void generateFile(){
        System.out.println("generating a csv file");

    }
}

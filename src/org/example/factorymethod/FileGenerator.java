package org.example.factorymethod;

//->Here we are going to create a FileGenerator interface for all file generators.
// Defines a contract that every file type (PDF, CSV, DOC) must implement.

public interface FileGenerator {
    void generateFile();
}

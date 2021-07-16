package com.company;

import java.util.ArrayList;

public class Folder extends File {
    private final ArrayList<File> files = new ArrayList<>();

    Folder(String name) {
        super(name);
    }

    Folder(String name, Folder parent) {
        super(name, parent);
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (File file : files){
            size += file.getSize();
        }
        return size;
    }

    public void addFile(File file) {
        this.files.add(file);
        file.parent = this;
    }

    @Override
    public String toString() {
        return name + "\nFolder properties: " + "\nSize: " + getSize()
                + "\nQuantity of files: " + this.files.size()
                + "\nDate: " + creationDate
                + "\nParentFolder: " + (parent != null ? parent.name : "No parent Folder")
                + "\nPath: " + (parent != null ? getPath() : "/" + name);
    }
}

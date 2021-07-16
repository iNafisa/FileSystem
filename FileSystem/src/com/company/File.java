package com.company;

import java.util.Date;

public abstract class File {
    protected String name;
    protected Date creationDate;
    protected Folder parent;

    public File(String name) {
        this.name = name;
        this.creationDate = new Date();
    }

    File(String name, Folder parent) {
        this(name);
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public int getSize() {
        return getSize();
    }

    public String getPath() {
        if (parent == null) {
            return "/" + name;
        }
        return parent.getPath() + "/" + name;
    }

    @Override
    public String toString() {
        return name + "\nFile properties: "
//                + "\nType: " + type
                + "\nSize: " + getSize()
                + "\nDate: " + creationDate
                + "\nParentFolder: " + parent.name
                + "\nPath: " + getPath();
    }
}

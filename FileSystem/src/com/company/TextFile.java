package com.company;

public class TextFile extends File {

    private String text;

    TextFile(String name, Folder parent) {
        super(name + ".txt", parent);
        parent.addFile(this);
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    @Override
    public int getSize() {
        return text.length();
    }
}

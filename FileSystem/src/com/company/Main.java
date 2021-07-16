package com.company;

public class Main {

    public static void main(String[] args) {
        Folder download = new Folder("download");
        Folder texts = new Folder("texts");

        TextFile topic = new TextFile("topic", texts);
        TextFile topic1 = new TextFile("topic1", texts);
        topic.setText("Hello World!");
        topic1.setText("Hello!");
        download.addFile(texts);
        System.out.println(texts);
        System.out.println(download);
    }
}

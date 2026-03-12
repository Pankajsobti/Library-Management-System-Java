package model;

public class Book {
    private int id;
    private String name;
    private String author;
    private boolean issued;

    public Book(int id, String name, String author){
        this.id=id;
        this.name=name;
        this.author=author;
        this.issued=false;
    }

    public int getId(){
        return id;
    }
    public String getName(){
    return name;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isIssued(){
        return issued;
    }
    public void issueBook(){
        issued=true;
    }
    public void returnBook(){
        issued=false;
    }
    @Override
    public String toString(){
        return "ID: " + id + "Name:" + name + "Author: "+ "Issued: "+ issued;
    }
}

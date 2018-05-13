package com.twu.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private BookList BookList;

    private ArrayList<String> Menu = new ArrayList<String>();

    public Biblioteca() {
        ArrayList<Book> list = new ArrayList<Book>();
        this.Menu.add("List Books");
        list.add(new Book("1","Book 1", "Author 1", "2011",false));
        list.add(new Book("2","Book 2", "Author 2", "2014",false));
        list.add(new Book("3","Book 3", "Author 2", "2017",false));
        list.add(new Book("4","Book 4", "Author 3", "2018",false));
        list.add(new Book("5","Book 5", "Author 1", "2016",false));
        list.add(new Book("6","Book 6", "Author 1", "2012",false));
        this.BookList = new BookList(list);
    }

    public Biblioteca(ArrayList<Book> list) {
        this.BookList = new BookList(list);
        this.Menu.add("List Books");
    }

    public String Welcome(){
        return "Welcome to biblioteca";
    }

    public String ListBooks(){
        return this.BookList.toShortDetails();
    }

    public String BookDetails(){
        return this.BookList.toString();
    }

    public String MainMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Menu:\n");
        for (String menu: this.Menu
                ) {
            stringBuilder.append(menu);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public String InvalidOption(){
        return "Select a valid option!\n";
    }

    public String Quit(){
        return "Quit!";
    }

    public String CheckOut(String title){
        if(this.BookList.CheckOut(title)){
            return "Thank you! Enjoy the book";
        }
        else{
            return "That book is not available";
        }
    }

    public String Return(String title){
        if(this.BookList.Return(title)){
            return "Thank you for returning the book.";
        }
        else{
            return "That is not a valid book to return.";
        }
    }
}

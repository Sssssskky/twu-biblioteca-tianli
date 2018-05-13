package com.twu.biblioteca;

import java.util.ArrayList;

public class BookList {
    private ArrayList<Book> List;

    public BookList(ArrayList<Book> List) {
        this.List = List;
    }

    public String toShortDetails(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Id\tTitle\n");
        for (int i = 0 ; i < List.size() ; i++ ) {
            Book book = List.get(i);
            if (!book.GetChecked()) {
                stringBuilder.append(book.ShortInfo());
            }
        }
        return stringBuilder.toString();
    }

    public Boolean Return(String title){
        for (int i = 0 ; i < this.List.size() ; i++ ) {
            Book book = this.List.get(i);
            if (book.GetTitle().equals(title)&&book.GetChecked()){
                book.Return();
                this.List.set(i, book);
                return true;
            }
        }
        return false;
    }

    public Boolean CheckOut(String title){
        for (int i = 0 ; i < this.List.size() ; i++ ) {
            Book book = this.List.get(i);
            if (book.GetTitle().equals(title)&&!book.GetChecked()){
                book.CheckOut();
                this.List.set(i, book);
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Id\tTitle\tAuthor\tPublished Year\n");
        for (Book book :
                this.List) {
            if (!book.GetChecked()) {
                stringBuilder.append(book.toString());
            }
        }
        return stringBuilder.toString();
    }
}

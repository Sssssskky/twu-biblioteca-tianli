package com.twu.biblioteca;

public class Book {
    private String Id;
    private String Title;
    private String Author;
    private String Year;
    private boolean Checked;
    public Book(String Id, String Title, String Author, String Year, boolean Checked){
        this.Id = Id;
        this.Title = Title;
        this.Author = Author;
        this.Year = Year;
        this.Checked = Checked;
    }

    public boolean GetChecked(){
        return this.Checked;
    }

    public void SetChecked(boolean checked){
        this.Checked = checked;
    }

    public String GetTitle(){
        return this.Title;
    }


    public void Return(){
        this.SetChecked(false);
    }

    public void CheckOut(){
        this.SetChecked(true);
    }

    public String ShortInfo(){
        return this.Id + "\t" + this.Title + "\n";
    }

    @Override
    public String toString() {
        return this.Id + "\t" + this.Title + "\t" + this.Author + "\t" + this.Year + "\n";
    }
}

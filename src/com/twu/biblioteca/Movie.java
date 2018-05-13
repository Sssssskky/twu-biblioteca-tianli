package com.twu.biblioteca;

public class Movie {
    private String Name;
    private String Year;
    private String Director;
    private String Rating;
    private boolean Checked;

    public Movie(String name, String year, String director, String rating){
        this.Checked = false;
        this.Director = director;
        this.Name = name;
        this.Year = year;
        this.Rating = rating;
    }

    public String GetName(){
        return this.Name;
    }

    public boolean GetChecked(){
        return this.Checked;
    }
    public void CheckOut(){
        this.SetChecked(true);
    }
    public void SetChecked(boolean checked){
        this.Checked = checked;
    }

    @Override
    public String toString() {
        return this.Name + "\t" + this.Year + "\t" + this.Director + "\t" + this.Rating + "\n";
    }
}

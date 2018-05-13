package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


class TestData{
    public Biblioteca Biblioteca;
    public TestData(){
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("1","Book 1", "Author 1", "2011",false));
        list.add(new Book("2","Book 2", "Author 2", "2014",false));
        list.add(new Book("3","Book 3", "Author 2", "2017",false));
        this.Biblioteca = new Biblioteca(list);
    }
}

public class BibliotecaTest {
    private TestData testData = new TestData();
    @Test
    public void testWelcome(){
        assertEquals("Welcome to biblioteca", testData.Biblioteca.Welcome());
    }
    @Test
    public void testListBooks(){
        assertEquals("Id\tTitle\n" +
                "1\tBook 1\n" +
                "2\tBook 2\n" +
                "3\tBook 3\n", testData.Biblioteca.ListBooks());
    }
    @Test
    public void testBookDetails(){
        assertEquals("Id\tTitle\tAuthor\tPublished Year\n" +
                "1\tBook 1\tAuthor 1\t2011\n" +
                "2\tBook 2\tAuthor 2\t2014\n" +
                "3\tBook 3\tAuthor 2\t2017\n", testData.Biblioteca.BookDetails());
    }
    @Test
    public void testMainMenu(){
        assertEquals("Menu:\nList Books\n", testData.Biblioteca.MainMenu());
    }
    @Test
    public void testInvalidOption(){
        assertEquals("Select a valid option!\n", testData.Biblioteca.InvalidOption());
    }
    @Test
    public void testQuit(){
        assertEquals("Quit!", testData.Biblioteca.Quit());
    }
    @Test
    public void testCheckOutSuccessful(){

        assertEquals("Thank you! Enjoy the book", testData.Biblioteca.CheckOut("Book 1"));
    }
    @Test
    public void testCheckOutFailed(){
        assertEquals("That book is not available", testData.Biblioteca.CheckOut("Book 4"));
    }
    @Test
    public void testReturnBookSuccessful(){
        testData.Biblioteca.CheckOut("Book 1");
        assertEquals("Thank you for returning the book.", testData.Biblioteca.Return("Book 1"));
    }
    @Test
    public void testReturnBookFailed(){
        assertEquals("That is not a valid book to return.", testData.Biblioteca.Return("Book 4"));
    }
}

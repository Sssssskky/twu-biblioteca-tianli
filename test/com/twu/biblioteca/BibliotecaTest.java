package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


class TestData{
    public BookList BookList;
    public Biblioteca Biblioteca;
    public TestData(){
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("1","Book 1", "Author 1", "2011",false));
        list.add(new Book("2","Book 2", "Author 2", "2014",false));
        list.add(new Book("3","Book 3", "Author 2", "2017",false));
        this.BookList = new BookList(list);
        this.Biblioteca = new Biblioteca(list);
    }
}

public class BibliotecaTest {
    private TestData testData = new TestData();
    @Test
    public void testWelcome(){
        assertEquals("Welcome to biblioteca", testData.Biblioteca.Welcome());
    }
    public void testListBooks(){
        assertEquals("Id\tTitle\n" +
                "1\tBook 1\n" +
                "2\tBook 2\n" +
                "3\tBook 3\n", testData.Biblioteca.ListBooks());
    }
    public void testBookDetails(){
        assertEquals("Id\tTitle\tAuthor\tPublished Year\n" +
                "1\tBook 1\tAuthor 1\t2011\n" +
                "2\tBook 2\tAuthor 2\t2014\n" +
                "3\tBook 3\nAuthor 3\t2017", testData.Biblioteca.BookDetails());
    }
    public void testMainMenu(){
        assertEquals("List Books\n", testData.Biblioteca.MainMenu());
    }

    public void testInvalidOption(){
        assertEquals("Select a valid option!\n", testData.Biblioteca.InvalidOption());
    }

    public void testQuit(){
        assertEquals("Quit!", testData.Biblioteca.Quit());
    }

    public void testCheckOutSuccessful(){

        assertEquals("Thank you! Enjoy the book", testData.Biblioteca.CheckOut("Book 1"));
    }

    public void testCheckOutFailed(){
        assertEquals("That book is not available", testData.Biblioteca.CheckOut("Book 1"));
    }

    public void testReturnBook(){
        assertEquals();
    }
}

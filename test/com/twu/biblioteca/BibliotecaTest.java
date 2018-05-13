package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


class TestData {
    public Biblioteca Biblioteca;

    public TestData() {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("1", "Book 1", "Author 1", "2011", false));
        books.add(new Book("2", "Book 2", "Author 2", "2014", false));
        books.add(new Book("3", "Book 3", "Author 2", "2017", false));
        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("Movie 1", "2017", "Director 1", "9"));
        movies.add(new Movie("Movie 2", "2017", "Director 2", "7"));
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("123-1234", "123456", "test@test.com", "1234567"));
        this.Biblioteca = new Biblioteca(books, movies, users);
    }
}

public class BibliotecaTest {
    private TestData testData = new TestData();

    @Test
    public void testWelcome() {
        assertEquals("Welcome to biblioteca", testData.Biblioteca.Welcome());
    }

    @Test
    public void testListBooks() {
        assertEquals("Id\tTitle\n" +
                "1\tBook 1\n" +
                "2\tBook 2\n" +
                "3\tBook 3\n", testData.Biblioteca.ListBooks());
    }

    @Test
    public void testListMoives() {
        assertEquals("Name\tYear\tDirector\tRating\n" +
                "Movie 1\t2017\tDirector 1\t9\n" +
                "Movie 2\t2017\tDirector 2\t7\n", testData.Biblioteca.ListMovies());
    }

    @Test
    public void testBookDetails() {
        assertEquals("Id\tTitle\tAuthor\tPublished Year\n" +
                "1\tBook 1\tAuthor 1\t2011\n" +
                "2\tBook 2\tAuthor 2\t2014\n" +
                "3\tBook 3\tAuthor 2\t2017\n", testData.Biblioteca.BookDetails());
    }

    @Test
    public void testMainMenu() {
        assertEquals("Menu:\nList Books\n", testData.Biblioteca.MainMenu());
    }

    @Test
    public void testInvalidOption() {
        assertEquals("Select a valid option!\n", testData.Biblioteca.InvalidOption());
    }

    @Test
    public void testQuit() {
        assertEquals("Quit!", testData.Biblioteca.Quit());
    }

    @Test
    public void testUserInfo() {
        testData.Biblioteca.Login("123-1234", "123456");
        assertEquals("Name\tEmail\tPhone:\n" +
                "123-1234" + "\t" + "test@test.com" + "\t" + "1234567" + "\n", testData.Biblioteca.UserInfo());
    }

    @Test
    public void testCheckOutBookSuccessful() {

        assertEquals("Thank you! Enjoy the book", testData.Biblioteca.CheckOutBook("Book 1"));
    }

    @Test
    public void testCheckOutMovieSuccessful() {
        assertEquals("Thank you! Enjoy the movie", testData.Biblioteca.CheckOutMovie("Movie 1"));
    }

    @Test
    public void testCheckOutMovieFailed() {
        assertEquals("That movie is not available", testData.Biblioteca.CheckOutMovie("Movie 4"));
    }

    @Test
    public void testCheckOutBookFailed() {
        assertEquals("That book is not available", testData.Biblioteca.CheckOutBook("Book 4"));
    }

    @Test
    public void testReturnBookSuccessful() {
        testData.Biblioteca.CheckOutBook("Book 1");
        assertEquals("Thank you for returning the book.", testData.Biblioteca.Return("Book 1"));
    }

    @Test
    public void testReturnBookFailed() {
        assertEquals("That is not a valid book to return.", testData.Biblioteca.Return("Book 4"));
    }
}

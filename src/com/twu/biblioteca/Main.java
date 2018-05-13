package com.twu.biblioteca;

import java.util.Scanner;

public class Main {

    private static Biblioteca biblioteca = new Biblioteca();

    private static Scanner in = new Scanner(System.in);

    private static void Run(){
        print(biblioteca.Welcome());
        while (true){
            print("Please Login:\nUsername:\n");
            String name = nextArg();
            print("Password:\n");
            String password = nextArg();
            if(biblioteca.Login(name,password)){
                print("Login Successful");
                print(biblioteca.UserInfo());
                break;
            }
            else {
                print("Login Failed");
            }
        }


        String command = "";
        while (NextCommand(command)){
            System.out.println(biblioteca.MainMenu());
            command = nextArg();
        }
    }

    private static String nextArg(){
        return in.nextLine();
    }

    private static void print(String text){
        System.out.println(text);
    }

    private static Boolean NextCommand(String command) {
        if(command.equals("")){
            return true;
        }
        else if(command.equals("Checkout Books")){
            print("Enter Book Title:");
            String title = nextArg();
            biblioteca.CheckOutBook(title);
            return true;
        }
        else if(command.equals("Checkout Movies")){
            print("Enter Movie Title:");
            String title = nextArg();
            biblioteca.CheckOutMovie(title);
            return true;
        }
        else if(command.equals("Checkout Movies")){
            print("Enter Movie Title:");
            String title = nextArg();
            biblioteca.CheckOutMovie(title);
            return true;
        }
        else if(command.equals("List Books")){
            System.out.println(biblioteca.ListBooks());
            return true;
        }
        else if(command.equals("Quit")){
            return false;
        }
        else{
            System.out.println(biblioteca.InvalidOption());
            return true;
        }
    }

    public static void main(){
        Run();
    }

}

package com.twu.biblioteca;

public class Main {

    private static Biblioteca biblioteca = new Biblioteca();

    private static void Run(){
        System.out.println(biblioteca.Welcome());
        String command = "";
        while (NextCommand(command)){
            System.out.println(biblioteca.MainMenu());
            command = "Quit";
        }
    }

    private static Boolean NextCommand(String command) {
        if(command.equals("")){
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

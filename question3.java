class Printer {
    void print(String text) {
        System.out.println("Printing: " + text);
    }
}

class Computer {
    private Printer printer; 

    public Computer(Printer printer) {
        this.printer = printer;
    }

    void printDocument(String document) {
        printer.print(document); 
    }
}

public class question3 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Computer computer = new Computer(printer);
        computer.printDocument("Hello, World!"); 
    }
}

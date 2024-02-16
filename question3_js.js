class Printer {
    print(text) {
        console.log("Printing: " + text);
    }
}

class Computer {
    constructor(printer) {
        this.printer = printer; 
    }

    printDocument(document) {
        this.printer.print(document); 
    }
}

const printer = new Printer();

const computer = new Computer(printer);

computer.printDocument("Hello, World!"); 

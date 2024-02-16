class Engine {
    start() {
        console.log("Engine started");
    }
}

class Car {
    constructor() {
        this.engine = new Engine(); 
    }

    start() {
        this.engine.start(); 
        console.log("Car started");
    }
}

const myCar = new Car();
myCar.start(); 

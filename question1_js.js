function Animal(name) {
    this.name = name;
}

Animal.prototype.sound = function() {
    console.log("Animal makes a sound");
};

function Dog(name) {
    Animal.call(this, name); 
}

Dog.prototype = Object.create(Animal.prototype);

Dog.prototype.bark = function() {
    console.log("Dog barks");
};

function Cat(name) {
    Animal.call(this, name); 
}

Cat.prototype = Object.create(Animal.prototype);

Cat.prototype.meow = function() {
    console.log("Cat meows");
};

var dog = new Dog("Buddy");
var cat = new Cat("Whiskers");

console.log(dog.name); 
console.log(cat.name); 

dog.sound(); 
dog.bark(); 

cat.sound(); 
cat.meow(); 

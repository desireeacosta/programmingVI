class Prototype {
  value = 14;

  printValue() {
      console.log(this.value);
  }

  clone() {
    return new this.constructor();
  }
}


const prototype = new Prototype()
console.log("Prototype:");
prototype.printValue();

const cloned = prototype.clone();
console.log("First clone:");
cloned.printValue();

console.log("First clone, value changed:");
cloned.value = 41;
cloned.printValue();
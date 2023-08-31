var SingletonExample = (function () {
  var instance;

  function createInstance() {
    var object = new Object("Instance of Singleton");
    return object;
  }

  return {
    getInstance: function () {
      if (!instance) {
        instance = createInstance();
      }
      return instance;
    }
  };
})();

var instance1 = SingletonExample.getInstance();
var instance2 = SingletonExample.getInstance();

console.log(instance1);
console.log(instance2);
if (instance1 == instance2) {
  console.log("Equal instances")
}

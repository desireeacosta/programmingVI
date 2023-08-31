class SingletonExample:
  _instance = None
  _lock = threading._lock

  def __new__(cls):
    if cls._instance is None:
      cls._instance = super(SingletonExample, cls).__new__(cls)
    return cls._instance

obj1 = SingletonExample()
obj2 = SingletonExample()

print(obj1)
print(obj2)

if id(obj1) == id(obj2):
  print('Equal instances!')
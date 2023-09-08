# **Design patterns**

## **Builder pattern**
If our class contains several properties to define its constructor (and some may be optional) then we can use a builder pattern.

A builder pattern helps to construct the object we need in parts.

### **What to do when there are child classes?**
To construct the builder pattern when child classes are involved, we can use the builder considering these changes. The important point is how to construct the object once our builders are done.

For example, review the files at builder/inherited-builder.

The construction of the object using the builder should be chained hierarchically, from the properties of the base class to the last child.

*Also, just like we can use the '@Builder' annotation to help with the builder of the classes in lombok, we can also use the '@SuperBuilder' annotation to help with the builder of the base classes and its child classes.*
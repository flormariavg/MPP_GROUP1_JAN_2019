3. A. UML classes Circle and Cylinder are given below, pictured in an inheritance relationship. Write
the code for Circle and Cylinder in Java, making use of the inheritance relationship. Does it make
sense to use inheritance here? Explain in a separate text file

-> it doesn't make sense with this design. Because when we create an Circle object,
it requests user has to input Radius and Height, but Height is not attribute of Circle (ex: " public Circle(double radius, double height) ",)
A principle of Circle violated 

and when we call method computeVolume() from Circle of object, it will compute that.
But in fact, it is not a principle of Circle.

Note:
Inheritance offers reuse (the subclass
inherits all public and protected methods and
attributes), reuse should never be the sole reason for
creating an inheritance relationship. 

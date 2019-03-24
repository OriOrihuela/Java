# Arnold is Being Cooked! 
### It is about calculating the weight of a person in the rest of the planets of our Solar System, in the style of this website:

http://www.traducimos.cl/planet/

It is important to avoid that this happens to you as Arnold in *Total Defiance*:

https://www.youtube.com/watch?v=86scPKqWFvc
### Apply these formulas:
`Weight_in_Surface = your_Mass * Gravity_in_surface`.

where:

`Gravity_in_surface = G * Mass_of_planet / Radio_of_planet_to_square`.

where:

`G = 6.67300E-11`.

and

`your_Mass = your_weight_in_the_Earth / superficial_gravity_Earth;`

**The mass and radius values of each planet (in Kg and m respectively) are**:
~~~
MERCURY (3.303e+23, 2.4397e6),     
VENUS   (4.869e+24, 6.0518e6),     
EARTH   (5.976e+24, 6.37814e6),     
MARS    (6.421e+23, 3.3972e6),     
JUPITER (1.9e+27,   7.1492e7),     
SATURN  (5.688e+26, 6.0268e7),     
URANUS  (8.686e+25, 2.5559e7),     
NEPTUNE (1.024e+26, 2.4746e7);
~~~
#### The output of the program in console is this (it also serves as test case), *where 175 is your weight on Earth*:
~~~
$ java Planet 175 
Your weight on MERCURY is 66.107583 
Your weight on VENUS is 158.374842 
Your weight on EARTH is 175.000000 
Your weight on MARS is 66.279007 
Your weight on JUPITER is 442.847567 
Your weight on SATURN is 186.552719 
Your weight on URANUS is 158.397260 
Your weight on NEPTUNE is 199.207413
~~~
### Here are the test cases that the code has to satisfy:

https://github.com/dfleta/Java/blob/master/arnoldEnumTypeMaven/src/test/java/org/foobarspam/arnoldEnumType/test/ArnoldEnumTypeTest.java

To use these test cases, you must include in the `POM.xml` of the Maven project a dependency on the `AssertJ` library:

http://joel-costigliola.github.io/assertj/assertj-core-quick-start.html

### Main script - main

**Program the logic so that, in addition to test cases, satisfy this main script of the program**:

https://github.com/dfleta/Java/blob/master/arnoldEnumTypeMaven/src/main/java/org/foobarspam/arnoldEnumType/main/ArnoldMain.java

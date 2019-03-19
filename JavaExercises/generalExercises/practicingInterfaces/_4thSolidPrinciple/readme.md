# Practice about the 4th SOLID Principle
1. In this exercise we are interested in the users of the `TextProcessor` class that
do not need the functionality to correct texts do not have any dependence with
the `Language` class.

2. To do this, you must decompose the functionality of the `TextProcessor` class in two interfaces,
a basic one (with the new methods() and text() and another more "complex" with functionality for the correction).

3. Once decomposed, adapt the test to see that everyone can use the type that should
(that is, the test_simple does not need the type of processor with language)

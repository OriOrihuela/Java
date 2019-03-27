# Romans Go Home!
### It's about writing a program that transforms Roman numerals into decimals:

~~~
I  one 
II two
III three 
IV  four 
V five 
VI  six 
VII  seven 
VIII  eight 
IX   nine 
XXXII   thirty-two 
XLV   forty-five
~~~

**You must use regular expressions and enumerated types.**

**The rules are described in the Wikipedia article:**

https://en.wikipedia.org/wiki/Roman_numerals

We must keep in mind that Roman numeration, not being a positional system, **does not require zero**.

For the modern notation of *Roman* numerals the following norms used are:

- The numbers are read from left to right starting with the symbols with the highest value, or set of symbols with the highest value.
- A symbol followed by another of equal or lower value, sum (eg *X · X · I = 10 + 10 + 1 = 21*), while if followed by another of higher 
value, both symbols form a set in which to subtract the value of the first to the value of the next (eg *X · IX = 10+ [10-1] = 19*).
- The unit (*I*) and the numbers with base 10 (*X, C* and *M*) can be repeated up to 3 consecutive times as addends.
- The numbers with base 5 (*V, L and D*), can not be repeated in a row, since the sum of these two symbols has representation with one 
of the previous symbols.
- The unit and base 10 symbols can also appear by subtracting before a higher value symbol, but with the following rules:
    - They can only appear by subtracting on symbols with base 5 and 10 of value immediately above, but not of others with higher 
    values (eg *'IV'* and *'IX'*, but not *'IL'* or *'IC'*).
    - In the case of being subtracted, they can not be repeated.
- The symbols with base 5 can not be used to subtract (eg 45 is written *'XLV'* and not *'VL'*).

**Guidelines**
Given a Roman numeral, e.g.

`String number Romano = "MDCCCLXXXVIII";`

of the rules can be deduced that these are the only combinations that will be presented:

1. M, C, X, I can appear from zero to three times (adding).
2. D, L, V can appear from zero to one time adding, since they can not subtract.
3. Subtracting, only combinations can appear:

    4. IV and IX
    5. XL and XC
    6. CD and CM
    7. D, L, V can not appear by subtracting.

**This can be translated into regular expressions and enumerated types**:

- You can create regular expressions to study the string with the Roman number.

- And then use the enumerated types to obtain the value of the Roman symbols (and the allowed combinations, for example, 
although this is not necessary).

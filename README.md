# Instructions  

## Practicum 19 - Arrays in Java<br>

### BACKGROUND<br>

**Arrays as Object**<br>
Arrays in Java are objects. While we will begin complete
discussion of classes and objects soon, for now we can think
of an object that has multiple parts to it, both *data* (variables)
and *methods* (functions).
<br><br>
We are able to select a particular member of an object by
use of the *dot operator*, `.` For example, Strings are also
objects. To determine the length of a string, we can access
its length method, 
<br><br>
`String name = "Jonathan";`
<br>
`name.length()` --> 8
<br><br>
Since arrays are object, we can also determine an
array's length as follows,
<br><br>
`int[] nums = {10,20,30,40,50,60};`<br>
`nums.length` --> 6<br><br>
Notice that for determining the length of a string, a method
(function) of a String object is called, with the use of
a set of empty parentheses (`name.length()`). The length of
an array, however, is stored in a variable named `length` within the 
array object, so no parentheses are used (`nums.length`). There are
many other methods of arrays that can be called as well.

**Array Types**
<br>
Arrays can be created for any existing data type. Thus, if a 
Fraction class (type) is created by the programmer, then
an array of Fraction objects can be declared,<br><br>
`Fraction[] fractions = new Fraction[50];`
<br><br>
A type name folled by an empty set of parenthese
can be thought of as the name of the array type.
<br><br>
**Declaration of Array-Type Variables**
There are often times when we want to declare an array-type
variable but do not yet know how big the array should be
delcared. This often occurs in the creation of classes. Thus, an
array variable and the actual array of elements can be
declared separately,<br><br>
`int[] nums;`  // declares a variable of type array of ints<br>
`nums = new int[10];` // assigns the varaible an array instance (object)<br><br>
The `new` operator is what requests Java to find enough free memory to reserve
(allocate) enough memory to store an array of ten integer values assigned to variable `nums`.
<br><br>
**Special Declaration of Arrays in Java**
<br>
Java allows arrays with a relatively small number of values
to be declared and initialized at the same time,
<br><br>
`int[] nums = {10,20,30,40,50,60};`
<br><br>
This implcitly requests Java to allocate an array of integers
of length 6 initialized with the integer values 10,20,30,40,50,60.
A similar thing could be done with a String array,
<br><br>
`String months = {"Jan","Feb","Mar",Apr","May"Jun","Jul",
                 "Aug","Sept","Oct","Nov","Dec"};`
<br>
### WHAT TO DO<br>
- `Complete the indicated sections` in the provided code.<br>
- `Run the predefined tests` (click Tests icon in the left column under Tools) and correct any logic errors. 

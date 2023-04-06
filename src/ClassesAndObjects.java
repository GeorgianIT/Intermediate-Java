public class ClassesAndObjects {
}
/*
accessModifier class ClassName{
variables
methods
}
--------------------------------------------------------------------
Example:
public class BasketballPlayer{
    String name;
    String nickname;
    ...
    public void freeThrow(){...}
}
--------------------------------------------------------------------
Object creation:
ClassName objectName = new ClassName(parameters);

ACCESS VARIABLE
objectName.variableName
ACCESS METHOD
objectName.methodName(parameters)
--------------------------------------------------------------------
CONSTRUCTOR

What is a constructor?
Is a special method in the class and called when you use new keyword to create objects
How to use
ClassName objectName = new ClassName(parameters)
--------------------------------------------------------------------
EXAMPLE:

class DodgeChallenger{
    short horsePower;
    DodgeChallenger(){
        this.horsePower = 392;
    }
}
    DodgeChallenger defaultDodge = new DodgeChallenger();
    DodgeChallenger anotherDodge = new DodgeChallenger();
--------------------------------------------------------------------
    class DodgeChallenger{
    short horsePower;
    DodgeChallenger(short horsePower){
        this.horsePower = horsePower;
    }
}
    DodgeChallenger normalDodge = new DodgeChallenger(392);
    DodgeChallenger beastDodge = new DodgeChallenger(717);

--------------------------------------------------------------------

Empty object

accesModifier ClassName objectName;
    -object's value is null
    -no new keyword
    -can't access methods
    -can't access variables
    -can be defined later
Example
DodgeChallenger redDodge;
--------------------------------------------------------------------

OOP INHERITANCE

accessModifier class ClassName extends OtherClassName{
    class variables
    methods
}

EXAMPLE
public class Dodge Challenger extends Car{...}
public class LamborghiniAventador extends Car{...}

OTHER EXAMPLE

public class Athlete {
    String name;
    short yearOfBorn;
}

public class BasketballPlayer extends Athlete{...}
public class FootballPlayer extends Athlete{...}

--------------------------------------------------------------------
OOP INHERITANCE - Super vs subclasses (parent and child)
OOP INHERITANCE - Method overriding

--------------------------------------------------------------------
OOP ENCAPSULATION
Encapsulation is wrapping up of data under sa single unit (a class) and it prevents data from being accessed by the code outside

set + get = public
      get = read-only
      set = write-only

How to do encapsulation

accessModifier class ClassName {
    private dataType variableName;

    public dataType getVariableName(){
        return variableName;
        }
    public void setVariableName(dataType variableName){
        this.variableName = variableName;
    }
 }
    EXAMPLE

    public class Athlete{
        private int yearOfBorn;

        public Athlete(int yearOfBorn){
            this.yearOfBorn = yearOfBorn;
            }
        public int getYerOfBorn(){
            return yearOfBorn;
            }
 }
Athlete usainBolt = new Athlete(1986);
System.out.println(usainBolt.getYearOfBorn());

--------------------------------------------------------------------

OOP ABSTRACTION
Abstraction display only the essential details to the user and hiding certain parts of the implementation

Abstract classes cannot be used to create object
we use abstract class to hide details

accessModifier abstract class ClassName{
    additional variables
    additional methods
    abstract methods
}

EXAMPLE

public abstract class Car{...}
public class DodgeChallenger extends Car{...}
DodgeChallenger greenDodge = new DodgeChallenger("green", 717);
Car orangeDodge = new DodgeChallenger("orange", 319);
Car orangeDodge = new Car("orange", 319); - ERROR beacuse Car is an abstact class and cannot create objects
--------------------------------------------------------------------

ABSTRACT METHOD
-can only be used in an abstract class
-does not have a body
-the body is provided by the subclass
-all the abstract method must be defined to create objects

accessModifier abstract returnType abstractMethod(parameters);

EXAMPLE
public abstract class Car{
   public abstract void startEngine();
}

public class DodgeChallenger extends Car{
    public void startEngine(){
        System.out.println("Starts a 5.0L massive petrol engine.")
        }
}
--------------------------------------------------------------------

OOP- ABSTRACTION - INTERFACE

-can have methods and variables
-methods only without body
-the body is provided by the class that implements it
-can't be used to create objects
-all methods must be defined in the subclass
-all fields and functions are public, abstract and final

interface InterfaceName{
    returnType methodName(parameters);
}

EXAMPLE

interface ElectricMode{
    void startElectricEngine();
}

public class DodgeChallenger extends Car implements ElectricMode{
    public void startElectricEngine(){
        System.out.println("Dodge Challenger starts its electric engine.")
    }
}

DodgeChallenger dodge = new DodgeChallenger();
dodge.startElectricEngine();
--------------------------------------------------------------------

ENCAPSULATION                   VS              ABSTRACTION
information(data) hiding                    Implementation(detail) hiding
Groups together data and                    Exposing the function and hiding implementation
methods and show the necessary
but hides the rest

--------------------------------------------------------------------
ADVANTAGES OF ABSTRACTIONS
-able to create classes that can't be instantiated but can be used as template
-hides details so user don't have to bother with that
-with interfaces you can add "abilities" to classes
-also reduce unnecessary code (functions that the parent has but children classes don't use)

--------------------------------------------------------------------
OOP - Polymorphism
Functions with the same name but different parameters
Allows you to have many forms with the same purpose

--------------------------------------------------------------------
FINAL KEYWORD

Final elements can't be changed overridden or inherited

FINAL VARIABLE:
-value of a final variable can't be changed

accessModifier final dataType VARIABLE_NAME= value;

EXAMPLE:
public final short NUMBER_OF_WHEELS = 4;
--------------------------------------------------------------------
FINAL METHOD:
-can't be overridden by the child class

accessModifier final returnType finalMethod(parameters){...}

EXAMPLE:

public final double calculateFuelConsumption(double distance, double fuelUsed){
    return fuelUsed / distance * 100;
}
--------------------------------------------------------------------

FINAL CLASS:
-can't be extended

accessModifier final class ClassName{...}

EXAMPLE:

public final class PasswordValidator{...}
--------------------------------------------------------------------
STATIC KEYWORD
Allows you to access Java element without creating any object

BEFORE
public double calculateFuelConsumption(double distance, double fuelUsed){...}

DodgeChallenger redDodge = new DodgeChallenger(...);
redDodge.calculateFuelConsumption(20.0, 2.0)

AFTER
public static double calculateFuelConsumption(double distance, double fuelUsed){...}
DodgeChallenger.calculateFuelConsumption(20.0, 2.0)

--------------------------------------------------------------------
STATIC VARIABLE
-It's a class variable not an object variable
-A single copy of variable is created and shared among all objects at class level
-Can be created at class-level only
-You can access it by using the class name
-Initialized before any object is created
-Static and non-static methods can use it

accessModifier static dataType variableName;

EXAMPLE:
private static int numberOfCars;
private static int numberOfProfessionalBasketballPlayers;
protected static String warningLevel = "Safe";
private static double globalTemperatureChange = 1.3;

--------------------------------------------------------------------
STATIC METHOD
-Any static member can be accessed before any objects of its class are created, and without reference to any object
-Can only directly call other static methods
-Can only directly access static data
-Cannot refer to this or super in any way

accessModifier static returnType methodName(parameters){...}

EXAMPLE:
public static final double calculateFuelConsumption(double distance, double fuelUsed){
    return fuelUsed/ distance * 100;
}
DodgeChallenger.calculateFuelConsumption(20.0, 2.0)
Math.round();
Math.abs();
System.out.println();

--------------------------------------------------------------------
STATIC BLOCK
If you need computation to initialize static variable
Executed once when the class is loaded
Blocks are executed in order
Very rarely used

static{...}
--------------------------------------------------------------------
STRING FUNCTIONS
Diagnose, check and modify strings

Equals function:
-Compares two strings
-returns true if the strings are equal, and false if not

stringVariable.equals(anotherStringVariable)

EXAMPLE:
public final String BRAZIL = "Brazil";
"Brazil".equals(BRAZIL) -> returns true
BRAZIL.equals("brazil") -> returns false
BRAZIL.equalsIgnoreCase("brazil") -> returns true

--------------------------------------------------------------------

Contains function:
-Check whether a string contains a sequence of characters

stringVariable.contains(anotherStringVariable)

EXAMPLE:
public final String BRAZIL = "Brazil";
"Brazil".contains("zil") -> returns true
BRAZIL.equals("braz") -> returns false
--------------------------------------------------------------------

Empty string:
-Checks whether a string is empty or not

stringVariable.isEmpty()

EXAMPLE
public String iAmEmpty="";
public final String BRAZIL = "Brazil";
BRAZIL.isEmpty() -> returns false
iAmEmpty.isEmpty() -> returns true
--------------------------------------------------------------------

Length:
-return the length of a specified string

stringVariable.length()

EXAMPLE
public String iAmEmpty="";
public final String BRAZIL = "Brazil";
BRAZIL.length() -> returns 6
iAmEmpty.length() -> returns 0

--------------------------------------------------------------------
LOWER AND UPPERCASE:
-Converts a string to lower/uppercase case letters

string.toUpperCase();
string.toLowerCase();
--------------------------------------------------------------------
STARTS and ENDSWITH:
checks whether a string starts with specified characters

stringVariable.startsWith();
stringVariable.endsWith();

--------------------------------------------------------------------
Replace function:
-searches a string for a specified value, and returns a new string where the specified values are replaced

originalString.replace(replaceThis, toThis)

EXAMPLE
public String no = "No";

no.replace("No","Yes") -> returns Yes for no variable
no.replace("N","D") -> returns Do for no variable

--------------------------------------------------------------------
 */


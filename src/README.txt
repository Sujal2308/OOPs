// new operator vs constructors 🚀

1️⃣new => It is used to create an object
2️⃣constructor => It is used to initialize object values
Ex: `class Student{
        String name; // instance variable
        int age;
        Student(String name , int age){ // constructor
        this.name = name;
        this.age = age;
        }
}`
Student s1 = new Student("Sujal" , 20);
Explanation : Here, An object creation happens first of Student class and
immediately constructor is called with passed values that initialized
the object instance variable.

Note: "this" in constructor represents the current object reference.
Like s1.name and s1.age.

// Child Object vs Parent Constructor 🚀

// parent class 🧔🏻‍♂️ :
           class Person{
                String name;
                int age;
                Person(String name, int age){
                    this.name = name;
                    this.age = age;
                }
           }
// child class 👶🏻  :
           class Student{
                 int marks;
                 int rollNo;
                 Student(String name, int age , int marks, int rollNo){
                      super(name,age); // calling parent class constructor
                      this.marks = marks;
                      this.rollNo = rollNo;
                 }
           }

           Student s1 = new Student("Sujal",20, 100, 360)

Explanation: We know that when we create a child class automatically
all the parent class fields and methods will be available to it.
Here when we create a child class object (s1 here) both parent and child
constructors were called.
📌* super() is used to call Person() constructor that is responsible to
initialize parent class properties
Here , both parent constructor and child constructor are executed for
child class object initialization only
➡️Note : Here parent class object is not created only child object is
created and all those inherited properties from parent their initialization
is taken care by parent constructor only

//📍 Note that two identical classNames are not allowed in same package
//🤩 The abstract class can have static void main method no problem
//☠️😭 Illegal Method Combination is abstract :
- static + abstract
- final + abstract (we know abstract method is overriden if it is final then no chance)


// Features of OOPs:
1) Data Hiding :
- Hiding the critical and private data that ensures security and data privacy
- It is achieved via "private" Keyword (private int salary;)
- Generally we use getter and setter method to get private value and
set or modify the private fields. These methods are public.
- Under these methods we perform some sort of validation (if validation
is true then expose the fields via getter method) otherwise return
some error message

2) Abstraction :
- It simply means hiding the internal implementation and just highlight/expose
the services offered.
- An authorised bank customer get the access of number of services like
Checking the balance() , withdraw() , deposit() , creditScore(),etc
but he will never know how these services are implemented behind the
scenes
- Ex: ATM machine
- It is implemented via gui interface , apis

Benfits:
1) Security (IMP)
2) Enhancements : without affecting end users we can perform any changes
internally
3) Maintainability

3) Encapsulation :
- It's a grouping mechanism of related data members and corresponding
behaviors/methods
- Encapsulation = Data Hiding + Abstraction
- Hiding data members behind methods is encapsulation
Ex: Every java class is example of encapsulation
`Ex: class Account{
     private double balance;
     private double creditScore
     private double loanEligible
     public double getBalance(){
        // Validation req
        return balance`
     }
     public double setBalance(double amount){
            // validation req
            this.balance = amount
     }
}

// Tightly Encapsulated Class :
- Aisa class jisme jitne bhi fields ho voh sab final rehene ko hona
tab hum bolenge ki humara class TEC
- If a parent class is not TEC then its sub classes can never be TEC

//Method Signatures
- In java , A method signature consists of "method name + arguments type"
- Note that return type is not a part of MSignature.
- Method Signature is used by compiler to resolve method calls.
- JVM maintains a method table where each and every method signature
persist within a class.
- Two methods of same class must have distinct signatures
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
CS542 Design Patterns
Spring 2016
Assignment 2 README FILE

Due Date: <2/29/2016, IN FORMAT: Monday, Feb 29, 2016>
Submission Date: <3/1/2016, IN FORMAT: Tuesday, March 1, 2016>
Author(s): <Satya Komal Gutta> 
e-mail(s): <sgutta1@binghamton.edu> 


PURPOSE:

[
  To understand and implement the design principles to a create multiple threads and read from an input file to print the sum of the odd numbers
  present in the file.
]

PERCENT COMPLETE:

[
  "I believe I have completed 100% of this project."
]

PARTS THAT ARE NOT COMPLETE:

[
  None
]

BUGS:

[
None
]

FILES:

[
README.txt
Diver.java, Results.java,StdoutDisplayInterface.java,CreateWorkers.java,WorkerThread.java,FileProcessor.java,IsPrime.java,Logger.java
  
]

SAMPLE OUTPUT:

[
  if
DEBUG_VALUE=4  "You called the constructor" gets printed.
DEBUG_VALUE=3  "You called the run() menthod" gets printed.
DEBUG_VALUE=2  "Added integer i to data structure" gets printed.
DEBUG_VALUE=1  "Prints the elements present in the data structure"
DEBUG_VALUE=0  "Prints -The sume of all the prime numbers is: abc" 
]

TO COMPILE:

[
 ## To clean:
ant -buildfile src/build.xml clean

## To compile: 
ant -buildfile src/build.xml all
 
]

TO RUN:

[
ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=2 -Darg2=0 
]

EXTRA CREDIT:

[
  "N/A"
]


BIBLIOGRAPHY:

[
  http://stackoverflow.com/questions/9874587/how-to-create-threads-dynamically

]

Choice of Data Structure in Results class

a).I used vector data structure to store the prime no's because by default vectors are synchronised in a multi threaded environment.Also vectors can grow dynamically.
b).Time Complexity: Adding the elements to the end of a Vector is O(1) and we adding to the end in this assignment.
c).Space Complexity of Vector is O(1)

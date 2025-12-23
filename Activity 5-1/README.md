![CS121 Banner](images/CS121-BANNER.svg)

**NOTE: Before beginning the lab, please remember to [open the workspace](images/open-lab-workspace.png) after cloning this repository in VSCode.**

# Module 5 Week 1 Activity - GradeBook (two class periods)

## Purpose & Concepts: 
The purpose of this activity is to practice previously covered concepts as well as the following new concepts: ArrayList, for-each loops, Wrapper class, autoboxing, Pointer, NullPointerException, Iterator, Parsing, Exceptions, File Class, Scanner Class, FileNotFoundException, Throwing an exception, try-catch statement, Tokens, Tokenizing, Delimiter, Regular expression.

Phase 1 of the activity focuses on creating, manipulating, and accessing ArrayLists. Phase 2 focuses on reading data from a file.

## Problem Description
In this activity, you will create a program that will create a GradeBook application that will store Student objects in an ArrayList and print the contents of grade book (the ArrayList) to the console.  

In Phase 1, the Student objects will be hard-coded into the program (i.e. you will explicitly create each student and add it to the ArrayList) using data given in GradeBook.java. In Phase 2, you will read the data for the Student objects from a Comma Separated Value formatted text file.

## Requirements
Phase 1:
1. Create an ArrayList that will store Student objects
2. Declare and instantiate 4 student objects using the information provided in GradeBook.java.
3. Populate the ArrayList with these student objects.
4. Print the gradebook to the console using a for-each loop and the toString() method of the Student object. The output should look similar to:
   ```
   Samwise Gamgee has an A.
   Frodo Baggins has a B.
   Pippin Took has a C.
   Meriadoc Brandybuck has a C.
   ```

Phase 2:
1. Comment out the hard-coded Student objects created in Phase 1 (*DO NOT DELETE THESE LINES*, instead *comment them out* so they can still be graded.)
1. Complete each TODO item in GradeBook.java to:
   - Open the csv file
   - Read in and parse the data from the file. Note: Each line in the file contains the information for a single student.
   - Create a Student object and set the student grade for each student
   - Add each Student object to the ArrayList.
   - The new ArrayList should still be printed to the console.

## Before You Begin: Computational Thinking & Planning
1. Read all provided files before beginning. Make special note of what data and methods are associated with Student objects. 
1. Use line comments to outline your plan for Phase 1
1. After completing Phase 1, use line comments to outline your plan for Phase 2.
   
## To Do
1.  Expand the folder named a5.1-GradeBook and open the file named GradeBook.java
2. Modify GradeBook.java to execute your Phase 1 plan.
3. Use comments to create a Phase 2 plan.
4. Complete your Phase 2 plan to satisfy all activity requirements.

## Review & Reflect
1. Terminology Identification: Identify examples of at least 4 different concepts listed in the "Concepts" list above. These should be identified with an @keyterm tag within the comment.
2. Code Review: When you are finished with this activity, pair up with a classmate and review each other’s code to make sure it meets all the requirements. 
3. Reflection: At the end of REFLECTION.md write a one paragraph reflection describing your experience with this activity. What went well? What was challenging? How could you improve your plan prior to beginning to code?

## Finally
1. Commit the changes to your local repository with a message stating that Activity 5.1 is complete.
2. Push the changes from your local repository to the GitHub classroom repository.
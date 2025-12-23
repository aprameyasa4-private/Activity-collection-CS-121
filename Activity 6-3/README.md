![CS121 Banner](images/CS121-BANNER.svg)

**NOTE: Before beginning the lab, please remember to [open the workspace](images/open-lab-workspace.png) after cloning this repository in VSCode.**

# Module 6 Week 3 Activity - ToDoList with File I/O 

## Purpose & Concepts: 
This activity concludes the ToDoList Manager activities. In this activity you will practice adding file input/output (File I/O) functionality to your multi-class program to allow state to be saved between sessions of the program. You will practice previously covered concepts as well as the following: Abstraction, Encapsulation, Variable Scope, Accessors, Mutators, Instance Methods, Pass-by-reference, Pass-by-value.


## Problem Description
In this activity, you will add file input/output (I/O) functionality to your TaskMaster driver class to allow ToDo lists to be saved to file and then read back in so you can access your saved ToDo list(s) each time you run your TaskMaster program. You will also practice using try-catch statements and exceptions.

## Before You Begin: Computational Thinking & Planning 
1. Read all requirements carefully.  Think about what files you will be working in and where the modifications will be made.
2. Outline the steps you need to take using line comments.

## To Do
1. Expand the folder named a6.3-ToDoListFileIO.
2. Copy your Task.java, TaskMaster.java, ToDoListInterface.java, ToDoList.java, and Category.java from last week's activity to a6.3-ToDoListFileIO.
3. Verify (again) that all methods are working correctly and that all requirements have been met.


## Requirements
You will add two methods to ToDoList:
1. `ToDoList(File file)` - This will be a new constructor in your ToDoList class that takes in a File object file and populates ArrayList *tasks* with data contained in the file. The first line of the file is the name of list. Each subsequent line contains information for a Task as comma separated values. (See below for more on file format.)
Use a try-catch statement to exit cleanly with an appropriately thrown exception if the file is not readable (i.e. if it does not exist, if the user does not have appropriate permissions, etc). After successfully opening the file, parse the contents of the file and populate ArrayList *tasks* with the tasks stored in the file.
2. `saveOut(File file)` - This method will take a File object file.  It will save the tasks in the arraylist (as a csv file).
Use a try-catch statement to exit cleanly and throw an appropriate exception if needed.
Remember to look at the file to be sure it is saving how you expect it to!
3. File Format Requirements: The first line of csv files for ToDoLists should contain the name of the ToDoList.
Each subsequent line of the csv file should have the following format to represent a single task:
`description,complete,category,priority`  For example, the following test1.csv contains list "Test List 1" with 3 Tasks:
```
Test List 1
Finish activity 6.5,false,SCHOOL,20
Eat a snack,false,PERSONAL,10
Take a nap,false,PERSONAL,15
```
4. In the last activity you tested your constructors and methods of your ToDoList class. 
In this activity, you will test that functionality again with the addition of new file I/O functionality. Do each of the following:
    - Create a new ToDoList instance using your constructor.
    - Add task1, task2, and task3 to your list using your addTask(Task t) method.
    - Add another task to your list using your addTask(String description) method.
    - Print your ToDoList and verify that your toString works as expected.
    - Call the saveOut method and save your ToDoList to test1.csv.  Does the file exist? Does it have the correct tasks in it?
    - Write a new test file called test2.csv with three tasks in it. Format this file as shown above.
    - Call the new ToDoList constructor method to open test2.csv.
    - Print your ToDoList and verify that the tasks in test2.csv are the tasks in the current ToDoList.
    - Add a task to ToDoList and call the saveOut method. Does test2.csv reflect the new state of ToDoList?


## Review & Reflect
1. Terminology Identification: Identify examples of at least 4 different concepts listed in the "Concepts" list above. These should be identified with an @keyterm tag within the comment.
2. Code Review: When you are finished with this activity, pair up with a classmate and review each other’s code to make sure it meets all the requirements. 
3. Reflection: At the end of REFLECTION.md write a one paragraph reflection describing your experience with this activity. What went well? What was challenging? How could you improve your plan prior to beginning to code? 

## Finally
1. Commit the changes to your local repository with a message stating that Activity 6.3 is complete.
2. Push/Sync the changes from your local repository to the GitHub classroom repository.

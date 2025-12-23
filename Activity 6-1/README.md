![CS121 Banner](images/CS121-BANNER.svg)

**NOTE: Before beginning the lab, please remember to [open the workspace](images/open-lab-workspace.png) after cloning this repository in VSCode.**

# Module 6 Week 1 Activity - Task with enum (two class periods)

## Purpose & Concepts: 
The next few weeks will bring together all previously covered concepts into a single program that spans multiple classes. You will practice conceptualizing a multi-class program, writing an object class, writing an aggregate class, writing driver classes, and testing each step along the way. The purpose of this activity is to practice writing an object class that uses an enum class and writing a driver class to test your object class. You will practice previously covered concepts as well as the following new concepts: Driver Class, Encapsulation, Visibility Modifier, Instance variable (or field or attribute), this reference, Formal Parameter, Argument, Object 

## Problem Description
This activity will be the first part of a larger ToDo List Manager program. The ToDoList Manager (TaskMaster.java) will allow the user to interact with a ToDoList (ToDoList.java).  A ToDoList is made up of Task objects (Task.java). Click [here](https://docs.google.com/presentation/d/1rMKkwkk1C5w4Clyc7BbwKaSdGurgZJp2pUD-7hJgxA4/) for a visualization of how these pieces will work together.

In this activity, you will write a class to represent a single Task object and a driver class with a main method to test your Task class.  You will also practice using an enum class.


## Before You Begin: Computational Thinking & Planning
1. This activity has a lot of pieces.  Start by thoroughly reading the requirements above.
1. As you read through the instructions, make notes with comments to remind yourself what you need to do.
1. Then use comments to outline the algorithms you're going to use to accomplish the requirements.


## To Do
1. Expand the folder named a6.1-Task and create a file called Task.java
2. Expand the folder named a6.1-Task and create a file called Category.java
3. Expand the folder named a6.1-Task and create a file called TaskMaster.java with a main method.
4. Implement the requirements (below). Be sure to test each step as you go!



## Requirements
1. Define a public enum called `Category` that can have values: `PERSONAL`, `WORK`, `SCHOOL`, `FUN`, `NONE`
1. Create a class Task with the following instance variables:
    - A *description*
    - A *priority* (this will be any integer value).
    - Whether or not the task is *complete*
    - A *category* that has one of the values of the Category enum
1. Give Task *overloaded constructors* below. Remember to instantiate *all* instance variables in both constructors. Think about the default values to use if they are not passed in as parameters.
    - `Task(String description)`
    - `Task(String description, int priority)`
1. Write a `toString()` method for Task that will return a String representing the state of the task in the following format. If the task is complete, prepend “[X]” before the description, else prepend “[ ]”.
    - Incomplete task output format: [ ] description, priority, category
    - Complete task output format:  [X] description, priority, category
1. Write getter and setter methods for all of the instance variables. Think about what (if any) parameters the methods will need and what (if any) return type they will have.
    - getDescription, setDescription
    - getPriority, setPriority
    - isComplete, setComplete
    - getCategory, setCategory
1. Write a driver class (class with the main() method) called TaskMaster.java that does each of the following:

   - Use the constructor that takes in a description to create a new Task object, named task1. Use “Finish Activity Task” as the task description. (See sample output below).
   - Print task1 to verify that your toString method works as expected.
   - Set task1 to complete using the setComplete method and verify the value was set correctly using your isComplete method.
   - Print task1 again to verify that your toString method still works as expected.
   - Set task1’s category to SCHOOL using the setCategory method and verify the value was set correctly using your getCategory method.
   - Print task1 again to verify that your toString method still works as expected.

   - Use the constructor that takes in a description and priority to create a new Task object, named task2 with priority 10. Use “Give Tigger a bath” as the description of this task. (See sample output below).
   - Print task2 to verify that your toString method works as expected.
   - Change the priority of task2 to 20 using the setPriority method and verify the value was set correctly using your getPriority method.
   - Print task2 again to verify that your toString method still works as expected.

When you are done, your output should look something like the following:
```
Task 1
[ ] Finish Activity 6.3, 0, NONE
Task 1 is complete: true
[X] Finish Activity 6.3, 0, NONE
Task 1 category: SCHOOL
[X] Finish Activity 6.3, 0, SCHOOL


Task 2
[ ] Give Tigger a bath, 10, NONE
Task 2 priority: 20
[ ] Give Tigger a bath, 20, NONE
```


## Review & Reflect
1. Terminology Identification: Identify examples of at least 4 of the following - constructor, getter, setter, driver class, object class, enum. These should be identified with an @keyterm tag within the comment.
2. Code Review: When you are finished with this activity, pair up with a classmate and review each other’s code to make sure it meets all the requirements. 
3. Reflection: At the end of REFLECTION.md write a one paragraph reflection describing your experience with this activity. What went well? What was challenging? How could you improve your plan prior to beginning to code? 

## Finally
1. Commit the changes to your local repository with a message stating that Activity 6.1 is complete.
2. Push the changes from your local repository to the GitHub classroom repository.

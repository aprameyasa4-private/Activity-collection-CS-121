![CS121 Banner](images/CS121-BANNER.svg)

**NOTE: Before beginning the lab, please remember to [open the workspace](images/open-lab-workspace.png) after cloning this repository in VSCode.**

# Module 6 Week 2 Activity - ToDoList

## Purpose & Concepts: 
This activity continues the ToDoList Manager program introduced last week.  The purpose of this activity is to practice previously covered concepts as well as the following new concepts: Interface, Static Method, Instance Method, Pass-by-Reference, Calling a method, Class Method, Overloading, Implementing an Interface, Enums

## Problem Description
In this activity, you will update *Task* to use enums and implement the *Comparable* interface.  You will then create an *aggregate* class, `ToDoList`, which *has-a* list of Task references. Your ToDoList class will provide methods for managing tasks.


## Before You Begin: Computational Thinking & Planning
1. Read all requirements before beginning, and re-read Task.java to refresh your memory of the class. If your Task.java is not fully functional talk to your instructor immediately.
2. Outline the steps you need to take using line comments.
   
## To Do
2. Expand the folder named a6.2-ToDoList and create a file called Category.java
2. Copy your Task.java, ToDoList.java, and TaskMaster.java files from last week's activity to a6.2-ToDoList.
3. Verify (again) that all methods are working correctly and that all requirements have been met.


## Requirements

1. Define a public enum called `Category` that can have values: `PERSONAL`, `WORK`, `SCHOOL`, `FUN`, `NONE`

1. Update the Task class to no longer use final ints. Replace the int instance variable with a `Category` instance variable.  Update the getter and setter for *category*.  Update the toString method and anywhere else you used *category* as an int to make it use the enum. Note that the enum makes *category* typesafe now! In your setter, you're guaranteed to get a valid value for *category*!

1. Update the class header for your Task class to implement the Comparable<Task> interface:
`public class Task implements Comparable<Task>`

1. Add the equals() and compareTo() methods below to your Task class:
```
/**
 * Indicates whether some task is "equal to" this task. Tasks are equal if
 * they have the same description (case insensitive).
 * @param The other task to compare this task to.
 * @return true if the tasks are equal, false otherwise.
 */
public boolean equals(Object o) {
    if (o instanceof Task) {
        Task other = (Task)o;
        if (this.description.equalsIgnoreCase(other.description)
            && this.category.equals(other.category)) {
            return true;
        } else {
            return false;
        }
    } else {
        return super.equals(o);
    }
}

```

```
/**
 * Compares two tasks based on their priorities.
 * @param The other task to compare this task to.
 * @return difference between the tasks if they are either both complete or
 * both incomplete, return -1 if this task is complete and the parameter task 
 * is incomplete, returns 1 if parameter task is complete and this task is not     
 * complete.
*/
@Override
public int compareTo(Task other)
{
	if(this.complete == other.complete)
	{
		return this.priority - other.priority;
	}
	else if(this.complete && !other.complete)
	{
		return -1;
	}
	else
	{
		return 1;
	}
}
```

3. Your ToDoList class must now implement the provided **ToDoListInterface** (ToDoListInterface.java). Modify your ToDoList class to be the following class header: 
`public class ToDoList implements ToDoListInterface`

7. Complete all remaining methods in ToDoListInterface.java. Read the javadocs in the interface carefully to determine what each method should do.  Read the following **HINTS**.  The first several refer to `getWork()`.  The last hint refers to `getTaskList()`:
    - The isEmpty() method from the ArrayList class will tell you if your list has any tasks in it.
    - To find the next incomplete task with the highest priority, you will leverage the Java Collections API and the compareTo method that you added to your Task class in the previous section of this activity. The Java Collections API provides a Collections class which consists exclusively of static methods that operate on or return collections. Since an ArrayList is a type of Collection, we can use these methods to help manage our task list. Use the max method from the Collections class to get the greatest task in the list. The max method returns the maximum element of the given collection, according to the natural ordering of its elements. The “natural ordering” for a Task has already been defined by your compareTo method.  Use: `Task maxTask = Collections.max(tasks);`
    - Make sure to check if the maxTask is complete before returning it to the user. If the maxTask is complete you can assume there is no work to do and return null.
    - getTaskList() returns a **copy** of the ArrayList of tasks - not an alias
1. Update your TaskMaster “driver” class. You will test the constructors and methods of your ToDoList class by doing the following:
    - Create a new ToDoList instance using your constructor.
    - Add task1, task2, and task3 to your list using your addTask(Task t) method.
    - Add another task to your list using your addTask(String description) method.
    - Print your ToDoList and verify that your toString works as expected.
    - Call the getWork method on your list to get your next task. Did it return the correct task?
    - Test the following conditions on your getWork method. How will you set up a list to force the conditions?
      - Does it return null if your list is empty?
      - Does it return null if all tasks are complete?



## Review & Reflect
1. Terminology Identification: Identify examples of at least four of the concepts listed at the top of this README.  Identify each example with an @keyterm tag within the comment.
2. Code Review: When you are finished with this activity, pair up with a classmate and review each other’s code to make sure it meets all the requirements. 
3. Reflection: At the end of REFLECTION.md write a one paragraph reflection describing your experience with this activity. What went well? What was challenging? How could you improve your plan prior to beginning to code? 

## Finally
1. Commit the changes to your local repository with a message stating that Activity 6.2 is complete.
2. Push the changes from your local repository to the GitHub classroom repository.

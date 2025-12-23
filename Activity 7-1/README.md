![CS121 Banner](images/CS121-BANNER.svg)

**NOTE: Before beginning the lab, please remember to [open the workspace](images/open-lab-workspace.png) after cloning this repository in VSCode.**
# Module 7 Week 1 Activity - BubbleSorter

## Purpose & Concepts: 
Module 7 concepts: Arrays, Array vs ArrayList, Array Declaration., Dynamic Sizing, Initializer list, Array Element, Bounds Checking, ArrayIndexOutOfBoundsException, Off-by-one-error, Two-Dimensional array, Rows vs Columns in 2D array, Iterating over 2D array, Array Tracing


## Problem Descriptions
In this activity you will first create a class called BubbleSorter that will have a 1D array of integers as an instance variable. The BubbleSorter will provide methods to sort, return, and display the given array.  To perform the sort operation you will implement the Bubble Sort algorithm (given in pseudo-code below). See the [Wikipedia page for BubbleSort](https://en.wikipedia.org/wiki/Bubble_sort) for a nice animation. As sorting algorithms go, bubble sort is one of the worst in terms of performance, but it does have the benefit of being one of the easiest to conceptualize and implement. :)

You will write a driver class to test the functionality of BubbleSorter. **After** that is working correctly, you will create a 2D array of integers in your driver class and use BubbleSorter to sort each row of the 2D array. 


## Before You Begin: Computational Thinking & Planning
1. Trace through the bubble sort algorithm by hand with a 5 element unsorted array.
2. Outline the algorithm in using line comments BubbleSorter.java
3. Outline the steps you need to take using line comments in BubbleDriver1.java
4. *After* BubbleSorter and BubbleDriver1 are working correctly, use that new understanding to create a plan (using line comments) for BubbleDriver2.java

## To Do
1. Expand the folder named a7.1-BubbleSorter and create files named BubbleSorter.java and BubbleDriver1.java
2. Write the BubbleSorter class to satisfy the requirements. Use BubbleDriver1 to test each method.
3. After these classes are working correctly, create a plan for BubbleDriver2.
4. Using these steps, create BubbleDriver2.java.


## Requirements
1. Create a class called BubbleSorter with the following methods:
   - Constructor that takes in an integer array as a parameter and stores the address of the array as an instance variable. In other words, the instance variable should be an alias of the given array.
   - sort() has no return and no parameters.  This method will sort the array in referenced in the BubbleSorter instance. Sort() will implement the Bubble Sort algorithm given in the pseudo-code below:
```
function sort():
   done = false
   while !done
      done = true
         for( i=1; i<dataArray.length; i++)
            if (dataArray[i-1] > dataArray[i])
               swap(i-1,i)
               done = false
  ```
   - swap(int index1, int index2) is a private helper method that will swap the positions of two elements in the array stored at index1 and index2.
   - getArray() will return a **copy** of the array
   - toString() will return a string that represents the state of the array
2. Create a driver class BubbleDriver1.java that will 
   - create an integer array populated with numbers between 0 and 99. Use an initializer list to instantiate the array.
   - create a new BubbleSorter object and test the functionality of each method. Create a good test plan and show the results of your tests in the console. How will you know if it is working correctly?
3. Create a driver class BubbleDriver2.java that will 
   - create a 2D array of integers populated with random numbers between 0 and 99 (i.e. use the Random class)(you may hard-code the dimensions of your 2D array)
   - sort each row of the 2D array using your BubbleSorter class
   - print out the original, unsorted 2D array
   - print out the sorted 2D array



## Review & Reflect
1. Terminology Identification: Identify examples of at least 4 different concepts listed in the "Concepts" list above. These should be identified with an @keyterm tag within the comment.
2. Code Review: When you are finished with this activity, pair up with a classmate and review each other’s code to make sure it meets all the requirements. 
3. Reflection: At the end of REFLECTION.md write a one paragraph reflection describing your experience with this activity. What went well? What was challenging? How could you improve your plan prior to beginning to code? 

## Finally
1. Commit the changes to your local repository with a message stating that Activity 7.1 is complete.
2. Push the changes from your local repository to the GitHub classroom repository.


![CS121 Banner](images/CS121-BANNER.svg)

**NOTE: Before beginning the lab, please remember to [open the workspace](images/open-lab-workspace.png) after cloning this repository in VSCode.**# Module 7 Week 2 Activity - SodaSurvey 

## Purpose & Concepts: 
The purpose of this activity is to practice previously covered concepts as well the following new concepts: Command-line arguments, Validating command-line arguments, Parsing arguments, Two-Dimensional array. In this activity, you will read table data from a file given as a command-line argument to populate a 2D array. You will then access all table values in loops to calculate row and column sums and averages.


## Before You Begin: Computational Thinking & Planning
1. Read SodaSurveyInterface.java
2. Outline your algorithms in your source files.

## To Do
1. Expand folder a7.2-SodaSurvey. Create SodaSurvey.java and SodaSurveyDriver.java
2. Follow your steps to write the classes to satisfy the given requirements.


## Problem Description
The Battle Bottle Soda Company is conducting market testing on some new soda flavors like Nuclear Nectarine, Samurai Strawberry, Bananarang, Mixed Martial Mango, etc. They’ve gathered feedback from passing patrons at several state fairs, where people are generally willing to try anything.

The data from each survey site is in table form in text files, where each row is one person’s rating of sodas on a scale of 1 to 10, where 1 corresponds to “Call 911...” and 10 is “Take my money, now!” Each column represents one of the sodas. The first line of the file has two integers, giving the number of rows (people) and columns (sodas) in the file to facilitate reading the table into a 2D integer array for processing.

For example, the following file represents the subsequent table:
```
3 4
2 4 1 7
3 3 2 4
1 5 2 5
```
|          | Soda 1 | Soda 2 | Soda 3 | Soda 4 |
| ---------| ------ | ------ | ------ | ------ |  
| Person 1 | 2      | 4      | 1      | 7      | 
| Person 2 | 3      | 3      | 2      | 4      |
| Person 3 | 1      | 5      | 2      | 5      | 



The company can’t afford a professional statistician who knows fancy terms like ‘variance’ and ‘normalization’, so you will be doing some initial processing of the data to get simple averages.

Program output should closely resemble:
```
Person 0 Mean: 3.50
Person 1 Mean: 3.00
Person 2 Mean: 3.25

Soda 0 Mean: 2.00
Soda 1 Mean: 4.00
Soda 2 Mean: 1.67
Soda 3 Mean: 5.33
```

## Requirements
1. Create a class SodaSurvey that implements SodaSurveyInterface.java.  
   - The SodaSurvey class will contain and process a 2D int array with rows corresponding to people and columns corresponding to sodas, as read from an input text file. The 2D array should be the ONLY instance variable. Use .length in all code to get array dimensions. There should be no ArrayLists anywhere in this program.
   - Use the following header for SodaSurvey: `public class SodaSurvey implements SodaSurveyInterface { }`
   - SodaSurvey must have one constructor that takes in an input filename as a String argument: `public SodaSurvey( String filename ) { }`
   - Use a Scanner to read in each row. You have a choice for how to process each line. You can use a second Scanner or you can use String .split() to break each row into a String[] of column values. Convert Strings to ints with Integer.parseInt()
   - Implement all methods as described in the SodaSurveyInterface method javadocs
   - The toString() method should return a String formatted as shown in the sample output above and in the interface javadoc for toString(). Format averages to two decimal places.

2. Create a driver class (with main() method) called SodaSurveyDriver.java. 
    - SodaSurveyDriver will get an input filename passed as a command-line argument to String[] args. There should be NO other user interaction via prompts or input from the keyboard.
    - Validate that a command line argument was received. If the program was launched without a command-line argument report the problem with a message to the console and exit.
    - Create a SodaSurvey object using the filename. Test the functionality of all SodaSurveyInterface methods.
    - Thoroughly test SodaSurvey.  Sample sessions should look like the following:

```
$ java SodaSurveyDriver
Usage: java SodaSurveyDriver filename
$
```
```
$ java SodaSurveyDriver Survey1.dat
Testing rowAvg(0): 3.5
Testing rowAvg(1): 3.0
Testing colAvg(0): 2.0
Testing colAvg(1): 4.0
Testing toString():
Person 0 Mean: 3.50
Person 1 Mean: 3.00
Person 2 Mean: 3.25

Soda 0 Mean: 2.00
Soda 1 Mean: 4.00
Soda 2 Mean: 1.67
Soda 3 Mean: 5.33
$
```
```
$ java SodaSurveyDriver Survey2.dat
Testing rowAvg(0): 2.0
Testing rowAvg(1): 3.3333333333333335
Testing colAvg(0): 2.0
Testing colAvg(1): 4.0

Testing toString():
Person 0 Mean: 2.00
Person 1 Mean: 3.33
Person 2 Mean: 3.33
Person 3 Mean: 1.33
Person 4 Mean: 3.00

Soda 0 Mean: 2.00
Soda 1 Mean: 4.00
Soda 2 Mean: 1.80
$
```



## Review & Reflect
1. Terminology Identification: Identify examples of at least 4 different concepts listed in the "Concepts" list above. These should be identified with an @keyterm tag within the comment.
2. Code Review: When you are finished with this activity, pair up with a classmate and review each other’s code to make sure it meets all the requirements. 
3. Reflection: At the end of REFLECTION.md write a one paragraph reflection describing your experience with this activity. What went well? What was challenging? How could you improve your plan prior to beginning to code? 

## Finally
1. Commit the changes to your local repository with a message stating that Activity 7.2 is complete.
2. Push the changes from your local repository to the GitHub classroom repository.

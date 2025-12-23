![CS121 Banner](images/CS121-BANNER.svg)

# Module 1 Activity 1 - Hello, Class!

## Purpose & Concepts

This activity will help you develop the skills needed to navigate the
computer system you will be using for this course.  Knowing how to
navigate your file system and use the terminal will be helpful for
when the GUI isn't working or you just want to do something fast!

If you have never used Linux before, be patient with yourself. You are
not expected to memorize all of the commands right away, so don't get
frustrated if this takes you a while.

You will also write, compile, and execute your first Java program!


## Instructions

You will be doing everything in the Terminal today. This assignment
isn't configured to work properly with VSCode, so trying to use the
GUI will give you varying degrees of success.  For guaranteed success,
follow the instructions and use the Terminal.

First, open the Terminal inside VSCode. To open the Terminal, look in
the menu bar at the top of the window.  Choose Terminal --> New
Terminal. It should open at the bottom of the window.

The first part of the prompt (user@nodeX) shows your user name and the
name of the particular workstation, or node, that you are logged
on. It also always displays your current directory, so it changes as
you move around your file system.

### Navigating the file system

Moving from your current location into another directory uses the
change directory command, `cd`, followed by the name of the directory
you want to move into (NOTE: Do not include the ‘$’ symbol when you
type your command. The examples below show that you should type the
command after the ‘$’ displayed by the command prompt).

Change into the a1.1 folder:

```
cd a1.1
```

Create a new Java file in this folder:

```
touch HelloClass.java
```

If you look in the file explorer in the left hand menu, you should see
`HelloClass.java` there.  Double click it to to open (you can open it
from the Terminal by using `code HelloClass.java`, but that doesn't
always work from inside VSCode).

### Compiling and Running

In HelloClass.java, enter the following program (don't include the ticks):
```
    public class HelloClass
    {  
        public static void main(String[] args)
        {
            System.out.println("Hello, Class!");
        }
    }  
```

**Save your file!** The compiler will compile what is written to disk,
  so it won't work if you don't save the file first.  Open the
  Terminal again if it was closed and move back to a1.1.

Verify you're in the right folder by using `ls` (lists the contents of the folder):

```
ls
```

You should see `HelloClass.java`.  If you don't, change into the a1.1 folder.

To compile, you use the Java compiler, `javac`:

```
javac HelloClass.java
```

If it was successful, if you list the folder again, you should see
`HelloClass.class`.  That's the compiled file.

To run the program, use `java`:

```
java HelloClass
```

You should see the output of your program in the Terminal!

## Exploring Error Messages

Once you have your version of `HelloClass.java` running, try changing
things in the code to see what kinds of error messages you get when
you compile. After each change, save your file, re-compile the program
and run it. Then restore the program to its working state before you
try to create another error. Document your observations in your
reflection in REFLECTION.md.

Try the following:

* Change the name of the class from HelloClass to helloclass in the class header.
* Remove a semicolon from somewhere in the code.
* Remove a closing curly brace from the code.
* Remove a double quote from the end of the String in the println statement.
* Change main to Main.
* Come up with some other changes to see if you can get some different error messages.


## Review and Reflect

Open REFLECTION.md and fill it out.


## Submitting

You will submit your work using git.  First, make sure you've
configured git. In the Terminal, enter the following commands,
updating the values with your name and your BSU email:

```
git config --global user.name "Your Name"
git config --global user.email "username@u.boisestate.edu"
git config --global pull.rebase false   
```


There are three steps to submitting to GitHub
1. Add your files (stage for commit)
2. Commit with a commit message
3. Push your changes

### Step 1: Add your files

Save your files! Then add all of the files you modified using git add, like this:

```
git add HelloClass.java REFLECTION.md 
```

### Step 2: Commit your files

Make a note of what you did to change these files.  In this case,
you're done with the assignment, so that's what we'll make the
message. Be careful to ensure that your punctuation matches the
following exactly (including spaces and quotes!)

```
git commit -m"Finished activity 1"
```

### Step 3: Push your files

Now we send those files off to GitHub!

```
git push
```

You should be all done!  Double check that your files were submitted
correctly by visiting GitHub using the link from the assignment.  What
you see on GitHub is what will be graded.  You can repeat Steps 1, 2,
and 3 until you get everything pushed.


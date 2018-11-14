# Artsy
Project from CS course in 2016 

## Project Description

![Artsy](http://i.imgur.com/YciJ2sl.png)

Your goal is to implement a Java application that can stitch together multiple images in
a number of "artsy" ways. This project will make use of interfaces and JavaFX 8.
This will require you to lookup things in Javadoc and apply your knowledge of
things like inheritance, polymorphism, and lambda expressions.

Part of software development is being given a goal but not necessarily being 
given instruction on all of the details needed to accomplish that goal. For example,
even though image manipulation hasn't been covered in class, in order to complete this 
project you are going to need to lookup how to load, interact with, and save images in Java.
Also, since this is your first project with JavaFX 8, you will probably need to consult the 
Oracle tutorials and definitely the Java SE 8 JavaDoc for assistance. 

This project is also designed to help you better understand how object communicate
with each other. Since GUI containers can be nested, you need to make sure that
your components and listeners have communication access to objects the need in
order to function correctly. While you can technically write your entire JavaFX-based
GUI application entirely in the <code>start</code> method, this will
make your code messy, hard to read, and result in lots of duplicate code.
Before you write any code, you should plan out your containment heirarchy and
design classes involving inheritance and polymorphism appropriately. Then, when
you go to write the code for your GUI, use the classes you designed, changing
them as needed.

## Artsy Interface

Here is some detailed information about what the graders expect to see
from your user interface. While your final design does not need to match
the following set of pictures exactly, you need to provide (at a minimum)
the same functionality. Here is what the program should resemble when it
first launches:

![Artsy](http://i.imgur.com/YciJ2sl.png)

There is a menu bar with a File menu. Underneath the menu bar there are
some buttons for performing the various artsy effects. There are also
placeholders for three different images. Above the first two images,
the file names of the images are present. Underneath each image there
are two buttons that perform various effects on that image.

The placeholder image is located in the <code>resources</code> directory
provided in the root of this project.

Here a closer look at the File menu:

![File Menu](http://i.imgur.com/7V90nli.png)

When the user chooses to open an image, a <code>javafx.stage.FileChooser</code> should open
up, allowing the user to browse for an image file, open it, and have that image
display in the appropriate place. When the user chooses to save the result, a
<code>FileChooser</code> should open up, allowing the user to browse for a
location to save the result image. The actual image file should be written to
the file location specified by the user. Also, when the user choose to exit, the
entire application should immediately exit.

After opening Image 1 and Image 2, the program should look something like this
(these sample images are located in the <code>samples</code> directory in the
root of this project):

![Loaded](http://i.imgur.com/JOdTmw8.jpg) 

Here is a before and after shot of clicking on the "rotate" button for Image 1:

![Before Rotate](http://i.imgur.com/ds34jlc.jpg)

As you can see, the user if prompted to enter the angle, in degrees, that the
image should be rotated. If the user cancels then no rotation should be
performed. If the user enters in an invalid input (in this case, not a number),
then a dialog box should appear letting the user know that the input was invalid
and the user should be re-prompted.

![After Rotation](http://i.imgur.com/ozslJvg.jpg)

As you can see, after a valid degree value is provided, Image 1 is rotated.
This effect should be achieved by using your <code>MyArtsy</code> class.

If, at any time, the user clicks on the "reset" button for a particular image,
that image should be reset to what it was before any modifications were made.
For the first two images, this will return them to their original state. For
the result image, this should revert the image back to the default image.

When saving, do not save changes to Image 1 and Image 2 back to their
respective files. The only image that will be saved is the Result image,
if the user chooses to do so.

Here is a before and after shot of the Artsy checkers effect:

![Before Checkers](http://i.imgur.com/sZCsHfJ.jpg)

Just like before, the user is prompted to enter a value. If the user cancels,
no effect should be applied. If the user enters in an invalid input (in this
case, not an integer), then a dialog box should appear letting the user know
that the input was invalid and the user should be re-prompted.

![After Checkers](http://i.imgur.com/CVPrsJ2.jpg)

As you can see, after a valid input is provided, the two images were combined
using the Artsy checkers effect and the result was displayed in the Result
image. This effect should be achieved by using your <code>MyArtsy</code> class.

Here are images for the horizontal stripes and vertical stripes effects:

![Before Vertical Stripes](http://i.imgur.com/OkVQ4xx.jpg)

![After Vertical Stripes](http://i.imgur.com/6OTYDdu.jpg)

![Before Horizontal Stripes](http://i.imgur.com/lbkyCDO.jpg)

![After Horizontal Stripes](http://i.imgur.com/WRAqVDv.jpg)

If a user rotates an image, the rotated version of the image should be used to
produce the Result image when an Artsy effect is applied. Here is an example:

![Rotated and Artsy](http://i.imgur.com/3OIXVY3.jpg)

That pretty much sums it up. If you have any questions, feel free to consult the
instructor or the TAs via Piazza. 

## Suggestions

I would suggest breaking up your interface into multiple classes as needed in 
order to reduce repetition and increase code reuse.
For example, you know that there are three images, each with their own "rotate" 
and "reset" buttons.
Think about creating a separate class that extends one of the existing subclasses of
<code>Pane</code> (e.g., <code>FlowPane</code>), containing
GUI components to display an image, its label, as well as those two buttons. This
class can also contain convenience methods for opening/saving a file, displaying 
the image for that panel. You can also include the action listeners for that 
panel's buttons as inner classes (named or anonymous). That way, you only write 
the code once (instead of three times) and you simply create three different objects
of that panel class to add to your GUI.

## Resources

The files for this project are hosted Github using <code>git</code>. They can be
retrieved by cloning the repository found at <code>git://github.com/mepcotterell-cs1302/cs1302-artsy.git</code>. 
For example, you can issue the following command to clone the repository:

    $ git clone git://github.com/mepcotterell-cs1302/cs1302-artsy.git LastName1-LastName2-p3

As always, I suggest developing directly on <code>nike.cs.uga.edu</code> because
this is where your project will be run and tested. Since <code>git</code> is 
already installed on <code>nike</code>, you can clone the project directly into 
your <code>nike</code> home directory using the command provided above.

If any changes are made to the project description or skeleton code, they will
be announced in class. In order to incorporate such changes into your code, you 
need only do a <code>git pull</code>.

Also, since <code>git</code> is a decentralized version control system, you will
have your own local copy of the repository. This means that you can log your 
changes using commits and even revert to a previous revision if necessary.

## Directory Structure and Packages

The <code>Artsy</code> interface is contained in the <code>cs1302.artsy</code> 
package under the <code>src/main/java/cs1302/artsy</code> directory. The other 
classes of interest for this project should be contained in the 
<code>src/main/java/cs1302/p2</code> directory. 
These classes are in the <code>cs1302.p2</code> package.

## Build System

For this project, we will be using the [Simple Build System (sbt)](http://www.scala-sbt.org/). 
If you clone the project from the GitHub repository then everything you need 
in order to compile and run your project on <code>nike</code> is already included. 
In order to compile your project, you can use the following command:

    $ ./sbt compile

To run your project, use the following command:

    $ ./sbt run

In order to clean your project (remove compiled code), use the following command:

    $ ./sbt clean

Reading Level Project

In this project, you will create a program capable of reading input from a .txt file and reporting some basic information about the “reading level” of the text.

Words with 4 or fewer letters are considered to be “kindergarten” reading level. Words with length in the range (4, 6] are “elementary level”, (6, 10] are “middle school level”, (10, 14] are “high school level”, and words longer than 14 letters are considered “advanced.”

You will be provided with a .zip file of a project. That project contains code that can read the contents of a .txt file into a String variable. After downloading and unzipping the file folder, rename the folder to include your name!

Given that the focus of this project is iteration, your solution will need to take advantage of looping somewhat extensively. For this reason, you will not be permitted to use the String.split method. While it is quite useful, you will need to chop the input string into individual words on your own inside of a loop.
Things you may find useful:
The textToString, getPunctuation, and removePunctuation methods provided with your project
The String methods covered previously in class
str.charAt(i), which returns the char at index i (where i is some non-negative integer) from the String str
Character.isWhitespace(char c), which returns true or false depending on whether the provided char is whitespace (space, tab, newline, etc.)
You can print a rounded version of a double (named myDouble for this example) in the middle of a string smoothly like this:
System.out.printf(“This is my string with a double rounded to two decimal places: The double is %.2f”, myDouble);

Specifications
Your code must compile and run without requiring any modification to receive above 70% credit for the project.
Your code must work on any given .txt file, provided it consists only of alphanumeric characters, basic punctuation, and whitespace.
Your program output must include the following:
A copy of the original text being analyzed
An “analysis” section that lays out how many of each type of word was found
A “specifics” section that lists all of the words in each category
An overall average rating, indicating whether this text should be considered “kindergarten”, “elementary”, “middle school”, “high school”, or “advanced”.
Here is one example of what your program output might look like:


-------------------Original text-------------------
Dog. Big dog. Little dog. Big dogs and little dogs. Black and white dogs. "Hello!" "Hello!" "Do you like my hat?"
-------------------Level Breakdowns-------------------
This text contains:
91 kindergarten-Level words,
23 elementary-level words,
2 middle-school-level words,
0 high-school-level words, and
0 advanced words.
-------------------Words In Each Category -------------------
Kindergarten-Level words: Dog Big dog dog Big dogs and dogs and dogs Do you like my hat I do not One dog in big
Elementary-Level words: Little little Black white Hello Hello little going Three going green yellow little gose
Middle-School-Level words: Good-by Good-by
-------------------Reading Level-------------------
The average word length in this text is 3.38 letters, so it appears to be of kindergarten reading level


Submission:
Submit a single .zip file of your “Reading Level Project” folder, complete with src/ folder and at least one samplePassage (.txt) file inside of it.

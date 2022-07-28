# Core Java Assignment

Problem Statement:

Find the occurrence of the given word and if not specified then of all words from the given document. Document path and the word should be consumed from the config file only.


Example:

· Document:

gemi mini gini gemi mine gini

gemi mini gini gemi mine gini

· Sample output when no word:

gemi - 4

mini - 2

mine - 2

gini - 4

· sample output when word is given - 'gemi':

gemi - 4

· sample output when given word has no occurrence: word - 'Gemini':

Gemini – 0

------------------------------------------------------------
**Now comes the solution and approach to the given problem Statement**

_The important points that are needed to be taken care in this project 
are:_

· If word is specified - return the frequency of that word.

· If no word is specified - print the frequency of all the words in given document.

· Handle exceptions wherever applicable

· Document code with readme as well as code comments

· Logging should be there


Now,

*I have used IntelliJ Idea Ultimate Edition for this project*

First of all, A file is created with the .properties extension in which the path of
txt file is given and the word (which needs to be searched) is also given as shown
in the project.

The whole code is written inside try and catch block to handle the exceptions raised
(if any)*
In the main file,

An object of properties file is created. Then using the getProperty method the Filepath
and the word is stored in two different strings.
The most efficient approach to find the occurrence of words in the file is using HashMap.

Then using the HashMap, the given problem Statement is done and the logic is applied
according to the conditions given in the problem Statement.

Code comments are well written at every step throughout the project for the thorough
understanding of the reader.

Logging is also done to capture the activity of project and to trace out errors.
It is used to get the information of what is going on in the project.







## Authors

- [@NamansainiGemini](https://github.com/NamansainiGemini)


## Contributing

Contributions are always welcome!

Contributor
    Naman Saini 
    https://github.com/NamansainiGemini

Please adhere to this project's `code of conduct`.


## Support

For support, email naman.saini@geminisolutions.com  


## Feedback

If you have any feedback, please reach out to us at naman.saini@geminisolutions.com


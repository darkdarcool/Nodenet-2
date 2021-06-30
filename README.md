# Nodenet

Hello! And welcome to Nodenet! This is the home repo of Nodenet!

You may notice this repo is called _Nodenet-2_, that is because this is actually the second version of Nodenet, the successor to Nodenet! 

Nodent wasn't coded very well, and was hard to understand and use, and had very few features.

Fortunately, Nodenet-2 is much better! It has many more features, and is built in the more powerful language, [java](https://openjdk.java.net)! 

# Installation

Currently, it doesn't have an installation! We may use npm bin, and connect it there, but otherwise, that's the only plan!

# Usage 

Nodenet-2 doesn't have many features currently, but here are the ones that are planned to be added!

## Test

Via [jest](https://jestjs.io), we can allow users to test their Nodejs code! Just like Dotnet! Here is how it will be used:

``` bash
nodenet test myFileToTest.js
```  
That is how the first Nodenet did it, and how it will be done here, but there will be more options to use it with! You can test _all_ of your test files by using:

```bash
nodenet test --all
```
And then Nodenet will test _all_ found jest files, so you don't just have to test one file at a time!

We will also have an option to test a certain test, which can be useful to run one singular test, and here is how we plan to implement it:

```bash
nodenet test --singular myTest
``` 

Then Nodenet will test one singular test!

Those are all of the features we currently are making!

README WILL BE DONE LATER
# CS305 – Software Engineering

## Practice Midterm

# Part 2: Theory [40 points]

This is part 2 of the midterm exam. It has 17 questions.

This file is named `Theory-Questions.md`. Provide the answers in this file and commit the file to the `master` branch of this `midterm-GASPAR` repo. Do not change the name of the file, and do not change the existing text unless otherwise indicated. We will only grade the master branch.
For multiple-choice questions, we marked the choices as `[]`; you should change each one to `[y]` for all correct (yes) choices and to `[n]` for all incorrect (no) choices. Unless otherwise specified, questions may have zero, one, or more correct answer choices.
An empty checkboxe will indicate that you did not finish answering the corresponding question, so we will not grade it. Do not introduce extraneous spaces, as that will cause you to lose points.

### Question 1

Which of the following is _not_ a sign of software complexity?

- [y] Large number of methods
- [n] Large number of small components
- [n] Large number of component interactions


### Question 2

Which of the following exceptions should be checked?

- [y] A request to a server that times out
- [n] A database query that attempts to retrieve data from a non-existent table
- [y] A user enters an invalid email address when signing up on a website
- [n] Your application requests a resource using a deprecated version of the API


### Question 3

Which of the following is true about using the Scrum Agile development to develop an application?

- [n] It allows you to eliminate code comments because only a small team is responsible for the code. This allows the team to move faster
- [y] Team members may come from different backgrounds (e.g. Android developers, AppEngine server developers, and data scientists can be on the same team)
- [n] The Scrum master helps maximize the business value of the application by prioritizing the customer’s interests
- [n] The Daily Scrum is used to resolve any blocking issues that team members experience in the current sprint


### Question 4

Which of the following is _always_ true about test-driven development (TDD)?

- [y] All tests must pass for a feature to be considered complete
- [n] It is a good practice for designing the “look and feel” of your application (e.g. button sizes, fonts)
- [n] It is useful for developing new features on a large, legacy application
- [n] Tests should not be discarded after the feature is implemented


### Question 5

Your application may receive "garbage input" if it does which of the following?

- [y] Reads a file
- [n] Writes a file
- [n] Reads data that it itself has previously written to memory
- [y] Has a command line interface


### Question 6

Which of the following are appropriate circumstances for adopting strict adherence to the waterfall development model?

- [n] Creating a new feature in an open source database (e.g. MySQL, Postgres) that is used by large companies.
- [y] Developing an operating system for an interstellar spacecraft
- [y] Building the Gotthard Base Tunnel
- [n] Creating a new Android application at a company with a large number of users (e.g. Facebook, Twitter).


### Question 7

Under which circumstances should you let a runtime exception abnormally terminate your application?

- [y] A divide-by-0 calculation
- [n] A connection to a server times out when requesting a resource
- [n] A user specifies an incorrect command line argument
- [y] Not being able to load a necessary external library for your application


### Question 8

Which are the downsides of choosing a Scrum development model when designing and manufacturing a new CPU?

- [n] The frequent feedback from Scrum can be distracting when designing a complicated system
- [y] The design and requirements must be in place before starting the development process due to the difficulty of replacing millions of defective CPUs if customers discover an error
- [y] The cost of making a change to a mature prototype is very high
- [n] Breaking down the project into small features for small Scrum teams is not possible


### Question 9

Your Android app communicates with several servers, some of which return XML while others return JSON. Which design pattern is most appropriate for writing the code to parse the servers’ responses?

- [n] Observer
- [y] Factory
- [n] Decorator
- [n] Singleton


### Question 10

Which of the following is true about software testing?

- [y] Tests are useful for refactoring
- [n] Testing proves that covered code has no bugs only if the tests pass
- [n] An application that has 100% test coverage is bug-free
- [y] Tests can help identify if a "solved" bug reappears in a later iteration of the code ("regression" bugs)


### Question 11

What is wrong with this Java interface?

```
public interface Stack<T> {
    public int getIndexOfTopItem();
    public void incrementTopItemIndex();
    public void pushItemAtFirstIndex(T item, int firstIndex);
    public T getItemAtFirstIndex(int firstIndex);
}
```

- [n] The interface should be a class instead
- [n] The stack index should be a generic index, so it doesn't limit the interface
- [y] The interface exposes too much internal complexity, breaking the abstraction layer
- [n] The interface should inherit from other interfaces to be more usable


### Question 12

You are tasked with modifying code a coworker wrote several years ago. The code does not match your preferred coding style. You should...

- [y] Write code that matches the old code's style
- [n] Reformat the whole file to your coding style
- [n] Leave the old code alone, but use the new format on lines of code that you change
- [n] Do whatever you want, it's old code anyway


### Question 13

Which of the following are appropriate uses of an issue tracker (e.g. GitHub Issues in your SwEng project repositories) for a given server application called `InventoryServer`?

- [n] Storing documentation about the API of `InventoryServer` for external developers
- [y] Tracking new features for `InventoryServer`
- [y] Tracking user interface bugs in `InventoryApp`, an Android app that communicates with `InventoryServer`
- [n] Assigning issues to team members so everyone knows who is responsible for each piece of functionality


### Question 14

When should you ask other members of your team to review your code?

- [n] After everybody has finished their task for the sprint
- [n] After finishing every method you need to write
- [y] After finishing one chunk of functionality
- [n] Never; the other members should take the initiative to review it


### Question 15

You are part of a team of four people who collaborate on code in a Git repository. Which of the following practices should be _avoided_?

- [n] have everyone in the team work on their own branch
- [y] have some people working directly on master and some others on dedicated branches
- [n] keep all branches in sync with master (e.g., by merging)
- [y] merging feature branches into other feature branches before either has been merged into master


### Question 16

What are Git pull requests used for?

- [y] to ease peer reviewing
- [n] to keep the code clean and tidy
- [y] to be able to see changes before merging these into master
- [n] because this is the only way to put changes into the master branch
- [n] because, you know, I was told to, but I don’t really know what it is...

### Question 17

Choose the best set of variable names (only one answer possible):

- [n] i, errs, c, a
- [n] i, errors, complete, alpha
- [y] i, numErrors, isRequestComplete, alpha
- [n] index, numberOfErrorsReceivedFromDatabaseServer, isRequestCompleteYet, angleForRotationInRadians

# Experiment8

## 2 Facades:

### CodeGenerator Facade

The Class CodeGenerator has been used in Parser.java. But Parser only used 2 functions of this big class. So we've created a facade for this parser.

This Facade contains only printMemory and semanticFunction methods.

![img.png](screenshots/Facade1.png)

### Memory Facade

The class Memory has too many methods. But in class SymbolTable, the only method that has been used is memory.getDateAddress(). So we will create a facade for class SymbolTable using this method.

This Facade contains only getDateAddress methods.

![img.png](screenshots/Facade2.png)

## Strategy

### Use this pattern in TypeAddress

Instead of using if/else in Address.java toString method, we consider TypeAddress as an Strategy to be set and return good toString output itself.

We should consider changing all enum uses in CodeGenerator and replace them with correct object.

![img.png](screenshots/Imidiate.png)
![img.png](screenshots/Indirect.png)
![img.png](screenshots/Direct.png)


## Seperate Query From Modifier

In Class Memory.java there are two methods that violate this pattern.

![img.png](screenshots/Sep1.png)

We Should Seperate modification of variables fromo getters in these two methods. In the picture below we fixed this issue.

![img.png](screenshots/Sep2.png)

## Self Encapsulated Field

In Class Address there are 3 public variables which been used from outside of the class directly.

![img.png](screenshots/Self1.png)

We should make them private and Outsiders just call getters and setters. Because of the document for the experiment asks us to solve 1 of these bad smells, we don't make varType private. We just fix Type and num.

![img.png](screenshots/Self2.png)

## Extract Methods

We have a same pattern in 4 different method like the pictures below. We can Extract a method named extractAddresses() from these methods to remove a bad smell.

![img.png](screenshots/Ex1.png)
![img.png](screenshots/Ex2.png)
![img.png](screenshots/Ex3.png)
![img.png](screenshots/Ex4.png)

After we Extract our method, The result will be like this.

![img.png](screenshots/Ex5.png)

## Introduce Assertion

In the previous method addition we did, There is a condition that ss and memory shouldn't be NULL. 

![img.png](screenshots/Assertion1.png)

So using this type of Refactoring we create 2 lines of Assert conditions to make sure those variables are not NULL.

![img.png](screenshots/Assertion2.png)

## Add Formatter Plugin to Maven

```xml
<plugin>
                <groupId>net.revelc.code.formatter</groupId>
                <artifactId>formatter-maven-plugin</artifactId>
                <executions>
                    <execution>
                        <goals>
                            <goal>format</goal>
                        </goals>
                        <configuration>
                            <configFile>eclipse-java-google-style.xml</configFile>
                            <encoding>UTF-8</encoding>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <groupId>net.revelc.code.formatter</groupId>
                <artifactId>formatter-maven-plugin</artifactId>
                <version>2.23.0</version>
            </plugin>
```

## Questions

### 1. Concept Explanations

Clean Code: Code that is easy to read, understand, maintain, and performs correctly.

Technical Debt: Shortcuts in coding that reduce development time in the short term but lead to greater problems and costs in the long term.

Code Smell: Indicators of potential issues in the code that may signify poor design, reduced maintainability, or possible errors.

### 2. Categories of Code Smells

According to refactoring.guru, code smells are divided into five main categories:

1. Object-Oriented Abusers: Smells related to improper use of object-oriented design principles. Examples include misuse of inheritance and poor encapsulation.

2. Encapsulation Smells: Smells indicating a disregard for encapsulation principles. Examples include public data and inappropriate use of getters and setters.

3. Lifecycle Smells: Smells related to improper resource management and object lifecycle handling. Examples include not releasing resources and dependency on external resources.

4. Bloaters: Smells indicating inappropriate data usage, often characterized by excessive size and unnecessary complexity in the code. Examples include long methods and large classes.

5. Change Preventers: Smells that make code changes and maintenance difficult. Examples include high coupling and scattered changes.

### 3. Lazy Class Smell

Category: Lazy Class falls under the "Object-Oriented Abusers" category.

Refactoring Suggestions: To address the Lazy Class smell, use refactoring techniques such as "Inline Class" and "Collapse Hierarchy." These help eliminate or merge classes that do not have enough functionality.

When to Ignore: Ignore the Lazy Class smell when the class is likely to gain more functionality in the future and will develop its responsibilities.

### 4. Code Smells in Model-to-C Converter Project

In a project involving converting a model to C, you might encounter the following code smells:

Long Method: Methods that are excessively long, making them hard to read and maintain.

Large Class: Classes that are overly large and take on too many responsibilities.

Feature Envy: Methods that heavily depend on data from other classes.

Data Clumps: Groups of data items that appear together frequently.

Primitive Obsession: Overuse of primitive data types instead of creating small classes for specific tasks.

Switch Statements: Excessive use of switch statements instead of using polymorphism.

Speculative Generality: Code that is more general than necessary and might never be used.

Temporary Field: Fields that are only used in certain situations.

Message Chains: Long chains of method calls that depend on each other.

Divergent Change: A class that often undergoes many different kinds of changes for different reasons.

### 5. Formatter Plugin

Function: The formatter plugin automatically formats the code according to predefined rules, including setting spaces, indentations, code arrangement, and other visual aspects.

Why It's Helpful: Formatter plugins help maintain consistency and readability in code, reducing errors and increasing the productivity of development teams.

Relationship with Code Refactoring: Properly formatted code sets a good foundation for refactoring, which aims to improve the structure and readability of the code. Having well-formatted code makes the refactoring process easier and more efficient.    

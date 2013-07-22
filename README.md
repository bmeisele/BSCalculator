BSCalculator
============

Ben and Steve working on REST Calculator for RHC training


FROM CODE RED DOCUMENTATION
==========================
Business Requirements
Overview

Create a Math Operations Web Service
Functionality

    Create a RESTful service that allows a user to perform the four basic math operations on two numbers:
        Add
        Subtract
        Multiply
        Divide
    The user shall be able to submit two numbers via GET, and the service shall return the result.
    The service should return the result within an object
        The object should also contain field(s) for error and/or status messages
    The service should support various object formats with the return object with different methods:
        JSON
        XML

Technical Requirements

Below are some ideas for different technologies to use to implement the solution.
RESTful Frameworks

    RESTEasy
    Apache CXF

Application Containers

    JBoss EAP 5.1
    JBoss EAP 6

Bonus

    Create additional methods for:
        Exponential operations
        Square root
        Factorial
    Require a login to access the additional methods


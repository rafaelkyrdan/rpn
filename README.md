# rpn
CLI RPN Calculator - a command-line reverse polish notation (RPN) calculator

## Prerequisites
- jdk
- scala
- sbt


## Run from shell scripts
1. A bash script rpn calculator", like `$ ./rpn-calculator`. 
2. To exit type a `q` command or an end of input indicator (EOF / Ctrl+D)

Example Input/Output
--------------------

The format is not important, as long as it makes sense.

    > 5 
    5
    > 8
    8
    > +
    13

---

    > 5 8 +
    13.0
    > 13 -
    0.0

---

    > -3
    -3.0
    > -2
    -2.0
    > *
    6.0
    > 5
    5.0
    > +
    11.0

---

    > 5
    5
    > 9
    9
    > 1
    1
    > -
    8
    > /
    0.625

## Run test
- sbt test

# Java_Car_Care

## Synopsis
This is a program to compute gas mileage and keep track of what maintenance needs to be taken care of for the user.

## Motivation
I came up with this idea due to the fact that I have a hard time keeping track of what maintenance needs to be done on my car, and I would guess that more people would like to know rather than having to rely on just a mechanic to inform them.

## Code Example
This snippet is to show how the mpg is computed and how the program looks for a necessary oil change.

```
  public static double mpg(int a, int b, double c) {
    int miles = a - b;
    double mpg = miles / c;
    return mpg;
  }
  public static void newOil(int a) {
    int[] oilChange = new int[60];
    int i;
    for (i = 0; i < 60; i++)
      oilChange[i] = (i + 1) * 5000; 
    for (i = 0; i < oilChange.length; i++) {
      if (a <= oilChange[i] + 200 && a >= oilChange[i]) {
        System.out.println("You need an oil change!");
      } else if (a >= oilChange[i] - 500 && a < oilChange[i]) {
        System.out.println("You will need an oil change at " + oilChange[i]);
      } 
    } 
  }
  ```

# Middle-earth Battle Simulator

## Description
Middle-earth is at war! Loyal races to Sauron fight against good races who do not want evil to reign over their lands. This program simulates a battle between two armies based on their composition and the specific "battle value" of each race.

## Battle Values
Each race is assigned a power value between 1 and 5:

### Good Races
* **Harfoots**: 1
* **Good Southrons**: 2
* **Dwarves**: 3
* **Numenoreans**: 4
* **Elves**: 5

### Evil Races
* **Evil Southrons**: 2
* **Orcs**: 2
* **Goblins**: 2
* **Wargs**: 3
* **Trolls**: 5

## Rules
* The program calculates the total power of each army by multiplying the number of members by their race's value.
* The result can be a victory for Good, a victory for Evil, or a Tie.
* Each army can be composed of a variable number of members from each race.

**Examples:**
* 1 Harfoot (1) vs 1 Orc (2) -> **Evil wins**
* 2 Harfoots (2) vs 1 Orc (2) -> **Tie**
* 3 Harfoots (3) vs 1 Orc (2) -> **Good wins**

## Software Testing
This project includes a comprehensive test suite using **JUnit 5** to ensure:
* **Functional Verification**: The battle logic correctly identifies winners and ties.
* **Boundary Value Analysis**: Correct handling of empty armies (0 units).
* **White Box Testing**: Verification of internal loops and mathematical calculations for each army.
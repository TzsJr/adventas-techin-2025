# 1st of December

### Santa’s Tiling Trouble

Santa is renovating one of the rooms in his workshop! 
You are given the dimensions of the room — its <b>length</b> and <b>width</b>, both in meters, and both whole numbers.

Your job is to calculate <b>how much money Santa must pay</b> for the tiles needed to cover the entire floor.

The price of one square meter of tiles is <b>m2price</b> coins.

But there's a twist! Because elves occasionally drop tiles, break tiles, or use them as sled ramps, 
Santa always buys <b>5% extra tiles</b> to cover possible losses.

<b>Your task:</b> Compute the total amount <b>totalCost</b> Santa needs to pay for all the tiles, including the extra 5%.

---
# 2nd of December

### Santa’s Midnight Clock Countdown

Santa’s magical workshop clock shows <b>x hours</b> and <b>y minutes</b>. 
Write a program that calculates:

- <b>m</b> — how many <b>minutes</b> have passed since midnight
- <b>s</b> — how many <b>seconds</b> have passed since midnight

<b>Example:</b> If the clock shows <b>x = 3</b> and <b>y = 5</b>, then:

- Minutes passed: <b>m = 185</b>
- Seconds passed: <b>s = 11100</b>

Help Santa keep track of time before the Christmas rush begins!

---
# 3rd of December

### Santa’s Number-Trimming Magic

Santa has a four-digit number written on his list. 
He wants to create a new two-digit number by removing the two middle digits from the original number — 
a little Christmas magic to help shorten his naughty-and-nice records!

Your job is to write a program that performs this transformation.

Example: If Santa’s number is <b>1235</b>, then the new number should be: <b>15</b>

Help Santa tidy up his list before Christmas Eve!

---
# 4th of December

### Gift Bag

Santa Claus is preparing his gift bag and checking the prices of different toys. 
The toy prices (real numbers) are entered from the keyboard. When <b>0</b> is entered, it means the magical toy list is finished.

Write a program that:
1. <b>Calculates the total price of all toys</b> that cost <b>more than 10 EUR</b> 
(because the more expensive toys are usually extra magical!).
2. <b>Determines and outputs</b> how many such special toys Santa has added to his bag.

Example (Santa’s list):

Input:
<b>5.6; 6.7; 12.3; 15.7; 0</b>

Output should be:
- Total price of magical toys: <b>28.0 EUR</b>
- Number of magical toys: <b>2</b>

---
# 5th of December

### Santa’s Magical ASCII Countdown

Santa Claus is preparing for his Christmas Eve flight, but before the sleigh lifts off the ground, 
he must complete a <b>magical countdown</b> from <b>10 to 0</b>. 
The countdown must be displayed in <b>big ASCII-art numbers</b>, using the provided DIGITS array.

Your task is to help Santa launch his sleigh!

<b>Task Requirements</b>
Create a program that:
1. Starts a countdown from <b>10</b> down to <b>0</b>.
2. Each second:
    - Clears the screen.
    - Displays the current number using the ASCII art from the DIGITS array.
    - Shows a festive message, such as:
      - "Santa is preparing…"
      - "Reindeer are buckling up…"
      - "Sleigh warming up…"
3. When the countdown reaches <b>0</b>, display:
   
<i>SANTA’S SLEIGH IS LAUNCHING!</i>

Digit array : https://github.com/tuleelut/techin_scriptmas_2025.git 

---
# 6th of December

### Santa’s Sleigh Flight Schedule

Santa’s magical sleigh takes off from the North Pole at <b>a hours</b> and <b>b minutes</b>. 
The sleigh stays in the air for <c>c minutes</c> delivering presents.

Write a program that calculates:

- <b>v</b> — the hour when Santa lands
- <b>m</b> — the minute when Santa lands

Keep in mind that <b>c can be large</b>, meaning Santa might land <b>after midnight</b>, on the next day!

<b>Example:</b> If Santa takes off at <b>a = 23, b = 55</b>, and the flight lasts <b>c = 14 minutes</b>, then Santa will land at:

- <b>v = 0 hours
- m = 9 minutes</b>

Help Santa keep his schedule on time—Christmas depends on it!

---
# 7th of December

### Santa’s Christmas Concert Seating Plan

Santa is organizing a big Christmas concert, and the architect has designed a hall with <b>n rows</b> of seats.

- In the <b>first row</b>, there will be <b>k seats</b>.
- Every next row will have <b>2 more seats</b> than the row before it (because more elves want a good view!).

Write a program that calculates <b>s</b>, the <b>total number of seats</b> Santa must order to match the architect’s seating plan.

<b>Example:</b> If <b>n = 3</b> rows and the first row has <b>k = 8</b> seats, then the total number of seats should be: <b>s = 30</b> seats

Help Santa make sure every elf gets a spot at the show!

---
# 8th of December

### Christmas Lights Pattern Generator

Story

Santa is testing a new <b>programmable Christmas lights system.</b> 
Each house on the street displays a pattern of lights based on a numeric rule <b>N.</b> 

Task Description

Write a program that generates an <b>N × N Christmas Lights Grid.</b>

Rules

For each cell at position <b>(row, col):</b>
- If <b>(row + col)</b> is divisible by <b>3</b>, print <b>T</b>
- If divisible by <b>5</b>, print <b>S</b>
- If divisible by <b>both 3 and 5</b>, print <b>G</b>
- Otherwise, print <b>.</b>
- Add a border of <b>#</b> around the grid.

Row and column numbers start from <b>1.</b>

Output for N = 6

##############<br>
#. T . . S T #<br>
#T . . S T . #<br>
#. . S T . . #<br>
#. S T . . T #<br>
#S T . . T S #<br>
#T . . T S . #<br>
##############

(Spaces are for readability.)

---
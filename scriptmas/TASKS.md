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

# 9th of December

### Santa’s Perfect Christmas Melon

Santa is at the North Pole Christmas Market looking for the perfect Christmas melon to take on his holiday journey. 
All melons are lined up in order, each with a known weight.

Santa wants to choose the melon whose weight is <b>closest to the average weight</b> of all melons — 
not too heavy, not too light, but just right for Christmas magic!

Your Task:<br>
Write a program that:
1. Calculates the <b>average weight</b> of all the Christmas melons.
2. Finds the <b>index (number)</b> of the melon whose weight is <b>closest to this average</b>.
3. Prints the melon number and the average weight (rounded to two decimal places).

Input:
- First value: <b>n</b> — the number of melons.
- Next values: <b>n real numbers</b> — the weights of each melon.

Output:<br>
Print on one line:<br>
<i>melonNumber averageWeight</i>

Example:<br>
Input:<br>
4<br>
4 3 7 8<br>

Output:<br>
1 4.00

---

# 10th of December

### Santa’s Spinning Clock Mystery

Santa looks at his magical clock, which currently shows <b>h hours</b> and <b>m minutes.</b> 
But this isn’t an ordinary clock — the minute hand can magically spin a full <b>360° turn</b> in an instant!

Your job is to determine <b>what time the clock will show</b> after the <b>minute hand completes one full rotation.</b>

The hand spins all the way around, but the time still advances just like on a real clock! 
That means: even though the hand spins super fast, we still treat it as if real time passed normally during that rotation.

Help Santa keep track of time as he prepares for Christmas Eve!

---

# 11th of December

### Santa’s Magical Archery Challenge

The annual <b>North Pole Archery Tournament</b> is underway! 
Santa’s target is mounted on a special board equipped with magical electronic sensors. 
The lower-left corner of the board has coordinates <b>(0, 0)</b>.

At the center of the target there is a black circle, and around it Santa has drawn <b>three additional rings</b>, 
each worth a different number of points. When an elf shoots an arrow, the sensors detect exactly where it lands.

Your task is to write a program that calculates <b>how many points</b> the elf earns based on the arrow’s landing position.

You are given:
- <b>(xc, yc)</b> — the coordinates of the target’s center
- The <b>radius</b> of each ring
- The <b>(x, y)</b> coordinates where the arrow landed
- The <b>point values</b> for each ring

<b>Scoring rule:</b> If the arrow lands <b>exactly on a ring boundary</b>, 
the elf earns <b>half</b> of the points that would be awarded if the arrow had landed inside that ring.

Help Santa score the competition correctly so he can award the Golden Candy Cane Trophy!

---

# 12th of December

### Santa’s Magic Word Workshop — Anagram Groups

Story<br>
Santa’s elves are preparing Christmas decorations, but their magic word machine has <b>scrambled the letters</b> of many festive words! 
Your job is to <b>help Santa group together all the words that are made of the same letters</b> — only rearranged differently.

Each group represents <b>one magical decoration pattern.</b>

Task<br>
Write a function that <b>groups together all Christmas word anagrams.</b>

Two words belong in the same group if:
- They contain <b>exactly the same letters</b>
- The order of letters may differ

Input<br>
An array of scrambled Christmas-related words:<br>
["eat", "tea", "tan", "ate", "nat", "bat"]


Output<br>
Return an array of grouped anagram words:<br>
[<br>
["eat", "tea", "ate"],<br>
["tan", "nat"],<br>
["bat"]<br>
]

Each inner array represents <b>one anagram family</b> created by the elves.

Bonus (Optional for Extra Elf Points)
- Sort each group <b>alphabetically</b>
- Sort all groups by <b>group size (largest first)</b>

Rules
- Do <b>not</b> use built-in anagram check libraries
- The solution should be <b>efficient</b> for large word lists

---

# 13th of December

### Christmas School – Student Name Magic

At the North Pole Christmas School, Santa keeps a magical student list. 
He wants to know <b>how many students are girls</b>, based on a simple Christmas rule:<br>
<b>Girls’ first names end with the letter ‘a’ Boys’ names do not.</b>

You are given the list of students in the form:<br>
<i>LastName FirstName</i><br>
written exactly like Santa keeps them in his book.

Your task is to help Santa count all girls and then list them.

<b>Your Task</b>
Write a program that:
1. Stores all student names in an <b>array or object.</b>
2. Counts how many students are <b>girls</b> (their first name ends with ‘a’).
3. Prints:
   - First line: <b>number of girls</b>
   - Next lines: <b>each girl’s full name</b> written in the same “LastName FirstName” format

<b>Input</b><br>
For example:<br>
const students = [<br>
"Petraitis Rokas",<br>
"Augė Artūras",<br>
"Mikalauskaitė Aušra",<br>
"Šlivka Donatas",<br>
"Stakėnaitė Ieva",<br>
"Skrėbė Domas",<br>
"Bruzgaitė Akvilė"<br>
];

<b>Output Example</b><br>
3<br>
Mikalauskaitė Aušra<br>
Stakėnaitė Ieva<br>
Bruzgaitė Akvilė<br>

---

# 14th of December

### Santa’s Gift Cart Engine

Story<br>
Santa is testing a brand-new <b>digital gift cart system</b> for his workshop! 
Before Christmas Eve, he needs <b>your help</b> to make sure the cart correctly tracks gifts, prevents duplicates, and applies magical promo codes.

Each gift has:
- A unique <b>gift ID</b>
- A <b>price</b> in candy canes

Task<br>
Implement a <b>Santa’s Gift Cart Engine</b> with the following methods:<br>
<i>cart.add(id, price)</i>              // Add a gift to the cart<br>
<i>cart.remove(id)</i>                  // Remove a gift from the cart<br>
<i>cart.total()</i>                     // Return total price of all gifts<br>
<i>cart.applyDiscount("PROMO10")</i>    // Apply a magical promo code<br>

Rules from Santa’s Workshop
- Promo codes are stored in an object:<br>
    {<br>
      PROMO10: 0.10,<br>
      PROMO25: 0.25,<br>
      SANTA50: 0.50<br>
    }<br>
- Each <b>gift ID must be unique</b> — no duplicate presents in Santa’s sack!
- total() must <b>always return the correct final amount</b>, including discounts
- Removing a gift <b>immediately updates the total</b>
- Invalid promo codes should be <b>ignored safely</b>
- The cart must <b>persist its internal state correctly</b>

Example<br>
<i>cart.add("train", 30)<br>
cart.add("doll", 20)<br>
cart.applyDiscount("PROMO10")<br>
cart.total()    // 45<br>
cart.remove("train")<br>
cart.total()    // 18</i><br>

Bonus Challenges (Extra Elf Points)
- Prevent negative prices
- Allow only <b>one promo code at a time</b>
- Add <i>cart.clear()</i> method for Santa’s reset button
- Return full cart content with <i>cart.list()</i>

---

# 15th of December

### Peter’s Christmas Shopping Dilemma

Peter wants to buy <b>one</b> Christmas gift. He has three options:
- A <b>book</b> costing x euros
- A <b>music CD</b> costing y euros
- A <b>USB memory stick</b> costing z euros

Peter will always buy the <b>cheapest</b> of the three items.

Your task is to determine <b>how much money Peter will spend.</b>

Input<br>
Three real numbers (decimals), each on the same line or separated by spaces:
- x – price of the book in euros
- y – price of the CD in euros
- z – price of the USB stick in euros

Output<br>
Print <b>one real number</b> – the <b>smallest</b> of the three prices.

You may:
- print it with <b>two decimal places</b>, e.g. <i>7.24</i>
- optionally add text like <i>Peter will spend 7.24.</i>

---
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

# 16th of December

### Santa’s Gift Audit

Santa Claus has just finished visiting all the workshops at the North Pole! Each workshop is run by a team of elves, 
and each elf is responsible for producing a certain number of gifts.

Your task is to help Santa <b>count gifts using nested loops.</b>

Task Description<br>
There are <b>W workshops</b>. In each workshop, there are <b>E elves</b>. Every elf produced <b>G gifts</b>, but the amount varies per elf.

You are given a 2D structure (array of arrays) where:
- Each <b>row</b> represents a workshop
- Each <b>column</b> represents an elf
- Each <b>number</b> represents how many gifts that elf produced

Your task<br>
Using a loop inside a loop, calculate:
1. For every workshop:
   - Workshop number
   - Total number of gifts made in that workshop
2. After processing all workshops:
   - Total number of gifts made in all workshops combined

Input (data provided directly in code)<br>
<i>[<br>
[5, 7, 3],     // Workshop 1: 3 elves<br>
[6, 4, 4, 5],  // Workshop 2: 4 elves<br>
[10, 2]        // Workshop 3: 2 elves<br>
]</i>

Output example<br>
<i>Workshop 1 made 15 gifts<br>
Workshop 2 made 19 gifts<br>
Workshop 3 made 12 gifts<br>
Santa’s total gift count is 46</i>

---

# 17th of December

### Santa’s Magic Juice Bottling Challenge

Santa and the elves have made a huge amount of <b>Magic Holiday Juice</b> from freshly harvested apples. 
They need your help to figure out how to bottle the juice correctly.

The juice can be filled into:
- <b>5-liter festive barrels
- 2-liter elf jugs
- 1-liter reindeer flasks</b>

Each elf bottles juice using this rule:
1. Fill as many <b>5-liter barrels</b> as possible
2. Then fill <b>2-liter jugs</b>
3. Put the remaining juice into <b>1-liter flasks</b>

Your Task<br>
Write a program that:
- Stores the juice amounts in <b>an array or object.</b>
- For each elf, calculates how many 5L, 2L, and 1L containers they will use.
- Prints the results in the format:<br>
<i>fiveLiter twoLiter oneLiter</i>

One line per elf.

Input (given directly in code)<br>
// Example data<br>
<i>const juiceAmounts = [45, 92, 33];</i><br>
or<br>
<i>const elves = [<br>
{ name: "Sparkle", liters: 45 },<br>
{ name: "Twinkle", liters: 92 },<br>
{ name: "Jingle", liters: 33 }<br>
];</i><br>

Expected Output Format<br>
For each elf:<br>
<i>number_of_5L_barrels number_of_2L_jugs number_of_1L_flasks</i>

Example with the given data:<br>
Data:<br>
<i>[45, 92, 33]</i>

Output:<br>
<i>9 0 0<br>
18 1 0<br>
6 1 1</i><br>

---

# 18th of December

### Santa’s Shopping Trip

Santa Claus is preparing for Christmas Eve! 
He visited <b>n different stores</b>, and in each store he bought <b>m magical items</b> needed for gifts, decorations, or reindeer treats.

For every store, you are given <b>m real numbers</b> — the prices of the items Santa bought in that store.

Your task<br>
For each store, calculate:
1. <b>Store number</b> (starting from 1)
2. <b>How many items Santa bought</b> in that store
3. <b>How much money Santa spent</b> in that store (rounded to two decimal places)

At the end, calculate:
4. <b>The total money Santa spent across all stores</b>, rounded to two decimal places

Input<br>
The data is given directly inside the program as arrays/lists.

Output format<br>
For each store, print:<br>
<i>storeNumber itemCount totalSpent</i><br>
After all stores, print:<br>
<i>totalSpentInAllStores</i>

Example<br>
If Santa bought these items:<br>
<i>Store 1: 1.07 2.92 3.45 1.09 0.89<br>
Store 2: 1.08 2.35 3.75 1.12 0.69<br>
Store 3: 0.98 2.48 3.62 1.10 0.72</i><br>

Your program should output:<br>
<i>1 5 9.42<br>
2 5 8.99<br>
3 5 8.90<br>
27.31</i>

---

# 19th of December

### Santa’s Toy Collection – Trading Duplicates

Santa has a full collection of <b>100 different Christmas toys</b>. Each toy has its own number from <b>1 to 100.</b>

One of Santa’s elves, <b>Binky Frostynose</b>, has his own box of toys. 
Some toy numbers may appear <b>several times</b> in his box – these are duplicates. 
Binky Frostynose wants to <b>trade only the extra copies</b> of toys he already has, so he can get toys he is missing.

Your job is to help him find <b>which toy numbers she can trade away.</b>

Task<br>
Write a program that:
1. Reads how many toys Binky Frostynose currently has.
2. Reads all the toy numbers he owns.
3. Finds all toys that appear <b>more than once.</b>
4. For each such toy, adds it to the “for trade” list.
5. Prints all toy numbers for trade in <b>increasing order.</b>

Input
- First line: <b>n</b> – the number of toys in Binky Frostynose’s box.
- Second line: <b>n integers</b> – the toy numbers (between 1 and 100). Some numbers may repeat.

Output
- Print all toy numbers Binky Frostynose will trade, in <b>ascending order</b>, separated by spaces.

Example<br>
Input<br>
17<br>
5 12 6 7 13 7 9 10 12 17 5 16 2 2 5 4 6

Output<br>
2 5 6 7 12

---

# 20th of December

### Santa’s Christmas Call Center – Billing Task

Every December, Santa runs a special <b>North Pole Call Center</b> where elves make phone calls to children around 
the world to confirm their Christmas wishes.<br>
At the end of the month, Santa must prepare a <b>magical call bill</b> for each elf.<br>
Your task is to help Santa calculate how much each elf must pay for their calls (in candy canes or Christmas coins).

Task Description<br>
Santa has a list of elves. For each elf, you know:
- <b>first name</b>
- <b>last name</b>
- a list of <b>calls</b> they made (each call contains: <i>cityName, minutesTalked</i>)

Santa also has a <b>price list</b>, where for every city you know the <b>price per minute.</b>

Your program must:
1. <b>Calculate the total cost of calls</b> for each elf.
2. <b>Sort all elves alphabetically</b> by last name.
3. <b>Print the billing report</b>, showing:
   - elf’s first name
   - elf’s last name
   - total cost of calls (rounded to 2 decimals)
4. Finally, print:
   - the <b>total money</b> collected from all elves.

Input (stored directly in code)<br>
Example data:<br>
const elves = [<br>
{<br>
firstName: "Jingle",<br>
lastName: "Sparkfoot",<br>
calls: [<br>
{ city: "London", minutes: 12 },<br>
{ city: "Paris", minutes: 7 }<br>
]<br>
},<br>
{<br>
firstName: "Twinkle",<br>
lastName: "Icicletoes",<br>
calls: [<br>
{ city: "NewYork", minutes: 20 },<br>
{ city: "London", minutes: 5 }<br>
]<br>
},<br>
{<br>
firstName: "Pudding",<br>
lastName: "Gumdrops",<br>
calls: [<br>
{ city: "Paris", minutes: 15 }<br>
]<br>
}<br>
];<br>

const priceList = {<br>
London: 0.50,<br>
Paris: 0.40,<br>
NewYork: 0.70<br>
};<br>

Output Example<br>
Gumdrops Pudding 6.00<br>
Icicletoes Twinkle 16.50<br>
Sparkfoot Jingle 9.50<br>
Total: 32.00<br>
(Names sorted alphabetically by last name.)

---

# 21st of December

### Christmas Library Task

Just before Christmas, a small town library is preparing for the holidays. 
Many readers want to borrow books to enjoy during long winter evenings. 
The librarian needs a <b>simple program</b> to manage books, readers, and loans.<br>
Your task is to help the librarian by creating a <b>Christmas Library System</b> using <b>object-oriented programming.</b><br>
The task must be suitable for <b>Python, C#, JavaScript, and Java.</b>

What the program should do<br>
The library must be able to:
- store information about books,
- register readers,
- lend books to readers,
- accept returned books,
- print a festive report of the library’s current state.

All data is provided <b>directly in the code</b> (no files).

Objects to implement<br>

#### Book

Represents a book on the library shelf.

Fields:
- id
- title
- author
- totalCopies – total number of copies
- availableCopies – copies currently available

Methods:
- isAvailable() → returns true if at least one copy is available

Rules:
- availableCopies cannot be negative
- availableCopies cannot exceed totalCopies

#### Reader

Represents a library reader.

Fields:
- id
- name
- borrowLimit (e.g. 3 books)
- borrowedBookIds (list or set)

Methods:
- canBorrow() → returns true if the reader has not reached the limit

#### Loan

Represents a borrowed book.

Fields:
- id
- bookId
- readerId
- loanDate
- returnDate (nullable)
- status – ACTIVE or RETURNED

#### Library

The main class that manages everything.

Fields:
- books (collection of Book)
- readers (collection of Reader)
- loans (collection of Loan)

Methods:
- addBook(book)
- registerReader(reader)
- borrowBook(readerId, bookId, date)
  - creates and returns a Loan
  - fails if:
    - book or reader does not exist
    - no available copies
    - reader reached borrow limit
- returnBook(loanId, date)
- getActiveLoans()
- printChristmasReport()

### Christmas Scenario

Create the following data <b>inside the program:</b>

Books
- “Clean Code” – 2 copies
- “The Pragmatic Programmer” – 1 copy
- “Refactoring” – 1 copy

Readers
- Alice (borrow limit 2)
- Bob (borrow limit 1)

Actions
1. Alice borrows Clean Code
2. Alice borrows Clean Code again
3. Bob tries to borrow Clean Code (should fail – no copies)
4. Alice returns one copy of Clean Code
5. Print the final Christmas report

Example output (suggested)

<i>BORROW OK: Alice borrowed "Clean Code"<br>
BORROW OK: Alice borrowed "Clean Code"<br>
BORROW FAILED: Bob cannot borrow "Clean Code" (no copies available)<br>
RETURN OK: "Clean Code" returned by Alice<br>

CHRISTMAS LIBRARY REPORT<br>
Clean Code: 1 / 2 available<br>
The Pragmatic Programmer: 1 / 1 available<br>
Refactoring: 1 / 1 available<br>

ACTIVE LOANS<br>
Alice → Clean Code</i>

---
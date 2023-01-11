## First And Last Digit Sum

### Description

Write a method named <b>sumFirstAndLastDigit</b> with one parameter of type <b>int</b> called <b>number</b>. The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.

If the number is negative then the method needs to return -1 to indicate an invalid value.

### Examples of input/output

<ul>
<li>sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.</li>
<li>sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.</li>
<li>sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.</li>
<li>sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.</li>
<li>sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.</li>
</ul>

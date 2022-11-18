
1.Store the roman character and their coresponding Integer value in a map

2.Store num= the value of the last character of the string

3.Run a for loop in the string from  i=second last character  till i >= 0

4.As Roman numerals are written largest to smallest from left to right,so
  if(s.charAt(i)) < (s.charAt(i + 1))
    then subtract s.charAt(i) from the number
  else
     add s.charAt(i) to the number 
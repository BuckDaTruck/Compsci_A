Iterating through Strings
Name: Buckley

In addition to the String methods you are familiar with from your Java quick reference, you may find the following helpful:

boolean startsWith(String chars)
Returns true if this starts with chars
boolean endsWith(String chars)
Returns true if this ends with chars



Given two Strings, word and a separator sep, return a big String made of count occurrences of the word, separated by the separator String.
repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This”

Given a String, consider the prefix string made of the first N chars of the string. Does that prefix appear somewhere else in the String? Assume that the String is not empty and that N is in the range [1, str.length()).
prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false

Write a function that returns true if the Strings “cat” and “dog” appear the same number of times in the given String.
catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true

Write a function that, given two Strings, returns true if either of the Strings appear at the very end of the other String, ignoring differences in casing.
endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true

Write a function that returns true if the given String contains a "bob" String, but where the middle 'o' char can be any char.
bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false

Given two Strings, a and b, write a function that returns a bigger String made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"

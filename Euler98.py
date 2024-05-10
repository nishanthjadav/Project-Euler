import math

f = open("C:\\Users\\nisha\\Downloads\\0098_words.txt", "r")
text = f.read()
arr = [name.strip('"') for name in text.split(",")]


def isAnagram(s1, s2):
    return sorted(s1) == sorted(s2)


def potentialCalc(s1, s2):
    largest = 0
    n = len(s1)
    start = 10 ** (n - 1)  # Smallest n-digit number
    end = (10 ** n) - 1  # Largest n-digit number

    for num in range(start, end + 1):  # potential values
        if math.sqrt(num).is_integer():
            s2Num = map_strings_to_number(s1, s2, num)
            if math.sqrt(s2Num).is_integer():
                if len(str(s2Num)) == len(str(num)):
                    if num > s2Num:
                        largest = num
                    elif s2Num > num:
                        largest = s2Num
        return largest


def map_strings_to_number(string1, string2, number):
    # Verify that the number is the same length as the first string
    if len(str(number)) != len(string1):
        return "Number length doesn't match the length of the first string"

    # Check if the two strings contain the same letters in order
    if sorted(string1) != sorted(string2):
        return "The two strings must contain the same letters in order for the mapping to work"

    # Create a mapping of each digit of the number to each letter of the first string
    mapping = {}
    for i in range(len(string1)):
        mapping[int(str(number)[i])] = string1[i]

    # Use the mapping to get the number associated with the second string
    mapped_number = ""
    for letter in string2:
        for key, value in mapping.items():
            if value == letter:
                mapped_number += str(key)
                break

        return int(mapped_number)

    maxVal = 0
    used = set()
    for word1 in arr:
        for word2 in arr:
            if isAnagram(word1, word2) and word1 != word2:
                if word1 not in used and word2 not in used:
                    pCalc = potentialCalc(word1, word2)
                    if pCalc > maxVal:
                        maxVal = pCalc
                    print(word1, " | ", word2, " CURR VAL: ", pCalc)

                used.add(word1)
                used.add(word2)

    print(maxVal)

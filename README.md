# Elements of Programming Interviews - Java Solutions

[![Java](https://img.shields.io/badge/Java-17+-blue.svg)](https://www.oracle.com/java/)
[![JUnit](https://img.shields.io/badge/JUnit-4.13.2-green.svg)](https://junit.org/junit4/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A comprehensive collection of Java solutions to the problems presented in the book *Elements of Programming Interviews* (EPI) by Adnan Aziz, Tsung-Hsien Lee, and Amit Prakash. This repository serves as a practical companion for coding interview preparation, providing clean, efficient implementations across various algorithmic domains.

## 📅 Project Timeline

- **Started**: March 15, 2026

## 📁 Project Structure

```
epi-java/
├── Arrays/
│   ├── ApplyPermutation.java
│   ├── ArbitraryPrecisionAdd.java
│   ├── ArbitraryPrecisionMultiply.java
│   ├── BuyAndSellStockTwo.java
│   ├── CanReachEnd.java
│   ├── ComputeRandomPermutation.java
│   ├── DeleteDuplicates.java
│   ├── DeleteDuplicatesTwo.java
│   ├── DutchNationalFlag.java
│   ├── EnumerateAllPrimes.java
│   ├── NextPermuationSmallest.java
│   ├── NonUniformRandomNumber.java
│   ├── OfflineRandomSampling.java
│   ├── OnlineRandomSampling.java
│   ├── PascalTriangle.java
│   ├── RandomSubsets.java
│   ├── RotateA2DArray.java
│   ├── SpiralMatrix.java
│   └── ValidSudoku.java
├── BinaryTrees/
│   └── BinaryTreeBootCamp.java
├── BitManipulation/
│   ├── ClosestSameBitCount.java
│   ├── CountBits.java
│   ├── ParityChecker.java
│   ├── ReverseBits.java
│   └── SwappingBits.java
├── LinkedList/
│   ├── AddTwoNumbersInLinkedList.java
│   ├── CyclicallyRightShift.java
│   ├── DeleteANode.java
│   ├── DetectCycle.java
│   ├── DetectCycleTwo.java
│   ├── EvenOddMerge.java
│   ├── LinkedListPivoting.java
│   ├── ListNode.java
│   ├── MergeTwoSortedList.java
│   ├── OverlappingListMayHaveCycle.java
│   ├── OverlappingNoCycleList.java
│   ├── PalindromeLinkedList.java
│   ├── RemoveDuplicatesFromSortedListNode.java
│   ├── ReverseSubList.java
│   └── removeKthLastNode.java
├── StacksAndQueue/
│   ├── BinaryTreeDepthOrder.java
│   ├── BinaryTreeNode.java
│   ├── BuildingWithSunsetView.java
│   ├── CircularQueue.java
│   ├── EvaluateRPN.java
│   ├── MaxStack.java
│   ├── PostingListJumpOrder.java
│   ├── QueueUsingStack.java
│   ├── QueueWithMaxAPI.java
│   ├── RPNExpression.java
│   ├── StackBootcamp.java
│   ├── StackWithMax.java
│   ├── ValidPathDirectory.java
│   └── WellFormedString.java
├── Strings/
│   ├── BaseConversion.java
│   ├── ComputeAllMnemonicsForAPhoneNumber.java
│   ├── FirstOccuranceOfSubstring.java
│   ├── GetValidIPAddresses.java
│   ├── IntToString.java
│   ├── LookAndSay.java
│   ├── RandomStringProblem.java
│   ├── ReplaceAndRemove.java
│   ├── ReverseWords.java
│   ├── RomanToInteger.java
│   ├── RunLenghEncoding.java
│   ├── SpreadSheetColumnEncoding.java
│   ├── StringToInt.java
│   └── ValidPlaindrome.java
├── lib/
│   ├── hamcrest-core-1.3.jar
│   └── junit-4.13.2.jar
├── PRACTICE_LOG.md
└── README.md
```

## 🚀 Getting Started

### Prerequisites

- **Java 17+**: Ensure you have Java Development Kit (JDK) 17 or higher installed.
- **JUnit 4.13.2**: Testing framework included in the `lib/` directory.
- **Hamcrest 1.3**: Matcher library for assertions, also included in `lib/`.

### Running the Code

1. **Clone the repository**:
   ```bash
   git clone https://github.com/harjas-romana/epi-java.git
   cd epi-java
   ```

2. **Compile Java files**:
   ```bash
   javac -cp "lib/*" Arrays/*.java
   ```

3. **Run a specific solution** (example):
   ```bash
   java -cp ".:lib/*" Arrays.CanReachEnd
   ```

4. **Run tests** (if available):
   ```bash
   java -cp ".:lib/*" org.junit.runner.JUnitCore Arrays.TestClass
   ```

### Development Environment

- **IDE**: Use any Java IDE like IntelliJ IDEA, Eclipse, or VS Code with Java extensions.
- **Build Tool**: Maven or Gradle can be integrated for better dependency management.
- **Testing**: Leverage JUnit for unit testing the solutions.

## 📚 Topics Covered

This repository covers a wide range of algorithmic topics essential for technical interviews:

- **Arrays**: Permutations, sampling, matrix operations, and more.
- **Bit Manipulation**: Efficient bit operations and counting.
- **Linked Lists**: Cycle detection, merging, and manipulation.
- **Stacks and Queues**: Custom implementations and applications.
- **Strings**: Encoding, decoding, and string algorithms.
- **Binary Trees**: Tree traversals and operations (in progress).

## 📝 Practice Log

Track your progress and insights in [`PRACTICE_LOG.md`](PRACTICE_LOG.md). Document solutions, time complexities, and key learnings from each problem.

## 🤝 Contributing

Contributions are welcome! If you have:

- Improved solutions
- Additional test cases
- Bug fixes
- New problem implementations

Please fork the repository, create a feature branch, and submit a pull request.

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📖 Resources

- [**Elements of Programming Interviews**](https://elementsofprogramminginterviews.com/) - The original book
- [LeetCode](https://leetcode.com/) - Practice similar problems
- [HackerRank](https://www.hackerrank.com/) - Additional coding challenges

---

*Happy coding and best of luck with your interview preparations!* 🎯
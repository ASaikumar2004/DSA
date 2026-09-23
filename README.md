# 📚 DSA - Data Structures & Algorithms

A structured collection of **Data Structures and Algorithms (DSA)** programs and practice problems implemented in **Java**, covering topics from basic concepts to advanced problem-solving.

The repository is organized topic-wise to strengthen programming fundamentals, improve logical thinking, and support **coding practice and technical interview preparation**. 🚀

---

## 🎯 Objectives

* Build strong DSA fundamentals using Java
* Practice problem-solving step by step
* Understand different data structures and algorithms
* Improve coding and logical thinking skills
* Prepare for coding assessments and technical interviews

---

## 📂 Repository Structure

| Folder                 | Description                                                  |
| ---------------------- | ------------------------------------------------------------ |
| `ActualDSA`            | Core DSA programs and practice problems                      |
| `Arrays`               | Array-based problems and operations                          |
| `CollectionsFramework` | Java Collection Framework programs                           |
| `DefaultMethods`       | Java 8 default and interface methods                         |
| `Inheritance`          | Java inheritance concepts and examples                       |
| `Java8`                | Java 8 features and examples                                 |
| `Keyword`              | Java keyword-based programs and concepts                     |
| `Pointers`             | Pointer/reference-related practice concepts                  |
| `ScannerExamples`      | Programs using Java Scanner                                  |
| `Searching`            | Searching algorithms and problems                            |
| `SortingTechniques`    | Sorting algorithms such as Bubble Sort, Selection Sort, etc. |
| `Variables`            | Java variable concepts and examples                          |
| `pack1`                | Additional Java/DSA practice programs                        |
| `pack2`                | Additional Java/DSA practice programs                        |

---

## 🧠 Topics Covered

### 🔹 Java Fundamentals

* Variables
* Keywords
* Scanner
* Operators
* Conditional Statements
* Loops
* Arrays
* Methods
* Classes and Objects

### 🔹 Object-Oriented Programming

* Inheritance
* Method Overloading
* Method Overriding
* Encapsulation
* Polymorphism
* Abstraction

### 🔹 Java 8

* Lambda Expressions
* Functional Interfaces
* Default Methods
* Static Methods
* Date and Time API
* Stream API
* Optional

### 🔹 Collections Framework

* List
* ArrayList
* LinkedList
* Set
* HashSet
* LinkedHashSet
* TreeSet
* Map
* HashMap
* LinkedHashMap
* TreeMap
* Iterator

### 🔹 Searching

* Linear Search
* Binary Search
* Searching-based problems

### 🔹 Sorting

* Bubble Sort
* Selection Sort
* Insertion Sort
* Sorting-based problems

### 🔹 Arrays

* Array Traversal
* Maximum and Minimum Elements
* Searching
* Sorting
* Array Manipulation
* 2D Arrays

---

## 📈 Learning Path

```text
Java Basics
     ↓
Arrays
     ↓
OOP Concepts
     ↓
Collections Framework
     ↓
Searching
     ↓
Sorting
     ↓
Problem Solving
     ↓
Advanced DSA
```

---

## 💻 Technologies Used

* **Language:** Java
* **IDE:** Eclipse / IntelliJ IDEA / VS Code
* **Version Control:** Git & GitHub

---

## 🚀 How to Use This Repository

### Clone the repository

```bash
git clone https://github.com/ASaikumar2004/DSA.git
```

### Open the project

Open the cloned folder in your preferred Java IDE.

### Explore and Practice

Navigate through the folders, study the programs, and try solving similar problems independently.

---

## 📝 Example: Bubble Sort

Bubble Sort repeatedly compares adjacent elements and swaps them when they are in the wrong order.

```java
for (int i = 0; i < arr.length - 1; i++) {
    boolean swapped = false;

    for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            swapped = true;
        }
    }

    if (!swapped) {
        break;
    }
}
```

### Time Complexity

* **Best Case:** `O(n)`
* **Average Case:** `O(n²)`
* **Worst Case:** `O(n²)`

---

## 🎓 Interview Preparation

This repository helps practice common interview topics:

* Arrays
* Strings
* Searching
* Sorting
* Collections
* OOP
* Java 8
* Problem Solving
* Time and Space Complexity

---

## 📊 Progress

```text
✅ Java Fundamentals
✅ Arrays
✅ OOP Concepts
✅ Collections Framework
✅ Java 8
✅ Searching
🚀 Sorting
🚀 More DSA Problems
```

---

## 🤝 Contribution

This is primarily a personal learning and practice repository.

Suggestions and improvements are welcome. Feel free to open an **Issue** or submit a **Pull Request**.

---

## 👨‍💻 Author

**Sai Kumar**

Java Full Stack Trainee | Java Developer Aspirant | DSA Learner

GitHub: **ASaikumar2004**

---

⭐ **If you find this repository useful, consider giving it a star!**

**Keep Learning • Keep Practicing • Keep Coding 🚀**

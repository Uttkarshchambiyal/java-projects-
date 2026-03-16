<div align="center">

# 🏦 Bank System

### A Console-Based Banking Application built with Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Concepts-blue?style=for-the-badge)
![Console](https://img.shields.io/badge/Console-App-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Complete-brightgreen?style=for-the-badge)

<img src="https://raw.githubusercontent.com/Tarikul-Islam-Anik/Animated-Fluent-Emojis/master/Emojis/Objects/Money%20Bag.png" alt="Money Bag" width="120" />

> A beginner-friendly Java mini project that simulates core banking operations — deposit, withdraw, and balance check — all from the terminal.

</div>

---

## 📌 Table of Contents

- [Features](#-features)
- [Demo](#-demo)
- [How It Works](#-how-it-works)
- [Project Structure](#-project-structure)
- [Getting Started](#-getting-started)
- [Concepts Used](#-concepts-used)
- [Future Improvements](#-future-improvements)
- [Author](#-author)

---

## ✨ Features

| Feature | Description |
|---|---|
| 💰 **Deposit** | Add money to your account and view updated balance |
| 🏧 **Withdrawal** | Withdraw money and see remaining balance |
| 📊 **Balance Check** | Instantly view your current account balance |
| 👤 **Account Info** | Set account holder name and account number |
| 🖥️ **Console Menu** | Easy-to-use numbered menu interface |

---

## 🎬 Demo

```
╔══════════════════════════════════════╗
║        🏦  BANK SYSTEM MENU          ║
╠══════════════════════════════════════╣
║  1. 💰  Deposit                      ║
║  2. 🏧  Withdrawal                   ║
║  3. 📊  Check Balance                ║
╚══════════════════════════════════════╝

Enter your choice: 1
Enter Account Holder Name: John Doe
Enter Account Number: 123456
Enter amount to deposit: 5000

✅ ₹5000 deposited successfully!
📊 Current Balance: ₹25000
```

---

## ⚙️ How It Works

```mermaid
flowchart TD
    A([▶ Start Program]) --> B[Display Menu]
    B --> C{User Choice}
    C -->|1| D[💰 Deposit]
    C -->|2| E[🏧 Withdrawal]
    C -->|3| F[📊 Check Balance]
    D --> G[Enter Name + Account No + Amount]
    E --> H[Enter Name + Account No + Amount]
    F --> I[Enter Name + Account No]
    G --> J[Call deposit method → Print Balance]
    H --> K[Call withdrawl method → Print Balance]
    I --> L[Call checkbalance method → Print Balance]
    J --> M([🔚 End])
    K --> M
    L --> M
```

---

## 📁 Project Structure

```
📦 bank-system/
├── 📄 BankAccount.java     ← Main class with menu & input handling
├── 📄 BankAccount.class    ← Compiled bytecode
└── 📄 readme.md            ← Project documentation
```

> **`BankAccount.java`** contains two classes:
> - **`Bank`** — Holds account data (`balance`, `accountHolderName`, `accountNumber`) and exposes `deposit()`, `withdrawl()`, and `checkbalance()` methods.
> - **`BankAccount`** — Entry point with `main()`, handles Scanner input and the interactive menu.

---

## 🚀 Getting Started

### Prerequisites

- ✅ Java JDK **8 or above** installed
- ✅ `java` and `javac` added to your system **PATH**

### Installation & Run

```bash
# 1. Clone the repository
git clone https://github.com/Uttkarshchambiyal/java-Small-Projects-.git

# 2. Navigate to the bank-system folder
cd java-Small-Projects-/bank-system

# 3. Compile the Java file
javac BankAccount.java

# 4. Run the program
java BankAccount
```

---

## 🧠 Concepts Used

```
✔ Object-Oriented Programming (OOP)
✔ Classes and Objects
✔ Instance Variables and Methods
✔ Console I/O with Scanner
✔ Conditional Statements (if-else / switch)
✔ Basic Arithmetic Operations
```

---

## 🔮 Future Improvements

- [ ] 🔐 Add PIN/password authentication
- [ ] 🔁 Loop menu for multiple operations per session
- [ ] 👥 Support multiple accounts using `ArrayList`
- [ ] ⚠️ Input validation & insufficient funds check
- [ ] 📁 File-based data persistence (save accounts between runs)
- [ ] 🖥️ Upgrade to a GUI using Java Swing

---

## 👨‍💻 Author

<div align="center">

**Uttkarsh Chambiyal**

[![GitHub](https://img.shields.io/badge/GitHub-Uttkarshchambiyal-181717?style=for-the-badge&logo=github)](https://github.com/Uttkarshchambiyal)

*"Building one mini project at a time 🚀"*

</div>

---

<div align="center">

⭐ **If you found this helpful, give it a star!** ⭐

</div>

# 🧾 Retro Video Game Store — Project Documentation

## ✅ 1. Clean Code Practices

### 🧹 Example 1: Descriptive Naming

```java
public boolean processPurchase(Cart userCart)
```
- Uses `processPurchase` instead of a vague name like `buy()`.
- `userCart` clearly indicates the purpose of the object.

---

### 🧹 Example 2: Single Responsibility

```java
public class Game {
    private String title;
    private String platform;
    private String description;
    private int stock;
    private double price;
    // Getters and constructor
}
```
- `Game` class is only responsible for holding game data.
- Business logic is separated out.

---

### 🧹 Example 3: Clear Logic Flow

```java
if (userCart.getItems().isEmpty()) {
    System.out.println("Purchase Failed: Your cart is empty!");
    return false;
}
```
- Clear, readable error handling.
- Avoids deep nesting by returning early.

---

## ✅ 2. Project Summary

### 🎯 What It Does

- CLI app for a retro video game store.
- Simulates viewing games, adding to cart, and purchasing.
- Tracks stock and prevents invalid purchases.

---

### ⚙️ How It Works

- `Game.java`: Data model for games.
- `Cart.java`: Holds selected games and calculates total.
- `PurchaseGame.java`: Handles buying logic and stock management.
- `GameStoreApp.java`: Simulates user behavior with hardcoded actions.

---

### ✅ Test Cases

| Test Case                       | Purpose                                             |
|--------------------------------|-----------------------------------------------------|
| `testCartTotal()`              | Ensures cart total is calculated correctly          |
| `testEmptyCartFailsPurchase()` | Prevents checkout when cart is empty                |
| `testStockReducesAfterPurchase()` | Verifies stock count reduces after a purchase    |



---

## ✅ 3. Dependencies

### 📦 Tools Used

- **JUnit 5** for unit testing
- **Maven** for build and dependency management

### 📄 Sample Entry in `pom.xml`

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>
```

Source: [Maven Central](https://search.maven.org/)

---

## ✅ 4. Challenges Faced

### 🛠️ Maven / Java Setup

- Setting up maven and getting it to work with my project

### 🔄 Git Push Issues

- Encountered a push rejection due to remote changes.
- Resolved using `git pull --rebase` before pushing.

### ✅ GitHub Actions

- Configured automated CI to run tests with each commit.
- Added `maven.yml` workflow to `.github/workflows/`


---

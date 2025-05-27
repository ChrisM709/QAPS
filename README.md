# 🎮 Retro Video Game Store (Java CLI Project)

This is a CLI-based Java application for managing a simple classic video game store. It was developed as part of the **SDAT & DevOps QAP 1** assignment and follows object-oriented principles, clean code practices, and includes automated unit tests with GitHub Actions CI.

---

## 📦 Features

- View a catalog of classic retro games
- Add games to a virtual cart
- Simulate purchases (with stock tracking)
- Automatically clear the cart after successful purchase
- Prevent checkout if out of stock or cart is empty

---

## 🧱 Project Structure

```
retroVideoGameStore/
├── src/
│   ├── main/java/com/classicgamestore/
│   │   ├── Game.java
│   │   ├── Cart.java
│   │   ├── PurchaseGame.java
│   │   └── GameStoreApp.java
│   └── test/java/com/classicgamestore/
│       └── GameStoreTest.java
├── pom.xml
```

---

## 🧪 Testing

- Built using **JUnit 5**
- Includes 3 unit tests:
  - `testCartTotal()`
  - `testEmptyCartFailsPurchase()`
  - `testStockReducesAfterPurchase()`
- Tests run automatically on every push via **GitHub Actions**

---

## ✅ GitHub Actions CI

This project includes a GitHub Actions workflow to:
- Automatically compile the project
- Run all unit tests on every push/pull request to `master`

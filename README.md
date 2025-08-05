
# 🎓 Student Record Management System (CLI-Based)

## 🛠️ Objective
Create a console-based CRUD (Create, Read, Update, Delete) system to manage student records.

## 💻 Tools Used
- **Language**: Java (JDK 8+)
- **IDE**: VS Code / IntelliJ CE
- **Execution**: Terminal / Command Prompt

## 📂 Project Structure

```
student-record-system/
│
├──Student.java    // Student class with attributes and methods
├── StudentManagementSystem.java   // Main Java file with all logic
└── README.md                      // Project documentation
```

## 🚀 Features

- Add new student records
- View all student records
- Update existing student details by ID
- Delete student records by ID
- Menu-driven interface
- Uses ArrayList to store and manage student objects

## 🧾 Student Fields

- ID (int)
- Name (String)
- Marks (double)

## ▶️ How to Run

1. **Compile the Java file**
   ```bash
   javac StudentManagementSystem.java
   ```

2. **Run the compiled program**
   ```bash
   java StudentManagementSystem
   ```

## 📋 Menu Options

```
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
```

## 💡 Sample Interaction

```
Enter your choice (1-5): 1
Enter Student ID: 101
Enter Student Name: Alice
Enter Student Marks: 89.5
Student added successfully.

Enter your choice (1-5): 2
Student Records:
ID: 101, Name: Alice, Marks: 89.5
```

## 💡 Screenshot

![Screenshot](https://github.com/RAMAKRISHNA3488/Task-2-Student-Record-Management-System/blob/master/screensort/Screenshot%202025-08-05%20153256.png)
## 📌 Notes

- Student records are stored in-memory using an `ArrayList`.
- Basic input validations are included.
- This is a CLI (Command Line Interface) based application.

## 📈 Future Enhancements

- Store student records in a file or database.
- Add input validation for duplicate IDs.
- Include sorting/searching features.
- GUI version using Swing or JavaFX.

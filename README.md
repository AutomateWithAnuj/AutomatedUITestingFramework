# 🚀 Selenium Automation Framework (with Java)

**Author:** Anuj Rajput  
**Technologies Used:** Java, Selenium, TestNG  
**Build Tool:** Maven  
**Reports:** Allure  
**Code Quality:** SonarLint  
**Java Version:** 8+

---

## 🧩 Framework Overview

A robust and scalable Selenium Automation Framework built using **Java**, **Selenium**, and **TestNG**, designed for maintainability, reusability, and efficient test execution both **locally** and on a **Docker-based cloud grid (Selenoid)**.

---

<img width="2048" height="1176" alt="image" src="https://github.com/user-attachments/assets/f5b05f28-0433-46ff-bda1-dd6047163a2d" />


## ⚙️ Key Features

- **TestNG Integration:**  
  Uses annotations like `@Test`, `@BeforeMethod`, and `@AfterMethod` for structured test execution.

- **Page Object Model (POM):**  
  Implements modular page classes for better maintainability and reusability.

- **Thread Safety:**  
  Uses **ThreadLocal** for driver management to ensure safe parallel test execution.

- **Assertions:**  
  Powered by **AssertJ** for fluent, chainable, and readable assertions.

- **Data-Driven Testing:**  
  Test data fetched from **Excel sheets** via **TestNG DataProvider**.

- **Property File Configuration:**  
  Reads sensitive data (like username and password) and environment configs from `.properties` files.

- **Cross-Environment Execution:**  
  Runs on both **local systems** and **Selenoid Docker Grid**.

- **Reporting:**  
  Generates detailed and interactive **Allure Reports** after test execution.

- **Code Quality:**  
  Enforced using **SonarLint** to maintain clean, bug-free code.

- **Java Compatibility:**  
  Fully compatible with **Java 8 and above**.

---

## 🧠 Tools & Integrations

| Tool / Library | Purpose |
|----------------|----------|
| **Selenium WebDriver** | Browser automation |
| **TestNG** | Test orchestration and configuration |
| **Maven** | Build automation and dependency management |
| **Allure** | Test reporting and result visualization |
| **AssertJ** | Fluent and expressive assertions |
| **Selenoid (Docker Grid)** | Execute Selenium tests inside Docker containers |
| **SonarLint** | Code analysis and quality enforcement |
| **Excel + Apache POI** | External data-driven testing |
| **Java Properties File** | Environment and credential configuration |

---

<img width="2430" height="1162" alt="image" src="https://github.com/user-attachments/assets/1bc4aa73-0e91-4af3-8431-a23298aba25c" />


<pre>
```text
selenium-automation-framework/
│
├── 📁 src/
│   ├── 📁 main/
│   │   ├── 📁 java/
│   │   │   ├── base/                  # Base classes (DriverManager, TestBase)
│   │   │   ├── pages/                 # Page Object Model (POM) classes
│   │   │   ├── utils/                 # Utility classes (ExcelReader, ConfigReader)
│   │   │   └── listeners/             # TestNG listeners and retry analyzers
│   │   └── 📁 resources/              # Config and log files
│   │
│   ├── 📁 test/
│   │   ├── 📁 java/
│   │   │   ├── tests/                 # Actual TestNG test scripts
│   │   │   └── dataproviders/         # Data provider classes
│   │   └── 📁 resources/
│   │       └── testdata/              # Excel test data files
│
├── 📁 config/                          # Environment and property files
│   ├── config.properties               # Contains URLs, credentials, environment setup
│   └── log4j.properties                # Logging configuration
│
├── 📁 allure-results/                  # Allure test result JSON files
├── 📁 allure-report/                   # Generated Allure HTML reports
├── 📁 screenshots/                     # Screenshots captured during failures
│
├── pom.xml                             # Maven dependencies and plugins
├── testng.xml                          # TestNG suite configuration
├── README.md                           # Project documentation (this file)
└── .gitignore                          # Git ignored files and folders
```
</pre>

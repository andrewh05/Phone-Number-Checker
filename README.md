# Phone Number Checker

This is a simple Java program that determines the telecom provider (MTC Touch or Alfa) for Lebanese phone numbers based on their GSM code and the first digit after the code.

## Features

Provider Identification: The program checks if a phone number starting with `+96171` or `+96176` belongs to MTC Touch or Alfa.
Simple to Use: Just enter the phone number, and the program will tell you which provider it belongs to.

## Getting Started
Prerequisites
You need to have Java installed on your computer. You can download it from here.
Running the Program
Clone the repository:


```
git clone https://github.com/yourusername/phone-number-provider-checker.git
cd phone-number-provider-checker
```

Compile the Java program:
```
javac PhoneNumberChecker.java
```

Run the program:
```
java PhoneNumberChecker
Enter the phone number:
```

The program will prompt you to enter a phone number starting with +96171 or +96176.
Example: +96171123456
The program will then output the provider (MTC Touch or Alfa).

## Example Usage
```
Enter phone number starting with +96171 or +96176: +96171123456
The provider is: MTC Touch
```

# Email_Administration_App
A simple Java application for IT administrators to create and manage new-hire email accounts. It generates standardized email addresses, assigns departments, creates random passwords, and allows basic mailbox/account configuration.

## Features
- Generates emails in the format: `firstname.lastname@department.company.com`
- Department selection: `sales`, `development`, `accounting` (or blank if none)
- Random password generation
- Setters to:
  - Change password
  - Set mailbox capacity
  - Set an alternate email address
- Getters to display:
  - Name
  - Email
  - Mailbox capacity

## Project Structure 
- `src/` – Java source files
  - `Email.java` – core email/account logic (generation + setters/getters)
  - `EmailApp.java` – main/driver class (user prompts + demo)

## How It Works
1. Enter a first name and last name.
2. Choose a department (or none).
3. The app generates:
   - Email address based on naming + department
   - A random password
4. Optionally update account settings using setter methods.

## Example Email Formats
- With department: `john.doe@sales.company.com`
- Without department: `john.doe@company.com` *(if implemented to omit the department segment)*

## Run (example)
Compile and run using your IDE, or from the command line:
1. Compile your `src` files
2. Run the `EmailApp` main class

## Future Improvements
- Validate department input
- Stronger password rules / SecureRandom usage
- Unit tests (JUnit)
- Configurable company domain and departments

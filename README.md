# College Management project

Objective:
Develop a College Directory Application to facilitate seamless interaction between students, faculty members, and administrators within a single college. The application will allow users to manage and access personal and academic information efficiently.
User Roles:
Student
Faculty Member
Administrator
Requirements:
1. Login Page
User Interface:
Simple form with fields for Username, Password, and a role selection dropdown (Student/Faculty Member/Administrator).
Submit button to log in.
Functionality:
Validate user credentials against the database.
Redirect users to their respective dashboards based on their role.
Implement error handling for incorrect credentials.
2. Student Interface
A. View Personal Profile
User Interface:
Display personal information (name, photo, contact details).
Display academic information (courses, grades, attendance).
Functionality:
Fetch and display the student's profile details from the database.
B. Search for Other Students
User Interface:
Search bar with filters for name, department, or year.
List view displaying basic details of matching students.
Functionality:
Implement search functionality to query the database.
Display search results dynamically.
C. Contact Faculty Advisors
User Interface:
List view of assigned faculty advisors with contact options (email, phone).
Functionality:
Fetch and display advisor details from the database.
Provide contact links for email or phone.
3. Faculty Member Interface
A. Manage Class List
User Interface:
List view of students in the faculty member's courses with columns for student names, photos, and contact information.
Functionality:
Fetch and display class list from the database.
B. Update Profile
User Interface:
Form to update office hours, contact email, and phone number.
Functionality:
Validate and save updated profile information to the database.
Ensure students can view the updated profile.
4. Administrator Interface
A. Manage Student and Faculty Records
User Interface:
Form to add, update, or remove student and faculty records.
List view of records with options for CRUD operations.
Functionality:
Implement CRUD operations for student and faculty records in the database.
Ensure changes are reflected immediately in the directory.
B. Dashboard with Graphs
User Interface:
Interface to view graphical representations of key data points (e.g., student enrollment trends, faculty course loads).
Include charts and graphs for visual representation of data.
Functionality:
Fetch and aggregate data for graphical display.
Provide interactive elements for data visualization.
# leucineproject

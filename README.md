# Repository to implement threads in a Java application.

Implementing threads in an application can provide several benefits, such as:

-Improved performance<br>
-Responsiveness<br>
-Resource Utilization<br>
-Simplified Coding<br>
-Scalability<br>

So I decided to create a very simple program to better understand how threads work, how they can be synchronized, and how they can interact with each other.

🧵 The program simulates a voting system for a fictitious brand called Topsy-Turvy Bakery, which is hosting a wedding cake design webinar for their customers. During this webinar, the audience will vote for the final round of a baking competition among three finalists. The program implements multiple threads to handle voting and counting of votes for each cake design.

The program is divided into two challenges. The first challenge involves creating and starting threads for voting and counting of votes for each cake design. The second challenge involves simulating votes coming in at random intervals and counting of votes happening every two seconds, with all tasks stopping after 30 seconds.

🧵 To run the program, you need to have a Java Development Kit (JDK) installed on your computer. Once you have cloned or downloaded the repository, navigate to the directory where the program is saved and run the following command:


`javac WebinarPollingSystem.java`<br>
`java WebinarPollingSystem`


The program will then execute, and you can see the output in the terminal.

The program demonstrates the use of Java threads to handle concurrent tasks, the implementation of the Runnable interface to create threads, and the use of thread class methods like sleep() and interrupt() to pause and stop threads.

🧵 If you encounter any issues or have questions, please feel free to reach out or refer to the code comments for guidance.

/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student
import problem3.myqueue.MyPriorityQueue;

public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("samar", 1);
        obj.insert("sameer", 4);
        obj.insert("sudheer", 3);
        obj.insert("samrat", 2);
        obj.insert("surendra", 5);
        obj.display();
    }
}

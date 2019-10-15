/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhsarray;


public class Main {
    public static void main(String[] args) {
        QLHS ql = new QLHS();
        QLHSArray q1 = new QLHSArray(1, "Nam", "58pm", 10);
        QLHSArray q2 = new QLHSArray(2, "An", "58th3", 9);
        QLHSArray q3 = new QLHSArray(3, "Trang", "58cx", 8);
        QLHSArray q4 = new QLHSArray(4, "Linh", "58th", 9);
        QLHSArray q5 = new QLHSArray(5, "Anh", "58ht", 10);
        ql.addhs(q5);
        ql.addhs(q4);
        ql.addhs(q3);
        ql.addhs(q2);
        ql.addhs(q1);
        ql.xuatall();
        ql.findlop("58th3");
        ql.findname("Name");
        ql.sortbypoint();
    }
}

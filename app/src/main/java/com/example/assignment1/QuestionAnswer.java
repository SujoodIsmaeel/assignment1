package com.example.assignment1;

public class QuestionAnswer {
    public static String question[] ={
            "The …………………… arranges widgets in positions relative to each other",
            "The ………………………… is a layout that arranges other views either horizontally in a single column or vertically in a single row.",
            "Which of the following files has the correct name for a layout design file of an activity in an Android app?",
            "A standard Android toast notification appears near the bottom of the screen, centered horizontally. To change this position you can use ………………….…"
    };

    public static String choices[][] = {
            {"RelativeLayout","Linear Layout","ConstraintLayout","Table Layout"},
            {"Linear Layout","RelativeLayout","ConstraintLayout"," Frame Layout"},
            {"MainActivity.java or MainActivity.kt"," activity_main.xml","Sample.class"," Gradle.sql"},
            {"toast.setGravity","toast.coordinates","toast.position","toast.location"}
    };

    public static String correctAnswers[] = {
            "RelativeLayout",
            "Linear Layout",
            " activity_main.xml",
            "toast.setGravity"
    };

}

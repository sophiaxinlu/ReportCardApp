package com.example.sophialu.reportcard;

/**
 * Created by sophia.lu on 8/13/16.
 */
public class ReportCard {
    private int averageGrade;
    private int grammerGrade;
    private int mathGrade;
    private int artGrade;
    private String studentName;
    private String term;

    public ReportCard(String studentName, String term, int grammerGrade, int mathGrade, int artGrade) {
        this.studentName = studentName;
        this.term = term;
        this.grammerGrade = grammerGrade;
        this.mathGrade = mathGrade;
        this.artGrade = artGrade;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        studentName = studentName;
    }

    public int getAverageGrade() {
        averageGrade = Math.round((grammerGrade + mathGrade + artGrade) /3);
        return averageGrade;
    }

    public int getGrammerGrade() {
        return grammerGrade;
    }

    public void setGrammerGrade(int grade) {
        grammerGrade = grade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int grade) {
        mathGrade = grade;
    }

    public int getArtGrade() {
        return artGrade;
    }

    public void setArtGrade(int grade) {
        artGrade = grade;
    }

    @Override
    public String toString() {
        return "Report Card for: " + studentName
                + "\nTerm: " + term
                +  "\nGrammer: " + grammerGrade
                +  "\nMath: " + mathGrade
                +  "\nArt: " + artGrade
                +  "\nGrade Average: " + getAverageGrade();
    }

}

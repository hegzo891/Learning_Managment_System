package model;

import java.util.List;

public class Quiz {
    private Long id;
    private Long courseId;
    private String title;
    private List<String> questions;
    private List<String> answers;

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getCourseId() {
        return courseId;
    }
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<String> getQuestions() {
        return questions;
    }
    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }
    public List<String> getAnswers() {
        return answers;
    }
    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}
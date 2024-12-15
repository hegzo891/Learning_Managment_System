package repository;

import model.Quiz;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class QuizRepository {

    private List<Quiz> quizList = new ArrayList<>();

    // Get all quizzes
    public List<Quiz> findAll() {
        return quizList;
    }

    // Get a quiz by ID
    public Optional<Quiz> findById(Long id) {
        return quizList.stream()
                .filter(quiz -> quiz.getId().equals(id))
                .findFirst();
    }

    // Save or update a quiz
    public Quiz save(Quiz quiz) {
        quizList.add(quiz); // Add new quiz to list
        return quiz;
    }

    // Delete a quiz by ID
    public void deleteById(Long id) {
        quizList.removeIf(quiz -> quiz.getId().equals(id));
    }
}
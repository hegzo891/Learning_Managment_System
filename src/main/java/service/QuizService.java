package service;

import model.Quiz;
import repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    // Get all quizzes
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    // Get a quiz by ID
    public Optional<Quiz> getQuizById(Long id) {
        return quizRepository.findById(id);
    }

    // Add a new quiz
    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    // Update an existing quiz
    public Quiz updateQuiz(Long id, Quiz quizDetails) {
        Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
        quiz.setTitle(quizDetails.getTitle());
        // Set other fields here
        return quizRepository.save(quiz);
    }

    // Delete a quiz
    public void deleteQuiz(Long id) {
        quizRepository.deleteById(id);
    }
}
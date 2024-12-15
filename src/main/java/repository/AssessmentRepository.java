package repository;

import model.Assessment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AssessmentRepository {

    private List<Assessment> assessmentList = new ArrayList<>();

    // Get all assessments
    public List<Assessment> findAll() {
        return assessmentList;
    }

    // Get an assessment by ID
    public Optional<Assessment> findById(Long id) {
        return assessmentList.stream()
                .filter(assessment -> assessment.getAssessmentId().equals(id))
                .findFirst();
    }

    // Save or update an assessment
    public Assessment save(Assessment assessment) {
        assessmentList.add(assessment);
        return assessment;
    }

    // Delete an assessment by ID
    public void deleteById(Long id) {
        assessmentList.removeIf(assessment -> assessment.getAssessmentId().equals(id));
    }
}
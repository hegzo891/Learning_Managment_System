package service;

import model.Assessment;
import repository.AssessmentRepository;

import java.util.List;

public class AssessmentService {

    private final AssessmentRepository assessmentRepository;

    public AssessmentService(AssessmentRepository assessmentRepository) {
        this.assessmentRepository = assessmentRepository;
    }

    public List<Assessment> getAllAssessments() {
        return assessmentRepository.findAll();
    }
}
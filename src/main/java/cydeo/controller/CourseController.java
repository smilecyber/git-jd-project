package cydeo.controller;

import cydeo.entity.Course;
import cydeo.service.ProgramService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CourseController {
    private final ProgramService programService;

    public String createCourse(Course course){
        return "success";
    }
}

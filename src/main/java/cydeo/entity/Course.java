package cydeo.entity;

import lombok.Data;

import java.util.List;

@Data
public class Course {
    private Integer id;
    private String courseCode;
    private List<Topic> topics;
    private Program program;
}

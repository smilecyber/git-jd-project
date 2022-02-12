package cydeo.entity;

import lombok.Data;

import java.util.List;

@Data
public class Topic {
    private Integer id;
    private String name;
    private List<Course> courseList;
    public String getFirstCourseCode(){
        return courseList.get(0).getCourseCode();
    }
}

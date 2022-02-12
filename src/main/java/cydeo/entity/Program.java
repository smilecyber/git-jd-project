package cydeo.entity;

import lombok.Data;

@Data
public class Program {
    private Integer id;
    private String programCode;
    private String programName;
    //some work here
    private String programDetails;
    private String published;
}


package cydeo.entity;

import lombok.Data;

import java.util.UUID;

@Data
public class Program {
    private Integer id;
    private String programCode;
    private String programName;
    //some work here
    private String programDetails;
    private UUID externalProgramId;
    private String published;

    public String retrieveProgramDetails(){
        return programCode + " " + programDetails;
    }
}


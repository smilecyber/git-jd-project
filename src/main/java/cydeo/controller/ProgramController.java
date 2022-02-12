package cydeo.controller;

import cydeo.entity.Program;
import cydeo.service.ProgramService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProgramController {
    private final ProgramService programService;

    public String createProgram(Program program){
        return programService.createProgram(program);
    }
}

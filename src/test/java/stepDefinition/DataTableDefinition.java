package stepDefinition;

import dataTemplate.LecturePrimitive;
import io.cucumber.java.en.Given;

import java.util.List;

public class DataTableDefinition {

    @Given("the list string lecture details are")
    public void theListStringLectureDetailsAre(List<List<String>> lectures) {
        System.out.println("");
        System.out.println(lectures);
    }

    @Given("the list primitive lecture details are")
    public void thePrimitiveLectureDetailsAre(List<LecturePrimitive> lectures) {
        System.out.println("");
        System.out.println(lectures);
    }
}

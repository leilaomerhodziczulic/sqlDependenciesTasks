package controllers;

import io.ebean.DB;
import models.Students;
import play.mvc.Controller;
import play.mvc.Result;


public class StudentController extends Controller {
    public Result insertStudent(){
        try{
            Students student = new Students("leila", "ABC1234");
            DB.save(student);
            return ok("Student " + student.name + " added!");
        }catch (Exception e) {
            e.printStackTrace();
            return internalServerError("Error inserting student: " + e.getMessage());
        }



    }
}

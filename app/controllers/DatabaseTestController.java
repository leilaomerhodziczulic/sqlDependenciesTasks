package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class DatabaseTestController extends Controller {
    public Result checkDB(){
        return ok("Connection is up!");
    }
}

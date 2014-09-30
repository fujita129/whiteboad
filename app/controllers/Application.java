package controllers;

import static play.data.Form.form;

import java.util.List;

import models.DayTarget;
import models.UsrInfo;
import models.Word;
import play.*;
import play.data.Form;
import play.db.ebean.Model.Finder;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result GO_HOME = redirect(
            routes.Application.home()
        );

	public static Result index() {
        return GO_HOME;
    }

    public static Result home() {
    	Form<Word> wordForm = Form.form(Word.class);
    	Finder<Long, Word> wordFinder = new Finder<Long, Word>(Long.class, Word.class);
    	List<Word> words = wordFinder.all();
    	return ok(
    		home.render(words, wordForm)
    	);
    }

    public static Result createWord() {
        Form<Word> wordForm = form(Word.class).bindFromRequest();
        wordForm.get().save();
        return GO_HOME;
    }
}

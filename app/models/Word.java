package models;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.validation.*;

/**
 * Word entity managed by Ebean
 */
@Entity
public class Word extends Model {

	public String selectColor(){
		String result = "";
		int tmp1 = (int)((Math.random() * 12));
		int tmp2 = (int)(Math.random() * 16);
		result += Integer.toHexString(tmp1);
		result += Integer.toHexString(tmp2);
		result = result+result+result;
		return result;
	}

    public int leftval = (int)((Math.random() * 65 ) + 15);
    public int topval = (int)((Math.random() * 350) + 250);

    private static final long serialVersionUID = 1L;

	@Id
    public Long id;

    @Constraints.Required
    public String content;

    public String lef = Integer.toString(leftval)+"%";

    public String top = Integer.toString(topval)+"px";

    public int size = (int)((Math.random() * 4) + 4);

    public String color = selectColor();

    public static Finder<Long,Word> findWord = new Finder<Long,Word>(Long.class, Word.class);

}

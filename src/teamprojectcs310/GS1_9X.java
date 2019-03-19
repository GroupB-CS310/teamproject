package teamprojectcs310;

import java.util.HashMap;
import java.util.regex.Pattern;

public class GS1_9X extends GS1 {
    
    public GS1_9X() {
        
        super();
        super.matchers = new HashMap<>();
        
        
        
        super.matchers.put("90",  Pattern.compile("^90(.){1,30}[%\\x1D]"));
        super.matchers.put("90eol",  Pattern.compile("^90(.){1,30}$"));  
        super.matchers.put("91",  Pattern.compile("^91(.){1,90}[%//x1D]"));
        super.matchers.put("91eol",  Pattern.compile("^91(.){1,90}$"));
        super.matchers.put("92",  Pattern.compile("^92(.){1,90}[%//x1D]"));
        super.matchers.put("92eol",  Pattern.compile("^92(.){1,90}$"));
        super.matchers.put("93",  Pattern.compile("^93(.){1,90}[%//x1D]"));
        super.matchers.put("93eol",  Pattern.compile("^93(.){1,90}$"));
        super.matchers.put("94",  Pattern.compile("^94(.){1,90}[%//x1D]"));
        super.matchers.put("94eol",  Pattern.compile("^94(.){1,90}$"));
        super.matchers.put("95",  Pattern.compile("^95(.){1,90}[%//x1D]"));
        super.matchers.put("95eol",  Pattern.compile("^95(.){1,90}$"));
        super.matchers.put("96",  Pattern.compile("^96(.){1,90}[%//x1D]"));
        super.matchers.put("96eol",  Pattern.compile("^96(.){1,90}$"));
        super.matchers.put("97",  Pattern.compile("^97(.){1,90}[%//x1D]"));
        super.matchers.put("97eol",  Pattern.compile("^97(.){1,90}$"));
        super.matchers.put("98",  Pattern.compile("^98(.){1,90}[%//x1D]"));
        super.matchers.put("98eol",  Pattern.compile("^98(.){1,90}$"));
        super.matchers.put("99",  Pattern.compile("^99(.){1,90}[%//x1D]"));
        super.matchers.put("99eol",  Pattern.compile("^99(.){1,90}$"));
    }

}


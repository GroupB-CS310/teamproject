package teamprojectcs310;

import java.util.HashMap;
import java.util.regex.Pattern;

public class GS1_0X extends GS1 {

    public GS1_0X() {
        
        super();
        
        super.matchers = new HashMap<>();
        
        super.matchers.put( "01", Pattern.compile("^01[0-9]{14}") ); // AI #01
        
    }
    
    public Object parse01(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "GTIN");
        output.put("ai", element.substring(0, 2) );
        output.put("prefix", Integer.parseInt( element.substring(2, 10) ) );
        output.put("item", Integer.parseInt( element.substring(10, 15) ) );
        output.put("check", Integer.parseInt( element.substring(15) ) );
        output.put("element", element);
        
        return output;
        
    }
    
}
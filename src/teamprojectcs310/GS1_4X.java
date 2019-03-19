package teamprojectcs310;
import java.util.HashMap;
import java.util.regex.Pattern;

public class GS1_4X extends GS1 {
    
    public GS1_4X(){
        
        super();
        
        super.matchers = new HashMap<>();
        
        super.matchers.put( "400", Pattern.compile("^400(.){1,30}[%\\x1D]") );          // AI #400       
        super.matchers.put( "400eol", Pattern.compile("^400(.){1,30}$") );              // AI #400 (eol)       
        super.matchers.put( "401", Pattern.compile("^401(.){1,30}[%\\x1D]") );          // AI #401 
        super.matchers.put( "401eol", Pattern.compile("^401(.){1,30}$") );              // AI #401 (eol)
        super.matchers.put( "402", Pattern.compile("^402[0-9]{17}"));                   // AI #402
        super.matchers.put( "403", Pattern.compile("^403(.){1,30}[%\\x1D]") );          // AI #403
        super.matchers.put( "403eol", Pattern.compile("^403(.){1,30}$") );              // AI #403 (eol)
        super.matchers.put( "410", Pattern.compile("^410[0-9]{13}") );                  // AI #410
        super.matchers.put( "411", Pattern.compile("^411[0-9]{13}") );                  // AI #411
        super.matchers.put( "412", Pattern.compile("^412[0-9]{13}") );                  // AI #412
        super.matchers.put( "413", Pattern.compile("^413[0-9]{13}") );                  // AI #413
        super.matchers.put( "414", Pattern.compile("^414[0-9]{13}") );                  // AI #414
        super.matchers.put( "415", Pattern.compile("^415[0-9]{13}") );                  // AI #415
        super.matchers.put( "416", Pattern.compile("^416[0-9]{13}") );                  // AI #416
        super.matchers.put( "420", Pattern.compile("^420(.){1,20}[%\\x1D]") );          // AI #420
        super.matchers.put( "420eol", Pattern.compile("^420(.){1,20}$") );              // AI #420 (eol)
        super.matchers.put( "421", Pattern.compile("^421[0-9]{3}(.){1,9}[%\\x1D]") );   // AI #421
        super.matchers.put( "421eol", Pattern.compile("^21[0-9]{3}(.){1,9}$") );        // AI #421 (eol)
        super.matchers.put( "422", Pattern.compile("^422[0-9]{3}") );                   // AI #422
        super.matchers.put( "423", Pattern.compile("^423[0-9]{3}(.){1,12}[%\\x1D]") );  // AI #423
        super.matchers.put( "423eol", Pattern.compile("^423[0-9]{3}(.){1,12}$") );      // AI #423 (eol)
        super.matchers.put( "424", Pattern.compile("^424[0-9]{3}") );                   // AI #424
        super.matchers.put( "425", Pattern.compile("^425[0-9]{3}(.){1,12}[%\\x1D]") );  // AI #425
        super.matchers.put( "425eol", Pattern.compile("^425[0-9]{3}(.){1,12}$") );      // AI #425 (eol)
        super.matchers.put( "426", Pattern.compile("^426[0-9]{3}") );                   // AI #426
        super.matchers.put( "427", Pattern.compile("^427(.){1,3}[%\\x1D]") );           // AI #427
        super.matchers.put( "427eol", Pattern.compile("^427(.){1,3}$") );               // AI #427 (eol)
        

    }
    
}

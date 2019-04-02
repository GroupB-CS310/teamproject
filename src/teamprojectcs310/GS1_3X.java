package teamprojectcs310;
import java.util.HashMap;
import java.util.regex.Pattern;

public class GS1_3X extends GS1 {
    
    public GS1_3X(){
        
        super();
        
        super.matchers = new HashMap<>();
        

        
        super.matchers.put( "30", Pattern.compile("^30(.){1,8}[%\\x1D]") );             // AI #30       
        super.matchers.put( "30eol", Pattern.compile("^30(.){1,8}$") );                 // AI #30 (eol)
        super.matchers.put( "310n", Pattern.compile("^310n[0-9]{6}"));                  // AI #310n
        super.matchers.put( "311n", Pattern.compile("^311n[0-9]{6}"));                  // AI #311n
        super.matchers.put( "312n", Pattern.compile("^312n[0-9]{6}"));                  // AI #312n
        super.matchers.put( "313n", Pattern.compile("^313n[0-9]{6}"));                  // AI #313n
        super.matchers.put( "314n", Pattern.compile("^314n[0-9]{6}"));                  // AI #314n
        super.matchers.put( "315n", Pattern.compile("^315n[0-9]{6}"));                  // AI #315n
        super.matchers.put( "316n", Pattern.compile("^316n[0-9]{6}"));                  // AI #316n
        super.matchers.put( "320n", Pattern.compile("^320n[0-9]{6}"));                  // AI #320n
        super.matchers.put( "321n", Pattern.compile("^321n[0-9]{6}"));                  // AI #321n
        super.matchers.put( "322n", Pattern.compile("^322n[0-9]{6}"));                  // AI #322n
        super.matchers.put( "323n", Pattern.compile("^323n[0-9]{6}"));                  // AI #323n
        super.matchers.put( "324n", Pattern.compile("^324n[0-9]{6}"));                  // AI #324n
        super.matchers.put( "325n", Pattern.compile("^325n[0-9]{6}"));                  // AI #325n
        super.matchers.put( "326n", Pattern.compile("^326n[0-9]{6}"));                  // AI #326n
        super.matchers.put( "327n", Pattern.compile("^327n[0-9]{6}"));                  // AI #327n
        super.matchers.put( "328n", Pattern.compile("^328n[0-9]{6}"));                  // AI #328n
        super.matchers.put( "329n", Pattern.compile("^329n[0-9]{6}"));                  // AI #329n
        super.matchers.put( "330n", Pattern.compile("^330n[0-9]{6}"));                  // AI #330n
        super.matchers.put( "331n", Pattern.compile("^331n[0-9]{6}"));                  // AI #331n
        super.matchers.put( "332n", Pattern.compile("^332n[0-9]{6}"));                  // AI #332n
        super.matchers.put( "333n", Pattern.compile("^333n[0-9]{6}"));                  // AI #333n
        super.matchers.put( "334n", Pattern.compile("^334n[0-9]{6}"));                  // AI #334n
        super.matchers.put( "335n", Pattern.compile("^335n[0-9]{6}"));                  // AI #335n
        super.matchers.put( "336n", Pattern.compile("^336n[0-9]{6}"));                  // AI #336n
        super.matchers.put( "337n", Pattern.compile("^337n[0-9]{6}"));                  // AI #337n
        super.matchers.put( "340n", Pattern.compile("^340n[0-9]{6}"));                  // AI #340n
        super.matchers.put( "341n", Pattern.compile("^341n[0-9]{6}"));                  // AI #341n
        super.matchers.put( "342n", Pattern.compile("^342n[0-9]{6}"));                  // AI #342n
        super.matchers.put( "343n", Pattern.compile("^343n[0-9]{6}"));                  // AI #343n
        super.matchers.put( "344n", Pattern.compile("^344n[0-9]{6}"));                  // AI #344n
        super.matchers.put( "345n", Pattern.compile("^345n[0-9]{6}"));                  // AI #345n
        super.matchers.put( "346n", Pattern.compile("^346n[0-9]{6}"));                  // AI #346n
        super.matchers.put( "347n", Pattern.compile("^347n[0-9]{6}"));                  // AI #347n
        super.matchers.put( "348n", Pattern.compile("^348n[0-9]{6}"));                  // AI #348n
        super.matchers.put( "349n", Pattern.compile("^349n[0-9]{6}"));                  // AI #349n
        super.matchers.put( "350n", Pattern.compile("^350n[0-9]{6}"));                  // AI #350n
        super.matchers.put( "351n", Pattern.compile("^351n[0-9]{6}"));                  // AI #351n
        super.matchers.put( "352n", Pattern.compile("^352n[0-9]{6}"));                  // AI #352n
        super.matchers.put( "353n", Pattern.compile("^353n[0-9]{6}"));                  // AI #353n
        super.matchers.put( "354n", Pattern.compile("^354n[0-9]{6}"));                  // AI #354n
        super.matchers.put( "355n", Pattern.compile("^355n[0-9]{6}"));                  // AI #355n
        super.matchers.put( "356n", Pattern.compile("^356n[0-9]{6}"));                  // AI #356n
        super.matchers.put( "357n", Pattern.compile("^357n[0-9]{6}"));                  // AI #357n
        super.matchers.put( "360n", Pattern.compile("^360n[0-9]{6}"));                  // AI #360n
        super.matchers.put( "361n", Pattern.compile("^361n[0-9]{6}"));                  // AI #361n
        super.matchers.put( "362n", Pattern.compile("^362n[0-9]{6}"));                  // AI #362n
        super.matchers.put( "363n", Pattern.compile("^363n[0-9]{6}"));                  // AI #363n
        super.matchers.put( "364n", Pattern.compile("^364n[0-9]{6}"));                  // AI #364n
        super.matchers.put( "365n", Pattern.compile("^365n[0-9]{6}"));                  // AI #365n
        super.matchers.put( "366n", Pattern.compile("^366n[0-9]{6}"));                  // AI #366n
        super.matchers.put( "367n", Pattern.compile("^367n[0-9]{6}"));                  // AI #367n
        super.matchers.put( "368n", Pattern.compile("^368n[0-9]{6}"));                  // AI #368n
        super.matchers.put( "369n", Pattern.compile("^369n[0-9]{6}"));                  // AI #369n
        super.matchers.put( "37", Pattern.compile("^37(.){1,8}[%\\x1D]") );             // AI #37       
        super.matchers.put( "37eol", Pattern.compile("^37(.){1,8}$") );                 // AI #37 (eol)
        super.matchers.put( "390n", Pattern.compile("^390n(.){1,15}[%\\x1D]") );        // AI #390n       
        super.matchers.put( "390neol", Pattern.compile("^390n(.){1,15}$") );            // AI #390n (eol)
        super.matchers.put( "391n", Pattern.compile("^391n[0-9]{3}(.){1,15}[%\\x1D]") );// AI #391n       
        super.matchers.put( "391neol", Pattern.compile("^391n[0-9]{3}(.){1,15}$") );    // AI #391n (eol)
        super.matchers.put( "392n", Pattern.compile("^392n(.){1,15}[%\\x1D]") );        // AI #392n       
        super.matchers.put( "392neol", Pattern.compile("^392n(.){1,15}$") );            // AI #392n (eol)
        super.matchers.put( "393n", Pattern.compile("^393n[0-9]{3}(.){1,15}[%\\x1D]") );// AI #393n       
        super.matchers.put( "393neol", Pattern.compile("^393n[0-9]{3}(.){1,15}$") );    // AI #393n (eol)
        super.matchers.put( "394n", Pattern.compile("^394n[0-9]{4}"));                  // AI #394n
        super.matchers.put( "394neol", Pattern.compile("^394n(.){1,4}$") );             // AI #394n (eol)
    
    }
    
    
    }
    

       
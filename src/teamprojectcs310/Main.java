package teamprojectcs310;

public class Main { 
    
    public static void main(String[] args) {
        
        PlinkoMasterParser p = new PlinkoMasterParser();
        String s = p.parse("01123456789012340212345678901234101234567890%1112345612123456131234561512345616123456171234562012211234567890%221234567890%2401234567890%2411234567890%242123456%2431234567890%2501234567890%2511234567890%25312345678901231234567890%2541234567890%25512345678901231234567890%3012345678%310n123456311n123456312n123456313n123456314n123456315n123456316n123456320n123456321n123456322n123456323n123456324n123456325n123456326n123456327n123456328n123456329n123456330n123456331n123456332n123456333n123456334n123456335n123456336n123456337n123456340n123456341n123456342n123456343n123456344n123456345n123456346n123456347n123456348n123456349n123456350n123456351n123456352n123456353n123456354n123456355n123456356n123456357n123456360n123456361n123456362n123456363n123456364n123456365n123456366n123456367n123456368n123456369n1234563712345678%390n1234567890%391n1231234567890%392n1234567890%393n1231234567890%394n12344001234567890%4011234567890%402123456789012345674031234567890%41012345678901234111234567890123412123456789012341312345678901234141234567890123415123456789012341612345678901234201234567890%421123123456789%4221234231231234567890%4241234251231234567890%426123427123%70011234567890123%70021234567890%70031234567890%7004123470051234567890%7008123%70091234567890%701012%70201234567890%70211234567890%70221234567890%70231234567890%703s1231234567890%7101234567890%7111234567890%7121234567890%7131234567890%7141234567890%723s121234567890%80011234567890123480021234567890%8003123456789012341234567890%80041234567890%8005123456800612345678901234121280071234567890%800812345678123480091234567890%80101234567890%80121234567890%80131234567890%8017123456789012345678%8018123456789012345678%80191234567890%80201234567890%81101234567890%8026123456789012341212%811112345%81121234567890%82001234567890%901234567890%911234567890%921234567890%931234567890%941234567890%951234567890%961234567890%971234567890%981234567890%991234567890%");
    }

//Below is a test string with every AI in it to test which ones work and don't work. 
//
//
//
//0012345678901234567801123456789012340212345678901234101234567890%1112345612123456131234561512345616123456171234562012211234567890%221234567890%2401234567890%2411234567890%242123456%2431234567890%2501234567890%2511234567890%25312345678901231234567890%2541234567890%25512345678901231234567890%3012345678%310n123456311n123456312n123456313n123456314n123456315n123456316n123456320n123456321n123456322n123456323n123456324n123456325n123456326n123456327n123456328n123456329n123456330n123456331n123456332n123456333n123456334n123456335n123456336n123456337n123456340n123456341n123456342n123456343n123456344n123456345n123456346n123456347n123456348n123456349n123456350n123456351n123456352n123456353n123456354n123456355n123456356n123456357n123456360n123456361n123456362n123456363n123456364n123456365n123456366n123456367n123456368n123456369n1234563712345678%390n1234567890%391n1231234567890%392n1234567890%393n1231234567890%394n1234%4001234567890%4011234567890%40212345678901234567%4031234567890%41012345678901234111234567890123412123456789012341312345678901234141234567890123415123456789012341612345678901234201234567890%421123123456789%422123%4231231234567890%424123%4251231234567890%426123%427123%70011234567890123%70021234567890%70031234567890%70041234%70051234567890%7006123456%70071234567890%7008123%70091234567890%701012%70201234567890%70211234567890%70221234567890%70231234567890%703s1231234567890%7101234567890%7111234567890%7121234567890%7131234567890%7141234567890%723s121234567890%800112345678901234%80021234567890%8003123456789012341234567890%80041234567890%8005123456%8006123456789012341212%80071234567890%8008123456781234%80091234567890%80101234567890%80111234567890%80121234567890%80131234567890%8017123456789012345678%8018123456789012345678%80191234567890%80201234567890%81101234567890%8026123456789012341212%811112345%81121234567890%82001234567890%901234567890%911234567890%921234567890%931234567890%941234567890%951234567890%961234567890%971234567890%981234567890%991234567890%
//
//
//Below is a list of AI's I have concluded are bricked in some way. If included in the string it does not finish but if removed it does finish from 01 all the way to 99
//
//00, 7006, 7007, 8011
//
}

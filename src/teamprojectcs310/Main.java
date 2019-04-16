package teamprojectcs310;

public class Main { 
    
    public static void main(String[] args) {
        
        PlinkoMasterParser p = new PlinkoMasterParser();
        String s = p.parse("901234567890%911234567890%921234567890%931234567890%4001234567890%333n123456");
    }
}

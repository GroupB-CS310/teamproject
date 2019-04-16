package teamprojectcs310;

public class Main { 
    
    public static void main(String[] args) {
        
        PlinkoMasterParser p = new PlinkoMasterParser();
        String s = p.parse("02123456789012342194362579%11123456");
    }
}

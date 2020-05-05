public class CPU {
    
    public void freeze() {
       
        System.out.println("  ad88");
        System.out.println("  d8\"");
        System.out.println("  88");
        System.out.println("MM88MMM 8b,dPPYba,  ,adPPYba,  ,adPPYba, 888888888  ,adPPYba,");
        System.out.println("  88    88P'   \"Y8 a8P_____88 a8P_____88      a8P\" a8P_____88");
        System.out.println("  88    88         8PP\"\"\"\"\"\"\" 8PP\"\"\"\"\"\"\"   ,d8P'   8PP\"\"\"\"\"\"\"");  
        System.out.println("  88    88         \"8b,   ,aa \"8b,   ,aa ,d8\"      \"8b,   ,aa");
        System.out.println("  88    88          `\"Ybbd8\"\'  `\"Ybbd8\"\' 888888888  `\"Ybbd8\"\'");
        System.out.println("");
    }
    
    public void jump(long position) {
            System.out.println("Goto memory position: " + position);
    }
    
    public void execute() {
        System.out.println("Executing...");
    }
}

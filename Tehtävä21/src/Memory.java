class Memory {
    
    public void load(long position, byte[] data) {
        System.out.println("Reading data \"" + data + "\" from memrory position \"" + position + "\"");
        for (int c = 0; c < data.length; c++) {
            System.out.print(data[c] + "=" + Character.toString((char)data[c]) + "  ");
        }
        System.out.println("");
    }
}
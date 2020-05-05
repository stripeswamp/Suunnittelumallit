class HardDrive {
    
    public byte[] read(long lba, int size) {
        
        System.out.println("Reading stored data from " + lba + ", " + size + " byte(s)");
        String Data = "muistiosoite";
        return Data.getBytes();
    }
}

class ComputerFacade {
    
    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;
    private long BOOT_ADDRESS;
    private long BOOT_SECTOR;
    private int SECTOR_SIZE;

    public ComputerFacade() {
        
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
        this.BOOT_ADDRESS = 1024;
        this.BOOT_SECTOR = 4096;
        this.SECTOR_SIZE = 512;
    }

    public void start() {
        
        this.processor.freeze();
        this.ram.load(this.BOOT_ADDRESS, this.hd.read(this.BOOT_SECTOR, this.SECTOR_SIZE));
        this.processor.jump(this.BOOT_ADDRESS);
        this.processor.execute();
    }
}
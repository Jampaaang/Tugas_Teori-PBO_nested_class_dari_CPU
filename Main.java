public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");

        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();

        // inner class Harddisk
        CPU.Harddisk harddisk = myKomputer.new Harddisk(500, "Seagate");
        harddisk.getHarddiskInfo();

        // inner class Motherboard
        CPU.Motherboard motherboard = myKomputer.new Motherboard("H61", "Gigabyte");
        motherboard.getMotherboardInfo();

        // inner class PowerSupply
        CPU.PowerSupply powerSupply = myKomputer.new PowerSupply(500, "Corsair");
        powerSupply.getPowerSupplyInfo();

        // inner class VGACard
        CPU.VGACard vgaCard = myKomputer.new VGACard(16, "Gigabyte", "GeForce RTX 3060");
        vgaCard.getVGACardInfo();

        // bikin object harddisk, vga, motherboard, powersupply
    }
}
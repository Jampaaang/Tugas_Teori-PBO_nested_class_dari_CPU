import java.text.NumberFormat;
import java.util.Locale;
public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }
    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }

    // inner class Harddisk
    class Harddisk {
        int kapasitas;
        String manufacturer;

        Harddisk(int kapasitas, String manufacturer) {
            this.kapasitas = kapasitas;
            this.manufacturer = manufacturer;
        }

        public void getHarddiskInfo() {
            System.out.println("Kapasitas HDD: " + this.kapasitas + " GB");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }
    // inner class Motherboard
    class Motherboard {
        String chipset;
        String manufacturer;

        Motherboard(String chipset, String manufacturer) {
            this.chipset = chipset;
            this.manufacturer = manufacturer;
        }

        public void getMotherboardInfo() {
            System.out.println("Chipset MOBO: " + this.chipset);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }
    // inner class PowerSuply
    class PowerSupply {
        int wattage;
        String manufacturer;

        PowerSupply(int wattage, String manufacturer) {
            this.wattage = wattage;
            this.manufacturer = manufacturer;
        }

        public void getPowerSupplyInfo() {
            System.out.println("Daya PSU: " + this.wattage + " watt");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }
    // inner class VGACard
    class VGACard {
        int memory;
        String manufacturer;
        String chipset;

        VGACard(int memory, String manufacturer, String chipset) {
            this.memory = memory;
            this.manufacturer = manufacturer;
            this.chipset = chipset;
        }

        public void getVGACardInfo() {
            System.out.println("Memori VGA: " + this.memory + " GB");
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Chipset: " + this.chipset);
        }
    }
}
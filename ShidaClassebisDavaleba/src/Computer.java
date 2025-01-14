public class Computer {
    private String country;
    private String brand;
    private double price;
    private boolean hasWarranty;
    private Monitor monitor;
    private Motherboard motherboard;

    public Computer(String countryOfManufacture, String brand, double price, boolean hasWarranty,
                    int diagonal, String resolution, int refreshRate,
                    int ramSlots, String ramType, int frequency) {
        this.country = countryOfManufacture;
        this.brand = brand;
        this.price = price;
        this.hasWarranty = hasWarranty;
        this.monitor = new Monitor(diagonal, resolution, refreshRate);
        this.motherboard = new Motherboard(ramSlots, ramType, frequency);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasWarranty() {
        return hasWarranty;
    }

    public void setHasWarranty(boolean hasWarranty) {
        this.hasWarranty = hasWarranty;
    }

    public void printInfo() {
        System.out.println("Computer Information: ");
        System.out.println("Country: " + country);
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
        System.out.println("Warranty: " + (hasWarranty ? "Yes" : "No"));
        System.out.println();
        monitor.printInfo();
        System.out.println();
        motherboard.printInfo();
    }

    private class Monitor {
        private int diagonal;
        private String resolution;
        private int refreshRate;

        public Monitor(int diagonal, String resolution, int refreshRate) {
            this.diagonal = diagonal;
            this.resolution = resolution;
            this.refreshRate = refreshRate;
        }

        public int getDiagonal() {
            return diagonal;
        }

        public void setDiagonal(int diagonal) {
            this.diagonal = diagonal;
        }

        public String getResolution() {
            return resolution;
        }

        public void setResolution(String resolution) {
            this.resolution = resolution;
        }

        public int getRefreshRate() {
            return refreshRate;
        }

        public void setRefreshRate(int refreshRate) {
            this.refreshRate = refreshRate;
        }

        public void printInfo() {
            System.out.println("Monitor Information: ");
            System.out.println("Diagonal: " + diagonal + " inches");
            System.out.println("Resolution: " + resolution);
            System.out.println("Refresh Rate: " + refreshRate + " Hz");
        }
    }

    private class Motherboard {
        private int ramSlots;
        private String ramType;
        private int frequency;

        public Motherboard(int ramSlots, String ramType, int frequency) {
            this.ramSlots = ramSlots;
            this.ramType = ramType;
            this.frequency = frequency;
        }

        public int getRamSlots() {
            return ramSlots;
        }

        public void setRamSlots(int ramSlots) {
            this.ramSlots = ramSlots;
        }

        public String getRamType() {
            return ramType;
        }

        public void setRamType(String ramType) {
            this.ramType = ramType;
        }

        public int getFrequency() {
            return frequency;
        }

        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }

        public void printInfo() {
            System.out.println("Motherboard Information: ");
            System.out.println("RAM Slots: " + ramSlots);
            System.out.println("RAM Type: " + ramType);
            System.out.println("Frequency: " + frequency + " MHz");
        }
    }
}

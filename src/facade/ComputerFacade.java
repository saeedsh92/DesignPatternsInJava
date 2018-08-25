package facade;

public class ComputerFacade {

    public void makePowerfulComputer() {
        System.out.println("Creating a powerful computer...");
        Computer computer = new Computer();
        computer.setCpu(new Cpu("Intel Core i7"));
        computer.setHardDisk(new HardDisk("SSD", 512));
        computer.setRam(new Ram("Dual Channel", 16));
        computer.assemble();
        System.out.println("Powerful Computer is created,"+printComputerInfo(computer));
    }

    public void makeEconomicComputer() {
        System.out.println("Creating a economic computer...");
        Computer computer = new Computer();
        computer.setCpu(new Cpu("Intel Core i3"));
        computer.setHardDisk(new HardDisk("SATA", 1024));
        computer.setRam(new Ram("Single", 4));
        computer.assemble();
        System.out.println("Powerful Computer is created, " +printComputerInfo(computer));
    }

    private String printComputerInfo(Computer computer) {
        StringBuilder stringBuilder = new StringBuilder()
                .append("Information: ")
                .append("\n")
                .append(" Cpu=> ")
                .append(computer.getCpu().getModel())
                .append("\n")
                .append(" Ram=> ")
                .append(computer.getRam().getCapacity())
                .append(" GB ")
                .append(computer.getRam().getType())
                .append("\n")
                .append(" HardDisk=> ")
                .append(computer.getHardDisk().getCapacityInGigabyte())
                .append(" GB")
                .append(computer.getHardDisk().getType());
        return stringBuilder.toString();
    }
}

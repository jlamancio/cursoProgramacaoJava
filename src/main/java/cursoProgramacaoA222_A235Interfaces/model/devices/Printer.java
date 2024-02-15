package cursoProgramacaoA222_A235Interfaces.model.devices;

public class Printer extends Device {
    public Printer(String serialNumber){
        super(serialNumber);
    }
    @Override
    public void processDoc(String doc){
        System.out.println("Printer processing: " + doc);
    }
    public void print(String doc){
        System.out.println("Printing: " + doc);
    }
}

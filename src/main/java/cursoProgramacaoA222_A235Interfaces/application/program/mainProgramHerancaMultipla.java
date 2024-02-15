package cursoProgramacaoA222_A235Interfaces.application.program;

import cursoProgramacaoA222_A235Interfaces.model.devices.ComboDevice;
import cursoProgramacaoA222_A235Interfaces.model.devices.ConcretPrinter;
import cursoProgramacaoA222_A235Interfaces.model.devices.ConcretScanner;

public class mainProgramHerancaMultipla {
    public static void main(String[] args) {
        System.out.println();
        ConcretPrinter p = new ConcretPrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");
        System.out.println();
        ConcretScanner s = new ConcretScanner("2003");
        s.processDoc("My e-mail");
        System.out.println("Scan result: " + s.scan());
        System.out.println();
        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My Dissertation");
        c.print("My Dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}

package cursoProgramacaoA222_A235Interfaces.application.program;

import cursoProgramacaoA222_A235Interfaces.model.devices.Printer;
import cursoProgramacaoA222_A235Interfaces.model.devices.Scanner;

public class mainProgramHerancaMultipla {
    public static void main(String[] args) {
        System.out.println();
        Printer p = new Printer("1080");
        p.processDoc("My Letter");
        p.print("My Letter");
        System.out.println();
        Scanner s = new Scanner("2003");
        s.processDoc("My e-mail");
        System.out.println("Scan result: " + s.scan());
    }
}

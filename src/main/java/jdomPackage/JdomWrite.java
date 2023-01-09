package jdomPackage;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import java.io.FileWriter;
import java.io.IOException;

public class JdomWrite {

    public static void main(String[] args) throws IOException {

        XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());

        Document doc = new Document();

        doc.setRootElement(new Element("company"));
        Element staff = new Element("staff");
        Element Department = new Element("Department");
        staff.addContent(Department);
        doc.getRootElement().addContent(staff);
//        staff.setAttribute("id", "1001");
//        staff.addContent(new Element("name").setText("mkyong"));
//        staff.addContent(new Element("role").setText("support"));
//        staff.addContent(new Element("salary")
//                .setAttribute("curreny", "USD").setText("5000"));
//        staff.addContent(new Comment("for special characters like < &, need CDATA"));
//
//        staff.addContent(new Element("bio")
//                .setContent(new CDATA("HTML tag <code>testing</code>")));
//
//        doc.getRootElement().addContent(staff);
//
//        Element staff2 = new Element("staff");
//        staff2.setAttribute("id", "1002");
//        staff2.addContent(new Element("name").setText("yflow"));
//        staff2.addContent(new Element("role").setText("admin"));
//        staff2.addContent(new Element("salary")
//                .setAttribute("curreny", "EUD").setText("8000"));
//        staff2.addContent(new Element("bio")
//                .setContent(new CDATA("a & b")));
//        doc.getRootElement().addContent(staff2);

        xmlOutputter.setFormat(Format.getPrettyFormat());

        xmlOutputter.output(doc, System.out);

        try(FileWriter fileWriter =
                    new FileWriter("input2.xml")){
            xmlOutputter.output(doc, fileWriter);
        }


    }

}

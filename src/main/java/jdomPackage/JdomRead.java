package jdomPackage;


import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


import java.io.*;

public class JdomRead {

    public static void main(String[] args) throws IOException, JDOMException {
        SAXBuilder saxBuilder = new SAXBuilder();

        File inputFile = new File("input2.xml");

        Document document = saxBuilder.build(inputFile);

        Element staff = document.getRootElement().getChild("staff");

        System.out.println(staff.getChild("Department"));
//
//        Element classElement = document.getRootElement();
//
//        XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());
//
//        xmlOutputter.output(document, System.out);



        // output to any Writer
//        try(FileWriter fileWriter =
//                    new FileWriter("input2.xml")){
//            xmlOutputter.output(new Document(), fileWriter);
//        }

        writeXml(System.out);
//
    }

    public static void writeXml(OutputStream output) throws IOException {

        XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());

        Document doc = new Document();

        doc.setRootElement(new Element("company"));
        Element staff = new Element("staff");
//        doc.getRootElement().addContent(staff);
//        staff.setAttribute("id", "1001");
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

        xmlOutputter.output(doc, output);

        try(FileWriter fileWriter =
                    new FileWriter("input2.xml")){
            xmlOutputter.output(doc, fileWriter);
        }


    }


}

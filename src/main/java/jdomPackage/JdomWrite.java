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

        doc.setRootElement(new Element("school"));

        Element students = new Element("students");

//        doc.getRootElement().addContent(students);

        Element student1 = new Element("student");

        //setAttribute is a method which sets id as an attribute which represents primary key
        student1.setAttribute("id", "100");

        Element name1 = new Element("name");

        //setText is a method gives value to the element
        name1.setText("Hari");

        student1.addContent(name1);

        students.addContent(student1);

        Element student2 = new Element("student");

        student2.setAttribute("id", "101");

        Element name2 = new Element("name");

        name2.setText("Bachi");

        student2.addContent(name2);

        students.addContent(student2);



//        students.addContent(student1);

        doc.getRootElement().addContent(students);


        xmlOutputter.setFormat(Format.getPrettyFormat());
//
//        xmlOutputter.output(doc, System.out);
//
        //FileWriter is a class which takes the file and write the content into the file.
        try(FileWriter fileWriter =
                    new FileWriter("input2.xml")){
            xmlOutputter.output(doc, fileWriter);

            System.out.println("Writer has written following xml code into the file successfully");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



    }

}

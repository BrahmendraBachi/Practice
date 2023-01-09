package jdomPackage;


import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.*;
import java.util.List;

public class JdomRead {

    public static void main(String[] args) throws IOException, JDOMException {


        // SAXbuilder uses a third-party SAX parser (chosen by JAXP by default, or you can configure it manually)
        // to handle the parsing duties and uses an instance of a SAXHandler to listen
        // to the SAX events in order to construct a document with JDOM content using a JDOMFactory.
        // Information about SAX can be found at http://www.saxproject.org.
        SAXBuilder saxBuilder = new SAXBuilder();

        File inputFile = new File("input2.xml");


        Document document = saxBuilder.build(inputFile);

        //getRootElement() method is used to get root element of the xml file
        //getChild(*cname*) method gives the child present in the selected element where name is child name


        //prints RootElement
//        System.out.println(document.getRootElement());

        //getChild() method gives the child *students* present in the root element.
        Element students = document.getRootElement().getChild("students");

        //getChild() method gives the child *student* present in the students element.
        System.out.println(students.getChild("student") + "\n");

        //getChildren() method gives all the children present in the given element students
        List<Element> studentsList = students.getChildren();

        System.out.println(studentsList + "\n");

        //
        System.out.println(students.getChildren("student") + "\n");

        Element student = students.getChild("student");

//        XMLOutputter xmlOutputter = new XMLOutputter();
//
//        xmlOutputter.setFormat(Format.getPrettyFormat());
//
//        xmlOutputter.output();
//
//        xmlOutputter.output(student, System.out);

        // gives the id of first node present in the XML
        System.out.println(student.getAttribute("id") + "\n");

        for(Element stud : studentsList){
            //getValue is a method used to print the value of the attribute
            System.out.println("Roll No : " + stud.getAttribute("id").getValue());
            System.out.println("Name : " + stud.getChild("name").getText() + "\n");

        }



    }


}

package serializingPackage;

import lombok.var;
import org.json.JSONObject;

import java.util.ArrayList;

public class SerializingJSON {

    public static void main(String[] args) {

        ArrayList<String> namesList = new ArrayList<String>();

        var values = new JSONObject();

        values.put("item1", 10);
        values.put("item2", 19);

        System.out.println("\n ***Original Json");
        System.out.println(values);
        System.out.println("   Class");
        System.out.println(values.getClass().getName());

        // {"item1" : 10, "item2" : 20}

        //converts JsonObject to String
        String str = values.toString();


        String repStr = str.replace("=", ":");

        System.out.println("\n ***after modi to string");
        System.out.println(repStr);

        System.out.println("   Class");
        System.out.println(repStr.getClass().getName());


        var jsonValues = new JSONObject(repStr);
        System.out.println("\n ***after modi to json");
        System.out.println(jsonValues);
        System.out.println("    Class");
        System.out.println(jsonValues.getClass().getName());









//        Map<> myClass=new Gson().fromJson(str,MyClass.class);

//        String str=values.toString();

//        ObjectInputStream var = new ObjectInputStream(namesList);

    }


}

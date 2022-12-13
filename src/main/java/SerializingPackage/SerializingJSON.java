package SerializingPackage;

import org.json.JSONObject;

import java.util.ArrayList;

public class SerializingJSON {

    public static void main(String[] args) {

        ArrayList<String> namesList = new ArrayList<String>();

        var values = new JSONObject();

        values.put("item1", 10);
        values.put("item2", 19);

        System.out.println(values);
        System.out.println(values.getClass().getName());

        // {"item1" : 10, "item2" : 20}

        String str = values.toString();

        String repStr = str.replace("=", ":");
        System.out.println("after modi");
        System.out.println(repStr);


        var jsonValues = new JSONObject(repStr);









//        Map<> myClass=new Gson().fromJson(str,MyClass.class);

//        String str=values.toString();

//        ObjectInputStream var = new ObjectInputStream(namesList);

    }


}

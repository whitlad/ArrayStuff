
import java.util.ArrayList;

public class ArrayListStuff
{
public void printNames()

{
    //Array with assigned elements this has a fixed size - better to use an Array List
    String[] namesArray = new String[3];
    namesArray[0] = "Larry";
    namesArray[1] = "Curly";
    namesArray[2] = "Moe";

    System.out.println("The size of the array is " +namesArray.length);

    ArrayList<String> names = new ArrayList<>();
    //label type of array both sides need to match the type
    //<> fills the second brackets with the type of array this is
    names.add("Larry");
    names.add("Curly");
    names.add("Moe");

    //System.out.println(names.get(0));
    //System.out.println(names.get(1));
    //System.out.println(names.get(2));
    System.out.println("The size of the ArrayList is" +names.size());

    System.out.println("The element at index 1 is " + names.get(1));

    //names.remove(1); //this removes index 1
    System.out.println("The element at index 1 is" +names.get(1));

    //for (int i=0; i <name.size(); i++) this will do the size of the array

    for (int i = 0; i<3; i++) //the amount of times i<3
    {
    System.out.println(names.get(i));  //add the names.get (i) is the amount of times to call this
    }
//enhanced for loop - loop variable eachName - works through the variable
    for (String eachName : names)
    {
        System.out.println(eachName);

    }

}


}

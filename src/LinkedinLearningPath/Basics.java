package LinkedinLearningPath;

public class Basics {

    public static void main(String[] Args){
        System.out.println("Contains the Basic Concepts");

        primitiveDataTypes();

    }


    public static void primitiveDataTypes(){
        int myint = 5;
        double mydouble = 156.5;
        float myfloat = 10;
        String myString = "Praveen George";

        // WRAPPER CLASS EXAMPLES
        String doublevalue = "156.5";
        Double doubleObj = Double.parseDouble(doublevalue);

        byte byteValue = doubleObj.byteValue();
        int intValue = doubleObj.intValue();
        float floatValue = doubleObj.floatValue();
        String stringvalue = doubleObj.toString();

        System.out.println("ByteValue" + byteValue);
        System.out.println("IntValue" + intValue);
        System.out.println("FloatValue" + floatValue);
        System.out.println("String Value" + stringvalue);
    }


}


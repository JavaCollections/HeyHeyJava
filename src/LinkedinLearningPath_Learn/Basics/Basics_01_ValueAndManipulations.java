package LinkedinLearningPath_Learn.Basics;

public class Basics_01_ValueAndManipulations {

    public static void main(String[] Args){
        System.out.println("Contains the Basic Concepts");

        currencyValues();

    }

    public static void primitiveDataTypes(){
        int myint = 5;
        char mychar = 'a';
        double mydouble = 156.5;
        float myfloat = 10;
        String myString = "Praveen George";

        // WRAPPER CLASS EXAMPLES
            // PARSE METHODS //
            // Turns String to the value specified
        String StringValue = "156.5";
        Double doubleObj = Double.parseDouble(StringValue);

//        Integer intObj = Integer.parseInt(StringValue);


            // VALUE CONVERSION
        byte byteValue = doubleObj.byteValue();
        int intValue = doubleObj.intValue();
        float floatValue = doubleObj.floatValue();
        String stringvalue = doubleObj.toString();

        System.out.println("ByteValue " + byteValue);
        System.out.println("IntValue " + intValue);
        System.out.println("FloatValue " + floatValue);
        System.out.println("String Value " + stringvalue);

//        TODO Research about the MAX Value setting Helper class for integers
//        MAX VALUE
//        Byte b = new Byte(127);
//        b.MAX_VALUE() = 127;
//
//        Integer i = new Integer(10);
//        i.MAX_VALUE() = 10;
//        i = 11;
//        System.out.println("Max Value Check " + i);


    }

    public static void currencyValues(){
        double doubleValue = 0.012;
        System.out.println(doubleValue + doubleValue + doubleValue);

        String stringValue = Double.toString(doubleValue);
        System.out.println("String Value " + stringValue);

    }




}


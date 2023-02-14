public class atividade {
    public static void main(String[] args) {

        String numInt = "2023";


        Float floatNum1 = new Float("200.30");
        Integer intNum1 = new Integer(numInt);
        Integer i = Integer.valueOf(2023);
        Double doubleNum1 = new Double("200.30");
        Double d = Double.valueOf(200.300);


        Character char1 = new Character('k');


        System.out.println("Float : "+floatNum1);
        System.out.println("Integer : "+intNum1);
        System.out.println("Char: "+char1);
        System.out.println(i.equals(intNum1));
        System.out.println(d == doubleNum1);
    }
}







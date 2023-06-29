public class Task1 {
    public static void main(String[] args) throws Exception {
        String [] arrayData =  Test.ReadLineFromFile("tekst.txt");
        for(int i = 0; i < arrayData.length; i++) {
            System.out.println(PrintLine(arrayData[i]));
        }
        
    }
    public static StringBuilder PrintLine(String line) {
        String line1 = line.replace("{", "").replace("}", "").replaceAll("\"", "");
        String line2 = line1.replace("[", "").replace("]", "");
        StringBuilder result = new StringBuilder("");
        String [] arrayData = line2.split(",");
        String [] listName = {"Студент ", " получил ", " по предмету "};
        for (int i =0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            result.append(listName[i]);
            result.append(arrData[1]);
            }
        return result;
    }
}


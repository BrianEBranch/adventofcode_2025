import java.io.BufferedReader;
import java.io.FileReader;

class solution {
    public static void main(String[] args){
        int dialPos = 50;
        int pass = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("puzzle_1/input.txt"));
            String line = reader.readLine();
            while (line != null){
                int rotation = Integer.parseInt(line.substring(1)) % 100;
                if(line.charAt(0) == 'L'){
                    // Turn left
                    if(dialPos - rotation < 0){
                        dialPos = 100 + (dialPos - rotation);
                    } else {
                        dialPos -= rotation;
                    }
                } else {
                    // Turn right
                    if(dialPos + rotation >= 100){
                        dialPos = (dialPos + rotation) - 100;
                    } else {
                        dialPos += rotation;
                    }
                }
                if(dialPos == 0){
                    pass++;
                }
                line = reader.readLine();
            }
        } catch (Exception e) {
        }
        System.out.println(pass);
    }
}
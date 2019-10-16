public class Main {
    public static void main(String[] args){
        int x=0;

            while (x<10){

            }
            int y=0;
            for(int i=0; i<10; i++){
                System.out.println(i);
            }
            int k;
            String greet="Hello There!";
            for(int k=0; k<greet.length(); k++){
                String letter  = greet.substring(k,k+1);

                if(!letter.equals("e")){
                    System.out.println(letter);
                }
            }
    }
}

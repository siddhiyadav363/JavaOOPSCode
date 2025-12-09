public class VowelCount {
    public static int countVowel(String str){
        str=str.toLowerCase();
        int count=0;
        for(char ch:str.toCharArray()){
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String input="Siddhi Rajeev Yadav";
        int vowelCount=countVowel(input);
        System.out.println("Total vowels: "+vowelCount);
    }
}

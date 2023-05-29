public class Utilities {
    //Returns a char array containing every nth char. when
    //sourceArray.length <n, returns sourceArray
    char[] sourceArray;
    int n;
    String source;

    public Utilities(char[] sourceArray, int n, String source) {
        this.sourceArray = sourceArray;
        this.n = n;
        this.source = source;
    }

    public char[] getSourceArray() {
        return sourceArray;
    }

    public int getN() {
        return n;
    }

    public String getSource() {
        return source;
    }

    public char[] everyNthchar(char[] sourceArray, int n){
        if(sourceArray== null || sourceArray.length<n){
            return sourceArray;
        }
        int returnedLength=sourceArray.length/n;
        char[] result=new char[returnedLength];
        int index=0;
        for (int i=n-1; i<sourceArray.length; i+=n){
            result[index++]=sourceArray[i];
        }
        return result;
    }
    // Removes pairs of same character that are next
    // to each other, by removing on e occurred of the character
    // "ABBCDEEF" -> "ABCDEF"
    // "ABCBEEF" -> "ABCBDEF" ( the two B's aren't next to each other, so they
    // aren't removed

    public String removePairs(String source){
        //if length <2 return the array, no challenges
        if (source.length()<2){
            return source;
        }
        StringBuilder sb=new StringBuilder();
        char[] string=source.toCharArray();
        for (int i=0; i<string.length-1; i++){
            if (string[i]!=string[i+1]){
                sb.append(string[i]);
            }
        }
        //the last digit always it's ok to add
        sb.append(string[string.length-1]);
        return sb.toString();
    }
    // perform a conversion based on same internal
    // business rule
    public int convert(int a, int b){
        return (a/b) + (a*30)-2;
    }
    public String nullIfOddLenght(String source){
        if (source.length()%2==0){
            return source;
        }
        return null;
    }
}



























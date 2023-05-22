public class StringUtilities {
    private StringBuilder stringBuilder=new StringBuilder();
    private int charAdded=0;
    public void addChar(StringBuilder stringBuilder, char c){
        this.stringBuilder.append(c);
        charAdded++;
    }
}

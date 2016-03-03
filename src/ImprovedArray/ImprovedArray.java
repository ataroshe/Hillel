package ImprovedArray;

public class ImprovedArray {
    private String[] improvedArray = new String[10];
    private int position = 0;

    public void add(String element) {
        improvedArray[position] = element;
        position++;
    }

    public String get(int index) {
        return improvedArray[index];
    }

    public int size(){
        return position;
    }

    public boolean equals(ImprovedArray other){
        for (int i = 0; i < improvedArray.length; i++){
            improvedArray[i].equals(other);
        }
        return (position == other.position) &&
    }
}

package ImprovedArray;

public class ImprovedArray {
    private String[] array = new String[10];
    private int position = 0;

    public void add(String element) {
        if (array.length == position) {
            doubleSize();
        }
        array[position] = element;
        position++;
    }

    public String get(int index) {
        return array[index];
    }

    public int size() {
        return position;
    }

    public boolean equals(ImprovedArray other) {
        if (position != other.position) {
            return false;
        }
        else {
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(other.array[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    private void doubleSize() {
        String[] temp = new String[array.length * 2];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }

    public String toString() {
        if (position == 0) {
            return "Nothing to show";
        }
    String result = "";
    for (int i = 0; i < position; i++) {
        result = result + "\'" + array[i];
        if (i < position - 1) {
            result = result + "\', ";
        } else {
            result = result + "\'.";
        }
    }
    return result;
}
}

import java.util.Arrays;
import java.util.List;

public class IntArrayList implements IntList {
    private int[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int count = 0;
    private static final double EXTENSION_COEF = 1.5;

    public IntArrayList() {
        this.elements = new int[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(int e) {
        boolean ContainsCheck = false;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == e) {
                ContainsCheck = true;
            }
        }
        return ContainsCheck;
    }

    @Override
    public void add(int e) {
        if (capacity == count) {
            grow();
        }
        elements[count++] = e;
    }

    private void grow() {
        int newCapacity = (int) (capacity * EXTENSION_COEF);
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
        }
        capacity = newCapacity;
        elements = newElements;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("No such index");
        }
        return elements[index];
    }

    @Override
    public void remove(int index) {
        int ArrayLength = elements.length;
      /* for (int i = 0; i < ArrayLength; i++) {
            if (elements[i] == index) {
                break;
            } если вместо index будет подаватся элемент листа */
            for (int i = index; i < ArrayLength - 1; i++) {
                elements[i] = elements[i+1];
                ArrayLength--;
            }
    }

    @Override
    public void sort() {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] > elements[i+1]) {
                    isSorted = false;
                    buf = elements[i];
                    elements[i] = elements[i + 1];
                    elements[i + 1] = buf;
                }
            }
        }
    }

    @Override
    public void addAll(IntList intList) {
//        int newCapacity = intList.size(); //создаю новую переменную, в которой буду хранить размер листа
//        int[] newElements = new int[newCapacity]; //создаю новый массив длинной, равной длинне листа
//        for (int i = 0; i < capacity; i++) { //а в цикле просто переношу старые данные из elements в новый расширенный массив
//            newElements[i] = elements[i];
//            count++;
//        }
//        capacity = newCapacity; // обновляем значения
//        elements = newElements; //здесь приравниваем ссылку, чтобы теперь везде использовася массив newElements
        for (int i = 0; i < intList.size(); i++) {
            if (capacity == count) {
                grow();
            }
            add(intList.get(i));
        }
    }

   /* public void addAll(IntList intList, int startPosition) {
        int newCapacity = intList.size();
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
            count++;
        }
        capacity = newCapacity;
        elements = newElements;

        for (int i = startPosition; i < intList.size(); i++) {
            elements[i] = intList.get(i);
        }
    }*/ //FIXME доделать, если лист вставляют в середину массива

    @Override
    public int[] toArray() {
        int[] ListToArray = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            ListToArray[i] = elements[i];
        }
        return ListToArray;
    }

    @Override
    public int indexOf(int value) {
        int i;
        for (i = 0; i < elements.length; i++) {
            if(elements[i] == value) {
                break;
            }
        }
        return i;
    }

    @Override
    public Iterator iterator() {
        return new MyIter();
    }


    class MyIter implements Iterator {
        private int currentIndex;

        public MyIter() {
            currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public int next() {
            return elements[currentIndex++];
        }
    }
}
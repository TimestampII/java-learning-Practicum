package Practicum.Sprint_6.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// класс может реализовать Comparable<T> только один раз
class MinMax implements Comparable<MinMax> {

    private final String name;
    private final int age;

    public MinMax(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // переопределяем compareTo - студенты будут сравниваться по имени и по возрасту
    @Override
    public int compareTo(MinMax o) {
        final int nameComparison = String.CASE_INSENSITIVE_ORDER.compare(this.name, o.name);
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Integer.compare(this.age, o.age);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        final MinMax a = new MinMax("aaa", 30);
        final MinMax b = new MinMax("aaa", 27);
        final MinMax c = new MinMax("ccc", 33);

        final MinMax d = new MinMax("ddd", 21);

        // создаем изменяемы список из изменяемого List.of(..)
        final List<MinMax> list = new ArrayList<>(List.of(a, b, c, d));
        Collections.sort(list);
        System.out.println(list);

        // выводим минимальный элемент в соответствии с правилами сортировки Comparable<MinMax>
        // так как список предварительно отсортирован, минимальным будет первый элемент
        System.out.println(Collections.min(list));

        // теперь напечатаем максимальный элемент
        System.out.println(Collections.max(list));
    }
}


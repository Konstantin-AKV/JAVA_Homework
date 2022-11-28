package итоговый.проект;

import java.util.*;

public class Cat implements Comparable<Cat>{
    private int id;
    private int age;
    private int weigth;
    private String name;
    private String poroda;
    private String color;
    private String table;
    private String recept;

    public Cat(int id, int age, int weigth, String name, String poroda, String color, String table, String recept) {
        this.id = id;
        this.age = age;
        this.weigth = weigth;
        this.name = name;
        this.poroda = poroda;
        this.color = color;
        this.table = table;
        this.recept = recept;
    }

    public Cat(int id, String name) {
        this(id, 0, 0, name, null, null, null, null);
    }

    public Cat() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getRecept() {
        return recept;
    }

    public void setRecept(String recept) {
        this.recept = recept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id && age == cat.age && Objects.equals(name, cat.name) && Objects.equals(poroda, cat.poroda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, name, poroda);
    }

    @Override
    public String toString() {
        return "Cat {" +
                "id=" + id +
                ", age=" + age +
                ", weigth=" + weigth +
                ", name='" + name + '\'' +
                ", poroda='" + poroda + '\'' +
                ", color='" + color + '\'' +
                ", table='" + table + '\'' +
                ", recept='" + recept + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat(1, "name1"));
        cats.add(new Cat(1, "name1"));
        cats.add(new Cat(2, "name2"));
        cats.add(new Cat(3, 1, 1, "name3", "poroda", "black", "table", "recept"));
        cats.add(new Cat(4, 1, 1, "name4", "poroda", "black", "table", "recept"));
        System.out.println("HashSet");
        for (Cat i : cats) {
            System.out.println(i);
        }
        Set<Cat> treeSet = new TreeSet<>(cats);
        treeSet.add(new Cat(5, 7, 1, "name4", "poroda", "black", "table", "recept"));
        treeSet.add(new Cat(6, 2, 1, "name4", "poroda", "black", "table", "recept"));
        treeSet.add(new Cat(7, 5, 1, "name4", "poroda", "black", "table", "recept"));
        treeSet.add(new Cat(8, 4, 1, "name4", "poroda", "black", "table", "recept"));
        treeSet.add(new Cat(9, 10, 1, "name4", "poroda", "black", "table", "recept"));
        System.out.println("TreeSet");
        for (Cat j : treeSet) {
            System.out.println(j);
        }
    }

    @Override
    public int compareTo(Cat o) {
        if (this.age == o.age) {
            return 0;
        } else if (this.age > o.age) {
            return 1;
        } else {
            return -1;
        }
        /* return Integer.compare(this.age, o.age); */
    }
}

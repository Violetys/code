package something1;

import java.util.Comparator;
import java.util.TreeMap;

/*
 * TreeMap也是基于红黑树（二叉树）数据结构实现 的， 特点：会对元素的键进行排序存储。

	TreeMap 要注意的事项：
	1. 往TreeMap添加元素的时候，如果元素的键具备自然顺序，那么就会按照键的自然顺序特性进行排序存储。
	2. 往TreeMap添加元素的时候，如果元素的键不具备自然顺序特性， 那么键所属的类必须要实现Comparable接口，把键
	的比较规则定义在CompareTo方法上。
	
	3. 往TreeMap添加元素的时候，如果元素的键不具备自然顺序特性，而且键所属的类也没有实现Comparable接口，那么就必须
	在创建TreeMap对象的时候传入比较器
 * */
class Emp {//implements Comparable<Emp>{
    
    String name;
    
    int salary;

    public Emp(String name, int salary) {
        super();
        this.name = name;
        this.salary = salary;
    }
    
    
    @Override
    public String toString() {
        return "[姓名："+this.name+" 薪水："+ this.salary+"]";
    }

/*
    @Override
    public int compareTo(Emp o) {
        return this.salary - o.salary;
    }*/
    
}


//自定义一个比较器
class MyComparator implements Comparator<Emp>{

    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.salary - o2.salary;
    }
    
}




public class treeMap {
    
    public static void main(String[] args) {
    /*    TreeMap<Character, Integer> tree = new TreeMap<Character, Integer>();
        tree.put('c',10);
        tree.put('b',2);
        tree.put('a',5);
        tree.put('h',12);
        System.out.println(tree);*/
        
        //创建一个自定义比较器
        MyComparator comparator = new MyComparator();
        
        TreeMap<Emp, String> tree = new TreeMap<Emp, String>(comparator);
        tree.put(new Emp("冰冰", 2000),"001");
        tree.put(new Emp("家宝", 1000),"002");
        tree.put(new Emp("习总", 3000),"003");
        tree.put(new Emp("克强", 5000),"005");        
        tree.put(new Emp("财厚", 5000),"008");
        System.out.println(tree);
        
        
        
        
    }

}

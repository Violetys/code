package synchronizedTest;
/*
 * synchronized是Java中的关键字，是一种同步锁。它修饰的对象有以下几种： 
		1. 修饰一个代码块，被修饰的代码块称为同步语句块，其作用的范围是大括号{}括起来的代码，作用的对象是调用这个代码块的对象； 
		2. 修饰一个方法，被修饰的方法称为同步方法，其作用的范围是整个方法，作用的对象是调用这个方法的对象； 
		3. 修改一个静态的方法，其作用的范围是整个静态方法，作用的对象是这个类的所有对象； 
		4. 修改一个类，其作用的范围是synchronized后面括号括起来的部分，作用主的对象是这个类的所有对象。

 * */
/*
 * Synchronized修饰一个方法很简单，就是在方法的前面加synchronized，public synchronized void method(){//todo}; 
 * synchronized修饰方法和修饰一个代码块类似，只是作用范围不一样，修饰代码块是大括号括起来的范围，而修饰方法范围是整个函数。

 * */
/*
 * public synchronized void run() {					//synchronized修饰方法
	   for (int i = 0; i < 5; i ++) {
	      try {
	         System.out.println(Thread.currentThread().getName() + ":" + (count++));
	         Thread.sleep(100);
	      } catch (InterruptedException e) {
	         e.printStackTrace();
	      }
	   }
	}

 * 
 * Synchronized作用于整个方法的写法。 
	写法一：	
	public synchronized void method()
	{
	   // todo
	}
	
	写法二：	
	public void method()
	{
	   synchronized(this) {
	      // todo
	   }
	}
	
	写法一修饰的是一个方法，写法二修饰的是一个代码块，但写法一与写法二是等价的，都是锁定了整个方法时的内容。

 * 
 * 
 * 在用synchronized修饰方法时要注意以下几点： 
	1. synchronized关键字不能继承。 
		虽然可以使用synchronized来定义方法，但synchronized并不属于方法定义的一部分，因此，synchronized关键字不能被继承。如果在父类中的
		某个方法使用了synchronized关键字，而在子类中覆盖了这个方法，在子类中的这个方法默认情况下并不是同步的，而必须显式地在子类的这个方
		法中加上synchronized关键字才可以。当然，还可以在子类方法中调用父类中相应的方法，这样虽然子类中的方法不是同步的，但子类调用了父类
		的同步方法，因此，子类的方法也就相当于同步了。这两种方式的例子代码如下： 
	
			在子类方法中加上synchronized关键字
			class Parent {
			   public synchronized void method() { }
			}
			class Child extends Parent {
			   public synchronized void method() { }
			}
			
			在子类方法中调用父类的同步方法
			class Parent {
		   		public synchronized void method() {   }
				}
				class Child extends Parent {
				   public void method() { super.method();   }
			} 
		
	2.在定义接口方法时不能使用synchronized关键字。
	
	3.构造方法不能使用synchronized关键字，但可以使用synchronized代码块来进行同步。 

 * 
 * */
public class synff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

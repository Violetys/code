package something1;

import java.io.Serializable;

/*
 * 	①用类的new （）创建
	
	②用clone方法创建， 需要类实现 Cloneable 接口
	
	③通过反射机制创建
	
	④将一个对象实例化后，进行序列化，再反序列化
 * 
 * 
 * 
 * */

public class Howtogetclass implements Cloneable,Serializable{
	String Name="";
	String Phone="";
	String Company="";
	
}


/*
 * 1.new()方法
   User user = new User();
   
   
 * 2.用clone方法创建， 需要类实现 Cloneable 接口
   User user2 = (User) user1.clone();
  
    
 * 3.用 Class.forName方法获取类，在调用类的newinstance（）方法

	Class<?> cls =null;
	User u = null;
	try {
	cls = Class.forName("somthing1.Howtogetclass");
	u = (User)cls.newInstance();
	} catch (ClassNotFoundException e1) {
	e1.printStackTrace();
	}
	
 * 4.将一个对象实例化后，进行序列化，再反序列化，也可以获得一个对象（远程通信的场景下使用）
	try{ 
	ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream("D:/objectUser.txt")); 
	//序列化对象 
	out.writeObject(user1); //"Kong zi", "13800010001", "Greatwalk" 
	out.close(); 
	//反序列化对象 
	ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/objectUser.txt")); 
	User user4 = (User) in.readObject(); 
	System.out.println("反序列化user：" + user4); 
	in.close(); 
	} 
	catch(ClassNotFoundException e ){ 
	e.printStackTrace(); 
	} 
	catch(FileNotFoundException e ){ 
	e.printStackTrace(); 
	} 
	catch(IOException e ){ 
	e.printStackTrace(); 
	}
 * 
 * 
 * 
 * 
 * 
 * 
 * */

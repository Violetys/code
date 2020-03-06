package something1;
//使用Java实现完整遍历指定文件夹目录结构的程序
//可能使用到的File类的API:
//public File[] listFile() //列出当前File的文件/文件夹
//public boolean isDirectory() //判断当前File是否为目录
import java.io.File;
public class FilesTravel {
	
public static void travel(String path) {
	File file=new File(path);      			//创建File对象
	
	File[] fs = file.listFiles();			//列出当前File文件/文件夹		
	if (fs != null) {
		for (File f : fs){					//对每个File对象操作		
		    System.out.println(f);			//输出File路径
		    if(f.isDirectory()) {			//为文件夹时
		    	travel(f.getPath());		//递归调用遍历函数
		    	System.out.println();
		    }
		}
	}

}

// TODO:补充此方法体
public static void main(String[] args) {
travel("D:\\Download\\net");
}
}




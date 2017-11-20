package org.cn.vo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

public class FileLockDemo {
	public static void main(String[] args) throws IOException, InterruptedException{
		FileOutputStream out=new FileOutputStream("file.txt");
		FileLock lock=out.getChannel().tryLock();
		if(lock!=null){
			System.out.println("lock file");
			TimeUnit.SECONDS.sleep(100);
			lock.release();
			System.out.println("fileLock release");
		}
		lock.close();
	}
}

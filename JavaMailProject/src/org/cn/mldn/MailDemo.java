package org.cn.mldn;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message.RecipientType;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage; 

public class MailDemo {
	public static void main(String[] args) throws Exception{
		Properties config=new Properties();
		Session session=Session.getDefaultInstance(config);
		MimeMessage m=new MimeMessage(session);
		//设置发件人
		Address from=new InternetAddress("liurong_scut@sina.com","你好","utf-8");
		m.setFrom(from);
		m.setRecipient(RecipientType.TO, new InternetAddress("1069919773@qq.com"));
		m.setSubject("发送邮件","utf-8");
		m.setContent("这里是邮件的正文","text/plain");
		//设置邮件的发送时间
		m.setSentDate(new Date());
		m.saveChanges();
		File file=new File("E:\\testEmail.eml");
		FileOutputStream out=new FileOutputStream(file);
		m.writeTo(out);
		out.close();
	}
}

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
		//���÷�����
		Address from=new InternetAddress("liurong_scut@sina.com","���","utf-8");
		m.setFrom(from);
		m.setRecipient(RecipientType.TO, new InternetAddress("1069919773@qq.com"));
		m.setSubject("�����ʼ�","utf-8");
		m.setContent("�������ʼ�������","text/plain");
		//�����ʼ��ķ���ʱ��
		m.setSentDate(new Date());
		m.saveChanges();
		File file=new File("E:\\testEmail.eml");
		FileOutputStream out=new FileOutputStream(file);
		m.writeTo(out);
		out.close();
	}
}

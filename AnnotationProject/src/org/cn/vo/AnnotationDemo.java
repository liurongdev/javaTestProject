package org.cn.vo;

public class AnnotationDemo {
	@MyAnnotation(id=23,description="this is my first Annotation")
	public String getStrig(){
		return "l am liurong";
	}
	@MyAnnotation(id=24)
	public boolean isLike(){
		return false;
	}
	@MyAnnotation(id=25,description="this is my second Annotation")
	public int getInt(){
		return 23;
	}
}

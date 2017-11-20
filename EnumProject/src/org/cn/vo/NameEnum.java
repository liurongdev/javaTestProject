package org.cn.vo;

public enum NameEnum {
	LIU("THIS IS LIUR"),
	ZHANG("THIS IS ZHANG"),
	CHENG("THIS IS CHENG");
	private String description;
    private NameEnum(String description){
		this.description=description;
	}
    public String getDescription(){
    	return description;
    }
    public static void main(String[] args){
    	for(NameEnum name:NameEnum.values()){
    		System.out.println(name+"->"+name.getDescription());
    	}
    	String name="liurong";
    	System.out.println(name.substring(1).toLowerCase());
    	System.out.println(name);
    }
}

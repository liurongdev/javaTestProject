package org.cn.vo;

import java.util.EnumSet;
import static org.cn.vo.AlarmPoint.*;
public class AlarmDemo {
	public static void main(String[] args){
		EnumSet<AlarmPoint>set=EnumSet.noneOf(AlarmPoint.class);
		set.add(POINT3);
		set.add(POINT2);
		set.add(POINT1);
		set.add(START3);
		System.out.println(set);
	}
}

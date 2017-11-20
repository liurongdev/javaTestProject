package org.cn.vo;
import static org.cn.vo.AlarmPoint.POINT1;
import static org.cn.vo.AlarmPoint.POINT2;
import static org.cn.vo.AlarmPoint.START1;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
interface Command{
	void action();
}
public class EnumSetDemo {
	public static void main(String[] args){
		EnumSet<AlarmPoint>set=EnumSet.noneOf(AlarmPoint.class);
		System.out.println(set);
		set.add(AlarmPoint.POINT1);
		System.out.println(set);
		set.addAll(EnumSet.of(POINT1,POINT2,START1));
		System.out.println(set);
		set=EnumSet.allOf(AlarmPoint.class);
		System.out.println(set);
		set.removeAll(EnumSet.of(POINT1,START1));
		System.out.println(set);
		System.out.println("=============================");
		
		
		EnumMap<AlarmPoint,Command>map=new EnumMap<AlarmPoint,Command>(AlarmPoint.class);
		map.put(POINT1, new Command(){
			public void action(){
				System.out.println("Point1 action");
			}
		});
		map.put(START1, new Command(){
			public void action(){
				System.out.println("start1 action");
			}
		});
		for(Map.Entry<AlarmPoint, Command> entry: map.entrySet()){
			System.out.println(entry.getKey());
			entry.getValue().action();
		}
		//map.get(AlarmPoint.START2).action();
	}
}

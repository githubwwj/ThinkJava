package com.wwj.transform;

public class IfElse {
	
	public static void main(String[] args) {
		System.out.println(getGradeStage(3));
		System.out.println(getGradeStage(15));
		System.out.println(getGradeStage(18));
		System.out.println(getGradeStage(41));
		System.out.println(getGradeStage(66));
		System.out.println(getGradeStage(300));
	}
	
	/**
	 * 1．童年：0岁—6岁
	 * 2．少年：7岁—17岁
	 * 3．青年：18岁—40岁
	 * 4．中年：41—65岁
	 * 5．老年：66岁+
	 * 用户输入一个年龄,返回用户所在的年龄阶段
	 */
	public static String getGradeStage(int age){
		if(age>=0 && age<=6){
			return "童年";
		}else if(age >=7 && age<=17){
			return "少年";
		}else if(age >=18 && age<=40){
			return "青年";
		}else if(age>=41 && age<=65){
			return "中年";
		}else if(age>=66 && age<=150){
			return "老年";
		}
		return "您输入的年龄不合法";
	}
	//if(布尔表达式){
//	}
//	if(booleanexpression){
//		
//	}else if(booeanexpression){
//		
//	}else{
//		
//	}
}

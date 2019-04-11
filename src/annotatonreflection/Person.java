package annotatonreflection;

/**
 *  注释不能被其他程序读取 
 */
@Table("person")
public class Person {
	//注解的设计目标？
	//对类做出解释,被其它程序读取,被反射读取
	@Column(name="name",res="wwj")
	private String name;
	
	@Column(name="age",res="25")
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//select * from person where age =25 and name='wwj'; 
	

}

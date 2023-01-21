public class _06Puppy {
	int puppyAge;
	public _06Puppy(String name) { //构造方法不能有void
		System.out.println("小狗的名字是"+name);
	}
	
	public void setAge(int age) {
		puppyAge = age;
	}
	
	public void getAge() {
		System.out.println("小狗的年龄是"+ puppyAge);
	}
	
	public static void main(String[] args) {
		_06Puppy myPuppy = new _06Puppy("Tommy");
		myPuppy.setAge(5);
		myPuppy.getAge();
		System.out.println("变量值"+myPuppy.puppyAge);	
	}
	
}
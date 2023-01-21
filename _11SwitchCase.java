public class _11SwitchCase {
	public static void main(String[] args) {
		char grade = 'C';
		switch (grade) {
		case 'A':
			System.out.println("学神");
			break;
		case 'B':
			System.out.println("学霸");
			break;
		case 'C':
			System.out.println("普通人");
			break;
		case 'D':
			System.out.println("学弱");
			break;
			//case条件达成后如果不加break，后续case语句都会默认依次执行
		default:
			System.out.println("小垃圾");
		}
		System.out.println("成绩评级为" + grade);
	}
}
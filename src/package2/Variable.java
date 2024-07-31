package package2;

import java_program.NonStaticVar1;
import java_program.StaticVar1;

public class Variable {

	public static void main(String[] args) {
		
		System.out.println(StaticVar1.s1+StaticVar1.s2);
		
		NonStaticVar1 obj = new NonStaticVar1();
		
		System.out.println(obj.n1+obj.n2);
		

	}

}

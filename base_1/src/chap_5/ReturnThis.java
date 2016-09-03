package chap_5;

public class ReturnThis {
	public int age;
	public ReturnThis grow()
	{
		age++;
		return this;
	}

	public static void main(String[] args) {
		ReturnThis rt = new ReturnThis();
		rt.grow()
		.grow()
		.grow();
		System.out.println("rt 的 age成员变量值是："+rt.age);

	}

}

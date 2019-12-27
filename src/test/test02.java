package test;
/*各类单例模式集合*/
public class test02 {
	
	/*单例模式，懒汉式，线程安全*/
	public static class Singleton{
		private final static Singleton Instance = new Singleton();
		
		private Singleton() {}

		public static Singleton getInstance() {
			return Instance;
		}
	}
	
	/*饿汉式，线程不安全*/
	public static class Singleton2{
		private static Singleton2 Instance= null;
		private Singleton2() {}
		public static Singleton2 getInstance() {
			if(Instance==null) {
				Instance = new Singleton2();
			}
			return Instance;
		}
	}

	/*线程安全下的饿汉式，多线程环境下效率不高*/
	public static class Singleton3{
		private static Singleton3 Instance = null;
		private Singleton3() {}
		public static synchronized Singleton3 getInstance() {
			if(Instance==null) {
				Instance = new Singleton3();
			}
			return Instance;
		}
		
	}
	
	/*饿汉式，变种，线程安全*/
	public static class Singleton4{
		private static Singleton4 instance = null;
		static {
			instance = new Singleton4();
		}
		private Singleton4() {}
		public static Singleton4 getInstance() {
			return instance;
		}
	}
	
	/*懒汉式，使用静态内部类，线程安全，这是懒汉式最推荐的方法*/
	public static class Singleton5{
		private static final class SingletonHolder{
			private static final Singleton5 instance = new Singleton5();
		}
		private Singleton5() {}
		public static Singleton5 getInstance() {
			return SingletonHolder.instance;
		}
	}
	
	/*静态内部类，使用枚举方式，线程安全*/
	public enum Singleton6{
		Instance;
		public void whateverMethod() {}
	}
	
	/*静态内部类，使用双重校验锁机制，线程安全，这个一定要重点记忆*/
	public static class Singleton7{
		private volatile static Singleton7 instance = null;
		private Singleton7() {}
		public static Singleton7 getInstance() {
			if(instance==null) {
				synchronized(Singleton7.class) {
					if(instance==null) {
						instance = new Singleton7();
					}
				}
			}
			return instance;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(Singleton.getInstance() == Singleton.getInstance());
	        System.out.println(Singleton2.getInstance() == Singleton2.getInstance());
	        System.out.println(Singleton3.getInstance() == Singleton3.getInstance());
	        System.out.println(Singleton4.getInstance() == Singleton4.getInstance());
	        System.out.println(Singleton5.getInstance() == Singleton5.getInstance());
	        System.out.println(Singleton6.Instance == Singleton6.Instance);
	        System.out.println(Singleton7.getInstance() == Singleton7.getInstance());
	}

}

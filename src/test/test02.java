package test;
/*���൥��ģʽ����*/
public class test02 {
	
	/*����ģʽ������ʽ���̰߳�ȫ*/
	public static class Singleton{
		private final static Singleton Instance = new Singleton();
		
		private Singleton() {}

		public static Singleton getInstance() {
			return Instance;
		}
	}
	
	/*����ʽ���̲߳���ȫ*/
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

	/*�̰߳�ȫ�µĶ���ʽ�����̻߳�����Ч�ʲ���*/
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
	
	/*����ʽ�����֣��̰߳�ȫ*/
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
	
	/*����ʽ��ʹ�þ�̬�ڲ��࣬�̰߳�ȫ����������ʽ���Ƽ��ķ���*/
	public static class Singleton5{
		private static final class SingletonHolder{
			private static final Singleton5 instance = new Singleton5();
		}
		private Singleton5() {}
		public static Singleton5 getInstance() {
			return SingletonHolder.instance;
		}
	}
	
	/*��̬�ڲ��࣬ʹ��ö�ٷ�ʽ���̰߳�ȫ*/
	public enum Singleton6{
		Instance;
		public void whateverMethod() {}
	}
	
	/*��̬�ڲ��࣬ʹ��˫��У�������ƣ��̰߳�ȫ�����һ��Ҫ�ص����*/
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

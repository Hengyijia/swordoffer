package test;
/**
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 * <p/>
 * ���ɣ�����ѡȡ���������Ͻǵ����֡���������ֵ���Ҫ���ҵ����֣����ҹ��̽�����
 * ��������ִ���Ҫ���ҵ����֣��޳�����������ڵ��У����������С��Ҫ���ҵ����֣��޳�����������ڵ��С�
 * Ҳ����˵���Ҫ���ҵ����ֲ�����������Ͻǣ���ÿ���ζ�������Ĳ��ҷ�Χ���޳����л���һ�У�����ÿһ����������С
 * ���ҵķ�Χ��ֱ���ҵ�Ҫ���ҵ����֣����߲��ҷ�ΧΪ�ա�
 *
 * @param matrix �����ҵ�����
 * @param number Ҫ���ҵ���
 * @return ���ҽ����true�ҵ���falseû���ҵ�
 */
public class test03 {
	
	public static boolean isHave(int[][] matrix,int number) {
		if(matrix==null||matrix.length<1||matrix[0].length<1) {
			return false;
		}	
		int rows = matrix.length;
		int cols = matrix[1].length;
		
		int row = 0;
		int col = cols-1;
		
		while(row>=0 && col>=0 && row<rows && col<cols) {
			if(matrix[row][col]==number) {
				return true;
			}else if(number > matrix[row][col]) {
				row++;
			}else {
				col--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]  matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int number = 0;
		System.out.println(isHave(matrix,number));
		
	}

}

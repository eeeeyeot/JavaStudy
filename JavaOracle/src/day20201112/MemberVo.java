package day20201112;

public class MemberVo
{
	private String[] arr;
	
	public MemberVo() { }
	
	public MemberVo(String[] arr) {
		setSize(arr.length);
		
		for(int i = 0; i < arr.length; i++)
			this.arr[i] = arr[i];
	}
	
	private void setSize(int n) {
		arr = new String[n];
	}
	
	public int getSize() {
		return arr.length;
	}
	
	public String get(int index) {
		return arr[index];
	}
}

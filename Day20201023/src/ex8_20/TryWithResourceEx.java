package ex8_20;

public class TryWithResourceEx
{
	public static void main(String[] args)
	{
		try(CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(false);
		}catch (WorkException e) {
			e.printStackTrace();
		}
		catch (CloseException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try(CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(true);
		}
		catch(WorkException e) {
			e.printStackTrace();
		}
		catch(CloseException e) {
			e.printStackTrace();
		}
	}
}

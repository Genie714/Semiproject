// import ����
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;



public class LoadObject 
{
	String appDir = System.getProperty("user.dir");
	//������Ʈ�� �ҷ����ų� �����ϴ� �޼ҵ�
	public void loadObject() throws Exception
	{
		File f0 = new File(appDir, "\\data\\test.ser");
		if(!f0.getParentFile().exists())
		{
			f0.getParentFile().mkdirs();
		}
		
		if(f0.exists())
		{
			FileInputStream fis = new FileInputStream(f0);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//������ȭ
			HashMap h1 = (HashMap)ois.readObject();
			//System.out.println(h1);
			//System.out.println(ad.getAdminMoney());
			
			ois.close();
			fis.close();
		}
		else
		{
			Admin ad = Admin.getInstance();
		}
	}
}

//���Ϸ� ��ȯ�ϰ� �ҷ����� ���� �� ��ü Ÿ���� ���Ϸ� ��������...
// ������ Ÿ������ �Ұ�����?
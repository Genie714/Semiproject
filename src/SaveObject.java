//import ���� �ۼ�
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class SaveObject
{
	String appDir = System.getProperty("user.dir");
	
	public void saveObject() throws Exception
	{
		File f0 = new File(appDir, "\\data\\test.ser");
		if (!f0.getParentFile().exists())
		{
			//���͸� ������ ����ڴ�.
			f0.getParentFile().mkdirs();
		}
		HashMap<String,Object> h1 = new HashMap<String,Object>();
		
		//Admin ad = Admin.getInstance();
		
		h1.put("Admin", Admin.getInstance());
		//h1.put("Buyer", Buyer.getInstance());
		//h1.put("Alcohol", alc );
		
		FileOutputStream fos = new FileOutputStream(f0);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(h1);
		
		oos.close();
		
		fos.close();
		
	}
}

// ��ü�Ű������� �޾ƿͼ� �Ѵ�?
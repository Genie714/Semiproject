// import 구문
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;



public class LoadObject 
{
	String appDir = System.getProperty("user.dir");
	//오브젝트를 불러오거나 생성하는 메소드
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
			
			//역직렬화
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

//파일로 반환하고 불러오는 것을 그 객체 타입의 파일로 만들어야함...
// 데이터 타입으로 할것인지?
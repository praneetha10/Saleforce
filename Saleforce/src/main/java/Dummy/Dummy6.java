package Dummy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Dummy6 
{
	public static void main(String[] args) throws IOException 
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		String path="C:\\Users\\prane\\git\\saleforeproj\\com.Saleforce\\src\\test\\resources\\Leaddata.csv";
		String line="";
		{
			BufferedReader br=new BufferedReader(new FileReader(path));
			while((line=br.readLine())!=null)
			{
				String[] value=line.split(",");
				if(value.length<4|| value[0].equalsIgnoreCase("salutation"))
				continue;
				hm.get("salutation:"+ value[0]+",firstname:"+ value[1]+",lastname:"+value[2]+",phone:"+value[3]+",email:"+value[4]+",company:"+value[5]);
				hm.put("salutation", value[0]);
				hm.put("firstname", value[1]);
				hm.put("lastname", value[2]);
				hm.put("phone", value[3]);
				hm.put("email", value[4]);
				hm.put("company",value[5]);
				System.out.println(hm);
				Set<Entry<String,String>>entrySet=hm.entrySet();
				for(Entry<String,String>entry:entrySet)
				{
					System.out.println(entry.getValue());
				}
			}
		}
	}
}

package Bagg2;
import java.util.HashMap;
public class Hashmap {

	public static void main(String[] args) {
   HashMap<String,String> hm= new HashMap<String,String>();
   hm.put("ali","husan");
   hm.put("Mohamed","oras");
   hm.put("amir","Karar");
   hm.put("Basma","yasin");
   
   System.out.println(hm);
   
   hm.put("nizar","ahmed");
   hm.put("Mohaned","Samir");
   
   System.out.println(hm);
   
   hm.remove("Mohaned");

   System.out.println(hm);
	}

}

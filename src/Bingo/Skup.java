package Bingo;

public class Skup {
	
	static class Elem{
		int br;
		Elem sled;
		
		Elem(int b){
			br = b;
			sled =null;
		}
	}
	
private	Elem prvi , posl;


public boolean seNalezi(int br) {
	Elem tmp = prvi;
	while(tmp != null) 
		if(tmp.br ==br) return true;
		else tmp = tmp.sled; 
	return false;
}


public boolean dodaj(int num) {
	if(!seNalezi(num)) {
		new Elem(num);
	}
	return false;
}
public void isprazniSkup() {
	prvi = posl = null;
}

@Override
public String toString() {
	if(prvi == null) return "";
	
	StringBuilder stringBuilder = new StringBuilder();
	Elem ele = prvi;
	
	while(ele!=null) {
		stringBuilder.append(ele.br);
		ele = ele.sled;//obavezno
	}
	return stringBuilder.toString();
}

}

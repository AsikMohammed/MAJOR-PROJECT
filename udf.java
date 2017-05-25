import java.io.IOException;

import org.apache.pig.FilterFunc;
import org.apache.pig.data.Tuple;

public class udf extends FilterFunc{

	public Boolean exec(Tuple input) throws IOException{
	if(input ==null || input.size() ==0)
	{
		return null;
	}	
	String val1=input.get(0).toString();
	String val2=input.get(1).toString();
	int x =Integer.parseInt(val1);
	int y =Integer.parseInt(val2);
	if(x>(y*0.8))
	{
		return true;
	}
	return false;
}
}
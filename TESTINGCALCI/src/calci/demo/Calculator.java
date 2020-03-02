package calci.demo;

public class Calculator {
public int add(int...args)
{ int result=0;
	for(int i:args)
{   
	result=result+i;
}
return result;
	
}

public int sub(int...args)
{ int result=args[0];
	for(int i=1;i<args.length;i++)
{   
	
		result=result-args[i];
}
return result;
	
}

public int mul(int...args)
{ int result=1;
	for(int i:args)
{   
	result=result*i;
}
return result;
	
}
public int div(int a,int b) throws divideByZeroException
{ 
	try{
		return a/b;
	} catch(ArithmeticException e){
		throw new divideByZeroException("zero");
	}
}
}

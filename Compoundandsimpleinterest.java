package logging_assigment;

public class Compoundandsimpleinterest
{
	double principle,time,rateofinterest;
	Compoundandsimpleinterest(double principle,double time,double rateofinterest)
	{
		this.principle=principle;
		this.time=time;
		this.rateofinterest=rateofinterest;
	}
	public double simpleinterest()
	{
		return (principle*time*rateofinterest)/100;
	}
	public double compoundinterest()
	{
		return (principle*Math.pow(1.0+rateofinterest/100,time)-principle);
	}
}

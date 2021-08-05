package logging_assigment;
import java.util.Scanner;
import java.util.logging.Logger;
public class Simpleandcompoundinterest {
	private static  final Logger LOGGER=Logger.getLogger(Simpleandcompoundinterest.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LOGGER.setLevel(Level.FINE);
				Scanner in=new Scanner(System.in);
			    //LOGGER.debug("Enter the Principle amount:");
				LOGGER.info("Enter the Principle amount:");
				double principle=in.nextDouble();
				LOGGER.info("Enter the Annual Time:");
				double time=in.nextDouble();
				LOGGER.info("Enter Rate Of Interest:");
				double rateofinterest=in.nextDouble();
				Compoundandsimpleinterest amount=new Compoundandsimpleinterest(principle,time,rateofinterest);
				double si=amount.simpleinterest();
				double ci=amount.compoundinterest();
				LOGGER.info("simple interset= "+si);
				
				LOGGER.info("compound interest= "+ci);
				in.close();
	}

}

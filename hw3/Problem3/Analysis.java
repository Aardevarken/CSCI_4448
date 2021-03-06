/** Modified by Morgan Garske and Andrey Shprengel for HW3 CSCI 4448 Spring 2015 **/

interface Logging
{
	public enum LOG_TYPE {TXT, XML, HTML};
	public void log(String msg);
}

class LogFactory
{
	public static Logging getInstance (String type)
	{
		Logging logfile;
		System.out.println("Factory creating " + type + " log.");
		switch (type.toLowerCase())
		{
			case "text" : logfile = new LogText();
						  break;
			case "xml"  : logfile = new LogXML();
			              break;
			case "html" : logfile = new LogHTML();
			              break;
			default     : logfile = new LogText();
			              break;
		}
		return logfile;
	}
}

class LogText implements Logging
{
	public LogText()
	{
		System.out.println("Logging: text format");
	}
	public void log(String msg)
	{	
		System.out.println("Logging text to file: " + msg);
	}
}
class LogXML implements Logging
{
	public LogXML()
	{
		System.out.println("Logging: <type>XML Format</type>");
	}
	public void log(String msg)
	{	
		System.out.println("Logging text to file: log.xml" );
		System.out.println("<xml><msg>"+msg+"</msg></xml>");
	}
}
class LogHTML implements Logging
{
	public LogHTML()
	{
		System.out.println("Logging: HTML format");
	}
	public void log(String msg)
	{	
		System.out.println("Logging HTML to file: log.html" );
		System.out.println("<html><body>"+msg+"</body></html>");
	}
}

class Analysis
{
	public static void main(String[] args)
	{
		if (args.length != 1)
		{
			System.out.println("Usage: java Analysis type");
			System.exit(-1);
		}
		String type = args[0];
		System.out.println("Asking LogFactory to create " + type + " log");
		Logging logfile = LogFactory.getInstance(type);
		System.out.println("Factory created Logging object with type " + logfile.getClass());
		logfile.log("Starting application...");

		System.out.println("... read in data file to analyze ...");
		// code...
		System.out.println("... Clustering data for analysis ...");
		// code...
		System.out.println("... Printing analysis results ...");
		// code...
	}
}

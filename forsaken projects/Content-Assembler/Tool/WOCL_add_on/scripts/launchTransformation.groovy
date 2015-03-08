import groovy.io.FileType
import javax.swing.JOptionPane
import org.freeplane.plugin.script.proxy.Proxy

try {	
	def File xmlFreePlane = node.map.file
	
	def String xmlFreePlanePath = xmlFreePlane.path + ".xml"
	new File(xmlFreePlanePath).bytes = xmlFreePlane.bytes
	
	def File jarFile = new File(c.getUserDirectory().toString()+"/scripts/jar/org.inria.wordPress.enduser.xml2wdpConf.freePlane.jar")
	def String jarFilePath = jarFile.path
		
	//def Process p = new ProcessBuilder("java", "-jar", jarFilePath, xmlFreePlanePath).start()
	def ProcessBuilder procBuild = new ProcessBuilder("java", "-jar", jarFilePath, xmlFreePlanePath)
	procBuild.redirectErrorStream(true);
    def Process process = procBuild.start();
	
	InputStream inputStream = process.getInputStream();
	OutputStream outputStream = new FileOutputStream(new File("C:/Users/MALLON/log.freePlane"));

	int read = 0;
	byte[] bytes = new byte[1024];

	while ((read = inputStream.read(bytes)) != -1) {
		outputStream.write(bytes, 0, read);		
	}
	
	//Warning : this method is needed because of the limited output : if it is not
	//consumes, FreePlane freezes.
	process.consumeProcessOutput()
		
} catch (Exception e) {
	 ui.errorMessage(e.message)
}

//C:\Users\MALLON\Desktop\WebsiteExperimExampleTest.mm.xml
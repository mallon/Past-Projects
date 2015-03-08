package main;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.mallon.tools.converter.excel.ExcelXML2XLS;

public class launcher {

	public static void main(String[] args) {

		try {
			try(
					FileWriter fw = new FileWriter(new File("resources/XLSTest.xml").getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					){
					bw.write("<?xml version=\"1.0\"?>"+ "\n" +
								"<?mso-application progid=\"Excel.Sheet\"?>"+ "\n" +
								"<Workbook"+ "\n" +
								   "xmlns=\"urn:schemas-microsoft-com:office:spreadsheet\""+ "\n" +
								   "xmlns:o=\"urn:schemas-microsoft-com:office:office\""+ "\n" +
								   "xmlns:x=\"urn:schemas-microsoft-com:office:excel\""+ "\n" +
								   "xmlns:ss=\"urn:schemas-microsoft-com:office:spreadsheet\""+ "\n" +
								   "xmlns:html=\"http://www.w3.org/TR/REC-html40\">"+ "\n" +
								  "<DocumentProperties xmlns=\"urn:schemas-microsoft-com:office:office\">"+ "\n" +
								    "<Author>ALLON Matthieu</Author>"+ "\n" +
								    "<Created>2013-08-21T11:15:00Z</Created>"+ "\n" +
								    "<Company>AtlanMod</Company>"+ "\n" +
								  "</DocumentProperties>"+ "\n" +
								  "<Worksheet ss:Name=\"Sheet1\">"+ "\n" +
								    "<Table>");
					bw.write(createRows(Integer.valueOf(args[0])));
					bw.write(		"</Table>"+ "\n" +
								  "</Worksheet>"+ "\n" +
								"</Workbook>"
					);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		new ExcelXML2XLS("resources/XLSTest.xls");
		
	}

	public static String createRows(int lineNumber) throws IOException {
		String rowContent = "";
		
		for (int i = 0; i < lineNumber; i++) {	

			if (i == 0){
				String[] cells = {
						"Application", "Libell&#233;", "Domaine fonctionnel", "Modules", "Fonctions", "Type d&#180;application", 
						"Num&#233;ro du processus", "P&#244;le DSI", "Correspondant DSI", "Entit&#233;s concern&#233;es", 
						"Correspondant m&#233;tiers", "Int&#233;r&#234;t strat&#233;gique", "Endettement", 
						"Liste des sites qui utilisent l&#180;application", "Nombre d&#180;utilisateur", "Date de mise en " +
						"exploitation", "Criticit&#233; au sens m&#233;tier", "Criticit&#233; au sens PSI", "Evolution de " +
						"l&#180;application", "Statut application", "Confidentialit&#233; des donn&#233;es", "Convention de " +
						"service", "Nom de la convention de service", "Num&#233;ro de nomenclature", "Date de MAJ", 
						"Nom du progiciel et version", "Editeur du progiciel", "Langage de d&#233;veloppement et version",
						"Base de donn&#233;es et version", "Poids du progiciel", "Nom du serveur", "Fabriquant du serveur",
						"Mod&#234;le du serveur", "OS du serveur", "Volume base de donn&#233;es", "Flux entrant Nom de l&#180;application",
						"Flux entrant Informations MAJ", "Flux entrant Fr&#233;quence MAJ", "Flux entrant Traitement", 
						"Flux sortant Nom de l&#180;application", "Flux sortant Informations MAJ", "Flux sortant Fr&#233;quence MAJ",
						"Flux sortant Traitement", "Commentaires", "Colonne Fonction cach&#233;e pour &#233;dition", 
						"Num&#233;ro d&#180;identification", "Modif ligne"
				};
				rowContent += "\n" +"<Row>" + generateCells(cells); 
								
						
			}else{
				//1,2,3,4,5,6--,8,9,10,11,14--,19 to 47 firsts : strings
				//--7--,12,13--,15,16,17,18-- : integers
				String [] tabStatus = {"O", "S", "P", "A", "C"};
				String [] tabConfidentiality = {"TSD", "SD", "CD", "NP"};
				String [] tabUsers = {"user_A", "user_B", "user_C", "user_D", "user_E", "user_F"};
				String [] tabFunctionDomain = {"01-D&#233;cisionnel", "02-Finance", "03-Commerce", "04-Ressources humaines", "05-Achats"};		
				String[] tabPoleDSI = {"BHU", "PLO", "RES", "DEV", "SYS"};

				String[] cells= {	"APP_"+i, "LIB_"+i, 
						/*Functionnal domain*/tabFunctionDomain[Integer.valueOf(getRandomIntInString(0,4))],
						/*Module*/"MOD_"+i, /*Function*/"FUNCT_"+i, /*Type appli*/"SERV_APP"+i,
						/*num process*/""+i, /*Pole dsi*/tabPoleDSI[Integer.valueOf(getRandomIntInString(0,4))],
						/*Corr. DSI*/"CORR_DSI_"+i, /*Entite*/"ENT_"+i, /*Corr.metiers*/"CORR_MET_"+i,											
						/*inté. stratég.*/getRandomIntInString(1,2), /*endett.*/getRandomIntInString(1,2),
						/*sites users*/getRandomSetOfUsers(tabUsers), /*nb users*/getRandomIntInString(10, 2000), 
						/*date exploit*/getRandomYear(), /*critic.metier*/getRandomIntInString(1,2), 
						/*critic.PSI*/getRandomIntInString(1,2), /*evol app. - useless to generate*/"evolution blabla", 
						/*statut*/tabStatus[Integer.valueOf(getRandomIntInString(0,4))],
						/*conf.data*/tabConfidentiality[Integer.valueOf(getRandomIntInString(0,3))]
				};	
				rowContent += "\n" +"<Row>" + generateCells(cells); 
			}
			rowContent += "\n" + "</Row>" + "\n";
			
		}
		
		return rowContent;
	}

	private static String generateCells(String ... cellValues){
		String cellAndDataBegin = "\n" + "<Cell>" + "\n" +
									"<Data ss:Type=\"String\">";
		String cellAndDataEnd =		"</Data>" + "\n" +
								"</Cell>";
		String cells = "";
		
		for (String value : cellValues){
			cells += cellAndDataBegin + value + cellAndDataEnd;
		}
		
		return cells;
	}
	
	private static String getRandomIntInString(int min, int max){
		return String.valueOf(Math.abs(new Random().nextInt((max+1)-min) + min));
	}

	private static String getRandomYear(){
		Calendar now = Calendar.getInstance();
		String randomYear = String.valueOf(
											Integer.valueOf(
													getRandomIntInString(1995, now.get(Calendar.YEAR))
											)
							);
		return randomYear;
	}

	private static String getRandomSetOfUsers(String [] tabUsers){
		String usersWithoutDupplicate = "";
		Set<String> setOfUsers = new TreeSet<String>();
		for (int i = 0; i < Integer.valueOf(getRandomIntInString(1,5)); i ++){
			setOfUsers.add(tabUsers[Integer.valueOf(getRandomIntInString(0,5))] + "&#10;");
		}
		for (String user : setOfUsers){
			usersWithoutDupplicate += user;			
		}
		return usersWithoutDupplicate;
	}

}

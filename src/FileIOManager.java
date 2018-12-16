import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOManager {

	private String file_path;
	private String file_name;
	private FileReader reader;
	private FileWriter writer;
	private BufferedReader buffered_reader;
	private BufferedWriter buffered_writer;
	
	GenericDataPacker packer;

	public FileIOManager(String file_name, GenericDataPacker packer){
		this.file_path = "./SavedData/";
		this.file_name = file_path + file_name;
		this.reader = null;
		this.writer = null;
		this.buffered_reader = null;
		this.buffered_writer = null;
		
		this.packer = packer;
	}

	public void readFile(){
	
		String line = null;
		try{
			
			this.reader = new FileReader(this.file_name);
			this.buffered_reader = new BufferedReader(this.reader);
			
			while((line = buffered_reader.readLine()) != null) {
				System.out.println(line);
			}   
			
			buffered_reader.close();  
			
		} catch (FileNotFoundException ex){
			System.out.println("In readFile: " + ex);
		} catch(IOException ex){
			System.out.println("In readFile: " + ex);
		}
	}
	
	public void writeFile(){
		try{
			
			this.writer = new FileWriter(this.file_name);
			this.buffered_writer = new BufferedWriter(this.writer);
			
			buffered_writer.write("--CharacterData--\n");
			buffered_writer.write(packer.getName() + "\n");
			buffered_writer.write(packer.getLevel() + "\n");
			buffered_writer.write(packer.getAscendancy() + "\n");
			buffered_writer.newLine();
			
			buffered_writer.write("--LabData--\n");
			buffered_writer.write(packer.isNormal() + "\n");
			buffered_writer.write(packer.isCruel() + "\n");
			buffered_writer.write(packer.isMerc() + "\n");
			buffered_writer.write(packer.isUber() + "\n");
			
			for (int i = 0; i < packer.getNormalTrials().length; i++){
				buffered_writer.write(packer.getNormalTrials()[i] + " ");
			}
			buffered_writer.newLine();
			
			for (int i = 0; i < packer.getCruelTrials().length; i++){
				buffered_writer.write(packer.getCruelTrials()[i] + " ");
			}
			buffered_writer.newLine();
			
			for (int i = 0; i < packer.getMercTrials().length; i++){
				buffered_writer.write(packer.getMercTrials()[i] + " ");
			}
			buffered_writer.newLine();
			
			for (int i = 0; i < packer.getUberTrials().length; i++){
				buffered_writer.write(packer.getUberTrials()[i] + " ");
			}
			buffered_writer.newLine();
			buffered_writer.newLine();
			
			buffered_writer.write("--BanditData--\n");
			buffered_writer.write(packer.getBanditChoice() + "\n");
			buffered_writer.newLine();
			
			buffered_writer.write("--QuestData--\n");
			for (int i = 0; i < packer.getQuestStatuses().length; i++){
				buffered_writer.write(packer.getQuestStatuses()[i] + " ");
			}
			buffered_writer.newLine();
			
            // Always close files.
			buffered_writer.close();
	
		} catch (FileNotFoundException ex){
			System.out.println("In writeFile: " + ex);
		} catch(IOException ex){
			System.out.println("In writeFile: " + ex);
		}
	}
}

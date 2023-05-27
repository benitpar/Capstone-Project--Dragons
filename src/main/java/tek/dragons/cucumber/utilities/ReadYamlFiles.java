package tek.dragons.cucumber.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;

public class ReadYamlFiles {
	
	private static ReadYamlFiles readYamlFile;
	private HashMap propertyType;
	
	//we create a constructor to load our yaml file
	private ReadYamlFiles (String filePath) throws FileNotFoundException {
		FileInputStream fileInputStream = FileUtility.getFileInputStream(filePath);
		Yaml yaml = new Yaml();
		this.propertyType = yaml.load(fileInputStream);
		
	}
	//we catch 
	public static ReadYamlFiles getInstance(String filePath) throws FileNotFoundException {
		if(readYamlFile ==null)
			return new ReadYamlFiles(filePath);
		return readYamlFile;
	}
	
	public HashMap getYamlProperty(String key) {
		return (HashMap)this.propertyType.get(key);
	}

}
